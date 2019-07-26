package batchRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="FeaFolder",glue="stepDef22july",tags= {"@Smoke"},
plugin={"pretty","json:target/cucumber.json","html:target/cucumber-htmlreport.html"})
public class TestRunner {

}
