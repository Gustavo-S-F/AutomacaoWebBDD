package runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\user\\IdeaProjects\\AutomacaoTeste\\src\\test\\java\\teste\\testee.feature",
        tags="@Tag1",
        glue = {"steps"},monochrome = true,dryRun = false)

public class Runner {
}