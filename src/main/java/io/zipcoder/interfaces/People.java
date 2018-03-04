package io.zipcoder.interfaces;

import java.util.ArrayList;

public abstract class People <E extends Person>{

    ArrayList<E> personList = new ArrayList<E>();

    void add(E personToAdd){
        personList.add(personToAdd);
    }

    E findById(long id){
        E personToReturn = null;
        for (E person : personList){
            if (person.getId() == id){
                personToReturn = person;
            }
        }
        return personToReturn;
    }

    void remove(Person personToRemove){
        personList.remove(personToRemove);
    }

    void remove(long idToRemove){
        for (Person person : personList){
            if (person.getId() == idToRemove){
                personList.remove(person);
            }
        }
    }

    int getCount(){
        return personList.size();
    }

    abstract E[] getArray();



    void removeAll(){
        for (Person person : personList){
            personList.remove(person);
        }
    }

}
