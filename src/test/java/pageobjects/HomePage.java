package pageobjects;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.ExcelUtility;

public class HomePage extends BasePage {

	public WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	public HomePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = "//input[@class='react-autosuggest__input']")
	WebElement search_input;

	@FindBy(xpath = "//div[contains(@data-testid,'language:English')]//input")
	WebElement engcheck_box;

	@FindBy(xpath = "//div[contains(@data-testid,'productDifficultyLevel:Beginner')]//input")
	WebElement beginner_checkbox;

	@FindBy(xpath = "//*[@class='cds-CommonCard-title css-6ecy9b']")
	List<WebElement> courses_list;

	@FindBy(xpath = "//*[@class='cds-CommonCard-metadata']/p")
	List<WebElement> durations_list;

	@FindBy(xpath = "//*[@aria-label='Rating']/span")
	List<WebElement> ratings_list;

	public void setCourseName(String coursename) {

		search_input.sendKeys(coursename + Keys.ENTER);
	}

	public void clickCheckBox() {

		engcheck_box.click();
		beginner_checkbox.click();
	}

	String path = System.getProperty("user.dir") + "//testData//data.xlsx";
	int row = 1;
	int col = 0;

	ExcelUtility excel = new ExcelUtility(path);

	public void getCourseDetails() throws IOException {
		for (int i = 0; i < 2; i++) {
			System.out.println("Course Name: " + courses_list.get(i).getText());
			System.out.println("Rating: " + ratings_list.get(i).getText());
			System.out.println("Duration: " + durations_list.get(i).getText());

			excel.setCellData("Sheet1", row++, 0, courses_list.get(i).getText());
			excel.setCellData("Sheet1", row++, 0, ratings_list.get(i).getText());
			excel.setCellData("Sheet1", row++, 0, durations_list.get(i).getText());

		}

	}

}
