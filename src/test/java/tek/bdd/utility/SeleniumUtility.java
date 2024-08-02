package tek.bdd.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tek.bdd.base.BaseSetup;

import java.time.Duration;

public class SeleniumUtility extends BaseSetup {

    private WebDriverWait getWait(){
        return new WebDriverWait(getWebDriver(),Duration.ofSeconds(10));
        // Private method was created to be called by other method for clean coding.
    }

    public void ClickOnElement(By locator){
        getWait().until(ExpectedConditions.elementToBeClickable(locator)).click();

    }

    public void SendText(By locator, String value){
        getWait().until(ExpectedConditions.visibilityOfElementLocated(locator)).sendKeys("value");

    }
}
