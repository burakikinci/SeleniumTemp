package stepDefinitions;

import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import util.DriverFactory;

public class LoginPageStepDefinitions {
    WebDriver driver = DriverFactory.getDriver();
    LoginPage loginPage = new LoginPage(driver);

    @Given("User at login page")
    public void userAtLoginPage() {
        loginPage.verifyUserAtLoginPage();
    }

    @When("Click login button")
    public void clickLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("Check Required message about Username and Password")
    public void checkRequiredMessageAboutUsernameAndPassword() {
        loginPage.checkRequiredMessage();
    }

    @When("Write Username and Password")
    public void writeUsernameAndPassword() {
        loginPage.writeUsernameAndPassword();
    }

    @Then("Check Invalid credentials message about login")
    public void checkInvalidCredentialsMessageAboutLogin() {
        loginPage.checkInvalidCredentialsMessage();
    }

    @When("Write Correct Username and Password")
    public void writeCorrectUsernameAndPassword() {
        loginPage.writeCorrectUsernameAndPassword();
    }

    @Then("Check Successful login")
    public void checkSuccessfulLogin() {
        loginPage.checkDashboard();
    }
}
