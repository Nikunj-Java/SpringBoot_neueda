package com.neueda.learning;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LearningApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningApplication.class, args);
	}

    //@Bean- used to create Object of class
//    @Bean
//    public CommandLineRunner demo(Person person){
//        return  args -> {
//            person.feedPet();
//        };
//    }

    @Bean
    public CommandLineRunner demo(ApplicationContext context){
        return args -> {
            String petType=args.length>0 ? args[0] :"dog";
            Pet pet=context.getBean(petType, Pet.class);
            Person person= new Person(pet);
            person.feedPet();
        };
    }

}
