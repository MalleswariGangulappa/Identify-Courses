package pageobjects;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.ExcelUtility;

public class Language_Learning extends BasePage {

	public Language_Learning(WebDriver driver) {
		super(driver);
	}

	Actions action = new Actions(driver);
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	@FindBy(xpath = "//*[@aria-label='Show more Subject options']")
	WebElement search_link;
	@FindBy(xpath = "//*[contains(@data-testid,'topic:Language Learning')]")
	WebElement learning_chbox;
	@FindBy(xpath = "//*[@aria-label='Show more Language options']")
	WebElement lang_ShowMore;
	@FindBy(xpath = "//div[@data-testid='search-filter-group-Level']//label")
	List<WebElement> levels;
	@FindBy(xpath = "//div[@data-testid='search-filter-group-Language']//label")
	List<WebElement> languages;

	String path = System.getProperty("user.dir") + "//testData//data.xlsx";
	ExcelUtility excel = new ExcelUtility(path);
	int row = 1;

	public void ClickShowMore() {

		action = new Actions(driver);
		action.moveToElement(search_link).click().perform();
	}

	public void Clicklanguage() {
		wait.until(ExpectedConditions.visibilityOf(learning_chbox));
		action.moveToElement(learning_chbox).perform();
		learning_chbox.click();
	}

	public void getLevels() throws IOException {

		action.moveToElement(lang_ShowMore).click().perform();
		System.out.println("---------levels----------");
		for (int i = 0; i < levels.size(); i++) {
			excel.setCellData("Sheet1", row++, 0, levels.get(i).getText());

			System.out.println(levels.get(i).getText());
		}

	}

	public void getLanguages() throws IOException {

		System.out.println("---------languages----------");
		for (int i = 0; i <= 10; i++) {

			System.out.println(languages.get(i).getText());
			excel.setCellData("Sheet1", row++, 0, languages.get(i).getText());
		}
	}

}
