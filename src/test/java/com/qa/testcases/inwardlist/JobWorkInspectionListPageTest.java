package com.qa.testcases.inwardlist;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.inwardlistpages.JobWorkInspectionListPage;
import com.qa.utils.TestUtil;

public class JobWorkInspectionListPageTest extends TestBase {
	JobWorkInspectionListPage Jobworkinspectionlistpage;
	
	
	
	
	public JobWorkInspectionListPageTest()	
	{
		super();
	}
	
	@BeforeClass
	public void setup()
	{
		initialization();
		Jobworkinspectionlistpage = new JobWorkInspectionListPage();
		TestUtil.ValidateUserLogin();
	}
	
	@Test(priority=1)
	public void Verify_Navigation()
	{	
		
		Jobworkinspectionlistpage.Navigate_jobworkrough_menu();
	}

}
