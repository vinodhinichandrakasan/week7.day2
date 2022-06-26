package runner;

import hooks.BaseClass;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="C:\\TestLeaf\\Selenium\\src\\test\\java\\features",
       glue="stepDefinition",
       monochrome=true
       ,publish=true,
       tags="@Sanity or @Regression")
public class Day2_Learn extends BaseClass{

}
