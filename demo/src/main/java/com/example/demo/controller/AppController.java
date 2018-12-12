package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zcp on 2017/11/20.
 */
@RestController
public class AppController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String apiOrderPlace() {
        return "test";
    }

}
