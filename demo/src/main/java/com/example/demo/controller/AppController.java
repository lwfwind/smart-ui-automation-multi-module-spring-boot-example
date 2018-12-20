package com.example.demo.controller;

import com.ui.automation.framework.testng.TestngRun;
import com.ui.automation.framework.testng.TestngXml;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zcp on 2017/11/20.
 */
@RestController
public class AppController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public void runAllTestNgMethods() {
        TestngRun.execute(TestngXml.autoGenerate(1));
    }

}
