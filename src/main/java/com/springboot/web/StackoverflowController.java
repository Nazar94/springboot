package com.springboot.web;

import com.springboot.model.StackoverflowWebsite;
import com.springboot.service.StackOverflowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@Controller needed @ResponseBody if use controller
@RestController  //means that all method that is mapped on request will return response body
@RequestMapping("/api/stackoverflow")
public class StackoverflowController {
        @Autowired //Spring initialize Current bean-StackoverflowService and will connect it with Controller
        //StackoverflowController dont know anything about StackoverflowService so we can change stackoverflowService on smth. else
        //suitable for testing dont needed to use database or server just mocked class
        private StackOverflowService stackoverflowService;
    @RequestMapping
   // @ResponseBody//everything will be converted into json and sent
    //on client we want to get object
    /*
     $scope.websites = [{
        iconImageUrl: '',
        id: 'stackoverflow',
        website: 'stackoverflow.com',
        title: 'Stackoverflow website',
        description: 'StackOverflow description'
    }];
    */
    //this method only prepare response
    //stackoverflowService-class that returns all elements
    public List<StackoverflowWebsite> getListOfProviders(){

        return stackoverflowService.findAll();
    }
}
