package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class RegisterPageObject {

    private SelenideElement firstNameField = $(By.xpath("//input[@name = 'firstname']"));
    private SelenideElement lastNameField = $(By.xpath("//input[@name = 'lastname']"));
    private SelenideElement mobileNumberField = $(By.xpath("//input[@name = 'phone']"));
    private SelenideElement emailField = $(By.xpath("//input[@name = 'email']"));
    private SelenideElement passwordField = $(By.xpath("//input[@name = 'password']"));
    private SelenideElement confirmPasswordField = $(By.xpath("//input[@name = 'confirmpassword']"));
    private SelenideElement signUpButton = $(By.xpath("//button[@class = 'signupbtn btn_full btn btn-action btn-block btn-lg']"));

    public void enterFirstName(String firstName)    {
        firstNameField.sendKeys(firstName);
    }

    public void enterLastName(String lastName)  {
        lastNameField.sendKeys(lastName);
    }

    public void enterMobileNumber(String mobileNumber)  {
        mobileNumberField.sendKeys(mobileNumber);
    }

    public void enterEmail(String email)  {
        emailField.sendKeys(email);
    }

    public void enterPassword(String password)  {
        passwordField.sendKeys(password);
    }

    public void enterConfirmationPassword(String password)  {
        confirmPasswordField.sendKeys(password);
    }

    public void clickOnSignUpButton()  {
        signUpButton.click();
    }
}
