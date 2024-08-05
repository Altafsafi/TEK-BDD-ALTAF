package tek.bdd.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import tek.bdd.pages.HomePage;
import tek.bdd.pages.SignInPage;
import tek.bdd.utility.SeleniumUtility;

public class SecurityTestSteps extends SeleniumUtility {

    @When("user click on sign in link")
    public void validate_user_is_in_sign_in_page() {
            ClickOnElement(HomePage.SIGN_IN_LINK);
    }


    @Then("validate user is in sign in page")
    public void user_enter_and_and_click_on_login() {
          String PageTextTitle =  getElementText(SignInPage.SIGN_IN_PAGE_TEXT_TITLE);
        Assert.assertEquals("Sign in",PageTextTitle);
    }



    @When("user enter \"mohammad2536@gmail.com\" and \"Password@123\" and click on login")
    public void user_should_be_able_to_see_account_link() {
        SendText(SignInPage.EMAIL_INPUT,"mohammad2536@gmail.com");
        SendText(SignInPage.PASSWORD_INPUT,"Password@123");
        ClickOnElement(SignInPage.LOGIN_BUTTON);

    }




    @Then("user should be able to see account link")
    public void User_Should_Be_Able_To_See_Account(){
       boolean isAccountDisplayed = isElementDisplayed(HomePage.ACCOUNT_LINK);
       Assert.assertTrue(isAccountDisplayed);
    }
}
