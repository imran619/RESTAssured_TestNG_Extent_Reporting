package utilities;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReport {
	ExtentReports extent;
	ExtentTest logger;

	public void setUpReport() {
		
		extent = new ExtentReports(System.getProperty("user.dir") + "/ExtentReports/ExecutionReport.html", true);
		
	}

	public void logEvents(String value) {
		if (value=="Pass") {
			logger.log(LogStatus.PASS, value);			
		}
		else {
		logger.log(LogStatus.FAIL, value);
		}
	}

	public void startTestCase(String testcaseName) {
		logger = extent.startTest(testcaseName);
	}

	public void createFinalReport() {
		extent.flush();

	}

}
