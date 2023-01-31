package com.qa.testcases.inwardlist;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.inwardlistpages.JobWorkRoughListPage;
import com.qa.utils.TestUtil;

public class JobWorkRoughListPageTest extends TestBase {
	
	JobWorkRoughListPage jobworkroughlistpage;
	
	
	
	
	public JobWorkRoughListPageTest()	
	{
		super();
	}
	
	@BeforeClass
	public void setup()
	{
		initialization();
		jobworkroughlistpage = new JobWorkRoughListPage();
		TestUtil.ValidateUserLogin();
	}
	
//	@AfterClass
//	public void teardown()
//	{
//		driver.quit();
//	}
	
	@Test(priority=1)
	public void Verify_Navigation()
	{	
		
		jobworkroughlistpage.Navigate_jobworkrough_menu();
	}
	
	@Test(priority=2)
	public void Verify_inwardbutton_click()
	{
		jobworkroughlistpage.Open_inward_button();
	}
	
	@Test(priority=3)
	public void Verify_filldata_DocumentDeatils()
	{
		jobworkroughlistpage.fill_data_DocumentDetails();
		
		
	}
	
	@Test(priority=4)
	public void  Verify_fill_data_KPCertificateDetails()
	{
		jobworkroughlistpage.fill_data_KPCertificateDetails();
		
	}
	
	
}