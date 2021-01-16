package com.ivoronline.springboot_db_postgresql.controllers;

import com.ivoronline.springboot_db_postgresql.entities.PersonEntity;
import com.ivoronline.springboot_db_postgresql.respositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

  @Autowired
  PersonRepository personRepository;

  @ResponseBody
  @RequestMapping("/addPerson")
  public String addPerson() {

    //CREATE PERSON ENTITY
    PersonEntity personEntity = new PersonEntity();
                 personEntity.name = "John";
                 personEntity.age  = 20;

    //STORE PERSON ENTITY
    personRepository.save(personEntity);

    //RETURN SOMETHING TO BROWSER
    return "Person added to DB";

  }

}
