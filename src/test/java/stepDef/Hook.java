package stepDef;

import base.config;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.testng.util.Strings;


public class Hook extends config {
    public static String url;

    public static String envType =System.getProperty("env");
    public static String browserType =System.getProperty("browser");

    @Before
    public void beforeEachTest(){
        driver =setupBrowser(browserType);

        if(Strings.isNullOrEmpty(envType)){
            envType ="qa";
        }
        if (Strings.isNullOrEmpty(browserType)){
            browserType ="ch";
        }
        if (envType == "qa") {
            url = "https://qa.taltektc.com";
        } else if (envType == "stage") {
            url = "https://qa.taltektc.com";


            url = "https://qa.taltektc.com";
        } else if (envType == "prod") {
            url = "https://qa.taltektc.com";
        }
        driver.get(url);

        //start db connection
        //setup url=?
        // QA=QA.taltektc.com
        //stage=stage..taltektc.com
        //prod=prod.taltektc.com
    }

    @After
    public void AfterEachTest(){
        //close browser
        //quit browser
        //take screenshot if test steps or case fail
        //close db connection
    }
}
