package com;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        class Person {
            String name;
            public Person(String name) {
                this.name = name;
            }
        }

        List<Person> starwars = new ArrayList<>();
        starwars.add(new Person("Darth Vader"));
        starwars.add(new Person("Luke Skywalker"));
        starwars.add(new Person("Obi Wan"));
        starwars.add(new Person("Pink Panther"));

        starwars.stream().filter(new Predicate<Person>() {
            @Override
            public boolean test(Person person) {
                return person.name.length() > 10;
            }
        });

        starwars.stream().filter(new Predicate<Person>() {
            @Override
            public boolean test(Person person) {
                return false;
            }
        });
    }
}	
