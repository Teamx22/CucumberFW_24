package stepDef;

import base.config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class login_step extends config {
    @Given("student at TalentTEK Homepage")
    public void studentAtTalentTEKHomepage() {
        
    }

    @And("student enter their valid email address")
    public void studentEnterTheirValidEmailAddress() {
        driver.findElement(By.name("email")).sendKeys(STUDENT_EMAIL);
    }
    @And("student enter their valid password")
    public void studentEnterTheirValidPassword() {
        driver.findElement(By.name("password")).sendKeys(STUDENT_PASSWORD);
    }

    @When("student clicks on Login button")
    public void studentClicksOnLoginButton() {
        driver.findElement(By.xpath("//*[@id='login_form']/input")).click();
    }

    @Then("student should be successfully login")
    public void studentShouldBeSuccessfullyLogin() {
        String businessAct ="Student Information";
        String developerCodeExp = driver.findElement(By.xpath("//*[@id='wrap']//h2")).getText();
        Assert.assertEquals(businessAct,developerCodeExp);
    }
}
