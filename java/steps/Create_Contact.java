package steps;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import hooks.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Create_Contact extends BaseClass{
	
	public WebDriver driver;
	
	@Given("initialize chrome browser")
	public void load_chrome()
	{
		WebDriverManager.chromedriver().setup();
		
		 driver=new ChromeDriver();
		
	}
	@Given("enter the application_Url{string}")
	public void app_launch(String url)
	{
		driver.get(url);
	}
	
	
	@Given("provide the data for user_name{string}")
	public void user_name(String UserName)
	{
		 driver.manage().window().maximize();
		 driver.findElement(By.id("username")).sendKeys(UserName);
		 
		
	}
	@Given("provide the passworddata{string}")
	public void password_data(String password)
	{
		driver.findElement(By.id("password")).sendKeys(password);
	}
	@When("click the Login_button available") 
	public void Login_button()
	{
		 driver.findElement(By.className("decorativeSubmit")).click();
	}
	@When("click the CRM Link")
	public void cRM_link()
	{
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	@When("click the contact_button")
	public void contact_Button()
	{
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		
	}
	@Given("Enter FirstName Locator{string}")
	public void FirstName(String Name)
	{
		driver.findElement(By.id("firstNameField")).sendKeys(Name);
	}
	@Given("Enter LastName Field Using id Locator{string}")
	public void last_Name(String LastName)
	{
		 driver.findElement(By.id("lastNameField")).sendKeys(LastName);
	}
	@Given("Enter First local Field Using id Locator{string}")
	public void local_first(String LocalName)
	{
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys(LocalName);
		
	}
	@Given("Enter LastName Local Field Locator{string}")
	public void last_local(String LastLocalName)
	{
		 
		 driver.findElement(By.name("lastNameLocal")).sendKeys(LastLocalName);
	}
	@Given ("Enter Department Field{string}")
	public void dept_Name(String deptName)
	{
		 driver.findElement(By.id("createContactForm_departmentName")).sendKeys(deptName);
		 
	}
	@Given("Enter Description Field{string}")
	public void descr_Enter(String Descr)
	{
		 
		 driver.findElement(By.xpath("//*[@name='description']")).sendKeys(Descr);
	}
	@Given("Enter your email in the E-mail address{string}")
	public void email(String email)
	{
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys(email);
	}
			
	@Then("select the province")
	public void province()
	{
		WebElement ele1 = driver.findElement(By.name("generalStateProvinceGeoId"));
		 Select city=new Select(ele1);
		 city.selectByVisibleText("New York");
		 driver.findElement(By.className("smallSubmit")).click();
		 driver.findElement(By.linkText("Edit")).click();
		 driver.findElement(By.id("updateContactForm_description")).clear();
		 driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("New test notes are added");
	}
	@Then("click submit_button")
	public void submit_Button()
	{
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	}

}