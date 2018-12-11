package com.example.demo.testcase;

import com.example.demo.Application;
import com.qa.framework.SpringBootTestCaseBase;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = Application.class)
public class BaseTestCase extends SpringBootTestCaseBase {
}
