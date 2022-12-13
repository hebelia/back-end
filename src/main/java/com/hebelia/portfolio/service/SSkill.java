package com.hebelia.portfolio.service;

import com.hebelia.portfolio.entity.Skill;
import com.hebelia.portfolio.repository.RSkill;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
//data skisistence
@Transactional
public class SSkill {

    //    alias
    @Autowired
    public RSkill skiRep;

    public List<Skill> viewSkills() {
        List<Skill> listSkills = skiRep.findAll();
        return listSkills;
    }

    public Skill findSkill(long id) {
//        returns null if skison is not found
        Skill ski = skiRep.findById(id).orElse(null);
        return ski;
    }

    public void createSkill(Skill ski) {
        skiRep.save(ski);
    }

    public void editSkill(Skill ski) {
        skiRep.save(ski);
    }

    public void deleteSkill(long id) {
        skiRep.deleteById(id);
    }

}
