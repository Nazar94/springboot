package com.springboot.service;

import com.springboot.model.StackoverflowWebsite;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * ServiceClass has a method findAll() that used in Controller for
 * getting all list in practice using interface service with implementing service
 */
@Service
public class StackOverflowService {

    public static List<StackoverflowWebsite> items = new ArrayList<>();

    static{
        items.add(new StackoverflowWebsite("stackoverflow", "http://stackoverflow.com",
                "https://wpshout.com/media/2017/10/stack_overflow.jpg","Stackoverflow(StackExchange)", "Description"));
        items.add(new StackoverflowWebsite("stackoverflow", "http://stackoverflow.com",
                "https://wpshout.com/media/2017/10/stack_overflow.jpg","Stackoverflow(StackExchange)", "Description"));
        items.add(new StackoverflowWebsite("stackoverflow", "http://stackoverflow.com",
                "https://wpshout.com/media/2017/10/stack_overflow.jpg","Stackoverflow(StackExchange)", "Description"));
        items.add(new StackoverflowWebsite("stackoverflow", "http://stackoverflow.com",
                "https://wpshout.com/media/2017/10/stack_overflow.jpg","Stackoverflow(StackExchange)", "Description"));
        items.add(new StackoverflowWebsite("stackoverflow", "http://stackoverflow.com",
                "https://wpshout.com/media/2017/10/stack_overflow.jpg","Stackoverflow(StackExchange)", "Description"));
        items.add(new StackoverflowWebsite("stackoverflow", "http://stackoverflow.com",
                "https://wpshout.com/media/2017/10/stack_overflow.jpg","Stackoverflow(StackExchange)", "Description"));
    }


    public List<StackoverflowWebsite> findAll(){
        return items;
    }
}
