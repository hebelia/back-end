package com.hebelia.portfolio.controller;

import com.hebelia.portfolio.entity.Skill;
import com.hebelia.portfolio.service.SSkill;
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
@RequestMapping("skill") //https://portfolio-frontend-hlr.web.app/skill route
@CrossOrigin(origins = "https://portfolio-frontend-hlr.web.app")
public class CSkill {

    //    alias
    @Autowired
    SSkill skiServ;

    @GetMapping("/list")
    @ResponseBody
    public List<Skill> viewSkills() {
        return skiServ.viewSkills();
    }

    @GetMapping("/view/{id}") //id is dynamic
    @ResponseBody
    public Skill viewSkill(@PathVariable long id) {
        return skiServ.findSkill(id);
    }

    @PostMapping("/create")
    public String addSkill(@RequestBody Skill ski) {
        skiServ.createSkill(ski);
        return "La habilidad fue creada con exito";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteSkill(@PathVariable long id) {
        skiServ.deleteSkill(id);
        return "La habilidad fue eliminada con exito";
    }

    @PutMapping("/edit")
    public String updateSkill(@RequestBody Skill ski) {
        skiServ.editSkill(ski);
        return "La habilidad se actualizo con exito";
    }
        
    @PutMapping("/edit/{id}")
    public String updateSkillById(@PathVariable ("id") long id, Skill ski){
    skiServ.editSkill(ski);
    return "Los datos se actualizaron con exito";
    }
    
}
