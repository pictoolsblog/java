package com.pictools;

import java.util.List;

public class Person {
    private Long identification;
    private String name;
    private Integer age;
    private String favoriteColor;
    private List<String> hobbies;

    public Person(Long identification, String name, Integer age, String favoriteColor, List<String> hobbies) {
        this.identification = identification;
        this.name = name;
        this.age = age;
        this.favoriteColor = favoriteColor;
        this.hobbies = hobbies;
    }

    public Long getIdentification() {
        return identification;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getFavoriteColor() {
        return favoriteColor;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    @Override
    public String toString() {
        return name;
    }
}
