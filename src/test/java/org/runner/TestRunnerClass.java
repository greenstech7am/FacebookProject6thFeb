package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.utilities.JvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources", glue = "org.stepdefinition", dryRun=false, monochrome = true,
snippets=SnippetType.CAMELCASE,plugin= {"html:target\\Reports",
		"junit:target\\Reports\\fblogin.xml",
		"json:target\\Reports\\fbpage.json",
		"rerun:src\\test\\resources\\Rerun\\Failed.txt"})

public class TestRunnerClass {
	
	
	@AfterClass
	public static void reportPull() {
		JvmReport.generateJvmReport(System.getProperty("user.dir")+"\\target\\Reports\\fbpage.json");

	}
	

	

}
