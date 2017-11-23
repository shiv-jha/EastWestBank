package common;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.relevantcodes.extentreports.ExtentReports;
//import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Pages.HomePage;
import Pages.Login;

import com.relevantcodes.extentreports.Chart;
//import com.relevantcodes.extentreports.ExtentReports;
//import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Tools.Excel;
//import Tools.Constants;
import Tools.ReportManager;
import Tools.Utility;


public class TestCaseConfiguration {
     protected Login loginobj = null;
     protected DesiredCapabilities  capabilities;
     public static  ExtentReports Reports;
     public static  String sExcelPath;
     public static  HomePage homePage;
     public static Dictionary<String, String> excelDict;
     
    // public static  String sClinicalBaseNavigation;
     

  	 //public static ThreadLocal<InternetExplorerDriver> driver;
     public static ThreadLocal<ChromeDriver> driver;

  	@BeforeSuite(alwaysRun = true)
  	@Parameters({"url"})
  	
     public void setup(String sUrl) throws InterruptedException {
    	 
  		final DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
        //capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
    	 String timestamp = new SimpleDateFormat("yyyyMMddhhmm'.html'").format(new Date());
 		 Reports = ReportManager.getReporter(System.getProperty("user.dir")+"\\Reports\\" +"report_" + timestamp);
    	// File file = new File(System.getProperty("user.dir")+"\\Resources\\" + "IEDriverServer.exe");
    	 File file = new File(System.getProperty("user.dir")+"\\Resources\\" + "chromedriver.exe");
		 //System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
		 System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
   	     //driver=new ThreadLocal<InternetExplorerDriver>()
		// sClinicalBaseNavigation="http://sub.npstg.azri.de";
   	    driver=new ThreadLocal<ChromeDriver>()
   	    		 {
   	   	         	@Override
   	   	         /*	protected InternetExplorerDriver initialValue()
   	   	         		{
   	   	         			return new InternetExplorerDriver(); 
   	   	                }
   	   	         	*/
   	   	      protected ChromeDriver initialValue()
	         		{
	         			return new ChromeDriver(); 
	                }
   	   	        };
   	   	  driver.get().get(sUrl);
		 //driver.get().manage().deleteAllCookies();
		 //driver.get().manage().window().maximize();
//		 driver.get().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		 sExcelPath=System.getProperty("user.dir")+"\\Resources\\" +"Test_data.xls";
//		 excelDict=Excel.readfromExcelinDict();
//		// driver.get().navigate().to("https://www.tiaa.org/");
//		 //System.out.println(excelDict.get("https://www.tiaa.org/"));
		 driver.get().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		// driver.get().navigate().to((String) excelDict.get("URL"));
//	
//		// driver.get().navigate().to(sUrl);
//		 driver.get().navigate().to("http://newtours.demoaut.com");
//		 driver.get().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		 loginobj = PageFactory.initElements(driver.get(), Login.class);
//		 Utility.explicitlyWait(6000);
//
//		 String userName=(String) excelDict.get("UserName");
//		 String password=(String) excelDict.get("Password");
//		 homePage= loginobj.login(userName,password);
//		 Utility.explicitlyWait(5000);
     
     }
    
     public WebDriver getDriver() // call this method to get the driver object and launch the browser
     {
        return driver.get();
     }
     
    // @AfterMethod
     public void close(ITestResult result) throws InterruptedException {   

    	 loginobj.clickLogout();
    	 driver.get().close();
    	 driver.get().quit();
    	 
 		
		/*if (!result.isSuccess()) {
			REPORT.log(LogStatus.FAIL, result.getThrowable());
		}
    	*/        
  }
    
    
     @AfterClass
     public void afterClass() { 
    	// loginobj.clickLogout();
    	 //driver.get().close();
    	 //driver.get().quit();
     }
     
     @AfterSuite
     public void afterSuite() {  
    	 
    	  //driver.get().close();
    	 //driver.get().quit();
    /*	 loginobj.clickLogout();
    	 driver.get().close();
    	 driver.get().quit();*/
    	 Reports.config().chartTitle(Chart.TEST, "Test Steps");
    	 Reports.config().chartTitle(Chart.TEST_SET, "Test Cases"); 
     }
}