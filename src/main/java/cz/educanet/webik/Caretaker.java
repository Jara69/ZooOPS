package cz.educanet.webik;

public class Caretaker {
    private String firstname;
    private String lastname;
    private String gender;
    public int id;

    public Caretaker(String firstname, String lastname, String gender){
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
    }

    public String getName() {
        return firstname + lastname;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public void setFirstname(String firstname){
        this.firstname = firstname;
    }

    public void setLastname(String lastname){
        this.lastname = lastname;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

}
