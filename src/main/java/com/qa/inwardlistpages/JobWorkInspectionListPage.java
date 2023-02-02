package com.qa.inwardlistpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;
import com.qa.utils.TestUtil;

public class JobWorkInspectionListPage extends TestBase {
	
	@FindBy(xpath= "(//span[normalize-space()='Inward List'])[1]")
	WebElement inwardlist_menu;
	
	@FindBy(xpath= "((//a[normalize-space()='Job Work Inspection List'])[1])")
	WebElement jobworkinspectionlist_menu;
	
	
	
	public JobWorkInspectionListPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Navigate_jobworkrough_menu() 
	{
		try {
			TestUtil.navigate_to_option1(inwardlist_menu,jobworkinspectionlist_menu);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	

}
