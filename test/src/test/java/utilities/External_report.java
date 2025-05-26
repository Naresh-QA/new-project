package utilities;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class External_report implements ITestListener{
	
	//public class ExtentReport {
		
		public ExtentSparkReporter sparkreport;
		public ExtentReports extent;
		public ExtentTest test;
		public void onTestSuccess(ITestResult result) {
			 test=extent.createTest(result.getName());//creates new entry in the report
			 test.log(Status.PASS,"Test case passed is "+result.getName());//update the status
			 
			}
			public void onTestFailure(ITestResult result) {
				test=extent.createTest(result.getName());
				test.log(Status.FAIL,"Test case failed is "+result.getName());
				test.log(Status.FAIL, "testcase is failed due to "+result.getThrowable());//why failed
				
			  }
			public void onTestSkipped(ITestResult result) {
				test=extent.createTest(result.getName());
				test.log(Status.SKIP, "testcase is skipped due to "+result.getName());
				
			}
			public void onStart(ITestContext context) {
				sparkreport =new ExtentSparkReporter(System.getProperty("user.dir")+"/external_report/results.html");//location 
				 sparkreport.config().setDocumentTitle("automation report");//title of the report
				 sparkreport.config().setReportName("regression testing");//name of the report
				 sparkreport.config().setTheme(Theme.DARK);
				 extent =new ExtentReports();
				 extent.attachReporter(sparkreport);//we need to attach it in sparkreport
				 extent.setSystemInfo("computer name", "local host");
				 extent.setSystemInfo("Enviornment", "QA");
				 extent.setSystemInfo("tester name", "Naresh");
			  }
			public void onFinish(ITestContext context) {
				extent.flush();//This will update whole thing in the report

			} 
			}

