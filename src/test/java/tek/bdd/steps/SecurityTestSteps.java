package tek.bdd.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import tek.bdd.utility.SeleniumUtility;

public class SecurityTestSteps extends SeleniumUtility {

    @When("user click on sign in link")
    public void validate_user_is_in_sign_in_page() {
            ClickOnElement(By.id("signinLink"));
    }


    @Then("validate user is in sign in page")
    public void user_enter_and_and_click_on_login() {
          String PageTextTitle =  getElementText(By.className("login__subtitle"));
        Assert.assertEquals("Sign in",PageTextTitle);
    }



    @When("user enter \"mohammad2536@gmail.com\" and \"Password@123\" and click on login")
    public void user_should_be_able_to_see_account_link() {
        SendText(By.name("email"),"mohammad2536@gmail.com");
        SendText(By.name("password"),"Password@123");
        ClickOnElement(By.id("loginBtn"));

    }
    @Then("user should be able to see account link")
    public void User_Should_Be_Able_To_See_Account(){
       boolean isAccountDisplayed = isElementDisplayed(By.id("accountLink"));
       Assert.assertTrue(isAccountDisplayed);
    }
}
