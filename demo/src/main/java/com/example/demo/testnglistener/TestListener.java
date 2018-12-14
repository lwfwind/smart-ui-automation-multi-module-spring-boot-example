package com.example.demo.testnglistener;

import com.ui.automation.framework.testng.listener.ICustomTestListener;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.testng.ISuite;
import org.testng.ITestContext;
import org.testng.ITestResult;

@Component
public class TestListener implements ICustomTestListener {
    private static Logger logger = Logger.getLogger(TestListener.class);

    public void onTestFailure(ITestResult tr) {
        logger.info("onCustomTestFailure");
    }

    public void onTestSkipped(ITestResult tr) {
        logger.info("onCustomTestSkipped");
    }

    public void onTestSuccess(ITestResult tr) {
        logger.info("onCustomTestSuccess");
    }

    public void onTestStart(ITestResult tr) {
        logger.info("onTestStart");
    }

    public void onFinish(ISuite iSuite) {
        logger.info(iSuite.getName() + " finish");
    }

    public void onStart(ISuite iSuite) {
        logger.info(iSuite.getName() + " start");
    }

    public void onStart(ITestContext testContext) {
        logger.info("onStart");
    }

    ;

    public void onFinish(ITestContext testContext) {
        logger.info("onFinish");
    }

    ;

}
