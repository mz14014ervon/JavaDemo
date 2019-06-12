package stepdefinitions;

import Base.BaseUtil;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.AccountPageObject;
import general.User;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountStepDefinitions extends BaseUtil {

    private AccountPageObject account = new AccountPageObject();

    private BaseUtil base;

    public AccountStepDefinitions(BaseUtil base) {
        this.base = base;
    }



    @Then("New account is created")
    public void newAccountIsCreated() {
        System.out.println("Account is created");
        System.out.println(account);
        assertThat(account.getIntroText()).contains("Hi, " + base.UserName + " " + base.UserSurname);
//        assertThat(account.getIntroText()).contains("Hi, ");
//        System.out.println();
    }


}