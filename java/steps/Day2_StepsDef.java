package steps;

import org.openqa.selenium.By;
import org.testng.Assert;

import hooks.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Day2_StepsDef extends BaseClass {
	
		//public WebDriver driver;Given Enter the username 'Demosalesmanager'
//	And Enter the password 'crmsfa'
//	When Click on Login button
//	Then Homepage should be displayed
//	When Click on 'CRM/SFA' link
//	Then 'My Home' page should be displayed
			
		@Given("Enter the username {string}")
		public void enterUserName(String uName)
		{
			 driver.findElement(By.id("username")).sendKeys(uName);
		}
		@Given("Enter the password {string}")
		public void enterPassword(String pwd)
		{
			driver.findElement(By.id("password")).sendKeys(pwd);
		}
		@Given("Click on Login button")
		public void clickLogin()
		{
			driver.findElement(By.className("decorativeSubmit")).click();
		}
		@Given("Homepage should be displayed")
		public void verify()
		{
			String text = driver.findElement(By.xpath("//div[@id='form']/h2")).getText();
			if(text.contains("Demo"))
			{
				System.out.println("success");
			}
			else
			{
				System.out.println("fail");
			}
			
		}



	}

