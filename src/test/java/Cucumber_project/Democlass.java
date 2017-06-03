package Cucumber_project;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Democlass {
WebDriver driver;

ExtentReports extent;
ExtentTest test;

@BeforeTest
public void startReports()
{
	extent =new ExtentReports(System.getProperty("user.dir")+"/test-Output/MyOwnReport.html",true);
	
	extent.addSystemInfo("Hostname","veera" )
	.addSystemInfo("Enviroment", "QA")
	.addSystemInfo("User name", "veera prathap");
	extent.loadConfig(new File(System.getProperty("user.dir")+"/extent-config.xml"));
	
}


	
	@Given("open firefox and enter the url")
		public void launchapp()
	{
		
		driver=new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		
	}
	
	//@When("^The user enter ([a-zA-Z]{1,}) credentials$")
	
	@When("^The user enter ([a-zA-Z]{1,}) credentials$")
	
	public void EnterCredentials(String typeofcred)
	{
		
		System.out.println(typeofcred);
		driver.findElement(By.id("email")).sendKeys("9491076744");
		driver.findElement(By.id("pass")).sendKeys("*#*#*#");
		driver.findElement(By.id("loginbutton")).click();		
		
	}
	
	@Then("verify and take screen shot of the application")
	
	public void takeScreenshot()
	{
		
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try {
			 // now copy the  screenshot to desired location using copyFile //method
			FileUtils.copyFile(src, new File("C:\\Users\\DELL\\workspace\\Qtpselenium_cucumber\\Screenprints\\homepage.png"));
			}
			 
			catch (IOException e)
			 {
			  System.out.println(e.getMessage());
			 
			 }
		
		driver.quit();
	}
	@AfterTest
	public void endReport() {
		extent.flush();
		extent.close();
	}


	
	
	
	
	
}
