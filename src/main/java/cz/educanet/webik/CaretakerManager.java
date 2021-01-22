package cz.educanet.webik;

import javax.ejb.ApplicationException;
import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class CaretakerManager {

    Caretaker caretaker = null;

    private int id = 0;

    public static List<Caretaker> caretakers = new ArrayList<Caretaker>();

    public Caretaker getCaretaker(int id) {
        for (int i = 0; i < caretakers.size(); i++) {
            if (id == caretakers.get(i).id) {
                return caretakers.get(i);
            }
        }
        return null;
    }

    public Caretaker editCaretaker(Caretaker c, String firstname, String lastname, String gender){
        Caretaker idkTaker = new Caretaker(firstname, lastname, gender);

        c.setFirstname(firstname);
        c.setGender(gender);
        c.setLastname(lastname);
        return c;
    }

    public Caretaker addId(Caretaker c){
        c.setId(id);
        id ++;
        caretakers.add(c);
        return c;

    }
}