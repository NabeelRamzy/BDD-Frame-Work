package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(  tags = "@home",
		           features = {"src/test/java/feature/" },
                   glue = {"base","stepdef"},
                   monochrome = false ,
                   dryRun = false ,
                   plugin = { "pretty", "html:target/report.html", "json:target/report_json.json"})
public class Testrunner {

}
