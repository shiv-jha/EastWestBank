package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Home {
	@FindBy(name="passCount")
	 WebElement list_passcount;
	
	public void fillOrderForm()
	{
		new Select(list_passcount).selectByVisibleText("1");
		
	}

	public Home(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
