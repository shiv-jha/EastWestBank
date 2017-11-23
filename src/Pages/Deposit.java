package Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.LogStatus;

import Tools.Utility;
import common.TestCaseConfiguration;

public class Deposit extends TestCaseConfiguration{

	
	 @FindBy(linkText="Home")
	 WebElement home_link;
	
	 @FindBy(id="edit-cid")
	 WebElement txt_center_name;
	 
	 @FindBy(id="edit-field-bill-date-value-min-datepicker-popup-0")
	 WebElement dt_start_date;
	 
	 @FindBy(id="edit-field-bill-date-value-max-datepicker-popup-0")
	 WebElement dt_end_date;
	 
	 @FindBy(id="edit-submit-billing-reports-1")
	 WebElement btn_deposit_apply;
	 
	 @FindBy(className="views-table cols-14")
	 WebElement tbl_center;
	 
	 @FindBy(xpath="//table[@class='views-table cols-14']/thead/tr/th")
	 List <WebElement> center_table_headings;
		 
	 @FindBy(xpath="//table[@class='views-table cols-14']/tbody/tr")
	 List <WebElement> center_table_rows;
	 
	 @FindBy(xpath="//table[@class='views-table cols-14']/tbody/tr[1]/td")
	 List <WebElement> center_table_first_row_cols;
	 
	 @FindBy(xpath="//div[@id='edit_cid_chosen']/a/span")
	 WebElement click_To_Select;
	
	@FindBy(xpath="//div[@id='edit_cid_chosen']/div/div/input")
	WebElement txt_item_search;
	
	@FindBy(xpath="//div[@id='edit_cid_chosen']/div/ul/li[1]")
	WebElement link_searched_item;
	
	@FindBy(xpath="//div[@id='edit_cid_chosen']/div/ul")
	WebElement searched_result;
	
	
	
	public void verifyFieldAvailiblity()
	{
		
		Utility.isElementPresent(txt_center_name, "Center Name text field");
		Utility.isElementPresent(dt_start_date, "Start date - Date picker");
		Utility.isElementPresent(dt_end_date, "End date - Date picker");
		Utility.isElementPresent(btn_deposit_apply, "Apply Button");
		Utility.isEqual("Guest Type",center_table_headings.get(0).getText());
		Utility.isEqual("Guest ID",center_table_headings.get(1).getText());
		Utility.isEqual("Bill Date",center_table_headings.get(2).getText());
		Utility.isEqual("Bill Number",center_table_headings.get(3).getText());
		Utility.isEqual("Rate Plan",center_table_headings.get(4).getText());
		Utility.isEqual("Patient Name",center_table_headings.get(5).getText());
		Utility.isEqual("Item Description",center_table_headings.get(6).getText());
		Utility.isEqual("Amount",center_table_headings.get(7).getText());
		Utility.isEqual("Discount",center_table_headings.get(8).getText());
		Utility.isEqual("Net Amount",center_table_headings.get(9).getText());
		Utility.isEqual("Quantity",center_table_headings.get(10).getText());
		Utility.isEqual("Acquisition Source",center_table_headings.get(11).getText());
		Utility.isEqual("Center Name",center_table_headings.get(12).getText());
		Utility.isEqual("Primary Nephrologist",center_table_headings.get(13).getText());
		
	}
	
	public void verifyFilterationWithDate()
	{
		//txt_center_name.clear();
		
		System.out.println("start date:=  " + excelDict.get("valid_start_date"));
		
		System.out.println("end date:=  " + excelDict.get("valid_end_date"));
		dt_start_date.clear();
		dt_start_date.sendKeys(excelDict.get("valid_start_date"));
		dt_end_date.clear();
		dt_end_date.sendKeys(excelDict.get("valid_end_date"));
		
		btn_deposit_apply.click();
		Utility.explicitlyWait(4000);
		boolean bolDateFlag=false;
    	for(WebElement data:center_table_rows)
    	{
    		if (data.getText().contains(excelDict.get("valid_start_date")))
    		{
    			bolDateFlag=true;
    		}
    	}
    	if(bolDateFlag==true)
    	{
    		Reports.log(LogStatus.PASS, "Date filteration functinality successful");
    	}
    	else
    	{
    		Reports.log(LogStatus.FAIL, "Date filteration functinality failed");
    	}
		
	}
	
	public void verifyDateRangeError()
	{
		//txt_center_name.clear();
		dt_start_date.clear();
		dt_start_date.sendKeys(excelDict.get("invalid_start_date"));
		dt_end_date.clear();
		dt_end_date.sendKeys(excelDict.get("invalid_end_date"));
		btn_deposit_apply.click();
		btn_deposit_apply.click();
    	Utility.explicitlyWait(3000);
    	Reports.log(LogStatus.FAIL, "Date filteration Error functinality failed");
	}
	
	public void verifyInvalidcenter()
	{	
		//txt_center_name.clear();
		Utility.InvalidselectFromPopulatedListBox(click_To_Select, txt_item_search, searched_result,excelDict.get("invalid_center_search"));
		//btn_deposit_apply.click();
		Utility.waitForAjaxToFinish(5000);
		
		System.out.println(" invalid center: " +excelDict.get("invalid_center_search"));
		String sExpected=searched_result.getText() ;
		if (Utility.iscontains(sExpected, "No results match"))
		{ 
			Reports.log(LogStatus.PASS, "Invalid item search functionality passed");
		}
		else
		{
			Reports.log(LogStatus.FAIL,  "Invalid item search functionality failed");
		}

	}
	
	public boolean verifyDepositNodeCreation(String sDate,String sGuest,String sQty)
	{
		if (center_table_rows.size()>0)
		{
			Reports.log(LogStatus.PASS, "Deposits node are available in page");
		}
		else
		{
			Reports.log(LogStatus.FAIL,  "Deposits node are not available in page");
		}
		
		if (Utility.iscontains(center_table_first_row_cols.get(2).getText(),sDate) &&
		Utility.iscontains(center_table_first_row_cols.get(5).getText(),sGuest) &&
		Utility.iscontains(center_table_first_row_cols.get(10).getText(),sQty))
		{
		return true;
		}
		else
			return false;
	}
	
	public void verifyCenterSearch()
	{
		Utility.selectFromPopulatedListBox(click_To_Select, txt_item_search, link_searched_item, excelDict.get("valid_center_search"));
		btn_deposit_apply.click();
		Utility.waitForAjaxToFinish(5000);
		//System.out.println(" valid center: " +excelDict.get("valid_center_search"));
		if (center_table_rows.size()>0)
		{
			Reports.log(LogStatus.PASS, "valid center search returned  records");
		}
		else
		{
			Reports.log(LogStatus.FAIL, "Valid center search returned 0 records");
		}
		
		System.out.println(" valid center result: " +excelDict.get("valid_center_result"));
		if (center_table_rows.get(0).getText().contains(excelDict.get("valid_center_result")))
			                                                            
		{
			Reports.log(LogStatus.PASS, "valid center search functionality passed");
		}
		else
		{
			Reports.log(LogStatus.FAIL, "valid center search functionality failed");
		}
		
	}
	
	/*public void verifyNoDataSearch()
	{
		txt_center_name.clear();
		txt_center_name.sendKeys("invalid");
	}*/
	
	
	
	
	 public Deposit()
	  {
		  PageFactory.initElements(driver.get(), this);
	  }
	
}
