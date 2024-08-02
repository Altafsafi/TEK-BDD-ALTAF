package tek.bdd.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseSetup {

    private static WebDriver webDriver;

    public void setupBrowser(){

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://retail.tekschool-students.com/");
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    public void quitBrowser(){
        if(webDriver != null){
            webDriver.quit();
        }
    }

    public WebDriver getWebDriver(){
        return webDriver;
    }
}
