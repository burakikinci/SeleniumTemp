package StepDefinitions;

import Pages.AmazonPages;
import Util.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.tr.Ama;
import org.openqa.selenium.WebDriver;

public class AmazonSteps {
    WebDriver driver = DriverFactory.getDriver();
    AmazonPages amazonPages = new AmazonPages(driver);
    @Given("User is on homepage")
    public void userIsOnHomepage() {
        AmazonPages.HomePage();
    }

    @When("Click accept cookies")
    public void clickAcceptCookies() {
        AmazonPages.acceptCookie();
    }

    @When("Click the search button")
    public void clickTheSearchButton() {
        AmazonPages.clickSearch();
    }

    @When("Write product name")
    public void writeProductName() {
        AmazonPages.writeProduct();
    }

    @When("Click search button")
    public void clickSearchButton() {
        AmazonPages.searchButton();
    }

    @When("Filter for Shipped by Amazon")
    public void filterForShippedByAmazon() {
        AmazonPages.filterAmazon();
    }

    @When("Filter for Apple")
    public void filterForApple() {
        AmazonPages.filterApple();
    }

    @When("Click the first product")
    public void clickTheFirstProduct() {
        AmazonPages.firstProduct();
    }

    @When("Add to Cart")
    public void addToCart() {
        AmazonPages.addCart();
    }

    @When("Check at cart page")
    public void checkAtCartPage() {
        AmazonPages.checkCart();
    }
}
