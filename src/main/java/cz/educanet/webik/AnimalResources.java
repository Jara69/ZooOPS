package cz.educanet.webik;

import javax.inject.Inject;
import javax.naming.Name;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;


@Produces(MediaType.APPLICATION_JSON)
@Path("animals")

public class AnimalResources {

    @Inject
    private AnimalManager manager;

    public static List<Animal> animals = new ArrayList<Animal>();

    @POST
    @Path("create")
    public Response createAnimal(@FormParam("id") int id,
                                 @FormParam("Name") String name,
                                 @FormParam("Gender") String gender,
                                 @FormParam("Weight") int weight,
                                 @FormParam("age") int age) {

        Animal animal = new Animal(name, gender, age, weight);
        animals.add(manager.addId(animal));

        return Response.ok("animal" + animal + "has been added").build();

    }

    @GET
    public Response GetAllAnimals(){
        return Response.ok(animals).build();
    }

    @PUT
    @Path("{id}")

    public Response editAnimalos(Animal a,
                               @FormParam("name") String name,
                               @FormParam("weight") Integer weight,
                               @FormParam("age") Integer age,
                               @FormParam("gender") String gender) {
        if (manager.editAnimal(a, weight, gender, age, name) == null){
            return Response.status(Response.Status.valueOf("Netrol to")).build();
        }
        else return Response.ok().build();

    }

    @GET
    @Path("{id}")

   public Response getAnimal(){
        return getAnimal();
    }
}