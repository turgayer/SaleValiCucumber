package com.bcsit.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    @Given("User is on the login page")
    public void userIsOnTheLoginPage() {
        // write code: open the browser and navigate to web page
        System.out.println("open the browser and navigate to web page");
    }

    @When("User enters user credentials")
    public void userEntersUserCredentials() {
        // write code: enter username and password then click login button
        System.out.println("enter username and password then click login button");
    }

    @Then("User should be able to login")
    public void userShouldBeAbleToLogin() {
        // write code: verify that the url change to dashboard
        System.out.println("verify that the url change to dashboard");
    }
}