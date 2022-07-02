package runner;




import hooks.BaseClass;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/feature",
				 glue = {"steps", "hooks"},
				 monochrome = true,
				 publish = true,
				// tags = "@Smoke" // to execute only Smoke cases
//				 tags = "@Smoke and @Sanity" // to execute all tests belonging to Smoke and Sanity
				 //tags = "@Smoke or @Sanity" // to execute all tests belonging to either Smoke and Sanity
//				 tags = "not @Smoke" // all test cases excluding Smoke
				 tags="@Smoke or @regression"//to execute all tests belonging to either Smoke and regression
				 )

public class Day2Runner  extends BaseClass{
	

}
