package steps;


import org.openqa.selenium.By;
import org.testng.Assert;
import hooks.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

	public class CreateLead extends BaseClass{
		
		@Given("enter the username as {string}")
		public void enter_username(String name)
		{
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys(name);
		}
		@Given("enter the password as {string}")
		public void enter_password(String password) throws Exception
		{
			 driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
			 Thread.sleep(2000);
		}
		@When("click on Login button")
		public void Login_Button() throws Exception
		{
			driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
			 Thread.sleep(2000);
			
		}
		@Then("check the homepage is loaded")
		public void homePage_loaded()
		{
			driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		}

		@When("Click on {string} link")
		public void clickLink(String option) {
			driver.findElement(By.linkText(option)).click();
		}
		
		@Then("{string} page should be displayed")
		public void verifyMyHomePage(String pageName) {
//			if(driver.findElement(By.linkText(pageName)).isDisplayed())
//				System.out.println("page is displayed");
//			else
//				System.out.println("Page is not displayed");
			Assert.assertTrue(driver.findElement(By.linkText(pageName)).isDisplayed());
		}
	}


