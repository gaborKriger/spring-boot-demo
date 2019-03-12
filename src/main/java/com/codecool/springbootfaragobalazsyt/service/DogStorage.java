package com.codecool.springbootfaragobalazsyt.service;

import com.codecool.springbootfaragobalazsyt.model.Dog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class DogStorage {

    private List<Dog> dogs = new LinkedList<>();

    @Autowired
    private DogCreator dogCreator;

    public Dog addRandomDog() {
        Dog dog = dogCreator.createRandomDog();
        this.dogs.add(dog);
        return dog;
    }

    public List<Dog> getDogs() {
        return dogs;
    }

    public Dog addDog(Dog dog) {
        this.dogs.add(dog);
        return dog;
    }

    public Dog update(String name, Dog dog) throws Exception {
        Dog foundDog = dogs.stream()
                .filter(dog1 -> dog1.getName().equals(name))
                .findFirst()
                .orElseThrow(() -> new Exception("Dog not found: " + name));

        foundDog.setAge(dog.getAge());
        foundDog.setBreed(dog.getBreed());

        return dog;
    }
}
