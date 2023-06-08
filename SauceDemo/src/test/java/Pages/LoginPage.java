package Pages;
import Util.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    WebDriver driver;
    Util.ElementHelper elementHelper;
    WebDriverWait wait;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver,10);
        this.elementHelper = new ElementHelper(driver);}

    By loginButton = By.cssSelector("#login-button");
    By errorMessage = By.cssSelector("h3[data-test='error']");

    By usernamebox = By.cssSelector("#user-name");
    By passwordbox = By.cssSelector("#password");
    By productText = By.cssSelector(".title");



    public void userAtHomePage() {
        driver.get("https://www.saucedemo.com/");
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

    public void checkMessage(String username) {
        elementHelper.checkVisible(errorMessage);
    }

    public void writeUsernameForUsernameField(String username) {
        driver.findElement(usernamebox).click();
        elementHelper.sendKey(usernamebox,"abcdefg");
    }

    public void writePasswordForPasswordField(String password) {
        driver.findElement(passwordbox).click();
        elementHelper.sendKey(passwordbox,"123456");

    }

    public void correctUsernameForUsernameField(String correctUsername) {
        driver.findElement(usernamebox).click();
        elementHelper.sendKey(usernamebox,"standard_user");



    }

    public void falsePasswordForPasswordField(String falsePassword) {
        driver.findElement(passwordbox).click();
        elementHelper.sendKey(passwordbox,"abc1234");
    }

    public void dontMatchErrorMessage(String dontMatch) {
        elementHelper.checkVisible(errorMessage);
    }

    public void writeFalseUsername(String falseUsername) {
        driver.findElement(usernamebox).click();
        elementHelper.sendKey(usernamebox,"asdfg ");
    }

    public void writeCorrectPassword(String correctPassword) {
        driver.findElement(passwordbox).click();
        elementHelper.sendKey(passwordbox,"secret_sauce");
    }

    public void checkSuccessful() {
        elementHelper.checkVisible(productText);
    }
}
