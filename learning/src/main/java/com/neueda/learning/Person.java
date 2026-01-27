package com.neueda.learning;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component // comment this if you are using Application context
public class Person {
    private static final Logger logger= LoggerFactory.getLogger(Person.class);
    private final  Pet pet;

    //Dependency Injection(DI)
    public Person(Pet pet){
        this.pet=pet;
    } //@Qualifier has specificity higher than @Primary
    public void feedPet(){
        logger.info("Feeding Pet");
        pet.feed();

    }
}
