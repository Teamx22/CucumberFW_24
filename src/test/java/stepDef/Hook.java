package stepDef;

import base.config;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hook extends config{
    public static String baseURL;

    public static String envType =System.getProperty("env");
    public static String browserType=System.getProperty("browser");

    @Before
    public void beforeEachTest(){
        driver=setupBrowser(browserType);

        switch(envType){
            case"qa":
                baseURL=https;//qa.taltektc.com;
                break;
            case"stage":
                baseURL =https;//stage.taltektc.com;
                break;
            case "prod":
                baseURL=https;//prod.taltektc.com;

        }
        driver.get(baseURL);


        //start db connection
        //setup url=?
        // QA=QA.talentek.com
        //stage=stage..talentek.com
        //prod=prod.talentek.com


    }

    @After
    public void AfterEachTest(){
        //close browser
        //quit browser
        //take screenshot if test steps or case fail
        //close db connection
    }
}
