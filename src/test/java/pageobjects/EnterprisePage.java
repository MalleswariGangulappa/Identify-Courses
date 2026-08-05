package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class EnterprisePage extends BasePage{
	
	WebDriver driver;
	public  EnterprisePage(WebDriver driver)
	{
		super(driver);
		 this.driver=driver;
	}
	
	@FindBy(xpath="//a[text()='For Enterprise']")
	WebElement forEnterprise_link;
	@FindBy(id= "FirstName")
	WebElement firstname;
	@FindBy(id="LastName")
	WebElement lastname;
	@FindBy(id="Email")
	WebElement email;
	@FindBy(xpath="//input[@id='Phone']")
	WebElement phone;
	@FindBy(xpath="//*[@name='rentalField9']")
	WebElement orgn;
	@FindBy(id="Institution_Type__c")
	WebElement inst_Type;
	@FindBy(id="Company")
	WebElement cmp_name;
	@FindBy(id="Employee_Range__c")
	WebElement size;
	@FindBy(id="What_the_lead_asked_for_on_the_website__c")	
	WebElement need;
	@FindBy(id="Country")
	WebElement country;
	@FindBy(id="C4C_Job_Title__c")
	WebElement jobTitle;
	@FindBy(id="State")
	WebElement state;
	@FindBy(xpath="//*[@type='submit']")
	WebElement submitbtn;
	@FindBy(id = "ValidMsgEmail")
	WebElement errorMsg;
	
	
	public void clickForEnterpriseLink()
	{
		forEnterprise_link.click(); 
	}
	
	public void setfName(String name)
	{
		 firstname.sendKeys(name);
	}
	
	public void setlName(String lname )
	{
		
		 lastname.sendKeys(lname);
	}
	public void setEmail(String Email)
	{
		email.sendKeys(Email);
	}
	public void setPhone(String phno)
	{
		phone.sendKeys(phno);
	}
	public void orgDropDown(String org)
	{
		Select select=new Select(orgn);
		select.selectByVisibleText(org);
		
	}
	public void setInsType(String itype)
	{
		Select select=new Select(inst_Type);
		select.selectByVisibleText(itype);
		
	}
	public void setCName(String company)
	{
		cmp_name.sendKeys(company);
	}
	public void setRange(String range)
	{
		Select select=new Select(size);
		select.selectByVisibleText(range);
	}
	public void setNeedMsg(String msg)
	{
		Select select=new Select(need);
		select.selectByVisibleText(msg);
	}
	public void setCountry(String cntry)
	{
		Select select=new Select(country);
	    select.selectByVisibleText(cntry);
	}
	public void setTitle(String title)
	{
		Select select=new Select(jobTitle);
		select.selectByVisibleText(title);
	}
	public void setState(String st)
	{
		Select select=new Select(state);
		select.selectByVisibleText(st);
	}
	public void sbmtButton()
	{
		submitbtn.click();
	}
	public void getMessage() {
		
		System.out.println("--------Error Message----------");
		System.out.println(errorMsg.getText());
	}

}
