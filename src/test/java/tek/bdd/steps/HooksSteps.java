package tek.bdd.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import tek.bdd.utility.SeleniumUtility;

public class HooksSteps extends SeleniumUtility {


    @Before // Must be called from Cucumber not J-unit
    public void beforeEachScenario(){
        setupBrowser();
    }


    @After // Must be called from Cucumber not J-unit
    public void afterEachScenario(){
        quitBrowser();
    }
}
