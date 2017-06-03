package Cucumber_project;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="features",plugin={"html:output"		
					,"json:target-cucumberpretty.txt",
							"usage:target/cucumber-usage-json","junit:target/cucumber-results.xml"}

		
		)
					
public class Runnerclass {
	
	

}
