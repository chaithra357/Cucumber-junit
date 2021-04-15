package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)	
@CucumberOptions (features= {"src/test/resources/Login/Login.feature"},
glue={"StepDefinition"},
tags="@Login",
dryRun=false,
monochrome=true,
strict=true,
plugin = {"html:testoutput/chaithra.html","junit:testoutput/chaithra.xml","json:testoutput/chaithra.json"}
)
public class Test_Runner {


}
