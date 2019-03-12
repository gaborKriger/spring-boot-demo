package com.codecool.springbootfaragobalazsyt;

import com.codecool.springbootfaragobalazsyt.service.DogCreator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringBootFaragoBalazsYtApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringBootFaragoBalazsYtApplication.class);

    @Autowired
    private DogCreator dogCreator;

    @Autowired
    private DogCreator creator1;

    @Autowired
    private DogCreator helloCreator;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootFaragoBalazsYtApplication.class, args);
    }

    @PostConstruct
    public void afterInit() {
        LOGGER.info(dogCreator.toString());
        LOGGER.info(dogCreator.createRandomDog().toString());

        LOGGER.info(creator1.toString());
        LOGGER.info(creator1.createRandomDog().toString());

        LOGGER.info(helloCreator.toString());
        LOGGER.info(helloCreator.createRandomDog().toString());


    }
}
