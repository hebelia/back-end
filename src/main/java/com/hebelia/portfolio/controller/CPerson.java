package com.hebelia.portfolio.controller;

import com.hebelia.portfolio.entity.Person;
import com.hebelia.portfolio.service.SPerson;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("person") //localhost:8080/person route
@CrossOrigin(origins = "http://localhost:4200")
public class CPerson {
//    alias
    @Autowired
    SPerson perServ;
    
    @GetMapping("/list")
    @ResponseBody
    public List <Person> viewPeople(){
        return perServ.viewPeople();
    }
    
    @GetMapping ("/view/{id}") //id is dynamic
    @ResponseBody
    public Person viewPerson(@PathVariable long id){
        return perServ.findPerson(id);
    }
    
    @PostMapping("/create")
    public String addPerson (@RequestBody Person per){
        perServ.createPerson(per);
        return "La persona fue creada con exito";
    }
    
    @DeleteMapping("/delete/{id}")
    public String deletePerson(@PathVariable long id){
        perServ.deletePerson(id);
        return "La persona fue eliminada con exito";
    }
    
    @PutMapping("/edit")
    public String updatePerson(@RequestBody Person per){
        perServ.editPerson(per);
        return "La persona se actualizo con exito";
    }
//    review
    @PutMapping("/edit/{id}")
    public String updatePersonById(@PathVariable ("id") long id, Person per){
    perServ.editPerson(per);
    return "Los datos se actualizaron con exito";
    }
    
}
