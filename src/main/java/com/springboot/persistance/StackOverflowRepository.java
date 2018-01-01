package com.springboot.persistance;


/*creates spring bean
* spring configures mongo template*/
/*
@Repository
public class StackOverflowRepository {
    /*Spring connects object automatically*/
/*    @Autowired
    private MongoTemplate mongoTemplate;

    public List<StackoverflowWebsite> findAll() {
        /*our collection will save objects pojo so method find all get this objects*/
 /*       return mongoTemplate.findAll(StackoverflowWebsite.class);
    }
}
this method coul be changed for the next:
*/

import com.springboot.model.StackoverflowWebsite;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StackOverflowRepository extends MongoRepository<StackoverflowWebsite, String> {
/* now method find all is configurated by spring when we extends from MongoRepository*/

/*    public List<StackoverflowWebsite> findAll() {
       return mongoTemplate.findAll(StackoverflowWebsite.class);
    }
    */
/*find obj StackoverflowWebsites by Websites method is configurated by spring
* using spring data*/
    List<StackoverflowWebsite> findByWebsite(String website);
}