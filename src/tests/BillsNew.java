package tests;


import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
import Tools.Excel;
import Tools.Utility;
import Pages.Deposit;
import Pages.NewBill;
import common.TestCaseConfiguration;

public class BillsNew extends TestCaseConfiguration{

	NewBill newBill;
	Deposit deposit;

	@Test(enabled = true)
	public void NewBills() {

		Reports.startTest("Login and masqueradeAs");

		excelDict=Excel.readfromExcelinDict("Bills_New");
		Utility.waitForAjaxToFinish(7000);

		if(homePage.masqueradeAs(excelDict.get("center_manager")))
		{

			Reports.endTest();
			
			try
			{

				Reports.startTest("New_Test");
				newBill=homePage.navigateNewBill();
				
				boolean bFlag=newBill.inVaildItemAutoPopulate(excelDict.get("new_guest_op"),"Dialysis Session");
				if (bFlag)
				{
					Reports.log(LogStatus.PASS, "Dialysis is not populated for OP guest - passed");
				}
				else
				{
					Reports.log(LogStatus.FAIL, "Dialysis is  populated for OP guest - failed");
				}
				Reports.endTest();
				
				
			}
			catch(Exception e)
			{
				Reports.log(LogStatus.FAIL,"Test case :New_Test is failed" + e.getMessage());
			}
			

			try
			{

				Reports.startTest("TCBI131");
				newBill=homePage.navigateNewBill();
				newBill.createAndPayBill("cash",excelDict.get("guest_test"),excelDict.get("billing_item"));
				Reports.endTest();
			}
			catch(Exception e)
			{
				Reports.log(LogStatus.FAIL,"Test case :TCBI131 is failed" + e.getMessage());
			}




			try
			{

				Reports.startTest("TCBI137");
				newBill=homePage.navigateNewBill();
				newBill.createAndPayBill("Cash",excelDict.get("guest_test"),excelDict.get("billing_item"));
				Reports.endTest();
			}
			catch(Exception e)
			{
				Reports.log(LogStatus.FAIL,"Test case :TCBI137 is failed" + e.getMessage());
			}


			try
			{
				Reports.startTest("TCBI0078");
				newBill=homePage.navigateNewBill();
				newBill.utilizeZeroDeposit(excelDict.get("new_guest_op"), excelDict.get("billing_item"));
				Reports.endTest();
			}
			catch(Exception e)
			{
				Reports.log(LogStatus.FAIL,"Test case :TCBI0076 is failed");
			}

			try
			{
				Reports.startTest("TCBI0076");
				newBill=homePage.navigateNewBill();
				newBill.utilizeDeposit(excelDict.get("guest_test"), excelDict.get("billing_item"));
				Reports.endTest();
			}
			catch(Exception e)
			{
				Reports.log(LogStatus.FAIL,"Test case :TCBI0076 is failed");
			}

			try
			{

				Reports.startTest("TCBI0080");
				newBill=homePage.navigateNewBill();
				newBill.utilizeDepositAndNullify(excelDict.get("guest_test"),excelDict.get("billing_item"));
				Reports.endTest();
			}
			catch(Exception e)
			{
				Reports.log(LogStatus.FAIL,"Test case :TCBI0080 is failed");
			}


			try
			{
				Reports.startTest("TCBI0081");
				newBill=homePage.navigateNewBill();
				newBill.verifyInsuranceExpired(excelDict.get("insurance_expired_guest"));

				Reports.endTest();
			}
			catch(Exception e)
			{
				Reports.log(LogStatus.FAIL,"Test case :TCBI0081 is failed");
			}



		/*	try
			{
				Reports.startTest("TCBI0082");
				newBill=homePage.navigateNewBill();
				boolean bFlag=newBill.inVaildItemAutoPopulate("IP","Deposit");
				if (bFlag)
				{
					Reports.log(LogStatus.PASS, "Deposit is not populated for IP guest - passed");
				}
				else
				{
					Reports.log(LogStatus.WARNING, "Deposit is  populated for IP guest - failed");
				}
				Reports.endTest();
			}
			catch(Exception e)
			{
				Reports.log(LogStatus.FAIL,"Test case :TCBI0082 is failed");
			}
*/
			try
			{
				Reports.startTest("TCBI0049");
				newBill=homePage.navigateNewBill();
				newBill.verifyInsuranceExpired(excelDict.get("insurance_expired_guest"));

				Reports.endTest();
			}
			catch(Exception e)
			{
				Reports.log(LogStatus.FAIL,"Test case :TCBI0049 is failed");
			}


/*
			try
			{
				Reports.startTest("TCBI0050");
				newBill=homePage.navigateNewBill();
				boolean bFlag=newBill.inVaildItemAutoPopulate("IP",excelDict.get("package_test"));
				if (bFlag)
				{
					Reports.log(LogStatus.PASS, "Package is not populated for IP guest - passed");
				}
				else
				{
					Reports.log(LogStatus.WARNING, "Package is  populated for IP guest - failed");
				}
				Reports.endTest();
			}
			catch(Exception e)
			{
				Reports.log(LogStatus.FAIL,"Test case :TCBI0050 is failed");
			}
*/
			try
			{
				Reports.startTest("TCBI0051");
				newBill=homePage.navigateNewBill();
				newBill.inVaildItemAutoPopulate(excelDict.get("guest_test"),excelDict.get("Invalid_data"));
				Reports.endTest();
			}
			catch(Exception e)
			{
				Reports.log(LogStatus.FAIL,"Test case :TCBI0051 is failed");
			}

			try
			{
				Reports.startTest("TCBI0052");
				newBill=homePage.navigateNewBill();
				newBill.vaildItemAutoPopulate(excelDict.get("guest_test"),excelDict.get("package_population"));
				Reports.endTest();
			}
			catch(Exception e)
			{
				Reports.log(LogStatus.FAIL,"Test case :TCBI0052 is failed");
			}

		/*	try
			{
				Reports.startTest("TCBI0065");
				newBill=homePage.navigateNewBill();
				boolean bFlag= newBill.inVaildItemAutoPopulate("IP",excelDict.get("deposit_item"));

				if (bFlag)
				{
					Reports.log(LogStatus.PASS, "Deposit is not populated for IP guest - passed");
				}
				else
				{
					Reports.log(LogStatus.WARNING, "Deposit is  populated for IP guest - failed");
				}
				Reports.endTest();
			}
			catch(Exception e)
			{
				Reports.log(LogStatus.FAIL,"Test case :TCBI0065 is failed");
			}
			
			*/
			try
			{
				Reports.startTest("TCBI0068");
				newBill=homePage.navigateNewBill();
				newBill.createAndPayBill("cash",excelDict.get("guest_test"),excelDict.get("deposit_item"));
				Reports.endTest();



			}
			catch(Exception e)
			{
				Reports.log(LogStatus.FAIL,"Test case :TCBI0068 is failed");
			}
			try
			{
				Reports.startTest("TCBI0069");
				newBill=homePage.navigateNewBill();
				newBill.createAndPayBill("card",excelDict.get("guest_test"),excelDict.get("deposit_item"));
				Reports.endTest();
			}
			catch(Exception e)
			{
				Reports.log(LogStatus.FAIL,"Test case :TCBI0069 is failed");
			}

		}}

	//@Test(enabled = true)
	public void newBillsCoPay() {


		Reports.startTest("Login and masqueradeAs");
		excelDict=Excel.readfromExcelinDict("Bills_New");
		Utility.waitForAjaxToFinish(7000);

		if(homePage.masqueradeAs(excelDict.get("center_manager")))
		{

			Reports.endTest();
			try
			{
				Reports.startTest("TCBI0070");
				newBill=homePage.navigateNewBill();
				newBill.validPreauthWithPaymentMode("Co-pay Card",excelDict.get("guest_test_insurance"),excelDict.get("pre_auth_valid"),excelDict.get("guest_ins"),"Dietician Consultation - NP");
				// newBill.createAndPayBill("Co-pay Card",excelDict.get("guest_test"),excelDict.get("deposit_item"));
				Reports.endTest();
			}
			catch(Exception e)
			{
				Reports.log(LogStatus.FAIL,"Test case :TCBI0070 is failed");
			}
			try
			{
				Reports.startTest("TCBI0071");
				newBill=homePage.navigateNewBill();
				newBill.validPreauthWithPaymentMode("Co-pay Cash",excelDict.get("guest_test_insurance"),excelDict.get("pre_auth_valid"),excelDict.get("guest_ins"),"Dietician Consultation - NP");
				Reports.endTest();
			}
			catch(Exception e)
			{
				Reports.log(LogStatus.FAIL,"Test case :TCBI0071 is failed");
			}

			try
			{

				Reports.startTest("TCBI0083");
				newBill=homePage.navigateNewBill();
				newBill.validPreauthWithPaymentMode("Copay Deposit",excelDict.get("guest_test_insurance"),excelDict.get("pre_auth_valid"),excelDict.get("guest_ins"),"Dietician Consultation - NP");
				Reports.endTest();
			}
			catch(Exception e)
			{
				Reports.log(LogStatus.FAIL,"Test case :TCBI0083 is failed");
			}

			try
			{

				Reports.startTest("TCBI119");
				newBill=homePage.navigateNewBill();
				newBill.createAndPayBill("Copay Deposit",excelDict.get("guest_test_insurance"),excelDict.get("billing_item"));
				Reports.endTest();
			}
			catch(Exception e)
			{
				Reports.log(LogStatus.FAIL,"Test case :TCBI119 is failed");
			}

		}

		else
		{
			Reports.log(LogStatus.FAIL, "Masquerade functionality failed");
		}  

	}
}
