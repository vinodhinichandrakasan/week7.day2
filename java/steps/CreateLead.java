package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import hooks.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLead extends BaseClass {
	
//		public WebDriver driver;
//		@Given("launch the chrome browser")
//		public void openBroswer()
//		{
//			WebDriverManager.chromedriver().setup();
//			driver=new ChromeDriver();
//			
//		}
//		
		@Given("launch the application Url{string}")
		public void applicationUrl(String url)
		{
			driver.get(url);
			
		    driver.manage().window().maximize();
		}
		@Given("enter the username{string}")
		public void userName(String uName)
		{
			 driver.findElement(By.id("username")).sendKeys(uName);
		}
		@Given("enter the password{string}")
		public void Password(String password)
		{
			driver.findElement(By.id("password")).sendKeys(password);
		}
		@When("click on Loginbutton")
		public void loginButton()
		{
			driver.findElement(By.className("decorativeSubmit")).click();
		}
		@When("click a lead button")
		public void clickLead()
		{
			driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
			
		}
				
		@Then("click a create lead button")
		public void leadButton()
		{
			driver.findElement(By.xpath("//a[text()='Leads']")).click();
			driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
		}
			
		@Given("enter companyName {string}")
		public void companyName(String companyName)//companyName|firstName|lastName|deptName|descr|phoneNumber|email_Id|
		{
			 driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys(companyName);
			
		}
		@Given("enter firstName {string}")
		public void firstName(String firstName)
		{
			 driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys(firstName);
			
		}
		@Given("enter LastName {string}")
		public void LastName(String lastName)
		{
			 driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys(lastName);
			
		}

		@Given("enter departmentName {string}")
		public void deptName(String deptName)
		{
			 driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys(deptName);
			 
		}
		@Given("enter the description{string}")
		public void descr(String descr)
		{
			driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys(descr);
			
		}
		@Given("enter PhoneNumber {string}")
		public void phoneNum(String phoneNumber)
		{
			driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phoneNumber);
			
			
		}
		@Given("enter primaryEmail {string}")
		public void email(String email_Id)
		{
			//driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("8610783341");
			 driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys(email_Id);
		}
		@When("select city from dropdown")
		public void selectCity()
		{
			WebElement ele1 = driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
			 Select city=new Select(ele1);
			 city.selectByVisibleText("New York");
		}
			
		@When("click create lead submit button")
		public void clickSubmit()
		{
			 driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
			 System.out.println(driver.getTitle());
		}



	}


