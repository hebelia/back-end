
package com.hebelia.portfolio.controller;

import com.hebelia.portfolio.entity.Project;
import com.hebelia.portfolio.service.SProject;
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
@RequestMapping("project") //localhost:8080/project route
@CrossOrigin(origins = "http://localhost:4200")

public class CProject {
    //    alias
    @Autowired
    SProject projServ;
    
    @GetMapping("/list")
    @ResponseBody
    public List <Project> viewProjects(){
        return projServ.viewProjects();
    }
    
    @GetMapping ("/view/{id}") //id is dynamic
    @ResponseBody
    public Project viewProject(@PathVariable long id){
        return projServ.findProject(id);
    }
    
    @PostMapping("/create")
    public String addProject (@RequestBody Project proj){
        projServ.createProject(proj);
        return "El proyecto fue creado con exito";
    }
    
    @DeleteMapping("/delete/{id}")
    public String deleteProject(@PathVariable long id){
        projServ.deleteProject(id);
        return "El proyecto fue eliminado con exito";
    }
    
    @PutMapping("/edit")
    public String updateProject(@RequestBody Project proj){
        projServ.editProject(proj);
        return "El proyecto se actualizo con exito";
    }
    
}
