package com.qa.inwardlistpages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.base.TestBase;
import com.qa.utils.TestUtil;

public class JobWorkRoughListPage extends TestBase{
	
	//Document Info section 
	
	@FindBy(xpath= "(//span[normalize-space()='Inward List'])[1]")
	WebElement inwardlist_menu;
	
	@FindBy(xpath= "(//a[normalize-space()='Job Work Rough List'])[1]")
	WebElement jobworkroughlist_menu;
	
	@FindBy(xpath= "(//span[@class='btn-text'])[1]")
	WebElement inward_button;
	
	@FindBy(xpath= "//div[contains(text(),'Job Work Rough')]")
	WebElement InwardType_text;
	
	@FindBy(xpath= "//input[@placeholder = 'Select date']")
	WebElement Inwarddate;
	
	@FindBy(xpath= "(//input[@placeholder='Select date'])[2]")
	WebElement DocumentDate;
	
	@FindBy(xpath= "(//input[@id='react-select-3-input'])[1]")
	WebElement DocumentType;
	
	@FindBy(xpath= "(//div[@id='react-select-3-option-0'])[1]")
	WebElement DocumentType_select;
	
	
	
	@FindBy(xpath= "(//input[@type='text'])[3]")
	WebElement DocumentNo;
	
	@FindBy(xpath= "(//div[contains(@class,'css-13z0ixq')])[2]")
	WebElement SenderName;
	
	@FindBy(xpath= "(//div[@id='react-select-4-option-0'])[1]")
	WebElement SenderName_select;
	
	@FindBy(xpath= "(//div[contains(@class,'css-13z0ixq')])[3]")
	WebElement ReceivedFrom;
	
	@FindBy(xpath= "(//div[@id='react-select-5-option-1'])[1]")
	WebElement ReceivedFrom_select;

	@FindBy(xpath= "(//div[@class=' css-13z0ixq'])[4]")
	WebElement TransactionType;
	
	@FindBy(xpath= "(//div[@id='react-select-6-option-1'])[1]")
	WebElement TransactionType_select;
	
	@FindBy(xpath= "(//input[@type='number'])[1]")
	WebElement TotalPieces;
	
	@FindBy(xpath= "(//input[@type='number'])[2]")
	WebElement TotalCarats;
	
	@FindBy(xpath= "(//input[@type='number'])[3]")
	WebElement InwardPieces;
	
	@FindBy(xpath= "(//input[@type='number'])[4]")
	WebElement InwardCarats;
	
	
	
	
	
	
	
	@FindBy(xpath= "(//input[@type='number'])[5]")
	WebElement TotalPackets;
	
	@FindBy(xpath= "(//input[@type='file'])[1]")
	WebElement DocumentFile;
	
	@FindBy(xpath= "(//div[contains(@class,'css-13z0ixq')])[5]")
	WebElement ExchangeType;
	
	@FindBy(xpath= "(//div[@id='react-select-7-option-1'])[1]")
	WebElement ExchangeType_select;
	
	
	@FindBy(xpath= "(//input[@type='number'])[6]")
	WebElement ExchangeRate_BOE;
	
	@FindBy(xpath= "(//input[@type='number'])[7]")
	WebElement ExchangeRate_RBI;
	
	@FindBy(xpath= "(//input[@accept='image/jpg, image/jpeg, image/png'])[1]")
	WebElement RoughImages;
	
	// Total Invoice value in $
	
	@FindBy(xpath= "(//input[@type='number'])[8]")
	WebElement GrossValue;
	@FindBy(xpath= "(//input[@type='number'])[9]")
	WebElement Expense;
	
	// Save buttons of page 
	
	@FindBy(xpath= "(//button[@type='submit'])[1]")
	WebElement save_button1;
	
	//Success message 
	@FindBy(xpath= "//span[normalize-space()='Inward Document updated successfully.']")
	WebElement success_msg;
	
	
	//KP Certificate Details section 
	
	@FindBy(xpath= "(//input[@type='text'])[8]")
	WebElement CertificateNo;
	
	@FindBy(xpath= "(//div[contains(@class,'css-13z0ixq')])[1]")
	WebElement Origin;
	
	@FindBy(xpath= "(//div[@id='react-select-8-option-4'])[1]")
	WebElement Origin_select;
	
	@FindBy(xpath= "(//input[@placeholder='Select date'])[3]")
	WebElement IssueDate;
	
	@FindBy(xpath= "(//input[@placeholder='Select date'])[4]")
	WebElement ExpiryDate;
	
	@FindBy(xpath= "(//input[@type='file'])[3]")
	WebElement Certificate;
	

	
	public JobWorkRoughListPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void Navigate_jobworkrough_menu() 
	{
		try {
			TestUtil.navigate_to_option1(inwardlist_menu,jobworkroughlist_menu);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void Open_inward_button()
	{
		inward_button.isDisplayed();
		inward_button.click();
		System.out.println("Inward module is open - user can enter data in it.");
	}
	
	public void fill_data_DocumentDetails() 
	{
		InwardType_text.isDisplayed();
		
	Inwarddate.getText();
		
	
   
		 DocumentDate.sendKeys(TestUtil.GetCurrentDate("dd-MM-yyyy"));
		 try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		 DocumentDate.sendKeys(Keys.RETURN);
		
		 try {
			TestUtil.navigate_to_option1(DocumentType,DocumentType_select);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 DocumentNo.sendKeys(prop.getProperty("Document_No"));
		 
		 try {
			TestUtil.navigate_to_option1(SenderName,SenderName_select);
			TestUtil.navigate_to_option1(ReceivedFrom,ReceivedFrom_select);
			TestUtil.navigate_to_option1(TransactionType,TransactionType_select);
		 } catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
		 
		TotalPieces.sendKeys(prop.getProperty("TotalPieces"));
			
		TotalCarats.sendKeys(prop.getProperty("TotalCarats"));
			
		InwardPieces.sendKeys(prop.getProperty("InwardPieces"));
			
		InwardCarats.sendKeys(prop.getProperty("TotalPieces"));
			
			
		TotalPackets.sendKeys(prop.getProperty("TotalPackets"));
		TestUtil.upload_file(DocumentFile,prop.getProperty("DocumentFile_path"));
		try {
			TestUtil.navigate_to_option1(ExchangeType,ExchangeType_select);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		ExchangeRate_BOE.sendKeys(prop.getProperty("ExchangeRate_BOE"));
		ExchangeRate_RBI.sendKeys(prop.getProperty("ExchangeRate_RBI"));
		TestUtil.upload_file(RoughImages,prop.getProperty("RoughImages_path"));
		
		
		GrossValue.sendKeys(prop.getProperty("GrossValue"));
		Expense.sendKeys(prop.getProperty("Expense"));
		
		
		
		save_button1.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void fill_data_KPCertificateDetails()
	{
		
		
		CertificateNo.sendKeys(prop.getProperty("CertificateNo"));
		
		
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		try {
			TestUtil.navigate_to_option1(Origin,Origin_select);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		IssueDate.sendKeys(TestUtil.GetCurrentDate("dd-MM-yyyy"));
		IssueDate.sendKeys(Keys.RETURN);
		
		ExpiryDate.sendKeys(TestUtil.GetCurrentDate("dd-MM-yyyy"));
		ExpiryDate.sendKeys(Keys.RETURN);
		
		TestUtil.upload_file(Certificate,prop.getProperty("Certificate_path"));
		
	}
	
	
	
	
}