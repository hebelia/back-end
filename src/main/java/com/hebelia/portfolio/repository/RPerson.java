
package com.hebelia.portfolio.repository;

import com.hebelia.portfolio.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RPerson extends JpaRepository <Person, Long>{
//    other methods
}
