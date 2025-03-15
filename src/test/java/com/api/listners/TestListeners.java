package com.api.listners;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListeners implements ITestListener {

	private static final Logger logger = LogManager.getLogger(TestListeners.class);
	  public void onTestStart(ITestResult result) {
		    // not implemented
		  logger.info("Testsuite Started: "+result.getMethod().getMethodName());
		  }
	  public void onTestSuccess(ITestResult result) {
		    // not implemented
		  logger.info("Test success: "+result.getName());
		  }

		  
	  public void onTestFailure(ITestResult result) {
		    // not implemented
		  logger.error("Test Failure: "+result.getName());
		  }
	  public void onTestSkipped(ITestResult result) {
		    // not implemented
		  logger.info("Test Skipped: "+result.getName());
		  }
	  public void onFinish(ITestContext context) {
		    // not implemented
		  logger.info("Test Finish: "+context.getName());
		  }
	  
	   
	   public void onStart(ITestResult result) {
	     // not implemented
		   logger.info("Test started: "+result.getName());
	   }

}
