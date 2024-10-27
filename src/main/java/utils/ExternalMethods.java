package utils;

import model.Person;

import java.util.Objects;

public class ExternalMethods {
    public boolean isPersonAOlderThanPersonB(Person personA, Person personB){
        if (Objects.isNull(personA) || Objects.isNull(personB)) {
            return false;
        }
        return personA.getAge() > personB.getAge();
    }
}
