package cz.educanet.webik;

import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class AnimalManager {

    private int id = 0;

    Animal animal = null;

    public static ArrayList<Animal> animals = new ArrayList<Animal>();

    public ArrayList<Animal> getAnimals(){
        return animals;
    }

    public Animal editAnimal(Animal a, Integer weight, String gender, Integer age, String name) {
        Animal idkAnimal = new Animal(name, gender, age, weight);

        a.setName(name);
        a.setGender(gender);
        a.setAge(age);
        a.setWeight(weight);

        return a;
}

    public Animal addId(Animal a){
        a.setId(id);
        id ++;
        animals.add(a);
        return a;
    }

    public Animal getAnimal(Integer id){
        return getAnimals().get(id);
    }

}
