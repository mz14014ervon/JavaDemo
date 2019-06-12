package stepdefinitions;

import Base.BaseUtil;
import cucumber.api.java.en.And;
import general.User;
import pages.RegisterPageObject;

public class RegisterStepDefinitions extends BaseUtil {

    private RegisterPageObject register = new RegisterPageObject();
    private User user = new User();

    private BaseUtil base;

    public RegisterStepDefinitions(BaseUtil base) {
        this.base = base;
    }


    @And("I enter First Name")
    public void iEnterFirstName() {
        base.UserName = user.getFirstName();
        register.enterFirstName(user.getFirstName());
    }

    @And("I enter Last Name")
    public void iEnterLastName() {
        base.UserSurname = user.getLastName();
        register.enterLastName(user.getLastName());
    }

    @And("I enter Mobile Number")
    public void iEnterMobileNumber() {
        base.UserNr = user.getMobileNumber();
        register.enterMobileNumber(user.getMobileNumber());
    }

    @And("I enter Email")
    public void iEnterEmail() {
        base.UserEmail = user.getEmail();
        register.enterEmail(user.getEmail());
    }

    @And("I enter Password")
    public void iEnterPassword() {
        base.UserPass = user.getPassword();
        register.enterPassword(user.getPassword());
    }

    @And("I enter PasswordND")
    public void iEnterPasswordAgain() {
        register.enterConfirmationPassword(user.getPassword());
    }

    @And("I click on Sign Up button")
    public void iClickOnSignUpButton() {
        System.out.println(user);
        register.clickOnSignUpButton();
    }
}
