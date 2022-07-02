package steps;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import hooks.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Delete_Lead extends BaseClass{
	//public WebDriver driver;
	
	@Given("initialize and open chrome browser")
	public void browser()
	{
		 WebDriverManager.chromedriver().setup();
			
		 driver=new ChromeDriver();
	}
	@Given("enter the application Url{string}")
	public void appUrl(String url)
	{
		driver.get(url);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@Given("provide the username{string}")
	public void userNamedetails(String UName)
	{
		driver.findElement(By.id("username")).sendKeys(UName);
		
	}
	@Given("provide the password{string}")
	public void passWord(String password)
	{
		driver.findElement(By.id("password")).sendKeys(password);
			
	}
	@When("click the Login_button")
	public void clickLogin()
	{
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
	}
	@When("click the lead_button")
	public void lead_button()
	{
		driver.findElement(By.linkText("Leads")).click();
		
		
	}
	@When("click on find_Lead button")
	public void find_Lead()
	{
		
		 driver.findElement(By.linkText("Find Leads")).click();
	}
	@Given("search with the phoneNumber{string}")
	public void phone_Number(String phNumber) throws Exception	
	{
		driver.findElement(By.xpath("//span[@class='x-tab-strip-inner']/span[contains(text(),'Phone')]")).click();
		 driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phNumber);
		 driver.findElement(By.xpath("//td[@class='x-btn-center']/em/button[@class='x-btn-text' and text()='Find Leads']")).click();
		 //
		 Thread.sleep(2000);
	}
	
	@When("click on the delete button")
	public void delete_button() throws Exception
	{
		 WebElement ele = driver.findElement(By.xpath("//*[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		 String leadnum=ele.getText();
		 System.out.println(leadnum);
		 ele.click();
		 driver.findElement(By.className("subMenuButtonDangerous")).click();
		 driver.findElement(By.linkText("Find Leads")).click();
		 driver.findElement(By.name("id")).sendKeys(leadnum);
		 driver.findElement(By.xpath("//td[@class='x-btn-center']/em/button[@class='x-btn-text' and text()='Find Leads']")).click();
		 Thread.sleep(2000);
	}
	@Given("verify the record is not present{string}")
	public void verify_record(String data)
	{
		 WebElement ele2 = driver.findElement(By.xpath("//*[@class='x-paging-info' and text()='No records to display']"));
		 String act_data=ele2.getText();
		 System.out.println(act_data);
		 SoftAssert softAssertion= new SoftAssert();
		 System.out.println("softAssert Method Was Started");
		 softAssertion.assertEquals(data,act_data);
		 System.out.println("softAssert Method Was Executed");
		 softAssertion.assertAll();
	}

}