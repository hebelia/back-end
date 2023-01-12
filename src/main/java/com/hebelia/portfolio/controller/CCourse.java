
package com.hebelia.portfolio.controller;

import com.hebelia.portfolio.entity.Course;
import com.hebelia.portfolio.service.SCourse;
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
@RequestMapping("course") //https://portfolio-frontend-hlr.web.app/course route
@CrossOrigin(origins = "https://portfolio-frontend-hlr.web.app")
public class CCourse {
    //    alias
    @Autowired
    SCourse couServ;
    
    @GetMapping("/list")
    @ResponseBody
    public List <Course> viewCourses(){
        return couServ.viewCourses();
    }
    
    @GetMapping ("/view/{id}") //id is dynamic
    @ResponseBody
    public Course viewCourse(@PathVariable long id){
        return couServ.findCourse(id);
    }
    
    @PostMapping("/create")
    public String addCourse (@RequestBody Course cou){
        couServ.createCourse(cou);
        return "El curso fue creado con exito";
    }
    
    @DeleteMapping("/delete/{id}")
    public String deleteCourse(@PathVariable long id){
        couServ.deleteCourse(id);
        return "El curso fue eliminado con exito";
    }
    
    @PutMapping("/edit")
    public String updateCourse(@RequestBody Course cou){
        couServ.editCourse(cou);
        return "El curso se actualizo con exito";
    }
        
    @PutMapping("/edit/{id}")
    public String updateCourseById(@PathVariable ("id") long id, Course cou){
    couServ.editCourse(cou);
    return "Los datos se actualizaron con exito";
    }
    
    
}
