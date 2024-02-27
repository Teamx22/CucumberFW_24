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

    @And("student enter their invalid password")
    public void studentEnterTheirInvalidPassword() {
        
    }

    @And("student enter their invalid email address")
    public void studentEnterTheirInvalidEmailAddress() {
        
    }

    @Then("student should get an error message for entering invalid credentials")
    public void studentShouldGetAnErrorMessageForEnteringInvalidCredentials() throws InterruptedException {
        String expText ="Invalid email address";
        System.out.println ("My Exp is :====>" + expText);
        Thread.sleep(1000);   // Selenium move to fast
        String actText = driver.findElement(By.xpath("//*[@id='error-msg']")).getText();
        System.out.println ("My Developer had is :====>" + actText);
        Assert.assertEquals(expText,actText);

    }

    @Then("student should get an error message for entering invalid password")
    public void studentShouldGetAnErrorMessageForEnteringInvalidPassword() {
        String expText ="Incorrect email or password";
        String actText = driver.findElement(By.xpath("//*[@id='error-msg']")).getText();
        Assert.assertEquals(expText,actText);
    }
}
