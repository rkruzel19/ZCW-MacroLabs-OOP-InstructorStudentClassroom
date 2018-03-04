package io.zipcoder.interfaces;

public class Instructors extends People {

    private static final People<Instructor> INSTANCE = new Instructors();

    private Instructors() {

        String[] instructorNames = {
                "Froilan Miranda",
                "Iyassu Watts",
                "Janelle Bowman",
                "Dolio Durant",
                "Leon Hunter",
                "Melanie Augustin",
                "Mikaila Akeredolu",
                "Samantha Kooman",
                "Tariq Hook"
        };

        for (int x = 0; x < instructorNames.length; x++){
            Instructor instructorToAdd = new Instructor(x, instructorNames[x]);
            add(instructorToAdd);
        }

    }

    public static Instructors getInstance(){
        return INSTANCE;
    }

    Person[] getArray() {
        Person[] personArray = new Person[personList.size()];
        personArray = personList.toArray(personArray);
        return personArray;
    }
}
