package com.codecool.springbootfaragobalazsyt.controller;


import com.codecool.springbootfaragobalazsyt.model.Dog;
import com.codecool.springbootfaragobalazsyt.service.DogStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dog")
public class DogController {

    @Autowired
    private DogStorage dogStorage;

    @GetMapping("/list")
    public List<Dog> dogList() {
        return dogStorage.getDogs();
    }

    @GetMapping("/random")
    public Dog createRandomDog() {
        return dogStorage.addRandomDog();
    }

    @PostMapping("/add")
    public Dog addDog(@RequestBody Dog dog) {
        this.dogStorage.addDog(dog);
        return dog;
    }

    @PutMapping("/{name}")
    public Dog update(@PathVariable("name") String name, @RequestBody Dog dog) throws Exception {
        return dogStorage.update(name, dog);
    }


}
