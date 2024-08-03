package tek.bdd.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import tek.bdd.utility.SeleniumUtility;

public class SetupTestSteps extends SeleniumUtility {
    // every feature file should have a test definition

    @Given("open browser and navigate to retail app")
    public void OpenBrowserAndNavigate() {
        setupBrowser(); // Calling the browser method from BaseSetup USING OOP Inheritance
    }

    @Then("validate top left corner is Tekschool")
    public void ValidateTopLeftLogo() {
        String text = getElementText(By.className("top-nav__logo active"));
        System.out.println(text);
    }

    @Then("close the browser")
    public void CloseBrowser() {
        quitBrowser();
    }
}
