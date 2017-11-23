package Tools;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import com.relevantcodes.extentreports.LogStatus;

import common.TestCaseConfiguration;

public class Utility extends TestCaseConfiguration {

	public static void waitForAjaxToFinish(final int timeToWait) {
		int timeout = 0;
		 
		while(timeout < timeToWait) {
		    boolean ajaxFinished = (boolean) ((JavascriptExecutor) driver.get())
		            .executeScript("return !!jQuery && jQuery.active == 0");
		    
		    if(ajaxFinished) 
		        return;
		    
		    timeout++;
		    explicitlyWait(1000);
		}
		 
		throw new AssertionError("Ajax haven't finished its job in "+timeToWait+" sec");
	}


public static void explicitlyWait(int timeoutmsec) 
{
	try {
		Thread.sleep(timeoutmsec);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
public static boolean isElementPresent(WebElement w,String msg)
{
	try {
		
		Boolean b= w.isDisplayed();
		
		Reports.log(LogStatus.PASS, "Element: " +msg + " is displayed in the page" );
		return true;
      
    } catch (NoSuchElementException ex) { 
    	Reports.log(LogStatus.FAIL, "Element: " +msg + " is not displayed in the page" );
    	return false;
    }
	
	
}


public static boolean isElementPresentWithoutReport(WebElement w,String msg)
{
	try {
		
		Boolean b= w.isDisplayed();
		
		//Reports.log(LogStatus.PASS, "Element: " +msg + " is displayed in the page" );
		return true;
      
    } catch (NoSuchElementException ex) { 
    	//Reports.log(LogStatus.FAIL, "Element: " +msg + " is not displayed in the page" );
    	return false;
    }
	
	
}

public static boolean isEqual(String sExpected,String sActual)
{
	try {
		
		if(sExpected.toLowerCase().equalsIgnoreCase(sActual.toLowerCase()))
		{
		Reports.log(LogStatus.PASS, "Expected: " +sExpected + " and Actual is " + sActual );
		return true;
		}
		else { 
    	Reports.log(LogStatus.FAIL,"Expected: " +sExpected + " and Actual is " + sActual );
    	return false;
    }
	}
	catch (IndexOutOfBoundsException ex) { 
    	Reports.log(LogStatus.FAIL, "Element:" + sActual + " is not displayed in the page" );
    	return false;
    }
		catch (NoSuchElementException ex) { 
	    	Reports.log(LogStatus.FAIL, "Element: is not displayed in the page" );
	    	return false;
	    }
		
		catch (Exception ex) { 
			Reports.log(LogStatus.FAIL, "Element: "+ sActual + " is not displayed in the page" );
			return false;
    }
}

public static boolean isEqualWithoutReport(String sExpected,String sActual)
{
	try {
		
		if(sExpected.toLowerCase().equalsIgnoreCase(sActual.toLowerCase()))
		{
		Reports.log(LogStatus.PASS, "Expected: " +sExpected + " and Actual is " + sActual );
		return true;
		}
		else { 
    	Reports.log(LogStatus.PASS,"Expected: " +sExpected + " and Actual is " + sActual );
    	return false;
    }
	}
	catch (IndexOutOfBoundsException ex) { 
    	//Reports.log(LogStatus.FAIL, "Element:" + sActual + " is not displayed in the page" );
    	return false;
    }
		catch (NoSuchElementException ex) { 
	    	//Reports.log(LogStatus.FAIL, "Element: is not displayed in the page" );
	    	return false;
	    }
		
		catch (Exception ex) { 
			//Reports.log(LogStatus.FAIL, "Element: "+ sActual + " is not displayed in the page" );
			return false;
    }
}

public static boolean iscontains(String sExpected,String sActual)
{
	try
	{

		if(sExpected.toLowerCase().contains(sActual.toLowerCase()) || sActual.toLowerCase().contains(sExpected.toLowerCase()))
		{
		Reports.log(LogStatus.PASS, "Expected: " +sExpected + " and Actual is " + sActual );
		return true;
		}
		else { 
    	Reports.log(LogStatus.FAIL,"Expected: " +sExpected + " and Actual is " + sActual );
    	return false;
    }
		
	}	
	catch (IndexOutOfBoundsException ex) { 
    	Reports.log(LogStatus.FAIL, "Element:" + sActual + " is not displayed in the page" );
    	return false;
    }
		catch (NoSuchElementException ex) { 
	    	Reports.log(LogStatus.FAIL, "Element: is not displayed in the page" );
	    	return false;
	    }
	
	catch (Exception ex) { 
    	Reports.log(LogStatus.FAIL, "Element: "+ sActual + " is not displayed in the page" );
    	return false;
    }

}


public static boolean iscontainsWithoutReport(String sExpected,String sActual)
{
	try
	{

		if(sExpected.toLowerCase().contains(sActual.toLowerCase()) || sActual.toLowerCase().contains(sExpected.toLowerCase()))
		{
		//Reports.log(LogStatus.PASS, "Expected: " +sExpected + " and Actual is " + sActual );
		return true;
		}
		else { 
    	//Reports.log(LogStatus.FAIL,"Expected: " +sExpected + " and Actual is " + sActual );
    	return false;
    }
		
	}	
	catch (IndexOutOfBoundsException ex) { 
    	Reports.log(LogStatus.FAIL, "Element:" + sActual + " is not displayed in the page" );
    	return false;
    }
		catch (NoSuchElementException ex) { 
	    	Reports.log(LogStatus.FAIL, "Element: is not displayed in the page" );
	    	return false;
	    }
	
	catch (Exception ex) { 
    	Reports.log(LogStatus.FAIL, "Element: "+ sActual + " is not displayed in the page" );
    	return false;
    }

}



public static  void selectFromPopulatedListBox(WebElement w1,WebElement w2,WebElement w3,String sData)
{
	try {
		System.out.println("data is :  "+ sData);
		w1.click();
		Utility.waitForAjaxToFinish(4000);
		w2.sendKeys(sData);
		Utility.waitForAjaxToFinish(4000);
		w3.click();
		Utility.waitForAjaxToFinish(4000);
		Reports.log(LogStatus.PASS, sData +":  is selected from list box");
		
	}
	catch (IndexOutOfBoundsException ex) { 
		Reports.log(LogStatus.FAIL, "There is issue in :" + sData + " Selection" );
    	
    }
}

public static  void InvalidselectFromPopulatedListBox(WebElement w1,WebElement w2,WebElement w3,String sData)
{
	try {
		w1.click();
		Utility.waitForAjaxToFinish(4000);
		w2.sendKeys(sData);
		Utility.waitForAjaxToFinish(4000);
		w3.click();
		Utility.waitForAjaxToFinish(4000);
		String sExpected=w3.getText() ;
		if (Utility.iscontains(sExpected, "No results match"))
		{ 
			Reports.log(LogStatus.PASS, "Invalid item" + sData + " search populated 0 records");
		}
		else
		{
			Reports.log(LogStatus.FAIL,  "Invalid item" + sData + "search populated valid records");
		}
		
	}
	catch (IndexOutOfBoundsException ex) { 
		Reports.log(LogStatus.FAIL, "There is issue in :" + sData + " Selection" );
    	
    }
}


}