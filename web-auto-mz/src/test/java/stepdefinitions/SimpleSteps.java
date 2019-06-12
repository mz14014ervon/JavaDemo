package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SimpleSteps {

    @When("I navigate homepage")
    public void iNavigateHomepage() {
        System.out.println("Navigate to homepage");
    }

    @Then("homepage is opened")
    public void homepageIsOpened() {

        System.out.println("Verif that homepage is open");
    }

    @And("close browser")
    public void closeBrowser() {

    }

    @Given("environment is ready")
    public void environmentIsReady() {
    }
}
