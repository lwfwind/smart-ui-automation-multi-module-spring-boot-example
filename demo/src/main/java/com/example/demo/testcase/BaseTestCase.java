package com.example.demo.testcase;

import com.example.demo.Application;
import com.qa.framework.TestCaseBase;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = Application.class)
public class BaseTestCase extends TestCaseBase {
}
