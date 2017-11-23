package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import common.TestCaseConfiguration;
import Pages.HomePage;
//import pages.Home;
//import pages.Login;
import Pages.Login;
public class sample extends TestCaseConfiguration {

	//@BeforeTest
  
  @Test
  public void test1() {
	  Reports.startTest("Login ");
	  Login loginobj=new Login();
	  loginobj.login("mercury","mercury");
	  Reports.log(LogStatus.PASS, "Login is successful");
	  HomePage homeobj=new HomePage();
	  Reports.endTest();
	 // homeobj.
	  
  }
}
