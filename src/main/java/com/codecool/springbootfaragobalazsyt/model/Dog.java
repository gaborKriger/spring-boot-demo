package com.codecool.springbootfaragobalazsyt.model;

public class Dog {

    private Breed breed;
    private String name;
    private Integer age;

    public Dog() {
    }

    public Dog(Breed breed, String name, Integer age) {
        this.breed = breed;
        this.name = name;
        this.age = age;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed=" + breed +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
