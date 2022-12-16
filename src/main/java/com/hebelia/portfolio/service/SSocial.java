
package com.hebelia.portfolio.service;

import com.hebelia.portfolio.entity.Social;
import com.hebelia.portfolio.repository.RSocial;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Transactional
@Service
public class SSocial {
  //    alias
    @Autowired
    public RSocial socRep;

    public List<Social> viewSocials() {
        List<Social> listSocials= socRep.findAll();
        return listSocials;
    }
        public Social findSocial(long id) {

          Social soc = socRep.findById(id).orElse(null);
          return soc;
    }
    public void createSocial(Social soc) {
        socRep.save(soc);
    }
    public void editSocial(Social soc) {
        socRep.save(soc);
    }
    public void deleteSocial(long id) {
        socRep.deleteById(id);
    }
     public void updateSocialById(long id, Social soc){
        socRep.save(soc);
    }

}
