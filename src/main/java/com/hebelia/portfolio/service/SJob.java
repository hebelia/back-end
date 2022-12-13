
package com.hebelia.portfolio.service;

import com.hebelia.portfolio.entity.Job;
import com.hebelia.portfolio.repository.RJob;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SJob {
    //    alias
    @Autowired
    public RJob joRep;

    public List<Job> viewJobs() {
        List<Job> listJobs= joRep.findAll();
        return listJobs;
    }
        public Job findJob(long id) {
//        returns null if joson is not found
          Job jo = joRep.findById(id).orElse(null);
          return jo;
    }
    public void createJob(Job jo) {
        joRep.save(jo);
    }
    public void editJob(Job jo) {
        joRep.save(jo);
    }
    public void deleteJob(long id) {
        joRep.deleteById(id);
    }

}
