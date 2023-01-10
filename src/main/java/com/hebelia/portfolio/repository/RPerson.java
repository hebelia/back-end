
package com.hebelia.portfolio.repository;

import com.hebelia.portfolio.entity.Person;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RPerson extends JpaRepository <Person, Long>{
    //login method
    public List<Person> findByEmailAndPassword(String email, String password);

}
