package Persona;

import java.util.ArrayList;
import java.util.List;

public class PersonFacade {
    private List<Person> personas;

    public PersonFacade(List<Person> personas) {
        this.personas = personas;
    }

    public List<Person> PersonasEntre20y30() {
        List<Person> result = new ArrayList<>();
        for (Person person : personas) {
            if (person.getAge() >= 20 && person.getAge() <= 30) {
                result.add(person);
            }
        }
        return result;
    }
}
