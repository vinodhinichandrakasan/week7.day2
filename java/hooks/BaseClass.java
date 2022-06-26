package hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass extends AbstractTestNGCucumberTests {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void pre_condition()
	{
		 WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();	
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		
	}
	
	@AfterMethod
	public void post_condition()
	{
		driver.close();
	}

}
