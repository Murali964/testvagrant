import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"com/test/steps"},
        features = "src/test/resources/features",
        tags = "@smoke"
//        format = {"pretty"}

)


public class TestSuiteRunner {}