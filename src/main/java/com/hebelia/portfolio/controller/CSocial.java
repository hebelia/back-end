
package com.hebelia.portfolio.controller;

import com.hebelia.portfolio.entity.Social;
import com.hebelia.portfolio.service.SSocial;
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
@RequestMapping("socrse") //localhost:8080/socrse route
@CrossOrigin(origins = "http://localhost:4200")
public class CSocial {
    //    alias
    @Autowired
    SSocial socServ;
    
    @GetMapping("/list")
    @ResponseBody
    public List <Social> viewSocials(){
        return socServ.viewSocials();
    }
    
    @GetMapping ("/view/{id}") //id is dynamic
    @ResponseBody
    public Social viewSocial(@PathVariable long id){
        return socServ.findSocial(id);
    }
    
    @PostMapping("/create")
    public String addSocial (@RequestBody Social soc){
        socServ.createSocial(soc);
        return "La red social fue creada con exito";
    }
    
    @DeleteMapping("/delete/{id}")
    public String deleteSocial(@PathVariable long id){
        socServ.deleteSocial(id);
        return "La red social fue eliminada con exito";
    }
    
    @PutMapping("/edit")
    public String updateSocial(@RequestBody Social soc){
        socServ.editSocial(soc);
        return "La red social se actualizo con exito";
    }
        
    @PutMapping("/edit/{id}")
    public String updateSocialById(@PathVariable ("id") long id, Social soc){
    socServ.editSocial(soc);
    return "Los datos se actualizaron con exito";
    }
    
    
}
