package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.testng.AssertJUnit.assertEquals;

public class LoginPage {
    WebDriver driver;
    util.ElementHelper elementHelper;
    WebDriverWait wait;
    public LoginPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver,10);
        this.elementHelper = new util.ElementHelper(driver);}
    By LoginTitle = By.cssSelector(".oxd-text.oxd-text--h5.orangehrm-login-title");
    By LoginButton = By.cssSelector("button[type='submit']");
    By requiredMessageforUsername = By.cssSelector("body > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > form:nth-child(2) > div:nth-child(2) > div:nth-child(1) > span:nth-child(3)");
    By requiredMessagePassword = By.cssSelector("body > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > form:nth-child(2) > div:nth-child(3) > div:nth-child(1) > span:nth-child(3)");
    By usernameField = By.cssSelector("input[placeholder='Username']");
    By passwordField = By.cssSelector("input[placeholder='Password']");
    By InvalidCredentialsMessage = By.cssSelector(".oxd-text.oxd-text--p.oxd-alert-content-text");
    By Dashboard = By.cssSelector(".oxd-text.oxd-text--h6.oxd-topbar-header-breadcrumb-module");


    public void verifyUserAtLoginPage() {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        WebElement title = driver.findElement(LoginTitle);
        String titleText = title.getText();
        assertEquals(titleText,"Login");
    }

    public void clickLoginButton() {
        driver.findElement(LoginButton).click();
    }

    public void checkRequiredMessage() {
        elementHelper.checkVisible(requiredMessageforUsername);
        elementHelper.checkVisible(requiredMessagePassword);
    }

    public void writeUsernameAndPassword() {
        driver.findElement(usernameField).click();
        elementHelper.sendKey(usernameField,"abcdefg");
        driver.findElement(passwordField).click();
        elementHelper.sendKey(passwordField,"123456");
    }

    public void checkInvalidCredentialsMessage() {
        WebElement errorMessage = driver.findElement(InvalidCredentialsMessage);
        String errorMessageText = errorMessage.getText();
        assertEquals(errorMessageText,"Invalid credentials");
    }

    public void writeCorrectUsernameAndPassword() {
        driver.findElement(usernameField).click();
        elementHelper.sendKey(usernameField,"Admin");
        driver.findElement(passwordField).click();
        elementHelper.sendKey(passwordField,"admin123");
    }

    public void checkDashboard() {
        WebElement DashboardElement = driver.findElement(Dashboard);
        String DashboardElementText = DashboardElement.getText();
        assertEquals(DashboardElementText,"Dashboard");

    }
}
