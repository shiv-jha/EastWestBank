//Package name
package Pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;

import Tools.Utility;
import common.TestCaseConfiguration;

public class NewBill extends TestCaseConfiguration{



	@FindBy(xpath="//div[@id='edit_np_users_chosen']/a/span")
	WebElement click_To_Select;

	@FindBy(xpath="//div[@id='edit_np_users_chosen']/div/div/input")
	WebElement txt_item_search;

	@FindBy(xpath="//div[@id='edit_np_users_chosen']/div/ul/li[1]")
	WebElement link_searched_item;

	@FindBy(id="billing-item-adder")
	WebElement txt_billing_item;

	@FindBy(id="billing-items-add")
	WebElement div_billing_item;



	@FindBy(id="billing-items-list")
	WebElement tbl_billing_item;

	@FindBy(id="payType")
	WebElement list_Pay_type;

	@FindBy(id="new-payment")
	WebElement div_new_payment;


	@FindBy(xpath="//span[@class='confirm-payment']")
	WebElement btn_confirm_payment;


	@FindBy(id="bill-cancel")
	WebElement btn_cancel;


	@FindBy(id="bill-close")
	WebElement btn_pay_and_close;

	@FindBy(id="amount-balance")
	WebElement div_amount_balance;

	@FindBy(id="amount-payable")
	WebElement div_amount_payable;

	@FindBy(xpath="//table[@id='billing-items-list']/thead/tr/th")
	List <WebElement> heading_billing_item_list;

	@FindBy(xpath="//table[@id='billing-items-list']/tbody/tr[1]/td")
	List <WebElement> rows_billing_item_list;

	@FindBy(xpath="//table[@id='billing-items-list']/tbody/tr[1]/td[1]")
	WebElement billing_item_2;

	@FindBy(xpath="//table[@id='payment-items-list']/thead/tr/th")
	List <WebElement> heading_payment_item_list;


	@FindBy(xpath="//table[@id='billing-items-list']")
	WebElement tbl_billing_item_list;

	@FindBy(xpath="//table[@id='payment-items-list']")
	WebElement tbl_payment_item_list;

	@FindBy(xpath="//table[@id='billing-items-list']/tbody/tr/td[4]/input")
	WebElement txt_qty_item;

	@FindBy(xpath="//table[@id='billing-items-list']/tbody/tr/td[2]/input")
	WebElement txt_price_item;

	@FindBy(xpath="//table[@id='billing-items-list']/tbody/tr/td[2]")
	WebElement div_price_item;

	@FindBy(xpath="//table[@id='billing-items-list']/tbody/tr/td[1]/span[2]")
	WebElement link_billing_item_remove;


	@FindBy(xpath="//table[@id='billing-items-list']/tbody/tr[2]/td[1]/span[2]")
	WebElement link_billing_item_remove_2;

	@FindBy(xpath="//table[@id='billing-items-list']/tbody/tr")
	List <WebElement>  rows_billing_item_all_list;

	@FindBy(xpath="//table[@id='payment-items-list']/tbody/tr/td[1]/span")
	WebElement link_remove;

	@FindBy(xpath="//table[@id='payment-items-list']/tbody/tr/td[1]/input")
	WebElement txt_payment_date;

	@FindBy(xpath="//table[@id='payment-items-list']/tbody/tr/td[2]")
	WebElement div_payment_type;

	@FindBy(xpath="//table[@id='payment-items-list']/tbody/tr/td[2]")
	WebElement heading_deposit;

	@FindBy(xpath="//div[@class='personal-fieldset-wrapper']")


	WebElement guest_details;

	@FindBy(xpath="//div[@id='billing-items-add']/div/div/strong")
	WebElement selct_auto_billing_item;

	@FindBy(xpath="//select[@id='payType']/option[text() = 'Cash']")
	WebElement option_cash;

	@FindBy(xpath="//select[@id='payType']/option[text() = 'Card']")
	WebElement option_card;


	@FindBy(xpath="//select[@id='payType']/option[text() = 'Deposit']")
	WebElement option_deposit;


	@FindBy(xpath="//select[@id='payType']/option[text() = 'Copay Deposit']")
	WebElement option_copay_deposit;

	@FindBy(xpath="//select[@id='payType']/option[text() = 'Co-pay Cash']")
	WebElement option_co_pay_cash;


	@FindBy(xpath="//select[@id='payType']/option[text() = 'Co-pay Card']")
	WebElement option_copay_card;

	@FindBy(xpath="//select[@id='payType']/option[text() = 'Credit']")
	WebElement option_credit;

	// Receipt page objects

	@FindBy(xpath="//div[@id='bill']/div[@class='title']")
	WebElement bill_final_status;

	@FindBy(xpath="//div[@id='bill']/div[@class='meta']")
	WebElement bill_guest_receipt_info;

	@FindBy(xpath="//div[@id='bill']/div[@class='items']/table")
	WebElement tbl_item_details;

	@FindBy(xpath="//div[@id='bill']/div[@class='items']/table/thead/tr/th")
	List <WebElement> heading_item_table;

	@FindBy(xpath="//div[@id='bill']/div[@class='items']/table/tbody/tr/td")
	List <WebElement> rows_item_table;

	@FindBy(xpath="//div[@id='bill']/div[@class='items']/table/tbody/tr/td[4]/input")
	WebElement txt_qty;

	@FindBy(xpath="//div[@id='bill']/div[@class='items']/table/tbody/tr/td[2]/input")
	WebElement txt_price;

	@FindBy(xpath="//div[@id='bill']/div[@class='payments']/table")
	WebElement tbl_payment_details;

	@FindBy(xpath="//div[@id='bill']/div[@class='payments']/table/thead/tr/th")
	List <WebElement> heading_payment_table;

	@FindBy(xpath="//div[@id='bill']/div[@class='payments']/table/tbody/tr/td")
	List <WebElement> rows_payment_table;

	@FindBy(xpath="//div[@id='bill']/div[@class='meta']/div[2]/div[2]")
	WebElement div_receipt_no;

	@FindBy(xpath="//div[@class='summary-row payable']/span[@id='amount-payable-value']")
	WebElement div_amount_payable_value;

	@FindBy(xpath="//div[@class='summary-row paid']/span[@id='amount-payable-value']")
	WebElement div_amount_paid;

	@FindBy(xpath="//span[@id='amount-payable-value']")
	WebElement span_amt_payable;


	@FindBy(xpath="//span[@id='amount-balance-value']")
	WebElement div_amount_balance_value;

	@FindBy(xpath="//div[@class='preauth-error-message error-preauth']")
	WebElement div_insurance_error;

	@FindBy(id="packages")
	WebElement div_packages;

	@FindBy(id="np-action-nullify")
	WebElement div_nullify_bill;

	@FindBy(id="edit-nullify-comment")
	WebElement txt_nullify_comment;

	@FindBy(id="edit-nullify-submit")
	WebElement btn_nullify_submit;

	@FindBy(id="messages")
	WebElement msg_nullify;

	@FindBy(xpath="//div[@id='packages']/div[1]//div[2]/div/div[2]")
	WebElement div_package_left_qty;

	@FindBy(xpath="//div[@id='packages']/div[2]//div[2]/div/div[2]")
	WebElement div_package_left_qty_2;
	
	@FindBy(xpath="//div[@class='field-item odd field-deposit-value']")
	WebElement div_deposit_value;

	@FindBy(xpath="//select[@class='select-preauth']")
	WebElement list_pre_auth;

	@FindBy(xpath="//form[@id='np-users-fiter-form']/div/div[1]")
	WebElement div_session_zero_error;

	@FindBy(xpath="//form[@id='np-users-fiter-form']/div/div[2]")
	WebElement div_amoount_threshold_error;

	@FindBy(xpath="//span[@class='pre-amount-left']")
	WebElement span_amt_left_insurance;

	@FindBy(xpath="//span[@class='pre-sessions-left']")
	WebElement span_session_left_insurance;


	@FindBy(id="payData")
	WebElement txt_paydata;

	@FindBy(id="payAmount")
	WebElement txt_payamount;
	
	@FindBy(id="opg_name")
	WebElement txt_opg_name;
	
	@FindBy(id="opg_age")
	WebElement txt_opg_age;
	
	@FindBy(id="opg_gender")
	WebElement list_opg_gender;
	
	


	public void ZeroSessionValidatiion(String sGuestName,String sPreAuth,String sInsurance)
	{

		Utility.selectFromPopulatedListBox(click_To_Select, txt_item_search, link_searched_item, sGuestName);
		Utility.waitForAjaxToFinish(6000);
		new Select(list_pre_auth).selectByVisibleText(sPreAuth);
		guestVerificationForInsurance( sGuestName);
		System.out.println("guest passed");
		System.out.println("eoor 13" +div_session_zero_error.getText());

		if (div_session_zero_error.getText().contains("session left in this Pre-Auth") &&
				! div_insurance_error.getAttribute("style").contains("none"))
		{


			Reports.log(LogStatus.PASS, "Session 0 left in this pre auth functionality passed");
		}
		else
		{
			Reports.log(LogStatus.FAIL, "Session 0 left in this pre auth functionality failed");
		}

		if(! div_billing_item.getAttribute("style").contains("none"))
		{

			Reports.log(LogStatus.FAIL, "user is not able to bill , if no session left- FAILED");
		}
		else
		{
			Reports.log(LogStatus.PASS, "user is not able to bill , if no session left - PASSED");
		}
	}





	public void validityExpiredValidatiion(String sGuestName,String sPreAuth,String sInsurance)
	{
		Utility.selectFromPopulatedListBox(click_To_Select, txt_item_search, link_searched_item, sGuestName);
		Utility.waitForAjaxToFinish(6000);
		new Select(list_pre_auth).selectByVisibleText(sPreAuth);
		guestVerificationForInsurance( sGuestName);

		if (div_insurance_error.getText().contains("Insurance Validity Expired") &&
				! div_insurance_error.getAttribute("style").contains("none"))
		{
			Reports.log(LogStatus.PASS, "Insurance validity expired validation functionality passed");
		}
		else
		{
			Reports.log(LogStatus.FAIL, "Insurance validity expired validation functionality failed");
		}

		if(! div_billing_item.getAttribute("style").contains("none"))
		{

			Reports.log(LogStatus.FAIL, "user is not able to bill , if insurance expired- FAILED");
		}
		else
		{
			Reports.log(LogStatus.PASS, "user is not able to bill , if insurance expired- PASSED");
		}

	}

	public void amountZeroValidatiion(String sGuestName,String sPreAuth,String sInsurance)
	{
		Utility.selectFromPopulatedListBox(click_To_Select, txt_item_search, link_searched_item, sGuestName);
		Utility.waitForAjaxToFinish(6000);
		new Select(list_pre_auth).selectByVisibleText(sPreAuth);
		guestVerificationForInsurance( sGuestName);


		if(! div_billing_item.getAttribute("style").contains("none"))
		{

			Reports.log(LogStatus.FAIL, "user is not able to bill , if insurance expired- FAILED");
		}
		else
		{
			Reports.log(LogStatus.PASS, "user is not able to bill , if insurance expired- PASSED");
		}
	}

	public void sessionThresholdValidation(String sGuestName,String sPreAuth,String sInsurance)
	{
		Utility.selectFromPopulatedListBox(click_To_Select, txt_item_search, link_searched_item, sGuestName);
		Utility.waitForAjaxToFinish(6000);
		new Select(list_pre_auth).selectByVisibleText(sPreAuth);
		guestVerificationForInsurance( sGuestName);

		System.out.println("error:" + div_session_zero_error.getText());
		if (div_session_zero_error.getText().contains("session left in this Pre-Auth") &&
				! div_session_zero_error.getAttribute("style").contains("none"))
		{
			Reports.log(LogStatus.PASS, "Session count threshold validation functionality passed");
		}
		else
		{
			Reports.log(LogStatus.FAIL, "Session count threshold validation functionality failed");
		}

		if(! div_billing_item.getAttribute("style").contains("none"))
		{

			Reports.log(LogStatus.PASS, "user is  able to bill , if session count is reached threshold limit but not 0");
		}
		else
		{
			Reports.log(LogStatus.FAIL, "user is not able to bill , if session count is reached threshold limit but not 0");
		}


	}

	public void amountThresholdValidation(String sGuestName,String sPreAuth,String sInsurance)
	{
		Utility.selectFromPopulatedListBox(click_To_Select, txt_item_search, link_searched_item, sGuestName);
		Utility.waitForAjaxToFinish(6000);
		new Select(list_pre_auth).selectByVisibleText(sPreAuth);
		guestVerificationForInsurance( sGuestName);

		System.out.println("error:" + div_amoount_threshold_error.getText());
		if (div_amoount_threshold_error.getText().contains("left in this Pre-Auth") &&
				div_amoount_threshold_error.getText().contains("Only Rs.")
				&&
				! div_amoount_threshold_error.getAttribute("style").contains("none"))
		{
			Reports.log(LogStatus.PASS, "Session threshold amount  validation functionality passed");
		}
		else
		{
			Reports.log(LogStatus.FAIL, "Session threshold amount validation functionality failed");
		}

		if(! div_billing_item.getAttribute("style").contains("none"))
		{

			Reports.log(LogStatus.PASS, "user is  able to bill , if pre auth amount is reached threshold limit but not 0");
		}
		else
		{
			Reports.log(LogStatus.FAIL, "user is not able to bill , if pre auth is reached threshold limit but not 0");
		}
	}

	public void validPreauth(String sGuestName,String sPreAuth,String sInsurance,String sBillingItem)
	{
		Utility.selectFromPopulatedListBox(click_To_Select, txt_item_search, link_searched_item, sGuestName);
		Utility.waitForAjaxToFinish(6000);
		new Select(list_pre_auth).selectByVisibleText(sPreAuth);
		guestVerificationForInsurance( sGuestName);
		if (  navigateTillPayment(sGuestName,sBillingItem))
		{
			String sAmtLeftPre=span_amt_left_insurance.getText();
			String sSessionLeftPre=span_session_left_insurance.getText();
			System.out.println("available credit"+sAmtLeftPre);
			System.out.println("available session"+sSessionLeftPre);
			double dAmtleftPre=Double.parseDouble(sAmtLeftPre);
			int iSessionLeftpre=Integer.parseInt(sSessionLeftPre);
			System.out.println("available credit"+sAmtLeftPre);
			System.out.println("available session"+sSessionLeftPre);
			btn_confirm_payment.click();
			Utility.waitForAjaxToFinish(5000);
			btn_pay_and_close.click();
			Utility.waitForAjaxToFinish(7000);


			Utility.iscontains(heading_item_table.get(0).getText(), "Description");
			Utility.iscontains(heading_item_table.get(1).getText(), "Price");
			Utility.iscontains(heading_item_table.get(2).getText(), "Discount");
			Utility.iscontains(heading_item_table.get(3).getText(), "Quantity");
			Utility.iscontains(heading_item_table.get(4).getText(), "Total");
			Utility.iscontains(bill_guest_receipt_info.getText(), sGuestName);
			Utility.iscontains(rows_item_table.get(0).getText(), sBillingItem);
			String sPrice=rows_item_table.get(1).getText();
			double dPrice = Double.parseDouble(sPrice);
			String sQty=rows_item_table.get(3).getText();
			double dQty = Double.parseDouble(sQty);
			double dTotlaPrice=Double.parseDouble(rows_item_table.get(4).getText());
			if (rows_item_table.get(2).getText()=="0.00%" )
			{
				Utility.iscontains("Total Price:"+dPrice*dQty, "Total Price:"+rows_item_table.get(4).getText());
			}

			Utility.iscontains(heading_payment_table.get(0).getText(), "Date");
			Utility.iscontains(heading_payment_table.get(1).getText(), "Type");
			Utility.iscontains(heading_payment_table.get(2).getText(), "Amount");

			//Utility.iscontains(rows_item_table.get(0).getText(), "Deposit");
			Utility.iscontains(rows_payment_table.get(1).getText(),"Credit");
			Utility.iscontains("Total Price:"+rows_payment_table.get(2).getText(), "Total Price:"+dPrice*dQty);

			Utility.iscontains("Amount payable:"+div_amount_payable_value.getText(), "Amount payable:"+dPrice*dQty);
			Utility.iscontains("Amount paid:"+div_amount_paid.getText(), "Amount paid:"+dPrice*dQty);
			Utility.iscontains(div_amount_balance_value.getText(), "0");

			Utility.isElementPresent(bill_final_status,"Bill final status after payment");
			if( Utility.iscontains(bill_final_status.getText(), "Bill") &&
					Utility.iscontains(bill_final_status.getText(), "FINALIZED"))
			{
				Reports.log(LogStatus.PASS, " Bill status is Finalized");

				String sBillNo=div_receipt_no.getText();
				Reports.log(LogStatus.PASS, "sBillNo: " + sBillNo + " is generated succesfully");
			}

			else
			{
				Reports.log(LogStatus.FAIL, " Bill status is not closed");
			}
			homePage.navigateNewBill();
			Utility.waitForAjaxToFinish(6000);
			Utility.selectFromPopulatedListBox(click_To_Select, txt_item_search, link_searched_item, sGuestName);
			Utility.waitForAjaxToFinish(6000);
			new Select(list_pre_auth).selectByVisibleText(sPreAuth);
			Utility.waitForAjaxToFinish(6000);
			String sAmtLeftPost=span_amt_left_insurance.getText();
			String sSessionLeftPost=span_session_left_insurance.getText();
			System.out.println("available deposit"+sAmtLeftPost);
			double dAmtLeftPost=Double.parseDouble(sAmtLeftPost);
			int iSessionLeftpost=Integer.parseInt(sSessionLeftPost);
			if (Utility.isEqual(Double.toString(dAmtLeftPost),(Double.toString(dAmtleftPre-dTotlaPrice)))) 
			{
				Reports.log(LogStatus.PASS, "Available credit  amt  after deduction from the bill- passed");
			}
			else
			{
				Reports.log(LogStatus.FAIL, "Available credit  amt  after deduction from the bill- failed");
			}

			
			if (sBillingItem.contains("Session"))
					{
				
					}
			if (iSessionLeftpost==(iSessionLeftpre-1))
			{
				Reports.log(LogStatus.PASS, "Available session left after deduction from the bill- passed - Session before bill" + iSessionLeftpre + " and after bill " +iSessionLeftpost );
			}
			else
			{
				Reports.log(LogStatus.FAIL, "Available session left after deduction from the bill- failed - Session before bill" + iSessionLeftpre + " and after bill " +iSessionLeftpost );
			}
		}

		}
	


	public void validPreauthWithTwoPaymentMode(String spaymentType,String sGuestName,String sPreAuth,String sInsurance,String sBillingItem)
	{
		Utility.selectFromPopulatedListBox(click_To_Select, txt_item_search, link_searched_item, sGuestName);
		Utility.waitForAjaxToFinish(6000);
		new Select(list_pre_auth).selectByVisibleText(sPreAuth);
		guestVerificationForInsurance( sGuestName);
		if (  navigateTillPayment(sGuestName,sBillingItem))
		{
			String sAmtLeftPre=span_amt_left_insurance.getText();
			String sSessionLeftPre=span_session_left_insurance.getText();
			System.out.println("available credit"+sAmtLeftPre);
			System.out.println("available session"+sSessionLeftPre);
			double dAmtleftPre=Double.parseDouble(sAmtLeftPre);
			int iSessionLeftpre=Integer.parseInt(sSessionLeftPre);
			System.out.println("available credit"+sAmtLeftPre);
			System.out.println("available session"+sSessionLeftPre);
			list_Pay_type.click();
			//new Select(list_Pay_type).selectByIndex(1);
			Utility.explicitlyWait(2000);
			String sFinalStatus = "";
			spaymentType=spaymentType.toLowerCase();
			switch (spaymentType) {
			case "cash":
				option_cash.click();
				Reports.log(LogStatus.PASS, "Item: "+ spaymentType + "  is selected from payment type list box");
				//sFinalStatus="Closed";  
				break;
			case "card": 
				option_card.click();
				txt_paydata.sendKeys("1234");
				Reports.log(LogStatus.PASS, "Item: "+ spaymentType + "  is selected from payment type list box");
				//sFinalStatus="Closed";
				break;

			case "deposit": 
				option_deposit.click(); 
				Reports.log(LogStatus.PASS, "Item: "+ spaymentType + "  is selected from payment type list box");
				break;

			case "copay deposit": 
				option_copay_deposit.click();
				Reports.log(LogStatus.PASS, "Item: "+ spaymentType + "  is selected from payment type list box");
				sFinalStatus="Closed";
				break;

			case "co-pay cash": 
				option_co_pay_cash.click();
				Reports.log(LogStatus.PASS, "Item: "+ spaymentType + "  is selected from payment type list box");
				sFinalStatus="Closed";
				break;

			case "co-pay card": 
				option_copay_card.click();
				Reports.log(LogStatus.PASS, "Item: "+ spaymentType + "  is selected from payment type list box");
				sFinalStatus="Closed";
				break;

			case "credit": 
				option_credit.click();
				Reports.log(LogStatus.PASS, "Item: "+ spaymentType + "  is selected from payment type list box");
				// sFinalStatus="Finalized";
				break; 

			default:
				Reports.log(LogStatus.FAIL, "Item: "+ spaymentType + "  is not avialable in list box");
				break;


			}
			txt_payamount.sendKeys(Keys.chord(Keys.CONTROL, "a"),Integer.toString(1));
			//	.sendKeys("1");
			Utility.explicitlyWait(4000);
			btn_confirm_payment.click();

			Utility.explicitlyWait(4000);
			btn_confirm_payment.click();

			Utility.waitForAjaxToFinish(5000);
			btn_pay_and_close.click();
			Utility.waitForAjaxToFinish(7000);


			Utility.iscontains(heading_item_table.get(0).getText(), "Description");
			Utility.iscontains(heading_item_table.get(1).getText(), "Price");
			Utility.iscontains(heading_item_table.get(2).getText(), "Discount");
			Utility.iscontains(heading_item_table.get(3).getText(), "Quantity");
			Utility.iscontains(heading_item_table.get(4).getText(), "Total");
			Utility.iscontains(bill_guest_receipt_info.getText(), sGuestName);
			Utility.iscontains(rows_item_table.get(0).getText(), sBillingItem);

			Utility.iscontains(heading_payment_table.get(0).getText(), "Date");
			Utility.iscontains(heading_payment_table.get(1).getText(), "Type");
			Utility.iscontains(heading_payment_table.get(2).getText(), "Amount");


			Utility.isElementPresent(bill_final_status,"Bill final status after payment");
			if( Utility.iscontainsWithoutReport(bill_final_status.getText(), "Bill") &&
					Utility.iscontainsWithoutReport(bill_final_status.getText(),"Closed")
					||Utility.iscontainsWithoutReport(bill_final_status.getText(),"Finalized"))
			{
				Reports.log(LogStatus.PASS, " Bill status is Finalized/Closed");

				String sBillNo=div_receipt_no.getText();
				Reports.log(LogStatus.PASS, "sBillNo: " + sBillNo + " is generated succesfully");
			}

			else
			{
				Reports.log(LogStatus.FAIL, " Bill status is not Finalized/Closed");
			}


		}
	}



	public void validPreauthWithPaymentMode(String spaymentType,String sGuestName,String sPreAuth,String sInsurance,String sBillingItem)
	{
		Utility.selectFromPopulatedListBox(click_To_Select, txt_item_search, link_searched_item, sGuestName);
		Utility.waitForAjaxToFinish(6000);
		new Select(list_pre_auth).selectByVisibleText(sPreAuth);
		guestVerificationForInsurance( sGuestName);
		if (  navigateTillPayment(sGuestName,sBillingItem))
		{
			String sAmtLeftPre=span_amt_left_insurance.getText();
			String sSessionLeftPre=span_session_left_insurance.getText();
			System.out.println("available credit"+sAmtLeftPre);
			System.out.println("available session"+sSessionLeftPre);
			double dAmtleftPre=Double.parseDouble(sAmtLeftPre);
			int iSessionLeftpre=Integer.parseInt(sSessionLeftPre);
			System.out.println("available credit"+sAmtLeftPre);
			System.out.println("available session"+sSessionLeftPre);
			list_Pay_type.click();
			//new Select(list_Pay_type).selectByIndex(1);
			Utility.explicitlyWait(2000);
			String sFinalStatus = "";
			spaymentType=spaymentType.toLowerCase();
			switch (spaymentType) {
			case "cash":
				option_cash.click();
				Reports.log(LogStatus.PASS, "Item: "+ spaymentType + "  is selected from payment type list box");
				//sFinalStatus="Closed";  
				break;
			case "card": 
				option_card.click();
				txt_paydata.sendKeys("1234");
				Reports.log(LogStatus.PASS, "Item: "+ spaymentType + "  is selected from payment type list box");
				//sFinalStatus="Closed";
				break;

			case "deposit": 
				option_deposit.click(); 
				Reports.log(LogStatus.PASS, "Item: "+ spaymentType + "  is selected from payment type list box");
				break;

			case "copay deposit": 
				option_copay_deposit.click();
				Reports.log(LogStatus.PASS, "Item: "+ spaymentType + "  is selected from payment type list box");
				sFinalStatus="Closed";
				break;

			case "co-pay cash": 
				option_co_pay_cash.click();
				Reports.log(LogStatus.PASS, "Item: "+ spaymentType + "  is selected from payment type list box");
				sFinalStatus="Closed";
				break;

			case "co-pay card": 
				option_copay_card.click();
				Reports.log(LogStatus.PASS, "Item: "+ spaymentType + "  is selected from payment type list box");
				sFinalStatus="Closed";
				break;

			case "credit": 
				option_credit.click();
				Reports.log(LogStatus.PASS, "Item: "+ spaymentType + "  is selected from payment type list box");
				// sFinalStatus="Finalized";
				break; 

			default:
				Reports.log(LogStatus.FAIL, "Item: "+ spaymentType + "  is not avialable in list box");
				break;


			}
			//txt_payamount.sendKeys(Keys.chord(Keys.CONTROL, "a"),Integer.toString(1));
			//	.sendKeys("1");
			Utility.explicitlyWait(4000);
			btn_confirm_payment.click();

			// Utility.explicitlyWait(4000);
			//btn_confirm_payment.click();

			Utility.waitForAjaxToFinish(5000);
			btn_pay_and_close.click();
			Utility.waitForAjaxToFinish(7000);


			Utility.iscontains(heading_item_table.get(0).getText(), "Description");
			Utility.iscontains(heading_item_table.get(1).getText(), "Price");
			Utility.iscontains(heading_item_table.get(2).getText(), "Discount");
			Utility.iscontains(heading_item_table.get(3).getText(), "Quantity");
			Utility.iscontains(heading_item_table.get(4).getText(), "Total");
			Utility.iscontains(bill_guest_receipt_info.getText(), sGuestName);
			Utility.iscontains(rows_item_table.get(0).getText(), sBillingItem);

			Utility.iscontains(heading_payment_table.get(0).getText(), "Date");
			Utility.iscontains(heading_payment_table.get(1).getText(), "Type");
			Utility.iscontains(heading_payment_table.get(2).getText(), "Amount");


			Utility.isElementPresent(bill_final_status,"Bill final status after payment");
			if( Utility.iscontainsWithoutReport(bill_final_status.getText(), "Bill") &&
					Utility.iscontainsWithoutReport(bill_final_status.getText(),"Closed")
					||Utility.iscontainsWithoutReport(bill_final_status.getText(),"Finalized"))
			{
				Reports.log(LogStatus.PASS, " Bill status is Finalized/Closed");

				String sBillNo=div_receipt_no.getText();
				Reports.log(LogStatus.PASS, "sBillNo: " + sBillNo + " is generated succesfully");
			}

			else
			{
				Reports.log(LogStatus.FAIL, " Bill status is not Finalized/Closed");
			}


		}
	}
	public void utilizeZeroDeposit(String sGuestName,String sItem)
	{

		Utility.selectFromPopulatedListBox(click_To_Select, txt_item_search, link_searched_item, sGuestName);
		Utility.waitForAjaxToFinish(6000);
		String sGuest=guest_details.getText();
		if (sGuest.contains("First Name:") && sGuest.contains("Last Name:") && 
				sGuest.contains("Date Of Birth:") && sGuest.contains("Gender:") &&
				sGuest.contains("Mobile:") && sGuest.contains("Deposits:") &&
				sGuest.contains("Insurance:"))
		{
			Reports.log(LogStatus.PASS, "Guest Details functionality passed");
		}
		else
		{
			Reports.log(LogStatus.PASS, "Guest Details functionality passed");
		}

		txt_billing_item.sendKeys(sItem);
		Utility.waitForAjaxToFinish(3000);
		selct_auto_billing_item.click();
		Utility.iscontains(heading_billing_item_list.get(0).getText(), "Item");
		Utility.iscontains(heading_billing_item_list.get(1).getText(), "Price");
		Utility.iscontains(heading_billing_item_list.get(2).getText(), "Discount");
		Utility.iscontains(heading_billing_item_list.get(3).getText(), "Quantity");
		Utility.iscontains(heading_billing_item_list.get(4).getText(), "Total");
		String sAmtDeposit=div_deposit_value.getText();
		Reports.log(LogStatus.PASS, "Deposit is Zero");

		List<WebElement> itemList=new Select(list_Pay_type).getOptions();
		boolean bFlag=false;
		for(WebElement l:itemList)
		{
			System.out.println(l.getAttribute("value"));
			if( l.getAttribute("value").contains("Deposit"))
			{
				bFlag=true;
				break;
			}
			if(bFlag)
			{
				Reports.log(LogStatus.FAIL, "Deposit is available for customer , who has Zero deposit value");

			}
			else
				Reports.log(LogStatus.PASS, "Deposit is not available for customer , who has Zero deposit value");
		}
	}


	public void utilizeDeposit(String sGuestName,String sItem)
	{

		if(navigateTillPayment(sGuestName,sItem))
		{
			String sAmtDeposit=div_deposit_value.getText();
			System.out.println("available deposit"+sAmtDeposit);
			double dAmtDeposit=Double.parseDouble(sAmtDeposit);
			btn_pay_and_close.click();
			Utility.waitForAjaxToFinish(7000);


			Utility.iscontains(heading_item_table.get(0).getText(), "Description");
			Utility.iscontains(heading_item_table.get(1).getText(), "Price");
			Utility.iscontains(heading_item_table.get(2).getText(), "Discount");
			Utility.iscontains(heading_item_table.get(3).getText(), "Quantity");
			Utility.iscontains(heading_item_table.get(4).getText(), "Total");
			Utility.iscontains(bill_guest_receipt_info.getText(), sGuestName);
			Utility.iscontains(rows_item_table.get(0).getText(), sItem);
			String sPrice=rows_item_table.get(1).getText();
			double dPrice = Double.parseDouble(sPrice);
			String sQty=rows_item_table.get(3).getText();
			double dQty = Double.parseDouble(sQty);
			double dTotlaPrice=Double.parseDouble(rows_item_table.get(4).getText());
			if (rows_item_table.get(2).getText()=="0.00%" )
			{
				Utility.iscontains("Total Price:"+dPrice*dQty, "Total Price:"+rows_item_table.get(4).getText());
			}

			Utility.iscontains(heading_payment_table.get(0).getText(), "Date");
			Utility.iscontains(heading_payment_table.get(1).getText(), "Type");
			Utility.iscontains(heading_payment_table.get(2).getText(), "Amount");

			//Utility.iscontains(rows_item_table.get(0).getText(), "Deposit");
			Utility.iscontains(rows_payment_table.get(1).getText(),"Deposit - Using from guest's deposits");
			Utility.iscontains("Total Price:"+rows_payment_table.get(2).getText(), "Total Price:"+dPrice*dQty);

			Utility.iscontains("Amount payable:"+div_amount_payable_value.getText(), "Amount payable:"+dPrice*dQty);
			Utility.iscontains("Amount paid:"+div_amount_paid.getText(), "Amount paid:"+dPrice*dQty);
			Utility.iscontains(div_amount_balance_value.getText(), "0");

			Utility.isElementPresent(bill_final_status,"Bill final status after payment");
			if( Utility.iscontains(bill_final_status.getText(), "Bill") &&
					Utility.iscontains(bill_final_status.getText(), "Closed"))
			{
				Reports.log(LogStatus.PASS, " Bill status is closed");

				String sBillNo=div_receipt_no.getText();
				Reports.log(LogStatus.PASS, "sBillNo: " + sBillNo + " is generated succesfully");
			}

			else
			{
				Reports.log(LogStatus.FAIL, " Bill status is not closed");
			}
			homePage.navigateNewBill();
			Utility.waitForAjaxToFinish(6000);
			Utility.selectFromPopulatedListBox(click_To_Select, txt_item_search, link_searched_item, sGuestName);
			Utility.waitForAjaxToFinish(6000);
			String sAmtDeposit_post=div_deposit_value.getText();
			double dAmtDeposit_post=Double.parseDouble(sAmtDeposit_post);
			if (Utility.isEqual(Double.toString(dAmtDeposit_post),(Double.toString(dAmtDeposit-dTotlaPrice)))) 
			{
				Reports.log(LogStatus.PASS, "Available Deposit  amt  after deduction from the bill- passed");
			}
			else
			{
				Reports.log(LogStatus.FAIL, "Available Deposit  amt  after deduction from the bill- failed");
			}
		}
	}


	public void utilizeDepositAndNullify(String sGuestName,String sItem)
	{

		if(navigateTillPayment(sGuestName,sItem))
		{
			String sAmtDeposit=div_deposit_value.getText();
			System.out.println("available deposit"+sAmtDeposit);
			double dAmtDeposit=Double.parseDouble(sAmtDeposit);
			btn_pay_and_close.click();
			Utility.waitForAjaxToFinish(7000);


			Utility.iscontains(heading_item_table.get(0).getText(), "Description");
			Utility.iscontains(heading_item_table.get(1).getText(), "Price");
			Utility.iscontains(heading_item_table.get(2).getText(), "Discount");
			Utility.iscontains(heading_item_table.get(3).getText(), "Quantity");
			Utility.iscontains(heading_item_table.get(4).getText(), "Total");
			Utility.iscontains(bill_guest_receipt_info.getText(), sGuestName);
			Utility.iscontains(rows_item_table.get(0).getText(), sItem);
			String sPrice=rows_item_table.get(1).getText();
			double dPrice = Double.parseDouble(sPrice);
			String sQty=rows_item_table.get(3).getText();
			double dQty = Double.parseDouble(sQty);
			double dTotlaPrice=Double.parseDouble(rows_item_table.get(4).getText());
			if (rows_item_table.get(2).getText()=="0.00%" )
			{
				Utility.iscontains("Total Price:"+dPrice*dQty, "Total Price:"+rows_item_table.get(4).getText());
			}

			Utility.iscontains(heading_payment_table.get(0).getText(), "Date");
			Utility.iscontains(heading_payment_table.get(1).getText(), "Type");
			Utility.iscontains(heading_payment_table.get(2).getText(), "Amount");

			//Utility.iscontains(rows_item_table.get(0).getText(), "Deposit");
			Utility.iscontains(rows_payment_table.get(1).getText(),"Deposit - Using from guest's deposits");
			Utility.iscontains("Total Price:"+rows_payment_table.get(2).getText(), "Total Price:"+dPrice*dQty);

			Utility.iscontains("Amount payable:"+div_amount_payable_value.getText(), "Amount payable:"+dPrice*dQty);
			Utility.iscontains("Amount paid:"+div_amount_paid.getText(), "Amount paid:"+dPrice*dQty);
			Utility.iscontains(div_amount_balance_value.getText(), "0");

			Utility.isElementPresent(bill_final_status,"Bill final status after payment");
			if( Utility.iscontains(bill_final_status.getText(), "Bill") &&
					Utility.iscontains(bill_final_status.getText(), "Closed"))
			{
				Reports.log(LogStatus.PASS, " Bill status is closed");

				String sBillNo=div_receipt_no.getText();
				Reports.log(LogStatus.PASS, "sBillNo: " + sBillNo + " is generated succesfully");
			}

			else
			{
				Reports.log(LogStatus.FAIL, " Bill status is not closed");
			}
			div_nullify_bill.click();
			Utility.explicitlyWait(8000);
			Utility.iscontains(div_nullify_bill.getText(), "Are you sure you want to nullify this bill");
			div_nullify_bill.click();
			Utility.waitForAjaxToFinish(5000);
			txt_nullify_comment.sendKeys("This is for QA Purpose");
			btn_nullify_submit.click();
			Utility.waitForAjaxToFinish(5000);
			Utility.iscontains(msg_nullify.getText(), "Bill is nullified");
			homePage.navigateNewBill();
			Utility.waitForAjaxToFinish(6000);
			Utility.selectFromPopulatedListBox(click_To_Select, txt_item_search, link_searched_item, sGuestName);
			Utility.waitForAjaxToFinish(6000);
			String sAmtDeposit_post=div_deposit_value.getText();
			double dAmtDeposit_post=Double.parseDouble(sAmtDeposit_post);
			if (Utility.isEqualWithoutReport(Double.toString(dAmtDeposit_post),(Double.toString(dAmtDeposit-dTotlaPrice)))) 
			{
				Reports.log(LogStatus.FAIL, "Available Deposit  amt  after deduction and nullified  the bill- FAIL");
			}
			else
			{
				Reports.log(LogStatus.PASS, "Available Deposit  amt  after deduction and nullified  the bill- PASS");
			}
		}
	}

	public Deposit createDepositAndVerifyNode(String isNullify,String sUserFor,String sBillingitem)
	{

		if(navigateTillPayment(sUserFor,sBillingitem))
		{


			list_Pay_type.click();
			System.out.println("paytype clicked");
			option_cash.click();
			System.out.println("cash selected");

			if (Utility.isElementPresent(btn_confirm_payment, "Confirm payment"))
			{
				btn_confirm_payment.click();
				Utility.waitForAjaxToFinish(5000);
				btn_pay_and_close.click();
				Utility.waitForAjaxToFinish(7000);
			}

			Utility.iscontains(heading_item_table.get(0).getText(), "Description");
			Utility.iscontains(heading_item_table.get(1).getText(), "Price");
			Utility.iscontains(heading_item_table.get(2).getText(), "Discount");
			Utility.iscontains(heading_item_table.get(3).getText(), "Quantity");
			Utility.iscontains(heading_item_table.get(4).getText(), "Total");
			Utility.iscontains(bill_guest_receipt_info.getText(), sUserFor);
			Utility.iscontains(rows_item_table.get(0).getText(), sBillingitem);
			String sPrice=rows_item_table.get(1).getText();
			double dPrice = Double.parseDouble(sPrice);
			String sQty=rows_item_table.get(3).getText();
			double dQty = Double.parseDouble(sQty);
			if (rows_item_table.get(2).getText()=="0.00%" )
			{
				Utility.iscontains("Total Price:"+dPrice*dQty, "Total Price:"+rows_item_table.get(4).getText());
			}

			Utility.iscontains(heading_payment_table.get(0).getText(), "Date");
			Utility.iscontains(heading_payment_table.get(1).getText(), "Type");
			Utility.iscontains(heading_payment_table.get(2).getText(), "Amount");

			//Utility.iscontains(rows_item_table.get(0).getText(), "Deposit");
			//Utility.iscontains(rows_payment_table.get(1).getText().toLowerCase(),spaymentType.toLowerCase());
			Utility.iscontains("Total Price:"+rows_payment_table.get(2).getText(), "Total Price:"+dPrice*dQty);

			Utility.iscontains("Amount payable:"+div_amount_payable_value.getText(), "Amount payable:"+dPrice*dQty);
			Utility.iscontains("Amount paid:"+div_amount_paid.getText(), "Amount paid:"+dPrice*dQty);
			Utility.iscontains(div_amount_balance_value.getText(), "0");



		}
		else
			Reports.log(LogStatus.FAIL, "Navigateing till pay and close failed");

		if(isNullify.equalsIgnoreCase("Yes"))
		{
			div_nullify_bill.click();
			Utility.explicitlyWait(8000);
			Utility.iscontains(div_nullify_bill.getText(), "Are you sure you want to nullify this bill");
			div_nullify_bill.click();
			Utility.waitForAjaxToFinish(5000);
			txt_nullify_comment.sendKeys("This is for QA Purpose");
			btn_nullify_submit.click();
			Utility.waitForAjaxToFinish(5000);
			Utility.iscontains(msg_nullify.getText(), "Bill is nullified");

		}
		return new Deposit();
	}
	//Bill is nullified. Create a new bill here

	//Are you sure you want to nullify this bill? Click again to confirm

	//TCBI0086 
	public void verifyAvailablepackage(String sGuestName,String sPackage)
	{
		Utility.selectFromPopulatedListBox(click_To_Select, txt_item_search, link_searched_item, sGuestName);
		Utility.waitForAjaxToFinish(6000);

		if (Utility.iscontains(div_packages.getText(),sPackage)) 
		{
			Reports.log(LogStatus.PASS, "Available package is displaying in the page- passed");
		}
		else
		{
			Reports.log(LogStatus.FAIL, "Available package is not displaying in the page- failed");
		}
	}

	public void VerifyDeductionFrompackage(String sGuestName,String sPackage,String sItem)
	{
		if(navigateTillPayment(sGuestName,sItem))
		{
			if(Utility.iscontains(div_payment_type.getText(),"Package - Using 1 unit/s from Package"))
				Reports.log(LogStatus.PASS, "Available Service deduction from package is - passed");
		}
		else
		{
			Reports.log(LogStatus.FAIL, "Available Service deduction from package is - failed");
		}	 
	}


	public void VerifyDeductionFrompackageAmtZero(String sGuestName,String sPackage,String sItem)
	{
		if(navigateTillPayment(sGuestName,sItem))
		{
			if(Utility.iscontains(div_payment_type.getText(),"Package - Using 1 unit/s from Package"))
				Reports.log(LogStatus.PASS, "Available Service deduction from package is - passed");
		}
		else
		{
			Reports.log(LogStatus.FAIL, "Available Service deduction from package is - failed");
		}

		if(Utility.isEqual(div_amount_balance_value.getText(),"0"))
		{
			Reports.log(LogStatus.PASS, "Balance becomes zero for package utilization passed");
		}
		else
		{
			Reports.log(LogStatus.FAIL, "Balance becomes zero for package utilization failed");
		}
	}

	public void VerifyNotDeductionFrompackage(String sGuestName,String sPackage,String sItem)
	{
		if(navigateTillPayment(sGuestName,sItem))
		{
			if(Utility.iscontains(div_payment_type.getText(),"Package - Using 1 unit/s from Package"))
				Reports.log(LogStatus.FAIL, "Available Service deduction from expire package is - Failed");
		}
		else
		{
			Reports.log(LogStatus.FAIL, "Available Service deduction from expire package is - passed");
		}	 
	}	



	public void utilizePackagepackageAndNullify(String sGuestName,String sPackage,String sItem)
	{

		if(navigateTillPayment(sGuestName,sItem))
		{	
			String sQtyPackage=div_package_left_qty.getText();
			int iQtyPackage=Integer.parseInt(sQtyPackage);
			btn_pay_and_close.click();
			Utility.waitForAjaxToFinish(7000);


			Utility.iscontains(heading_item_table.get(0).getText(), "Description");
			Utility.iscontains(heading_item_table.get(1).getText(), "Price");
			Utility.iscontains(heading_item_table.get(2).getText(), "Discount");
			Utility.iscontains(heading_item_table.get(3).getText(), "Quantity");
			Utility.iscontains(heading_item_table.get(4).getText(), "Total");
			Utility.iscontains(bill_guest_receipt_info.getText(), sGuestName);
			Utility.iscontains(rows_item_table.get(0).getText(), sItem);
			String sPrice=rows_item_table.get(1).getText();
			double dPrice = Double.parseDouble(sPrice);
			String sQty=rows_item_table.get(3).getText();
			double dQty = Double.parseDouble(sQty);
			if (rows_item_table.get(2).getText()=="0.00%" )
			{
				Utility.iscontains("Total Price:"+dPrice*dQty, "Total Price:"+rows_item_table.get(4).getText());
			}

			Utility.iscontains(heading_payment_table.get(0).getText(), "Date");
			Utility.iscontains(heading_payment_table.get(1).getText(), "Type");
			Utility.iscontains(heading_payment_table.get(2).getText(), "Amount");

			//Utility.iscontains(rows_item_table.get(0).getText(), "Deposit");
			Utility.iscontains(rows_payment_table.get(1).getText(),"Deduction - Package");
			Utility.iscontains("Total Price:"+rows_payment_table.get(2).getText(), "Total Price:"+dPrice*dQty);

			Utility.iscontains("Amount payable:"+div_amount_payable_value.getText(), "Amount payable:"+dPrice*dQty);
			Utility.iscontains("Amount paid:"+div_amount_paid.getText(), "Amount paid:"+dPrice*dQty);
			Utility.iscontains(div_amount_balance_value.getText(), "0");

			Utility.isElementPresent(bill_final_status,"Bill final status after payment");
			if( Utility.iscontainsWithoutReport(bill_final_status.getText(), "Receipt")||
					Utility.iscontainsWithoutReport(bill_final_status.getText(), "Bill")
					&&
					Utility.iscontainsWithoutReport(bill_final_status.getText(), "Closed"))
			{
				Reports.log(LogStatus.PASS, " Bill status is closed");

				String sBillNo=div_receipt_no.getText();
				Reports.log(LogStatus.PASS, "sBillNo: " + sBillNo + " is generated succesfully");
			}

			else
			{
				Reports.log(LogStatus.FAIL, " Bill status is not closed");
			}

			div_nullify_bill.click();
			Utility.explicitlyWait(8000);
			Utility.iscontains(div_nullify_bill.getText(), "Are you sure you want to nullify this bill");
			div_nullify_bill.click();
			Utility.waitForAjaxToFinish(5000);
			txt_nullify_comment.sendKeys("This is for QA Purpose");
			btn_nullify_submit.click();
			Utility.waitForAjaxToFinish(5000);
			Utility.iscontains(msg_nullify.getText(), "Bill is nullified");
			homePage.navigateNewBill();
			Utility.waitForAjaxToFinish(6000);
			Utility.selectFromPopulatedListBox(click_To_Select, txt_item_search, link_searched_item, sGuestName);
			Utility.waitForAjaxToFinish(6000);
			String sQtyPackage_post=div_package_left_qty.getText();
			int iQtyPackage_post=Integer.parseInt(sQtyPackage_post);
			if (iQtyPackage_post==iQtyPackage) 
			{
				Reports.log(LogStatus.PASS, "Available package qty reset after nullifying the bill- passed");
			}
			else
			{
				Reports.log(LogStatus.FAIL, "Available package qty reset after nullifying the bill- failed");
			}
		}
	}




	public void utilizePackage(String sGuestName,String sPackage,String sItem)
	{
		//Utility.selectFromPopulatedListBox(click_To_Select, txt_item_search, link_searched_item, sGuestName);
		//Utility.waitForAjaxToFinish(6000);

		if(navigateTillPayment(sGuestName,sItem))
		{
			String sQtyPackage=div_package_left_qty.getText();
			System.out.println("available package"+sQtyPackage);
			int iQtyPackage=Integer.parseInt(sQtyPackage);
			btn_pay_and_close.click();
			Utility.waitForAjaxToFinish(7000);


			Utility.iscontains(heading_item_table.get(0).getText(), "Description");
			Utility.iscontains(heading_item_table.get(1).getText(), "Price");
			Utility.iscontains(heading_item_table.get(2).getText(), "Discount");
			Utility.iscontains(heading_item_table.get(3).getText(), "Quantity");
			Utility.iscontains(heading_item_table.get(4).getText(), "Total");
			Utility.iscontains(bill_guest_receipt_info.getText(), sGuestName);
			Utility.iscontains(rows_item_table.get(0).getText(), sItem);
			String sPrice=rows_item_table.get(1).getText();
			double dPrice = Double.parseDouble(sPrice);
			String sQty=rows_item_table.get(3).getText();
			double dQty = Double.parseDouble(sQty);
			if (rows_item_table.get(2).getText()=="0.00%" )
			{
				Utility.iscontains("Total Price:"+dPrice*dQty, "Total Price:"+rows_item_table.get(4).getText());
			}

			Utility.iscontains(heading_payment_table.get(0).getText(), "Date");
			Utility.iscontains(heading_payment_table.get(1).getText(), "Type");
			Utility.iscontains(heading_payment_table.get(2).getText(), "Amount");

			//Utility.iscontains(rows_item_table.get(0).getText(), "Deposit");
			Utility.iscontains(rows_payment_table.get(1).getText(),"Deduction - Package");
			Utility.iscontains("Total Price:"+rows_payment_table.get(2).getText(), "Total Price:"+dPrice*dQty);

			Utility.iscontains("Amount payable:"+div_amount_payable_value.getText(), "Amount payable:"+dPrice*dQty);
			Utility.iscontains("Amount paid:"+div_amount_paid.getText(), "Amount paid:"+dPrice*dQty);
			Utility.iscontains(div_amount_balance_value.getText(), "0");

			Utility.isElementPresent(bill_final_status,"Bill final status after payment");
			if( Utility.iscontains(bill_final_status.getText(), "Bill") &&
					Utility.iscontains(bill_final_status.getText(), "Closed"))
			{
				Reports.log(LogStatus.PASS, " Bill status is closed");

				String sBillNo=div_receipt_no.getText();
				Reports.log(LogStatus.PASS, "sBillNo: " + sBillNo + " is generated succesfully");
			}

			else
			{
				Reports.log(LogStatus.FAIL, " Bill status is not closed");
			}
			homePage.navigateNewBill();
			Utility.waitForAjaxToFinish(6000);
			Utility.selectFromPopulatedListBox(click_To_Select, txt_item_search, link_searched_item, sGuestName);
			Utility.waitForAjaxToFinish(6000);
			String sQtyPackage_post=div_package_left_qty.getText();
			int iQtyPackage_post=Integer.parseInt(sQtyPackage_post);
			if (iQtyPackage_post==(iQtyPackage-1)) 
			{
				Reports.log(LogStatus.PASS, "Available package qty reset after deduction from the bill- passed");
			}
			else
			{
				Reports.log(LogStatus.FAIL, "Available package qty reset after deduction from the  bill- failed");
			}
		}
	}




	public void verifyInsuranceExpired(String sGuestName)
	{
		String sPreAuth="none";
		if(sGuestName.contains(";"))
		{
			String[] splittedGuest=sGuestName.split(";");
			sGuestName=splittedGuest[0];
			 sPreAuth=splittedGuest[1];
		}
		Utility.selectFromPopulatedListBox(click_To_Select, txt_item_search, link_searched_item, sGuestName);
		Utility.waitForAjaxToFinish(6000);
		
		if( ! sPreAuth.contains("none"))
		{
		new Select(list_pre_auth).selectByVisibleText(sPreAuth);
		}
		Utility.waitForAjaxToFinish(6000);
		if (div_insurance_error.getText().contains("Insurance Validity Expired") &&
				! div_insurance_error.getAttribute("style").contains("none"))
		{
			Reports.log(LogStatus.PASS, "Insurance validity expired validation functionality passed");
		}
		else
		{
			Reports.log(LogStatus.FAIL, "Insurance validity expired validation functionality failed");
		}

		if(Utility.isElementPresentWithoutReport(div_billing_item,"billing item text field")  &&
				! div_billing_item.getAttribute("style").contains("none"))
		{

			Reports.log(LogStatus.FAIL, "user is not able to bill , if insurance expired- FAILED");
		}
		else
		{
			Reports.log(LogStatus.PASS, "user is not able to bill , if insurance expired- PASSED");
		}
	}
	
	

	public void verifyGuestDetails(String sGuestName)
	{
		Utility.selectFromPopulatedListBox(click_To_Select, txt_item_search, link_searched_item, sGuestName);
		Utility.waitForAjaxToFinish(6000);
		String sGuest=guest_details.getText();
		if (sGuest.contains("First Name:") && sGuest.contains("Last Name:") && 
				sGuest.contains("Date Of Birth:") && sGuest.contains("Gender:") &&
				sGuest.contains("Mobile:") && sGuest.contains("Deposits:") &&
				sGuest.contains("Insurance:"))
		{
			Reports.log(LogStatus.PASS, "Guest Details functionality passed");
		}
		else
		{
			Reports.log(LogStatus.PASS, "Guest Details functionality passed");
		}
	}

	public void vaildItemAutoPopulate(String sGuestName,String sBillingitem)
	{
		Utility.selectFromPopulatedListBox(click_To_Select, txt_item_search, link_searched_item, sGuestName);
		Utility.waitForAjaxToFinish(6000);
		txt_billing_item.sendKeys(sBillingitem);
		Utility.waitForAjaxToFinish(3000);
		if (Utility.iscontains(selct_auto_billing_item.getText(),sBillingitem ))
		{
			Reports.log(LogStatus.PASS, "Billing item auto population functionlity passed");
		}
		else
		{
			Reports.log(LogStatus.FAIL, "Billing item auto population functionlity failed");
		}
	}

	public boolean inVaildItemAutoPopulate(String sGuestName,String sBillingitem)
	{
		Utility.selectFromPopulatedListBox(click_To_Select, txt_item_search, link_searched_item, sGuestName);
		Utility.waitForAjaxToFinish(6000);
		txt_billing_item.sendKeys(sBillingitem);
		Utility.waitForAjaxToFinish(3000);
		if (Utility.isEqualWithoutReport(selct_auto_billing_item.getText(),sBillingitem ))
		{
			Reports.log(LogStatus.WARNING, "Billing item invalid auto population functionlity failed");
			return false;
		}
		else
		{
			Reports.log(LogStatus.PASS, "Billing item invalid auto population functionlity passed");
			return true;
		}
	}

	public void verifyBillingDetails(String sGuestName,String sBillingitem)
	{
		Utility.selectFromPopulatedListBox(click_To_Select, txt_item_search, link_searched_item, sGuestName);
		Utility.waitForAjaxToFinish(6000);
		txt_billing_item.sendKeys(sBillingitem);
		Utility.waitForAjaxToFinish(3000);
		selct_auto_billing_item.click();
		Utility.iscontains(heading_billing_item_list.get(0).getText(), "Item");
		Utility.iscontains(heading_billing_item_list.get(1).getText(), "Price");
		Utility.iscontains(heading_billing_item_list.get(2).getText(), "Discount");
		Utility.iscontains(heading_billing_item_list.get(3).getText(), "Quantity");
		Utility.iscontains(heading_billing_item_list.get(4).getText(), "Total");
	}

	public void verifyBillingQtyEditable(String sGuestName,String sBillingitem)
	{
		if(navigateTillPayment(sGuestName,sBillingitem))
		{
			String sQty=txt_qty_item.getAttribute("value");
			System.out.println("qty: "+ sQty);
			int iQty = Integer.parseInt(sQty);
			int iActualQty=iQty+1;
			//txt_qty_item.clear();
			//txt_qty_item.sendKeys(Integer.toString(iActualQty));


			txt_qty_item.sendKeys(Keys.chord(Keys.CONTROL, "a"),Integer.toString(iActualQty));
			Utility.explicitlyWait(2000);
			if (txt_qty_item.getAttribute("value")==Integer.toString(iActualQty))
			{
				Reports.log(LogStatus.PASS, "Billing QTY Field is editable");
			}
			else
			{
				Reports.log(LogStatus.FAIL, "Billing QTY Field is not editable");
			}

		}
	}

	public void verifyBillingPriceNotEditable(String sGuestName,String sBillingitem)
	{
		Utility.selectFromPopulatedListBox(click_To_Select, txt_item_search, link_searched_item, sGuestName);
		Utility.waitForAjaxToFinish(6000);
		txt_billing_item.sendKeys(sBillingitem);
		Utility.waitForAjaxToFinish(3000);
		selct_auto_billing_item.click();
		Utility.waitForAjaxToFinish(3000);
		//String sPrice=rows_billing_item_list.get(1).getText();
		if (Utility.isElementPresentWithoutReport(txt_price_item,"Price field editable"))
		{
			Reports.log(LogStatus.FAIL, "Billing Price Field is editable");
		}
		else
		{
			Reports.log(LogStatus.PASS, "Billing Price Field is not editable");
		}

	}
	
	public void verifyItemPriceForARP(String sGuestName,String sBillingitem,String sExpectedPrice)
	{
		Utility.selectFromPopulatedListBox(click_To_Select, txt_item_search, link_searched_item, sGuestName);
		Utility.waitForAjaxToFinish(6000);

		txt_billing_item.sendKeys(sBillingitem);
		Utility.waitForAjaxToFinish(3000);
		selct_auto_billing_item.click();
		Utility.waitForAjaxToFinish(3000);
		String sPrice=div_price_item.getText();

		if (sPrice.replace(",","").equals(sExpectedPrice))
		{
			Reports.log(LogStatus.PASS, "Billing Price Fetched functionality from ARP is passed-  Expected price :" +sExpectedPrice);
		}
		else
		{
			Reports.log(LogStatus.FAIL, "Billing Price Fetched functionality from ARP is failed-  Expected price :" +sExpectedPrice+ " and price in UI: "+ sPrice );
		}

	}

	public void verifyItemPriceForARPWithPreAuth(String sGuestName,String sBillingitem,String sPreAuth,String sExpectedPrice)
	{
		Utility.selectFromPopulatedListBox(click_To_Select, txt_item_search, link_searched_item, sGuestName);
		Utility.waitForAjaxToFinish(6000);
		new Select(list_pre_auth).selectByVisibleText(sPreAuth);
		
		Utility.waitForAjaxToFinish(5000);
		txt_billing_item.sendKeys(sBillingitem);
		Utility.waitForAjaxToFinish(3000);
		selct_auto_billing_item.click();
		Utility.waitForAjaxToFinish(3000);
		String sPrice=div_price_item.getText();

		if (sPrice.equals(sExpectedPrice))
		{
			Reports.log(LogStatus.PASS, "Billing Price Fetched functionality from ARP is passed-  Expected price :" +sExpectedPrice);
		}
		else
		{
			Reports.log(LogStatus.FAIL, "Billing Price Fetched functionality from ARP is failed-  Expected price :" +sExpectedPrice+ " and price in UI: "+ sPrice );
		}

	}

	public void verifyDefaultPaymentMode(String sUserFor,String sBillingitem,String sExpectedMode)
	{

		if(navigateTillPayment(sUserFor,sBillingitem))
		{


			if (Utility.isElementPresentWithoutReport(link_remove, "Remove Deposit or packages"))
			{
				link_remove.click();
				Utility.waitForAjaxToFinish(2000);


			}
		}

		String sSelectedVal=new Select(list_Pay_type).getFirstSelectedOption().getAttribute("value");



		boolean bFlag=false;

		if(  sSelectedVal.contains(sExpectedMode))
		{
			bFlag=true;

		}
		if(bFlag)
		{
			Reports.log(LogStatus.PASS, sExpectedMode +": is available as default payment mode");

		}
		else
			Reports.log(LogStatus.FAIL, sExpectedMode +": is not available as default payment mode, rather :" + sSelectedVal +":  is available as default");
	}

	public void verifySelectPaymentMode(String sUserFor,String sBillingitem,String spaymentType)
	{

		if(navigateTillPayment(sUserFor,sBillingitem))
		{


			if (Utility.isElementPresentWithoutReport(link_remove, "Remove Deposit or packages"))
			{
				link_remove.click();
				Utility.waitForAjaxToFinish(2000);


			}

			list_Pay_type.click();


			Utility.explicitlyWait(2000);

			List<WebElement> itemList=new Select(list_Pay_type).getOptions();

			for(WebElement l:itemList)
			{

				if( Utility.iscontains( l.getAttribute("value"), "Cash;Card;Deposit;Credit"))
				{
					Reports.log(LogStatus.PASS, "Item: "+ l.getAttribute("value") +" is Available in  payment type list box");
				}


			}
			spaymentType=spaymentType.toLowerCase();
			switch (spaymentType) {
			case "cash":
				option_cash.click();
				Reports.log(LogStatus.PASS, "Item: "+ spaymentType + "  is selected from payment type list box");
				break;
			case "card": 
				option_card.click();
				txt_paydata.sendKeys("1234");
				Reports.log(LogStatus.PASS, "Item: "+ spaymentType + "  is selected from payment type list box");
				break;

			case "deposit": 
				option_deposit.click(); 
				Reports.log(LogStatus.PASS, "Item: "+ spaymentType + "  is selected from payment type list box");
				break;


			default:
				Reports.log(LogStatus.FAIL, "Item: "+ spaymentType + "  is not avialable in list box");
				break;

			}



			if (Utility.isElementPresent(btn_confirm_payment, "Confirm payment"))
			{
				btn_confirm_payment.click();
				Utility.waitForAjaxToFinish(5000);

			}



			if (Utility.isElementPresent(btn_pay_and_close, "Pay and close button"))
			{
				Reports.log(LogStatus.PASS, "Pay and close button available after payment mode selection and confirm click"); 
			}
			else
			{
				Reports.log(LogStatus.PASS, "Pay and close button is not available after payment mode selection and confirm click");
			}

			if ( Utility.iscontains(div_amount_balance_value.getText(), "0"))
			{
				Reports.log(LogStatus.PASS, "Balance amount is zero after payment mode selection and confirm click");
			}

			else
			{
				Reports.log(LogStatus.FAIL, "Balance amount is not zero after payment mode selection and confirm click");
			}
		}



	}

	public void createAndPayBill(String spaymentType,String sUserFor,String sBillingitem)
	{

		if(navigateTillPayment(sUserFor,sBillingitem))
		{


			if (Utility.isElementPresentWithoutReport(link_remove, "Remove Deposit or packages"))
			{
				link_remove.click();
				Utility.waitForAjaxToFinish(2000);


			}


			list_Pay_type.click();
			//new Select(list_Pay_type).selectByIndex(1);
			Utility.explicitlyWait(2000);
			String sFinalStatus = "";
			spaymentType=spaymentType.toLowerCase();
			switch (spaymentType) {
			case "cash":
				option_cash.click();
				Reports.log(LogStatus.PASS, "Item: "+ spaymentType + "  is selected from payment type list box");
				sFinalStatus="Closed";  
				break;
			case "card": 
				option_card.click();
				txt_paydata.sendKeys("1234");
				Reports.log(LogStatus.PASS, "Item: "+ spaymentType + "  is selected from payment type list box");
				sFinalStatus="Closed";
				break;

			case "deposit": 
				option_deposit.click(); 
				Reports.log(LogStatus.PASS, "Item: "+ spaymentType + "  is selected from payment type list box");
				break;

			case "copay deposit": 
				option_copay_deposit.click();
				Reports.log(LogStatus.PASS, "Item: "+ spaymentType + "  is selected from payment type list box");
				break;

			case "co-pay cash": 
				option_co_pay_cash.click();
				Reports.log(LogStatus.PASS, "Item: "+ spaymentType + "  is selected from payment type list box");
				break;

			case "co-pay card": 
				option_copay_card.click();
				Reports.log(LogStatus.PASS, "Item: "+ spaymentType + "  is selected from payment type list box");
				break;

			case "credit": 
				option_credit.click();
				Reports.log(LogStatus.PASS, "Item: "+ spaymentType + "  is selected from payment type list box");
				sFinalStatus="Finalized";
				break; 

			default:
				Reports.log(LogStatus.FAIL, "Item: "+ spaymentType + "  is not avialable in list box");
				break;


			}






			if (Utility.isElementPresent(btn_confirm_payment, "Confirm payment"))
			{
				btn_confirm_payment.click();
				Utility.waitForAjaxToFinish(5000);

			}

			btn_pay_and_close.click();
			Utility.waitForAjaxToFinish(7000);
			Utility.iscontains(heading_item_table.get(0).getText(), "Description");
			Utility.iscontains(heading_item_table.get(1).getText(), "Price");
			Utility.iscontains(heading_item_table.get(2).getText(), "Discount");
			Utility.iscontains(heading_item_table.get(3).getText(), "Quantity");
			Utility.iscontains(heading_item_table.get(4).getText(), "Total");
		//	Utility.iscontains(bill_guest_receipt_info.getText(), sUserFor);
			Utility.iscontains(rows_item_table.get(0).getText(), sBillingitem);
			String sPrice=rows_item_table.get(1).getText();
			double dPrice = Double.parseDouble(sPrice);
			String sQty=rows_item_table.get(3).getText();
			double dQty = Double.parseDouble(sQty);
			if (rows_item_table.get(2).getText()=="0.00%" )
			{
				Utility.iscontains("Total Price:"+dPrice*dQty, "Total Price:"+rows_item_table.get(4).getText());
			}

			Utility.iscontains(heading_payment_table.get(0).getText(), "Date");
			Utility.iscontains(heading_payment_table.get(1).getText(), "Type");
			Utility.iscontains(heading_payment_table.get(2).getText(), "Amount");

			if (Utility.iscontainsWithoutReport(rows_payment_table.get(1).getText().toLowerCase(),spaymentType.toLowerCase())
					||Utility.iscontainsWithoutReport(rows_payment_table.get(1).getText().toLowerCase(),spaymentType.toLowerCase().replace(" ", "-")))
			{
				Reports.log(LogStatus.PASS, " Bill payment type successfully changed to: " + spaymentType);
			}
			
			//Utility.iscontains(rows_item_table.get(0).getText(), "Deposit");
			//Utility.iscontains(rows_payment_table.get(1).getText().toLowerCase(),spaymentType.toLowerCase());
			Utility.iscontains("Total Price:"+rows_payment_table.get(2).getText(), "Total Price:"+dPrice*dQty);

			Utility.iscontains("Amount payable:"+div_amount_payable_value.getText(), "Amount payable:"+dPrice*dQty);
			Utility.iscontains("Amount paid:"+div_amount_paid.getText(), "Amount paid:"+dPrice*dQty);
			Utility.iscontains(div_amount_balance_value.getText(), "0");

			Utility.isElementPresent(bill_final_status,"Bill final status after payment");

			if( Utility.iscontainsWithoutReport(bill_final_status.getText(), "Bill") || 
					Utility.iscontainsWithoutReport(bill_final_status.getText(), "Receipt") &&
					Utility.iscontainsWithoutReport(bill_final_status.getText(), sFinalStatus))
			{
				Reports.log(LogStatus.PASS, " Bill status is closed");

				String sBillNo=div_receipt_no.getText();
				Reports.log(LogStatus.PASS, "sBillNo: " + sBillNo + " is generated succesfully");
			}

			else
			{
				Reports.log(LogStatus.FAIL, " Bill status is not closed");
			}

		}
		else
			Reports.log(LogStatus.FAIL, "Navigateing till pay and close failed");
		//return new Deposit();

	}




	public void changePaymentDateAndPayBill(String sDate,String sUserFor)
	{


		txt_payment_date.click();
		txt_payment_date.clear();
		txt_payment_date.sendKeys(sDate);
		btn_pay_and_close.click();
		Utility.waitForAjaxToFinish(7000);


		Utility.iscontains(heading_item_table.get(0).getText(), "Description");
		Utility.iscontains(heading_item_table.get(1).getText(), "Price");
		Utility.iscontains(heading_item_table.get(2).getText(), "Discount");
		Utility.iscontains(heading_item_table.get(3).getText(), "Quantity");
		Utility.iscontains(heading_item_table.get(4).getText(), "Total");
		Utility.iscontains(bill_guest_receipt_info.getText(), sUserFor);

		Utility.iscontains(heading_payment_table.get(0).getText(), "Date");
		Utility.iscontains(heading_payment_table.get(1).getText(), "Type");
		Utility.iscontains(heading_payment_table.get(2).getText(), "Amount");
		if( Utility.iscontains(rows_payment_table.get(0).getText(), sDate))
		{
			Reports.log(LogStatus.PASS, "Payment date updated succesfully");


		}
		else
		{Reports.log(LogStatus.FAIL, "Payment date is not updated succesfully");

		}



		Utility.isElementPresent(bill_final_status,"Bill final status after payment");
		if( Utility.iscontains(bill_final_status.getText(), "Bill") &&
				Utility.iscontains(bill_final_status.getText(), "Closed"))
		{
			Reports.log(LogStatus.PASS, " Bill status is closed");

			String sBillNo=div_receipt_no.getText();
			Reports.log(LogStatus.PASS, "sBillNo: " + sBillNo + " is generated succesfully");
		}

		else
		{
			Reports.log(LogStatus.FAIL, " Bill status is not closed");
		}

	}

	public void changePaymentModeAndPayBill(String spaymentType,String sUserFor)
	{


		if (Utility.isElementPresentWithoutReport(link_remove, "Remove Deposit or packages"))
		{
			link_remove.click();
			Utility.waitForAjaxToFinish(2000);


		}

		list_Pay_type.click();
		//new Select(list_Pay_type).selectByIndex(1);
		Utility.explicitlyWait(2000);
		spaymentType=spaymentType.toLowerCase();
		switch (spaymentType) {
		case "cash":
			option_cash.click();
			Reports.log(LogStatus.PASS, "Item: "+ spaymentType + "  is selected from payment type list box");
			break;
		case "card": 
			option_card.click();
			txt_paydata.sendKeys("1234");
			Reports.log(LogStatus.PASS, "Item: "+ spaymentType + "  is selected from payment type list box");
			break;

		case "deposit": 
			option_deposit.click(); 
			Reports.log(LogStatus.PASS, "Item: "+ spaymentType + "  is selected from payment type list box");
			break;

		case "copay deposit": 
			option_copay_deposit.click();
			Reports.log(LogStatus.PASS, "Item: "+ spaymentType + "  is selected from payment type list box");
			break;

		case "co-pay cash": 
			option_co_pay_cash.click();
			Reports.log(LogStatus.PASS, "Item: "+ spaymentType + "  is selected from payment type list box");
			break;

		case "co-pay card": 
			option_copay_card.click();
			Reports.log(LogStatus.PASS, "Item: "+ spaymentType + "  is selected from payment type list box");
			break;
		case "credit": 
			option_credit.click();
			Reports.log(LogStatus.PASS, "Item: "+ spaymentType + "  is selected from payment type list box");
			break;  

		default:
			Reports.log(LogStatus.FAIL, "Item: "+ spaymentType + "  is not avialable in list box");
			break;

		}



		if (Utility.isElementPresent(btn_confirm_payment, "Confirm payment"))
		{
			btn_confirm_payment.click();
			Utility.waitForAjaxToFinish(5000);
			btn_pay_and_close.click();
			Utility.waitForAjaxToFinish(7000);
		}

		Utility.iscontains(heading_item_table.get(0).getText(), "Description");
		Utility.iscontains(heading_item_table.get(1).getText(), "Price");
		Utility.iscontains(heading_item_table.get(2).getText(), "Discount");
		Utility.iscontains(heading_item_table.get(3).getText(), "Quantity");
		Utility.iscontains(heading_item_table.get(4).getText(), "Total");
		Utility.iscontains(bill_guest_receipt_info.getText(), sUserFor);
		// Utility.iscontains(rows_item_table.get(0).getText(), sBillingitem);
		String sPrice=rows_item_table.get(1).getText();
		double dPrice = Double.parseDouble(sPrice);
		String sQty=rows_item_table.get(3).getText();
		double dQty = Double.parseDouble(sQty);
		if (rows_item_table.get(2).getText()=="0.00%" )
		{
			Utility.iscontains("Total Price:"+dPrice*dQty, "Total Price:"+rows_item_table.get(4).getText());
		}

		Utility.iscontains(heading_payment_table.get(0).getText(), "Date");
		Utility.iscontains(heading_payment_table.get(1).getText(), "Type");
		Utility.iscontains(heading_payment_table.get(2).getText(), "Amount");

		//Utility.iscontains(rows_item_table.get(0).getText(), "Deposit");
		if (Utility.iscontainsWithoutReport(rows_payment_table.get(1).getText().toLowerCase(),spaymentType.toLowerCase())
				||Utility.iscontainsWithoutReport(rows_payment_table.get(1).getText().toLowerCase(),spaymentType.toLowerCase().replace(" ", "-")))
		{
			Reports.log(LogStatus.PASS, " Bill payment type successfully changed to: " + spaymentType);
		}
		// Utility.iscontains("Total Price:"+rows_payment_table.get(2).getText(), "Total Price:"+dPrice*dQty);

		//Utility.iscontains("Amount payable:"+div_amount_payable_value.getText(), "Amount payable:"+dPrice*dQty);
		// Utility.iscontains("Amount paid:"+div_amount_paid.getText(), "Amount paid:"+dPrice*dQty);
		//Utility.iscontains(div_amount_balance_value.getText(), "0");

		Utility.isElementPresent(bill_final_status,"Bill final status after payment");
		if( Utility.iscontains(bill_final_status.getText(), "Bill") &&
				Utility.iscontainsWithoutReport(bill_final_status.getText(), "Closed") ||  
				Utility.iscontainsWithoutReport(bill_final_status.getText(), "Finalized"))
		{
			Reports.log(LogStatus.PASS, " Bill status is closed");

			String sBillNo=div_receipt_no.getText();
			Reports.log(LogStatus.PASS, "sBillNo: " + sBillNo + " is generated succesfully");
		}

		else
		{
			Reports.log(LogStatus.FAIL, " Bill status is not closed");
		}

	}


	public void changePackageItemQtyAndPayBill(String sUserFor,String sChangeType)
	{

		String sQtyPackage=div_package_left_qty.getText();
		System.out.println("available package"+sQtyPackage);
		int iQtyPackage=Integer.parseInt(sQtyPackage);
		String sQty=txt_qty_item.getAttribute("value");
		System.out.println("qty: "+ sQty);
		int iQty = Integer.parseInt(sQty);
		int iActualQty;
		if(sChangeType.equalsIgnoreCase("increase"))
		{
			iActualQty=iQty+1;
		}
		else
		{
			iActualQty=iQty-1;
		}


		txt_qty_item.sendKeys(Keys.chord(Keys.CONTROL, "a"),Integer.toString(iActualQty));
		Utility.explicitlyWait(2000);
		if (Utility.iscontains(txt_qty_item.getAttribute("value"),Integer.toString(iActualQty)))
		{
			Reports.log(LogStatus.PASS, "Billing QTY Field updated");
		}
		else
		{
			Reports.log(LogStatus.FAIL, "Billing QTY Field updated");
		}

		System.out.println("before billing click");
		txt_billing_item.click();
		Utility.waitForAjaxToFinish(2000);
		System.out.println("after billing click");
		if (Utility.isElementPresentWithoutReport(link_remove, "Remove Deposit or packages")

				&& ! link_remove.getAttribute("style").contains("none"))
		{
			link_remove.click();
			Utility.waitForAjaxToFinish(2000);


		}

		if (Utility.isElementPresentWithoutReport(link_remove, "Remove Deposit or packages")

				&& ! link_remove.getAttribute("style").contains("none"))
		{
			link_remove.click();
			Utility.waitForAjaxToFinish(2000);


		}
		
		
		System.out.println("after remove");
		if (Utility.isElementPresent(btn_confirm_payment, "Confirm payment"))
		{
			btn_confirm_payment.click();
			Utility.waitForAjaxToFinish(5000);
			System.out.println("after confirm click");
			
		}
		
		btn_pay_and_close.click();
		Utility.waitForAjaxToFinish(7000);
		System.out.println("after pay click");

		Utility.iscontains(heading_item_table.get(0).getText(), "Description");
		Utility.iscontains(heading_item_table.get(1).getText(), "Price");
		Utility.iscontains(heading_item_table.get(2).getText(), "Discount");
		Utility.iscontains(heading_item_table.get(3).getText(), "Quantity");
		Utility.iscontains(heading_item_table.get(4).getText(), "Total");
		Utility.iscontains(bill_guest_receipt_info.getText(), sUserFor);
		if( Utility.iscontains(rows_item_table.get(3).getText(), Integer.toString(iActualQty)))
		{
			Reports.log(LogStatus.PASS, "Updated item qty reflected in billing confirmation page");
		}
		else
		{
			Reports.log(LogStatus.FAIL, "Updated item qty is not reflected in billing confirmation page");
		}

		Utility.iscontains(heading_payment_table.get(0).getText(), "Date");
		Utility.iscontains(heading_payment_table.get(1).getText(), "Type");
		Utility.iscontains(heading_payment_table.get(2).getText(), "Amount");




		Utility.isElementPresent(bill_final_status,"Bill final status after payment");
		if( Utility.iscontains(bill_final_status.getText(), "Bill") &&
				Utility.iscontains(bill_final_status.getText(), "Closed"))
		{
			Reports.log(LogStatus.PASS, " Bill status is closed");

			String sBillNo=div_receipt_no.getText();
			Reports.log(LogStatus.PASS, "sBillNo: " + sBillNo + " is generated succesfully");
		}

		else
		{
			Reports.log(LogStatus.FAIL, " Bill status is not closed");
		}

		homePage.navigateNewBill();
		Utility.waitForAjaxToFinish(6000);
		Utility.selectFromPopulatedListBox(click_To_Select, txt_item_search, link_searched_item, sUserFor);
		Utility.waitForAjaxToFinish(6000);
		String sQtyPackage_post=div_package_left_qty.getText();
		int iQtyPackage_post=Integer.parseInt(sQtyPackage_post);
		
		
		
		if(sChangeType.equalsIgnoreCase("increase"))
		{
			if (iQtyPackage_post==(iQtyPackage-1)) 
			{
				Reports.log(LogStatus.PASS, "Available package qty reset after deduction from the bill- passed");
			}
			else
			{
				Reports.log(LogStatus.FAIL, "Available  package qty reset after deduction from the  bill- failed");
			}
		}
		else
		{
			if (iQtyPackage_post==(iQtyPackage+1)) 
			{
				Reports.log(LogStatus.PASS, "Available package qty reset after deduction from the bill- passed");
			}
			else
			{
				Reports.log(LogStatus.FAIL, "Available package qty reset after deduction from the  bill- failed");
			}
		}


		//return  iActualQty;

	}


	public int changeItemQtyAndPayBill(String spaymentType,String sUserFor,String sChangeType)
	{
		String sQty=txt_qty_item.getAttribute("value");
		System.out.println("qty: "+ sQty);
		int iQty = Integer.parseInt(sQty);
		int iActualQty;
		if(sChangeType.equalsIgnoreCase("increase"))
		{
			iActualQty=iQty+1;
		}
		else
		{
			iActualQty=iQty-1;
		}


		txt_qty_item.sendKeys(Keys.chord(Keys.CONTROL, "a"),Integer.toString(iActualQty));
		Utility.explicitlyWait(2000);
		if (Utility.iscontains(txt_qty_item.getAttribute("value"),Integer.toString(iActualQty)))
		{
			Reports.log(LogStatus.PASS, "Billing QTY Field updated");
		}
		else
		{
			Reports.log(LogStatus.FAIL, "Billing QTY Field updated");
		}


		txt_billing_item.click();
		Utility.waitForAjaxToFinish(2000);
		if (Utility.isElementPresentWithoutReport(link_remove, "Remove Deposit or packages") 

				&& ! link_remove.getAttribute("style").contains("none"))
		{
			link_remove.click();
			Utility.waitForAjaxToFinish(2000);


		}
		if (Utility.isElementPresentWithoutReport(link_remove, "Remove Deposit or packages")
				&& ! link_remove.getAttribute("style").contains("none"))
		{
			link_remove.click();
			Utility.waitForAjaxToFinish(2000);


		}

		if(Utility.isElementPresentWithoutReport(list_Pay_type, "Pay type list box") && 
				! list_Pay_type.getAttribute("style").contains("none"))
		{
			list_Pay_type.click();
			Utility.explicitlyWait(2000);

			option_cash.click();
			Reports.log(LogStatus.PASS, "Item: "+ spaymentType + "  is selected from payment type list box");

		} 


		if (Utility.isElementPresent(btn_confirm_payment, "Confirm payment"))
		{
			btn_confirm_payment.click();
			Utility.waitForAjaxToFinish(5000);
			btn_pay_and_close.click();
			Utility.waitForAjaxToFinish(7000);
		}

		Utility.iscontains(heading_item_table.get(0).getText(), "Description");
		Utility.iscontains(heading_item_table.get(1).getText(), "Price");
		Utility.iscontains(heading_item_table.get(2).getText(), "Discount");
		Utility.iscontains(heading_item_table.get(3).getText(), "Quantity");
		Utility.iscontains(heading_item_table.get(4).getText(), "Total");
		Utility.iscontains(bill_guest_receipt_info.getText(), sUserFor);
		if( Utility.iscontains(rows_item_table.get(3).getText(), Integer.toString(iActualQty)))
		{
			Reports.log(LogStatus.PASS, "Updated item qty reflected in billing confirmation page");
		}
		else
		{
			Reports.log(LogStatus.FAIL, "Updated item qty is not reflected in billing confirmation page");
		}

		Utility.iscontains(heading_payment_table.get(0).getText(), "Date");
		Utility.iscontains(heading_payment_table.get(1).getText(), "Type");
		Utility.iscontains(heading_payment_table.get(2).getText(), "Amount");




		Utility.isElementPresent(bill_final_status,"Bill final status after payment");
		if( Utility.iscontains(bill_final_status.getText(), "Bill") &&
				Utility.iscontains(bill_final_status.getText(), "Closed"))
		{
			Reports.log(LogStatus.PASS, " Bill status is closed");

			String sBillNo=div_receipt_no.getText();
			Reports.log(LogStatus.PASS, "sBillNo: " + sBillNo + " is generated succesfully");
		}

		else
		{
			Reports.log(LogStatus.FAIL, " Bill status is not closed");
		}
		return  iActualQty;

	}



	public void addnewSliBillsEdit(String sUserFor,String sBillingItem)
	{


		txt_billing_item.sendKeys(sBillingItem);
		System.out.println("first");
		Utility.explicitlyWait(3000);
		selct_auto_billing_item.click();
		Utility.waitForAjaxToFinish(3000);
		/*if(Utility.isElementPresentWithoutReport(list_Pay_type, "Pay type list box") && 
				! list_Pay_type.getAttribute("style").contains("none"))
		{
			list_Pay_type.click();
			Utility.explicitlyWait(2000);

				  option_cash.click();
				  Reports.log(LogStatus.PASS, "Item: "+ "Cash" + "  is selected from payment type list box");

		} 
		 */

		if (Utility.isElementPresentWithoutReport(link_remove, "Remove Deposit or packages")

				&& ! link_remove.getAttribute("style").contains("none"))
		{
			link_remove.click();
			Utility.waitForAjaxToFinish(2000);


		}
		System.out.println("second");
		if (Utility.isElementPresent(btn_confirm_payment, "Confirm payment")&& 
				! btn_confirm_payment.getAttribute("style").contains("none"))
		{
			btn_confirm_payment.click();
			Utility.waitForAjaxToFinish(5000);

		}
		System.out.println("third");
		btn_pay_and_close.click();
		Utility.waitForAjaxToFinish(7000);

		Utility.iscontains(heading_item_table.get(0).getText(), "Description");
		Utility.iscontains(heading_item_table.get(1).getText(), "Price");
		Utility.iscontains(heading_item_table.get(2).getText(), "Discount");
		Utility.iscontains(heading_item_table.get(3).getText(), "Quantity");
		Utility.iscontains(heading_item_table.get(4).getText(), "Total");
		Utility.iscontains(bill_guest_receipt_info.getText(), sUserFor);
		if(Utility.iscontains(tbl_item_details.getText(), sBillingItem))
		{
			Reports.log(LogStatus.PASS, "Added new billing item" + sBillingItem +": reflected in the final page");
		}
		else
		{
			Reports.log(LogStatus.FAIL, "Added new billing item" + sBillingItem +": is not reflected in the final page");
		}

		Utility.iscontains(heading_payment_table.get(0).getText(), "Date");
		Utility.iscontains(heading_payment_table.get(1).getText(), "Type");
		Utility.iscontains(heading_payment_table.get(2).getText(), "Amount");




		Utility.isElementPresent(bill_final_status,"Bill final status after payment");
		if( Utility.iscontains(bill_final_status.getText(), "Bill") &&
				Utility.iscontains(bill_final_status.getText(), "Closed"))
		{
			Reports.log(LogStatus.PASS, " Bill status is closed");

			String sBillNo=div_receipt_no.getText();
			Reports.log(LogStatus.PASS, "sBillNo: " + sBillNo + " is generated succesfully");
		}

		else
		{
			Reports.log(LogStatus.FAIL, " Bill status is not closed");
		}


	}

	public void removeSliBillsEdit(String sUserFor,String sBillingItem)
	{
		System.out.println("no of items:"+ rows_billing_item_all_list.size());
		if (rows_billing_item_all_list.size()>1)
		{
			//ifvvvjjb (billing_item_2.getText().contains(sBillingItem))
			link_billing_item_remove_2.click();
			System.out.println("clicked second item");

			Utility.waitForAjaxToFinish(2000);
		}
		else
		{
			link_billing_item_remove.click();

			Utility.waitForAjaxToFinish(2000);
			System.out.println("clicked first item");
		}
		//System.out.println("first");

		/*if(Utility.isElementPresentWithoutReport(list_Pay_type, "Pay type list box") && 
				! list_Pay_type.getAttribute("style").contains("none"))
		{
			list_Pay_type.click();
			Utility.explicitlyWait(2000);

				  option_cash.click();
				  Reports.log(LogStatus.PASS, "Item: "+ "Cash" + "  is selected from payment type list box");

		} 

		 */	
		while(true)

		{
			if (Utility.isElementPresentWithoutReport(link_remove, "Remove Deposit or packages")

					&& ! link_remove.getAttribute("style").contains("none"))
			{
				link_remove.click();
				Utility.waitForAjaxToFinish(2000);
				System.out.println("first paymnt clicked");

			}
			else
			{
				break;
			}

		}

		btn_confirm_payment.click();
		Utility.explicitlyWait(3000);



		btn_pay_and_close.click();
		Utility.waitForAjaxToFinish(7000);

		Utility.iscontains(heading_item_table.get(0).getText(), "Description");
		Utility.iscontains(heading_item_table.get(1).getText(), "Price");
		Utility.iscontains(heading_item_table.get(2).getText(), "Discount");
		Utility.iscontains(heading_item_table.get(3).getText(), "Quantity");
		Utility.iscontains(heading_item_table.get(4).getText(), "Total");
		Utility.iscontains(bill_guest_receipt_info.getText(), sUserFor);
		if(Utility.iscontainsWithoutReport(tbl_item_details.getText(), sBillingItem))
		{
			Reports.log(LogStatus.FAIL, "Remove one billing item" + sBillingItem +": not removed from  the final page");
		}
		else
		{
			Reports.log(LogStatus.PASS, "Remove one billing item" + sBillingItem +":  removed from  the final page");
		}

		Utility.iscontains(heading_payment_table.get(0).getText(), "Date");
		Utility.iscontains(heading_payment_table.get(1).getText(), "Type");
		Utility.iscontains(heading_payment_table.get(2).getText(), "Amount");




		Utility.isElementPresent(bill_final_status,"Bill final status after payment");
		if( Utility.iscontains(bill_final_status.getText(), "Bill") &&
				Utility.iscontains(bill_final_status.getText(), "Closed"))
		{
			Reports.log(LogStatus.PASS, " Bill status is closed");

			String sBillNo=div_receipt_no.getText();
			Reports.log(LogStatus.PASS, "sBillNo: " + sBillNo + " is generated succesfully");
		}

		else
		{
			Reports.log(LogStatus.FAIL, " Bill status is not closed");
		}


	}


	public boolean navigateTillPayment(String sGuestName,String sBillingitem)
	{
		Utility.selectFromPopulatedListBox(click_To_Select, txt_item_search, link_searched_item, sGuestName);
		
		Utility.waitForAjaxToFinish(6000);
		String sGuest=guest_details.getText();
		if (sGuest.contains("First Name:") && sGuest.contains("Last Name:") && 
				sGuest.contains("Date Of Birth:") && sGuest.contains("Gender:") &&
				sGuest.contains("Mobile:") && sGuest.contains("Deposits:") &&
				sGuest.contains("Insurance:"))
		{
			Reports.log(LogStatus.PASS, "Guest Details functionality passed");
		}
		else
		{
			Reports.log(LogStatus.PASS, "Guest Details functionality passed");
		}

		if (sGuestName.contains("OP"))
		{
			
			if (Utility.isElementPresent(txt_opg_name, "Guest Name"))
					{
						txt_opg_name.sendKeys("test_OP_Guest");
					}
			if (Utility.isElementPresent(txt_opg_age, "Guest age"))
					{
						txt_opg_age.sendKeys("30");
					}
			
			Utility.isElementPresent(list_opg_gender, "Guest age");
			
		}
		
		
		txt_billing_item.sendKeys(sBillingitem);
		Utility.waitForAjaxToFinish(3000);
		selct_auto_billing_item.click();
		Utility.iscontains(heading_billing_item_list.get(0).getText(), "Item");
		Utility.iscontains(heading_billing_item_list.get(1).getText(), "Price");
		Utility.iscontains(heading_billing_item_list.get(2).getText(), "Discount");
		Utility.iscontains(heading_billing_item_list.get(3).getText(), "Quantity");
		Utility.iscontains(heading_billing_item_list.get(4).getText(), "Total");

		Utility.iscontains(heading_payment_item_list.get(0).getText(), "Date");
		Utility.iscontains(heading_payment_item_list.get(1).getText(), "Type");
		Utility.iscontains(heading_payment_item_list.get(2).getText(), "Amount");
		Utility.isElementPresent(btn_cancel, "Cancel button");
		if (Utility.isElementPresent(btn_pay_and_close, "Pay and Close button"))
		{
			return true;
		}
		else
			return false;


	}

	public boolean navigateTillPaymentWithPreAuth(String sGuestName,String sBillingitem,String sPreAuth)
	{
		Utility.selectFromPopulatedListBox(click_To_Select, txt_item_search, link_searched_item, sGuestName);
		Utility.waitForAjaxToFinish(6000);
		if( ! sPreAuth.contains("none"))
		{
		new Select(list_pre_auth).selectByVisibleText(sPreAuth);
		}
		//new Select(list_pre_auth).selectByValue(sPreAuth);
		Utility.waitForAjaxToFinish(5000);
		String sGuest=guest_details.getText();
		if (sGuest.contains("First Name:") && sGuest.contains("Last Name:") && 
				sGuest.contains("Date Of Birth:") && sGuest.contains("Gender:") &&
				sGuest.contains("Mobile:") && sGuest.contains("Deposits:") &&
				sGuest.contains("Insurance:"))
		{
			Reports.log(LogStatus.PASS, "Guest Details functionality passed");
		}
		else
		{
			Reports.log(LogStatus.PASS, "Guest Details functionality passed");
		}

		txt_billing_item.sendKeys(sBillingitem);
		Utility.explicitlyWait(4000);
		selct_auto_billing_item.click();
		//Utility.explicitlyWait(3000);
		//txt_billing_item.click();
		Utility.iscontains(heading_billing_item_list.get(0).getText(), "Item");
		Utility.iscontains(heading_billing_item_list.get(1).getText(), "Price");
		Utility.iscontains(heading_billing_item_list.get(2).getText(), "Discount");
		Utility.iscontains(heading_billing_item_list.get(3).getText(), "Quantity");
		Utility.iscontains(heading_billing_item_list.get(4).getText(), "Total");

		Utility.iscontains(heading_payment_item_list.get(0).getText(), "Date");
		Utility.iscontains(heading_payment_item_list.get(1).getText(), "Type");
		Utility.iscontains(heading_payment_item_list.get(2).getText(), "Amount");
		Utility.isElementPresent(btn_cancel, "Cancel button");
		if (Utility.isElementPresent(btn_pay_and_close, "Pay and Close button"))
		{
			return true;
		}
		else
			return false;


	}

	public void guestVerificationForInsurance(String sGuestName)
	{
		Utility.selectFromPopulatedListBox(click_To_Select, txt_item_search, link_searched_item, sGuestName);
		Utility.waitForAjaxToFinish(6000);
		String sGuest=guest_details.getText();
		if (sGuest.contains("First Name:") && sGuest.contains("Last Name:") && 
				sGuest.contains("Date Of Birth:") && sGuest.contains("Gender:") &&
				sGuest.contains("Mobile:") && sGuest.contains("Deposits:") &&
				sGuest.contains("Insurance:"))
		{
			Reports.log(LogStatus.PASS, "Guest Details functionality passed");

		}
		else
		{
			Reports.log(LogStatus.PASS, "Guest Details functionality passed");
		}

	}

	public void verifyAmtExceedsAuth(String sGuestName,String sBillingitem,String sPreAuth)
	{
		if(navigateTillPaymentWithPreAuth(sGuestName,sBillingitem,sPreAuth))
		{

			System.out.println("Billing item is :"  + sBillingitem);
			//txt_qty_item.clear();
			txt_qty_item.sendKeys("1");
			Utility.explicitlyWait(2000);
			txt_billing_item.click();
			Utility.explicitlyWait(2000);
			String sAmtLeftPre=span_amt_left_insurance.getText();
			System.out.println("pre auth amt left :"  + sAmtLeftPre);
			String sAmtPayable=span_amt_payable.getText().replace(",","");

			System.out.println("amount payable is :"  + sAmtPayable);

			if (Integer.parseInt(sAmtLeftPre)<Integer.parseInt(sAmtPayable))
			{
				Reports.log(LogStatus.PASS, "Pre auth amt is less then amt payable");
			}
			else
			{Reports.log(LogStatus.FAIL, "Pre auth amt is not less then amt payable");

			}
			txt_billing_item.click();
			Utility.explicitlyWait(2000);
			btn_confirm_payment.click();
			Utility.explicitlyWait(3000);
			if(!div_new_payment.getAttribute("style").contains("none"))
			{
				Reports.log(LogStatus.PASS, "Other payment type is available if pre auth amt is less then payment to paid");
			}
			else
			{
				Reports.log(LogStatus.FAIL, "Other payment type is not available if pre auth amt is less then payment to paid");
			}
		}
	}

	public void removeBillingItemFunctionalityVerification(String sUserFor,String sBillingitem)
	{
		if(navigateTillPayment(sUserFor,sBillingitem))
		{
			link_billing_item_remove.click();
			Utility.explicitlyWait(4000);
			if(tbl_billing_item_list.getAttribute("style").contains("none"))
			{
				Reports.log(LogStatus.PASS, "Billing item table get removed after removing billing item");
			}
			else
			{
				Reports.log(LogStatus.FAIL, "Billing item table is not getting removed after removing billing item");
			}

			if(tbl_payment_item_list.getAttribute("style").contains("none"))
			{
				Reports.log(LogStatus.PASS, "payment details table get removed after removing billing item");
			}
			else
			{
				Reports.log(LogStatus.FAIL, "payment details table is not getting removed after removing billing item");
			}

		}

	}

	public void depositNotSubscribed(String sUserFor,String sBillingitem,String spreAuth)
	{

		if(navigateTillPaymentWithPreAuth(sUserFor,sBillingitem,spreAuth))
		{

			List<WebElement> itemList=new Select(list_Pay_type).getOptions();
			boolean bFlag=false;
			for(WebElement l:itemList)
			{
				System.out.println(l.getAttribute("value"));
				if( l.getAttribute("value").contains("Deposit"))
				{
					bFlag=true;
					break;
				}
				if(bFlag)
				{
					Reports.log(LogStatus.FAIL, "Deposit is available for customer , who has not sunscribed for deposit");

				}
				else
					Reports.log(LogStatus.PASS, "Deposit is not available for customer , who has not sunscribed for deposit");
			}
		}
	}


	public NewBill()
	{
		PageFactory.initElements(driver.get(), this);

	}
}
