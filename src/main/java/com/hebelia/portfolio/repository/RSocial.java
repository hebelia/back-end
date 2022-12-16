
package com.hebelia.portfolio.repository;

import com.hebelia.portfolio.entity.Social;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RSocial extends JpaRepository <Social, Long>{
    
}
