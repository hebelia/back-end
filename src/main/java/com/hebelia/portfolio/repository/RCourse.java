
package com.hebelia.portfolio.repository;

import com.hebelia.portfolio.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RCourse extends JpaRepository <Course, Long>{
    
}

