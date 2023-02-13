import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"com/test/steps"},
        features = "src/test/resources/features",
        tags = "@smoke",
        plugin = { "pretty", "html:target/cucumber-reports"},
        monochrome = true

)


public class TestSuiteRunner {}