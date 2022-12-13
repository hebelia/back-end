
package com.hebelia.portfolio.service;

import com.hebelia.portfolio.entity.Course;
import com.hebelia.portfolio.repository.RCourse;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SCourse {
    //    alias
    @Autowired
    public RCourse couRep;

    public List<Course> viewCourses() {
        List<Course> listCourses= couRep.findAll();
        return listCourses;
    }
        public Course findCourse(long id) {
//        returns null if cou is not found
          Course cou = couRep.findById(id).orElse(null);
          return cou;
    }
    public void createCourse(Course cou) {
        couRep.save(cou);
    }
    public void editCourse(Course cou) {
        couRep.save(cou);
    }
    public void deleteCourse(long id) {
        couRep.deleteById(id);
    }
    
}
