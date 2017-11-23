package Pages;


import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.LogStatus;

import Tools.Utility;
import common.TestCaseConfiguration;

public class HomePage extends TestCaseConfiguration{

	@FindBy(linkText="Home")
	WebElement home_link;

	//Voided bills navigation 
	@FindBy(linkText="Voided Bills")
	WebElement voidedBills;

	@FindBy(linkText="BILLING")
	WebElement billing_menu;

	@FindBy(xpath="//div[@id='bill_cycle_data_chosen']/a/span")
	WebElement click_To_Select_billing_cycle;

	@FindBy(xpath="//div[@id='bill_cycle_data_chosen']/div/div/input")
	WebElement txt_item_search_billing_cycle;

	@FindBy(xpath="//div[@id='bill_cycle_data_chosen']/div/ul/li[1]")
	WebElement link_searched_item_billing_cycle;


	@FindBy(xpath="//a[contains(@href , '/reports/billing/revenue_report') and contains(@class, 'sf-depth-2 menuparent')]")
	WebElement Report_sub_menu;


	//Create services navigation 
	@FindBy(xpath="//a[contains(@href , '/node/add/service') and contains(@class, 'sf-depth-3')]")
	WebElement new_services;


	@FindBy(xpath="//a[contains(@href , '/services') and contains(@class, 'sf-depth-2 menuparent')]")
	WebElement services_sub_menu;

	@FindBy(xpath="//a[contains(@href , '/services') and contains(@class, 'sf-depth-3')]")
	WebElement link_list_services;


	//Rate plans object

	@FindBy(xpath="//a[contains(@href , '/billing/rate-plans')]")
	WebElement rate_plan_menu;

	@FindBy(xpath="//a[contains(@href , '/node/add/rate-plan')]")
	WebElement rate_plan_add;

	@FindBy(xpath="//a[contains(@href , '/billing/rate-plans') and contains(@class, 'sf-depth-3')]")
	WebElement link_list_rate_plans;


	//Billing->Package

	@FindBy(xpath="//a[contains(@href , '/billing/packages')]")
	WebElement packages_menu;

	@FindBy(xpath="//a[contains(@href , '/node/add/package')]")
	WebElement package_add_link;

	//Billing->Reports->Deposit

	@FindBy(xpath="//a[contains(@href , '/reports/billing/deposits')]")
	WebElement reports_deposit;

	//Billing->Reports->Deposit utilisation report

	@FindBy(xpath="//a[contains(@href , '/deposit-utilisation-report')]")
	WebElement deposit_utilisation_reports;

	//Billing->Reports-> Deposit Till Date
	@FindBy(xpath="//a[contains(@href , '/report/deposit')]")
	WebElement deposit_till_date;

	//open bill reports
	@FindBy(xpath="//a[contains(@href , '/reports/billing/open')]")
	WebElement open_bill_reports;


	@FindBy(xpath="//a[contains(@href , '/reports/billing/collections')]")
	WebElement collections_reports;

	@FindBy(xpath="//a[contains(@href , '/reports/billing/consultations')]")
	WebElement consultations_reports;

	@FindBy(xpath="//a[contains(@href , '/bill/change/requests')]")
	WebElement bill_change_requests_reports;

	@FindBy(xpath="//a[contains(@href , '/package-utilisation-report')]")
	WebElement package_utilisation_report;

	@FindBy(xpath="//a[contains(@href , '/revenue/today')]")
	WebElement today_revenue_report;
	//
	@FindBy(xpath="//a[contains(@href , '/reports/billing/revenue_report') and contains(@class, 'sf-depth-3')]")
	WebElement new_revenue_report;

	//esic revenue report
	@FindBy(xpath="//a[contains(@href , '/reports/billing/revenue-esic')]")
	WebElement esic_revenue_report;

	//optimized bill list
	@FindBy(xpath="//a[contains(@href , '/all-bills')]")
	WebElement optimized_bill_list;


	//Insurance Pre Auth
	@FindBy(xpath="//a[contains(@href , '/pre-auth-list') and contains(@class, 'sf-depth-2 menuparent')]")
	WebElement insurance_sub_menu;

	//Insurance Pre Auth
	@FindBy(xpath="//a[contains(@href , '/node/add/insurance-pre-auth') and contains(@class, 'sf-depth-3')]")
	WebElement add_insurance_preAuths;


	//
	@FindBy(xpath="//a[contains(@href , '/center/rateplans') and contains(@class, 'sf-depth-3')]")
	WebElement center_rate_plans;

	@FindBy(xpath="//a[contains(@href , '/guests')]")
	WebElement guests_menu;

	@FindBy(linkText="Guests Reports")
	WebElement link_guests_report;

	@FindBy(xpath="//a[contains(@href , '/complete-guest-list')]")
	WebElement complete_guest_link;


	@FindBy(xpath="//a[contains(@href , '/center-messages')]")
	WebElement bill_msg_center_wise;

	@FindBy(xpath="//a[contains(@href , '/sng-bill-submission')]")
	WebElement sng_bill_submission;

	@FindBy(xpath="//a[contains(@href , '/reports/billing/optimize-revenue-summary')]")
	WebElement revenue_report_summary;


	@FindBy(xpath="//a[contains(@href , '/people/admin')]")
	WebElement link_administrator;

	@FindBy(id="edit-masquerade-user-field")
	WebElement txt_masquerade_as;

	@FindBy(id="edit-submit")
	WebElement btn_go;

	@FindBy(id="messages")
	WebElement div_msg;

	@FindBy(xpath="//a[contains(@href , '/np-bill')]")
	WebElement new_bill;

	@FindBy(xpath="//a[contains(@href , '/billdate-update')]")
	WebElement bill_date_update;

	@FindBy(xpath="//a[contains(@href , '/monthly-revenue-report')]")
	WebElement monthly_revenue_reports;



	//Inventory Navigation


	@FindBy(linkText="INVENTORY")
	WebElement inventory_menu;

	@FindBy(xpath="//a[contains(@href , '/inventory/indents/list') and contains(@class, 'sf-depth-2 menuparent')]")
	WebElement indent_sub_menu;
		

	@FindBy(xpath="//a[contains(@href , '/node/add/indent')]")
	WebElement link_new_indent;

	@FindBy(xpath="//a[contains(@href ,'/inventory/indents/list')]")
	WebElement link_list_indent;

	@FindBy(xpath="//a[contains(@href , '/inventory/po/open?type_1=purchase_order')]")
	WebElement purchase_order_sub_menu;

	@FindBy(xpath="//a[contains(@href , '/np/create/po')]")
	WebElement link_new_po;
	
	@FindBy(xpath="//a[contains(@href , '/inventory/po/approve')]")
	WebElement link_approve_po;
	
	@FindBy(xpath="//a[contains(@href , '/inventory/po/open')]")
	WebElement link_open_po;
	
	

	@FindBy(xpath="//a[contains(@href ,'/transfers/list') and contains(@class, 'sf-depth-2 menuparent')]")
	WebElement transfer_sub_menu;

	@FindBy(xpath="//a[contains(@href , '/node/add/transfer')]")
	WebElement link_new_transfer;

	@FindBy(xpath="//a[contains(@href , '/inventory/indents/monthlySummary')]")
	WebElement link_indent_summary;

//	ref="http://npstg.azri.de/sessions/all"
	//@FindBy(xpath="//a[contains(@href , 'http://npstg.azri.de/sessions/all']")
	//WebElement clinical_menu;
	
	@FindBy(xpath="//ul[@id='superfish-1']/li[9]/a")
	WebElement clinical_menu;
	
	@FindBy(xpath="//a[contains(@href , '/investigations') and contains(@class, 'sf-depth-2 menuparent')]")
	WebElement investigation_sub_menu;

	@FindBy(xpath="//a[contains(@href , '/node/add/investigation')]")
	WebElement link_new_investigation;


	@FindBy(xpath="//a[contains(@href , '/events/optimized-report') and contains(@class, 'sf-depth-2 menuparent')]")
	WebElement events_sub_menu;

	@FindBy(xpath="//a[contains(@href , '/node/add/event')]")
	WebElement link_new_event;

	@FindBy(xpath="//a[contains(@href , '/complete-guest-list')]")
	WebElement link_complete_guest;

	@FindBy(xpath="//a[contains(@href , '/node/add/daily-quality-report')]")
	WebElement link_daily_quality_report;

	@FindBy(xpath="//a[contains(@href , '/node/add/daily-quality-report')]")
	WebElement link_new_daily_qualiy_report;

	@FindBy(linkText="Clinical Reports")
	WebElement link_clinical_reports;

	@FindBy(xpath="//a[contains(@href , '/outcome-data-report')]")
	WebElement link_outcome_data_report;

	@FindBy(xpath="//a[@href = '/longitudinal-data']")
	WebElement link_longitudinal_data;
	
	@FindBy(xpath="//a[contains(@href , '/clinical-summary/list') and contains(@class, 'sf-depth-2 menuparent')]")
	WebElement monthly_clinical_summary_submenu;
	
	@FindBy(xpath="//a[contains(@href , '/monthly-clinical-summary')]")
	WebElement link_monthly_clinical_summary;
	
	@FindBy(linkText="Devel")
	WebElement link_devel;
	
	@FindBy(linkText="Switch back")
	WebElement link_switch_back;
	
	@FindBy(xpath="//a[contains(@href , '/dashboard')]")
	WebElement link_view;
	
	
	


	public NewBill navigateNewBill(){

		if (navigateTwoLayer(billing_menu,new_bill,"Billing->New" ))
		{

			Utility.selectFromPopulatedListBox(click_To_Select_billing_cycle, txt_item_search_billing_cycle, link_searched_item_billing_cycle, "1");
			return new NewBill();
		}
		else
		{
			return null;
		}

	}


	public Deposit NavigateReportsDeposit(){
		if (navigateThreeLayer(billing_menu,Report_sub_menu,reports_deposit,"Billing->Reports->Deposit" ))
		{
			return new Deposit();
		}
		else
		{
			return null;
		}

	}

	




	public boolean navigateThreeLayer(WebElement w1,WebElement w2,WebElement w3,String sNavigation )
	{
		JavascriptExecutor js = (JavascriptExecutor) driver.get(); 
		try
		{

			String mouseOverScript = "if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseover', true, false); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";  
			js.executeScript(mouseOverScript, w1);
			Utility.explicitlyWait(2000);
			System.out.println(1);
			js.executeScript(mouseOverScript, w2);
			Utility.explicitlyWait(4000);
			System.out.println(2);
			js.executeScript("arguments[0].click();", w3);
			Utility.explicitlyWait(2000);
			Reports.log(LogStatus.PASS, "Navigation to " + sNavigation);
			return true;
		}
		catch(NoSuchElementException e1)
		{   
			// home_link.click();
			js.executeScript("arguments[0].click();", home_link);
			Utility.explicitlyWait(4000);
			Utility.waitForAjaxToFinish(5000);
			//JavascriptExecutor js = (JavascriptExecutor) driver.get();  
			String mouseOverScript = "if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseover', true, false); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";  
			js.executeScript(mouseOverScript, w1);
			Utility.explicitlyWait(2000);
			System.out.println(1);
			js.executeScript(mouseOverScript, w2);
			Utility.explicitlyWait(4000);
			System.out.println(2);
			js.executeScript("arguments[0].click();", w3);
			Utility.explicitlyWait(2000);
			Reports.log(LogStatus.PASS, "Navigation to " + sNavigation);
			return true;
		}
		catch(ElementNotVisibleException e2)
		{
			//home_link.click();
			js.executeScript("arguments[0].click();", home_link);
			Utility.explicitlyWait(4000);
			Utility.waitForAjaxToFinish(5000);
			//JavascriptExecutor js = (JavascriptExecutor) driver.get();  
			String mouseOverScript = "if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseover', true, false); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";  
			js.executeScript(mouseOverScript, w1);
			Utility.explicitlyWait(2000);
			System.out.println(1);
			js.executeScript(mouseOverScript, w2);
			Utility.explicitlyWait(4000);
			System.out.println(2);
			js.executeScript("arguments[0].click();", w3);
			Utility.explicitlyWait(2000);
			Reports.log(LogStatus.PASS, "Navigation to " + sNavigation);
			return true;
		}
		catch(Exception e)
		{
			Reports.log(LogStatus.FAIL,"Navigation to " + sNavigation); 
			e.printStackTrace();
			return false;
		}
	}


	public boolean navigateTwoLayer(WebElement w1,WebElement w2,String sNavigation )
	{
		JavascriptExecutor js = (JavascriptExecutor) driver.get(); 
		try
		{

			String mouseOverScript = "if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseover', true, false); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";  
			System.out.println(1);
			js.executeScript(mouseOverScript, w1);
			Utility.explicitlyWait(2000);
			System.out.println(2);
			js.executeScript("arguments[0].click();", w2);
			System.out.println(3);
			Utility.explicitlyWait(2000);
			Reports.log(LogStatus.PASS, "Navigation to " + sNavigation);
			return true;
		}
		catch(NoSuchElementException e1)
		{   
			//home_link.click();

			js.executeScript("arguments[0].click();", home_link);
			Utility.explicitlyWait(4000);
			Utility.waitForAjaxToFinish(5000);
			// JavascriptExecutor js = (JavascriptExecutor) driver.get();  
			String mouseOverScript = "if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseover', true, false); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";  
			js.executeScript(mouseOverScript, w1);
			Utility.explicitlyWait(2000);
			js.executeScript("arguments[0].click();", w2);
			Utility.explicitlyWait(2000);
			Reports.log(LogStatus.PASS, "Navigation to " + sNavigation);
			return true;
		}
		catch(ElementNotVisibleException e2)
		{
			// home_link.click();
			js.executeScript("arguments[0].click();", home_link);
			Utility.explicitlyWait(4000);
			Utility.waitForAjaxToFinish(5000);
			// JavascriptExecutor js = (JavascriptExecutor) driver.get();  
			String mouseOverScript = "if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseover', true, false); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";  
			js.executeScript(mouseOverScript, w1);
			Utility.explicitlyWait(2000);
			js.executeScript("arguments[0].click();", w2);
			Utility.explicitlyWait(2000);
			Reports.log(LogStatus.PASS, "Navigation to " + sNavigation);
			return true;
		}
		catch(Exception e)
		{
			Reports.log(LogStatus.FAIL,"Navigation to " + sNavigation); 
			e.printStackTrace();
			return false;
		}
	}


	public boolean masqueradeAs(String sUser)
	{
		try
		{
			if (Utility.isElementPresentWithoutReport(link_administrator, "Loged in as Admin"))
			{
				//	System.out.println("inside masq");
				txt_masquerade_as.sendKeys(sUser);
				btn_go.click();
				Utility.explicitlyWait(3000);
				//driver.get().findElement(By.linkText(sUser)).click();
				//np.ap.bh.cm
				Utility.waitForAjaxToFinish(8000);
				if (Utility.iscontains(div_msg.getText(), "You are now masquerading as"))
				{
					Reports.log(LogStatus.PASS, "Masquerade as :" + sUser + "  is successful");
					return true;

				}
				else
				{
					Reports.log(LogStatus.FAIL, " not able to masquerade as :" + sUser);
					return false;
				}
			}
			else
			{
				Reports.log(LogStatus.PASS, "Already masquerade as :" + sUser);
				return true;
			}

		}

		catch(Exception e)
		{
			Reports.log(LogStatus.FAIL, " not able to masquerade as :" + sUser);
			return false;
		}


	}

	public HomePage()
	{
		PageFactory.initElements(driver.get(), this);
	}


}
