package tek.bdd.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tek.bdd.base.BaseSetup;

import java.time.Duration;

public class SeleniumUtility extends BaseSetup {

    private WebDriverWait getWait(){
        return new WebDriverWait(getWebDriver(),Duration.ofSeconds(20));
        // private method was created to be called by other method for clean coding.
    }

    public void ClickOnElement(By locator){
        getWait().until(ExpectedConditions.elementToBeClickable(locator)).click();

    }
    private WebElement waitForVisibility(By locator){
      return   getWait().until(ExpectedConditions.visibilityOfElementLocated(locator));
        // Private method was created to be called by other method for clean coding.
    }

    public void SendText(By locator, String value){
        waitForVisibility(locator).sendKeys(value);

    }

    public String getElementText(By locator){
       return waitForVisibility(locator).getText();

    }
}
