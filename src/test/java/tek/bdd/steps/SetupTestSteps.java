package tek.bdd.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import tek.bdd.utility.SeleniumUtility;

public class SetupTestSteps extends SeleniumUtility {
    // every feature file should have a test definition

    @Then("validate top left corner is TEKSCHOOL")
    public void ValidateTopLeftLogo() {
        String topLeftCornerText = getElementText(By.cssSelector("#root > div.main-container > div:nth-child(1) > div.top-nav > a"));
        Assert.assertEquals("TEKSCHOOL", topLeftCornerText); // Assertion comes from J-Unit
    }

@Then("validate sign in button is enabled")
    public void ValidateSignInButtonEnabled(){
       boolean SignInBtnEnabled = isElementEnabled(By.id("signinLink"));
       Assert.assertTrue(SignInBtnEnabled);
}
}
