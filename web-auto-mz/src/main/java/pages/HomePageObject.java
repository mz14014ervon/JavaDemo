package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HomePageObject {

    private SelenideElement myAccountButton = $("nav li[id='li_myaccount']");
    private SelenideElement signUpButton = $(By.xpath("//nav/descendant::a[contains(text(), ' Sign Up')]"));

    public void clickOnMyAccountButton() {
        myAccountButton.click();
    }
    public void clickOnSignUpButton()    {
        signUpButton.click();

    }
}
