package extentreport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;



public class Extent {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		ExtentReports report=new ExtentReports("E:\\Repo.html");
		ExtentTest test=report.startTest("Verifying application");
		
		WebDriver driver=new FirefoxDriver();
		//test.log(LogStatus.INFO, "brstared");
		test.log(LogStatus.INFO, "primusbank");
		driver.get("http://primusbank.qedgetech.com/");
		test.log(LogStatus.INFO, "Application running");
		String actresult=driver.getTitle();
		if (actresult.equalsIgnoreCase("Primus BankK")) {
			test.log(LogStatus.PASS, "title matched");
		}
			else {
				test.log(LogStatus.FAIL, "title mismatched");
			}
			report.endTest(test);
			report.flush();
			
		
		
	
	}

	

}
