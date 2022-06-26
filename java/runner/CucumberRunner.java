package runner;

import hooks.BaseClass;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="C:\\TestLeaf\\Selenium\\src\\test\\java\\feature",glue={"steps","hooks"},
						publish=true,
						tags="@smoke or @Regression",
						monochrome=true)
public class CucumberRunner extends BaseClass {

}
