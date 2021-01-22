package cz.educanet.webik;

import javax.inject.Inject;
import javax.swing.text.Caret;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;


@Produces(MediaType.APPLICATION_JSON)
@Path("caretakers")

public class CaretakerResources {

    @Inject
    private CaretakerManager manager;

    public static List<Caretaker> caretakers = new ArrayList<>();

    @GET
    public Response getAll() {
        return Response.ok(caretakers).build();
    }

    @POST
    @Path("create")
    public Response CreateC(@FormParam("id") int id,
                            @FormParam("firstname") String firstname,
                            @FormParam("lastname") String lastname,
                            @FormParam("gender") String gender) {

        Caretaker caretaker = new Caretaker(firstname, lastname, gender);
        caretakers.add(caretaker);
        return Response.ok("caretaker" + caretaker + "has been added").build();
}




    @DELETE
    @Path("/{id}")
    public Response DeleteCaretaker(@PathParam("id") int id) {
        manager.caretaker = null;
        return Response.ok("Caretaker was succesfuly removed").build();
    }

    @GET
    @Path("{id}")
    public Response getSpecificCaretaker(@PathParam("id") int id) {
        return Response.ok(manager.getCaretaker(id)).build();
    }

    @PUT
    @Path("{id}")
    public Response editCaretaker(Caretaker c, @FormParam("firstname")String firstname, @FormParam("lastname") String lastname, @FormParam("gender") String gender ){
        if (manager.editCaretaker(c, firstname, lastname, gender) == null){
            return Response.status(Response.Status.valueOf("Netrol to")).build();
        }
        else return Response.ok().build();
    }
}
