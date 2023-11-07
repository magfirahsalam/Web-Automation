import org.junit.runner.RunWith

import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber




















@RunWith(Cucumber.class)
@CucumberOptions(
features = "Include/features/Categories.feature",
glue = "stepDefinition",
tags = "@Categories",
monochrome = true,
plugin = [
	"pretty",
	"html:GherkinReports/Categories_Gherkin/HTML",
	"json:GherkinReports/Categories_Gherkin/JSON/reports.json",
]
)


public class Categories_Runner {
}
