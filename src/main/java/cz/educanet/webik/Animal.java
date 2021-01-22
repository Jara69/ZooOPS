package cz.educanet.webik;

public class Animal {
    private String name;
    private String gender;
    private int age;
    private int weight;
    private int id;

    public Animal(String name, String gender, Integer age, Integer weight){
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
    }

    public int getId(){
        return id;

    }

    public void setId(int id){
        this.id = id;

    }

    public void setName(String name){
        this.name = name;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public void setAge(Integer age){
        this.age = age;
    }

    public void setWeight(Integer weight){
        this.weight = weight;
    }
}
