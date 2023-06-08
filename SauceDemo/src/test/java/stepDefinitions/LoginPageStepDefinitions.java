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

    @Given("User at home page")
    public void userAtHomePage() {
        loginPage.userAtHomePage();

    }

    @When("Click login button")
    public void clickLoginButton() {
        loginPage.clickLogin();
    }

    @Then("Check {string} message about username")
    public void checkMessageAboutUsername(String username) {
        loginPage.checkMessage(username);
    }


    @When("write {string} for username field")
    public void writeForUsernameField(String Username) {
        loginPage.writeUsernameForUsernameField(Username);
    }

    @Then("Check {string} message about password")
    public void checkMessageAboutPassword(String error) {
        loginPage.checkMessage(error);
    }

    @When("write {string} for password field")
    public void writeForPasswordField(String password) {
        loginPage.writePasswordForPasswordField(password);
    }

    @When("write Correct {string} for username field")
    public void writeCorrectForUsernameField(String correctUsername) {
        loginPage.correctUsernameForUsernameField(correctUsername);
    }

    @When("write False {string} for password field")
    public void writeFalseForPasswordField(String falsePassword) {
        loginPage.falsePasswordForPasswordField(falsePassword);
    }

    @Then("Check {string} message about don't match")
    public void checkMessageAboutDonTMatch(String dontMatch) {
        loginPage.dontMatchErrorMessage(dontMatch);
    }

    @When("write False {string} for username field")
    public void writeFalseForUsernameField(String falseUsername) {
        loginPage.writeFalseUsername(falseUsername);
    }

    @When("write Correct {string} for password field")
    public void writeCorrectForPasswordField(String correctPassword) {
        loginPage.writeCorrectPassword(correctPassword);
    }

    @Then("Check Successful login")
    public void checkSuccessfulLogin() {
        loginPage.checkSuccessful();
    }
}
