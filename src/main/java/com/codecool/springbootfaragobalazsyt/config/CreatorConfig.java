package com.codecool.springbootfaragobalazsyt.config;

import com.codecool.springbootfaragobalazsyt.service.DogCreator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CreatorConfig {

    @Bean
    public DogCreator creator1() {
        return new DogCreator();
    }

    @Bean(name = "helloCreator")
    public DogCreator creator2() {
        return new DogCreator();
    }

}
