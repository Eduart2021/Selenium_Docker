import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        // Path to your feature files
        features = {"src/test/resources/feature"},

        // Specify the step definition package name
        glue = {"stepDefinition", "WebDriver"},

        // Specify tags to be executed
        tags = {"@integration"},

        // readable console logs
        monochrome = true,

        // This create cucumber reports
        plugin = {"pretty", "html:Reports/Default/"},

        // This create auto method nam in camelCase
        snippets = SnippetType.CAMELCASE
)


public class TestRunner {
}