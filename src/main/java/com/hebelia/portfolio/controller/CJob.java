
package com.hebelia.portfolio.controller;

import com.hebelia.portfolio.entity.Job;
import com.hebelia.portfolio.service.SJob;
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
@RequestMapping("job") //localhost:8080/job route
@CrossOrigin(origins = "http://localhost:4200")
public class CJob {
//    alias
    @Autowired
    SJob joServ;
    
    @GetMapping("/list")
    @ResponseBody
    public List <Job> viewJobs(){
        return joServ.viewJobs();
    }
    
    @GetMapping ("/view/{id}") //id is dynamic
    @ResponseBody
    public Job viewJob(@PathVariable long id){
        return joServ.findJob(id);
    }
    
    @PostMapping("/create")
    public String addJob (@RequestBody Job jo){
        joServ.createJob(jo);
        return "El trabajo fue creado con exito";
    }
    
    @DeleteMapping("/delete/{id}")
    public String deleteJob(@PathVariable long id){
        joServ.deleteJob(id);
        return "El trabajo fue eliminado con exito";
    }
    
    @PutMapping("/edit")
    public String updateJob(@RequestBody Job jo){
        joServ.editJob(jo);
        return "El trabajo se actualizo con exito";
    }

}
