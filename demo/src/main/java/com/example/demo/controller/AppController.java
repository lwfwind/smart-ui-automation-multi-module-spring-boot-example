package com.example.demo.controller;

import com.ui.automation.framework.testng.TestngRun;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zcp on 2017/11/20.
 */
@RestController
public class AppController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public void apiOrderPlace() {
        TestngRun.execute("testng_1.xml");
        /*XmlSuite suite = new XmlSuite();
        suite.setName("MyTestSuite");

        List<XmlClass> classes = new ArrayList<XmlClass>();
        classes.add(new XmlClass("com.example.demo.testcase.SearchWithServiceTest"));

        XmlTest test = new XmlTest(suite);
        test.setName("MyTests");
        test.setXmlClasses(classes);

        List<XmlSuite> suites = new ArrayList<XmlSuite>();
        suites.add(suite);

        TestNG testNG = new TestNG();
        testNG.setXmlSuites(suites);
        testNG.run();*/
    }

}
