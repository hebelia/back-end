
package com.hebelia.portfolio.service;

import com.hebelia.portfolio.entity.Project;
import com.hebelia.portfolio.repository.RProject;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SProject {
      //    alias
    @Autowired
    public RProject projRep;

    public List<Project> viewProjects() {
        List<Project> listProjects= projRep.findAll();
        return listProjects;
    }
        public Project findProject(long id) {

          Project proj = projRep.findById(id).orElse(null);
          return proj;
    }
    public void createProject(Project proj) {
        projRep.save(proj);
    }
    public void editProject(Project proj) {
        projRep.save(proj);
    }
    public void deleteProject(long id) {
        projRep.deleteById(id);
    }
        public void updateProjectById(long id, Project proj){
        projRep.save(proj);
    }

}
