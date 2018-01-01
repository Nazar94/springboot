package com.springboot.service;

import com.springboot.model.StackoverflowWebsite;
import com.springboot.persistance.StackOverflowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ServiceClass has a method findAll() that used in Controller for
 * getting all list in practice using interface service with implementing service
 */
@Service
public class StackOverflowService {

    @Autowired
    private StackOverflowRepository stackOverflowRepository;
/*
    public static List<StackoverflowWebsite> items = new ArrayList<>();

    static{
        items.add(new StackoverflowWebsite("stackoverflow", "http://stackoverflow.com",
                "https://wpshout.com/media/2017/10/stack_overflow.jpg","Stackoverflow(StackExchange)", "Description"));
        items.add(new StackoverflowWebsite("stackoverflow1", "http://stackoverflow.com",
                "https://wpshout.com/media/2017/10/stack_overflow.jpg","Stackoverflow(StackExchange)", "Description"));
        items.add(new StackoverflowWebsite("stackoverflow2", "http://stackoverflow.com",
                "https://wpshout.com/media/2017/10/stack_overflow.jpg","Stackoverflow(StackExchange)", "Description"));
        items.add(new StackoverflowWebsite("stackoverflow3", "http://stackoverflow.com",
                "https://wpshout.com/media/2017/10/stack_overflow.jpg","Stackoverflow(StackExchange)", "Description"));
        items.add(new StackoverflowWebsite("stackoverflow4", "http://stackoverflow.com",
                "https://wpshout.com/media/2017/10/stack_overflow.jpg","Stackoverflow(StackExchange)", "Description"));
        items.add(new StackoverflowWebsite("stackoverflow5", "http://stackoverflow.com",
                "https://wpshout.com/media/2017/10/stack_overflow.jpg","Stackoverflow(StackExchange)", "Description"));
    }
All datas are saved in db
*/

    /*Saving datas into database using @Postconstruct for initializing and calling method
    * after initializing bean
    * saving items(elements in mongo db)*/
/*    @PostConstruct
    public void init(){
        stackOverflowRepository.save(items);
    }

this method used once for saving datas to mongodb if use it once more it will save the same datas
*/
    public List<StackoverflowWebsite> findAll(){
        /*find all objects from repository*/
        return stackOverflowRepository.findAll();
    }
}
/**/