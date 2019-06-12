package stepdefinitions;

import Base.BaseUtil;
import cucumber.api.java.After;
import cucumber.api.java.Before;
//import cucumber.api.java.BeforeStep;

import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.remote.BrowserType.CHROME;

public class Hooks extends BaseUtil {

    private BaseUtil base;

    public Hooks(BaseUtil base) {
        this.base = base;
    }


    @Before
    public void launchBrowser(){
        System.out.println("------launching browser------");
        System.setProperty("selenide.browser", CHROME);

        //Passing the dummy WebDriver instance
        base.StepInfo = "FirefoxDriver";
    }

    @Before
    public void openHomePage()  {
        System.out.println("------BEEF------");
        open("https://www.phptravels.net/");
        System.out.println("------After------");
    }

    @After
    public void closeBrowser(){
        System.out.println("------close browser------");
        close();
    }
}
