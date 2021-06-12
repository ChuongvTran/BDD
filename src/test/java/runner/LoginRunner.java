package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
//		features=".\\src\\test\\java\\features\\TF_Login.feature",
		features="classpath:feature", // for if you have more then one feature (will read all features)
		glue="steps",
		tags="@others1", // to run more then one scenarios "@scenario1,@scenario2" // use "@loginFeature" to run the whole feature // will run all tags even in different features
		monochrome=true,
		dryRun=false,
		plugin= {
			"pretty",
			"html:target/cucumber",
			"json:target/cucumber.json"
		}
		)

public class LoginRunner {

}
