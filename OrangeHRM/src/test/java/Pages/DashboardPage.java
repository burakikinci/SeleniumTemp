package Pages;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.naming.Name;

import static org.testng.AssertJUnit.assertEquals;

public class DashboardPage {
    WebDriver driver;
    util.ElementHelper elementHelper;
    WebDriverWait wait;
    public DashboardPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver,10);
        this.elementHelper = new util.ElementHelper(driver);}
    By MyInfoButton = By.cssSelector("#app > div.oxd-layout > div.oxd-layout-navigation > aside > nav > div.oxd-sidepanel-body > ul > li:nth-child(6) > a > span");
    By SaveButton = By.cssSelector("div[class='orangehrm-horizontal-padding orangehrm-vertical-padding'] button[type='submit']");
    By NameAndSurnameTitle = By.cssSelector(".oxd-userdropdown-name");

    public void clickToMyInfo() {
        driver.findElement(MyInfoButton).click();
    }

    public void changeNameAndSurname() {
        WebElement Username = driver.findElement(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > div > div.orangehrm-edit-employee-content > div.orangehrm-horizontal-padding.orangehrm-vertical-padding > form > div:nth-child(1) > div.oxd-grid-1.orangehrm-full-width-grid > div > div > div.--name-grouped-field > div:nth-child(1) > div:nth-child(2) > input"));
        Username.sendKeys(Keys.CONTROL+"a");
        Username.sendKeys(Keys.DELETE);
        Username.sendKeys("Burak");

        WebElement Surname = driver.findElement(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > div > div.orangehrm-edit-employee-content > div.orangehrm-horizontal-padding.orangehrm-vertical-padding > form > div:nth-child(1) > div.oxd-grid-1.orangehrm-full-width-grid > div > div > div.--name-grouped-field > div:nth-child(3) > div:nth-child(2) > input"));
        Surname.sendKeys(Keys.CONTROL+"a");
        Surname.sendKeys(Keys.DELETE);
        Surname.sendKeys("İkinci");
    }

    public void clickToSaveButton() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)");
        driver.findElement(SaveButton).click();
    }

    public void checkNewNameAndSurname() {
        driver.findElement(MyInfoButton).click();
        WebElement NewNameAndSurname = driver.findElement(NameAndSurnameTitle);
        String NewNameAndSurnameText = NewNameAndSurname.getText();
        assertEquals(NewNameAndSurnameText,"Burak İkinci");

    }
}
