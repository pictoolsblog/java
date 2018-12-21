package com.pictools;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alison", 28));
        people.add(new Person("Patrick", 26));
        people.add(new Person("George", 41));
        people.add(new Person("Isabella", 35));

        //comparing
        people.stream().sorted(Comparator.comparing(Person::getAge)).forEach(System.out::println);

        //reversed
        people.stream().sorted(Comparator.comparing(Person::getAge).reversed()).forEach(System.out::println);

        //naturalOrder
        people.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);

        //Add null values ​​to test nullsFirst and nullsLast methods
        people.add(null);
        people.add(null);

        //nullsFirst
        people.stream().sorted(Comparator.nullsFirst(Comparator.naturalOrder())).forEach(System.out::println);

        //nullsLast
        people.stream().sorted(Comparator.nullsLast(Comparator.naturalOrder())).forEach(System.out::println);

        //Remove null values ​​and add 2 new people to test second level comparison
        people.removeIf(person -> person == null);
        people.add(new Person("Bryan", 28));
        people.add(new Person("Helen", 35));

        //thenComparing
        people.stream().sorted(Comparator.comparing(Person::getAge).thenComparing(Comparator.comparing(Person::getName))).forEach(System.out::println);

    }

}
