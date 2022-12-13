
package com.hebelia.portfolio.repository;
import com.hebelia.portfolio.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RProject extends JpaRepository<Project, Long>{
    
}
