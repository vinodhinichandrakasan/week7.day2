package steps;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import hooks.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Edit_Lead extends BaseClass{
	public WebDriver driver;
	@Given("open chrome browser")
	public void browser() {
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
	}
	@Given("enter application Url{string}")
	public void urlLaunch(String url)
	{
		 driver.get(url);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
	}
	
	@Given("give the username{string}")
	public void userName(String name)
	{
		driver.findElement(By.id("username")).sendKeys(name);
		 
	}
	@Given("give the password{string}")
	public void pass(String password)
	{
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@When("click on the Loginbutton")
	public void login()
	{ 
	 driver.findElement(By.className("decorativeSubmit")).click();
	 driver.findElement(By.linkText("CRM/SFA")).click();
	
		
	}
	@When ("click the lead button")
	public void lead()
	{
		 driver.findElement(By.linkText("Leads")).click();
	}
	@Then("click on findLead button")
	public void findLead()
	{
		 driver.findElement(By.linkText("Find Leads")).click();
	}
	
	@Given ("search with the firstname{string}")
	public void searchLead(String fname) throws Exception
	{
		 driver.findElement(By.xpath("//form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys(fname);
		 driver.findElement(By.xpath("//td[@class='x-btn-center']/em/button[@class='x-btn-text' and text()='Find Leads']")).click(); 
		 //driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		 //driver.close();
		 Thread.sleep(4000);
		 WebElement ele = driver.findElement(By.xpath("//*[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		 ele.click();
		
	}
	
	@When("click on the edit button")
	public void editLeadValue()
	{
		driver.findElement(By.xpath("//*[@class='subMenuButton' and text()='Edit']")).click();
	}
	@Given("update the companyName{string}")
	public void updateCompany(String cName)
	{
		WebElement ele2=driver.findElement(By.id("updateLeadForm_companyName"));
		 ele2.clear();
		 //String newcomp="comp";
		 ele2.sendKeys(cName);
		 driver.findElement(By.xpath("//*[@class='smallSubmit']")).click();
	}
	
	}

