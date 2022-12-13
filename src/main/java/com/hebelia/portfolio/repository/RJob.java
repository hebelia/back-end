package com.hebelia.portfolio.repository;

import com.hebelia.portfolio.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RJob extends JpaRepository <Job, Long>{
    
}
