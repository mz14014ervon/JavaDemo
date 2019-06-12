package pages;

import com.codeborne.selenide.SelenideElement;
import general.User;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AccountPageObject {

    private SelenideElement introductionText = $(By.xpath("//h3[@style='margin-left: 17px']"));
    private String strExpGreeting;

//    private String greetingExpected = "Hi, " + user.getFirstName() + " " + user.getLastName() ;

    public String getIntroText() {
        return introductionText.getText();
    }

//    public String expectedGreeting(){
//        return  strExpGreeting = "Hi, " + User.getFirstName() + " " + User.getLastName();
//    }

//    public boolean assertGreeting() {
//        private String greetingExpected = "Hi, " + user.getFirstName() + " " + user.getLastName() ;
//        greetingExpected.isEualTo(introductionText);
//    }


}
