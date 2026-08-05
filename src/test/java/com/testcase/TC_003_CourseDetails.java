package com.testcase;

import java.io.IOException;

import org.testng.annotations.Test;

import pageobjects.EnterprisePage;
import pageobjects.HomePage;
import pageobjects.Language_Learning;
import testBase.BaseTest;

public class TC_003_CourseDetails extends BaseTest {

	@Test(priority = 3)
	public void ClickForEnterprise() {
		EnterprisePage ep = new EnterprisePage(driver);
		logger.info("Launching  Enterprise page");
		ep.clickForEnterpriseLink();
		logger.info("Fill the form details");
		ep.setfName(p.getProperty("FirstName"));
		ep.setlName(p.getProperty("LastName"));
		ep.setEmail(p.getProperty("Email"));
		ep.setPhone(p.getProperty("Phone"));

		ep.orgDropDown(p.getProperty("OrgDrp"));
		ep.setInsType(p.getProperty("InsType"));
		ep.setTitle(p.getProperty("Title"));
		// ep.setCName(p.getProperty("Company"));

		// ep.setRange(p.getProperty("RangeDrp"));
		ep.setNeedMsg(p.getProperty("NeedDrp"));
		ep.setCountry(p.getProperty("CountryDrp"));

		ep.setState(p.getProperty("StateDrp"));
		ep.sbmtButton();
		logger.info("get Error Message");
		ep.getMessage();
		logger.info("*******Testing End*********");
		
	}
	
	


//
//   @Test(priority=1)
//	public void searchCourses() throws IOException {
//		logger.info("*********Testing Start*********");
//		HomePage hp = new HomePage(driver);
//		logger.info("Searching courses");
//		hp.setCourseName("Web Development");
//		logger.info("Applying Filters");
//		hp.clickCheckBox();
//		hp.getCourseDetails();
//		logger.info("Printing Course Details");
//		
//	}
//   
//   @Test(priority=2)
//	public void getLanguages() throws IOException
//	{
//
//	      Language_Learning ll=new Language_Learning(driver);
//	      logger.info(" Extracting all the languages and different levels with its total count & displaying them");
//	      ll.ClickShowMore();
//	      ll.Clicklanguage();
//	      ll.getLevels();
//	      ll.getLanguages();
//	      
//	}
}




//
//
//HomePage hp = new HomePage(driver);
//hp.setCourseName("Web Development");
//hp.clickCheckBox();
