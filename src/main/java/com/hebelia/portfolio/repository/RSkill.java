package com.hebelia.portfolio.repository;

import com.hebelia.portfolio.entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RSkill extends JpaRepository<Skill, Long> {

}
