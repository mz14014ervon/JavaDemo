package stepdefinitions;

import Base.BaseUtil;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import pages.HomePageObject;

public class HomeStepDefinitions extends BaseUtil{

    private HomePageObject home = new HomePageObject();

    private BaseUtil base;

    public HomeStepDefinitions(BaseUtil base) {
        this.base = base;
    }


    @When("I click on my account button")
    public void iClickOnMyAccountButton() {
        home.clickOnMyAccountButton();
    }

    @And("I click on Sign Up button in Homepage")
    public void iClickOnSignUpButtonInHomepage() {
        home.clickOnSignUpButton();
    }
}
