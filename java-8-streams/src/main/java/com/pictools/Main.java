package com.pictools;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

        public static void main(String[] args) {
            List<Person> people = new ArrayList<>();
            people.add(new Person(2562L, "Cristian", 16, "Blue", Arrays.asList("Puzzles")));
            people.add(new Person(5269L, "Alfred", 17, "Red", Arrays.asList("Photography","Drawing")));
            people.add(new Person(9856L, "Ashley", 32, "Green", Arrays.asList("Photography","Singing", "Cooking")));
            people.add(new Person(1736L, "Ariane", 41, "Red", Arrays.asList("Whittling","Dance")));
            people.add(new Person(6218L, "Curtis", 53, "Blue", Arrays.asList("Cooking","Yoga")));

            //map
            people.stream().map(Person::getName).forEach(System.out::println);

            //filter
            people.stream().filter(person -> person.getAge() >= 18).forEach(System.out::println);

            //flatMap
            people.stream().flatMap(person -> person.getHobbies().stream()).distinct().forEach(System.out::println);

            //distinct
            people.stream().map(Person::getFavoriteColor).distinct().forEach(System.out::println);

            //sorted
            people.stream().map(Person::getName).sorted().forEach(System.out::println);

            //min
            System.out.println(people.stream().min(Comparator.comparing(Person::getAge)).get());

            //max
            System.out.println(people.stream().max(Comparator.comparing(Person::getAge)).get());

            //count
            System.out.println(people.stream().count());

            //toMap
            Map<Long, Person> peopleByIdentification = people.stream()
                    .collect(Collectors.toMap(person -> person.getIdentification(), person -> person));
            peopleByIdentification.entrySet().stream()
                    .forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue()));

            //groupingBy
            Map<String, List<Person>> peopleByFavoriteColor = people.stream()
                    .collect(Collectors.groupingBy(Person::getFavoriteColor));
            peopleByFavoriteColor.entrySet().stream()
                    .forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue()));

        }

}
