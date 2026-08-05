package com.testcase;

import java.io.IOException;

import org.testng.annotations.Test;

import pageobjects.HomePage;
import pageobjects.Language_Learning;
import testBase.BaseTest;

public class TC_002_CourseDetails extends BaseTest {

	@Test(priority = 2)
	public void getLanguages() throws IOException {

		Language_Learning ll = new Language_Learning(driver);
		HomePage hp=new HomePage(driver);
		hp.setCourseName("Web Development");
		logger.info(" Extracting all the languages and different levels with its total count & displaying them");
		ll.ClickShowMore();
		ll.Clicklanguage();
		ll.getLevels();
		ll.getLanguages();
		

	}

}
