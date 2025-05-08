package utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener  {
	
	 public void onStart(ITestContext context) {
		    System.out.println("Execution has started....");

		  }
	
	 public void onTestStart(ITestResult result) {
		    System.out.println("test case has started....");

		  }

		 
		  public void onTestSuccess(ITestResult result) {
			    System.out.println("test case has successed....");

		  }

		 
		  public  void onTestFailure(ITestResult result) {
			    System.out.println("test case has failed....");

		  }
		  public void onTestSkipped(ITestResult result) {
			    System.out.println("test case has skipped....");
			  }
		  public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			    System.out.println("test case couldenot able  to execute within time....");
			  }
		  public void onFinish(ITestContext context) {
			    System.out.println("Execution has completed....");
			  }


}
