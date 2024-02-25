package stepDef;
import base.config;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.testng.util.Strings;


public class Hook extends config{
    public static String url;
    public static String envType = System.getProperty("env");
    public static String browserType =System.getProperty("browser");

    @Before
    public void beforeEachTest(){
        if (Strings.isNullOrEmpty(envType)){
            envType ="qa";
        }
        if (Strings.isNullOrEmpty(browserType)){
            browserType ="ch";
        }
        driver =setupBrowser(browserType);

                switch (envType) {
                    case "qa":
                        url = "https://qa.taltektc.com";
                        break;
                    case "stage":
                        url = "https://stage.taltektc.com";
                        break;

                    case "prod":
                        url = "https://prod.taltektc.com";
                }
                driver.get(url);
        }
        @After
    public void afterEachTest(){

        }
                    //close browser
                    //quit browser
                    //take screenshot if test steps or case fail
                    //close db connection

                }


