package com.rmaslov.maven.console;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.rmaslov.maven.core.Person;
import com.rmaslov.maven.service.PersonService;

public class App {

    private static PersonService personService = new PersonService();
    public static void main(String[] args) throws JsonProcessingException {

        Person person = new Person();

        person.setLastname("Smith");
        person.setFirstName("Jon");

        System.out.println(person);

        String json = personService.convert(person);

        Person afterParse = personService.parse(json);

        System.out.println(afterParse);
    }
}
