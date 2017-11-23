package Pages;
import org.openqa.selenium.WebElement;
 
import org.openqa.selenium.support.FindBy;
 
import org.openqa.selenium.support.PageFactory;

import Tools.ReportManager;
import Tools.Utility;
import common.TestCaseConfiguration;
 
public class Login extends TestCaseConfiguration{
 
    /**
 
     * All WebElements are identified by @FindBy annotation
 
     */
 
 //   WebDriver driver;
 
    @FindBy(name="userName")

    WebElement userName;
 
    @FindBy(name="password")
 
    WebElement password;

    @FindBy(name="login")
 
    WebElement login;
    
    @FindBy(linkText="Logout")
    
    WebElement logout;

    public Login(){
 
       // this.driver = driver;
 
        //This initElements method will create all WebElements
 
        PageFactory.initElements(driver.get(), this);
 
    }
 
    //Set user name in textbox
 
    public void setUserName(String strUserName){
 
        userName.sendKeys(strUserName);   
 
    }
 
    //Set password in password textbox
 
    public void setPassword(String strPassword){
    password.clear();
    password.sendKeys(strPassword);
 
    }

    //Click on login button
 
    public void clickLogin(){
 
            login.click();
          
 
    }
    
    public void clickLogout(){
    	 
        logout.click();
      

}

    //Get the title of Login Page
 

    /**
 
     * This POM method will be exposed in test case to login in the application
 
     * @param strUserName
 
     * @param strPasword
 
     * @return
 
     */
 
    public HomePage login(String strUserName,String strPasword){
 
        //Fill user name
 
        this.setUserName(strUserName);
 
        //Fill password
 
        this.setPassword(strPasword);
 
        //Click Login button
 
        this.clickLogin();
        
		
		return new HomePage();
          
 
    }
 
}