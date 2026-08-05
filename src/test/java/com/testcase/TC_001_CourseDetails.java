package com.testcase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageobjects.HomePage;
import pageobjects.Language_Learning;
import testBase.BaseTest;

public class TC_001_CourseDetails extends BaseTest {

	@Test(priority = 1)
	public void searchCourses() throws IOException {
		logger.info("*********Testing Start*********");
		HomePage hp = new HomePage(driver);
		logger.info("Searching courses");
		hp.setCourseName("Web Development");
		logger.info("Applying Filters");
		hp.clickCheckBox();
		hp.getCourseDetails();
		logger.info("Printing Course Details");
		

	}

}
