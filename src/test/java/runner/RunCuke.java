package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features/dataTable.feature",
				 glue = {"steps"},
				 monochrome = true,
				 plugin = {"html:target/cucumber-reports/cucumber-html-report.html",
						   "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}//, tags = "@positive"
				)

public class RunCuke extends AbstractTestNGCucumberTests
{

}
