
package com.hebelia.portfolio.service;

import com.hebelia.portfolio.entity.Person;
import com.hebelia.portfolio.repository.RPerson;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
//data persistence
@Transactional
public class SPerson {
//    alias
    @Autowired
    public RPerson perRep;

    public List<Person> viewPeople() {
        List<Person> listPeople= perRep.findAll();
        return listPeople;
    }
        public Person findPerson(long id) {
//        returns null if person is not found
          Person per = perRep.findById(id).orElse(null);
          return per;
    }
    public void createPerson(Person per) {
        perRep.save(per);
    }
    public void editPerson(Person per) {
        perRep.save(per);
    }
    public void deletePerson(long id) {
        perRep.deleteById(id);
    }
//    review
    public void updatePersonById(long id, Person per){
        perRep.save(per);
    }

}
