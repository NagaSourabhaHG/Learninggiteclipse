import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtenttReportt {

	public static void main(String[] args) {
		
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	
 ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(new  File("C:/Users/SOURABHA/Desktop/HTML pages/S1.html"));
ExtentReports extent = new ExtentReports();	


extent.attachReporter(htmlReporter);

ExtentTest test = extent.createTest("homepage");
driver.get("http://www.google.com");

String At = driver.getTitle();
String et="Google";
if(At.equals(et))
{
	test.log(Status.PASS,"navigated to the target url");
	test.log(Status.INFO, "");

	}
else
	
	test.log(Status.FAIL, "target url is not working");

driver.close();
extent.flush();


	}
}
