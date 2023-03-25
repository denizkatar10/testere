package stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.Amazon_Main_Page;
import pages.Baby_Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class First_Amazon_Step_Definitions {
    Amazon_Main_Page amazon_mainPage = new Amazon_Main_Page();
    Select select;
    Baby_Page baby_page = new Baby_Page();
    @Given("user navigetes to amazon page")
    public void user_navigetes_to_amazon_page() {
        Driver.getDriver().get(ConfigReader.getProperty("amazon_url"));
    }
    @Given("user clicks dropdown button")
    public void user_clicks_dropdown_button() {
        amazon_mainPage.dropdown.click();
        select = new Select(amazon_mainPage.dropdown);
        select.selectByVisibleText("Baby");
    }
    @Given("user clicks search button")
    public void user_clicks_search_button() {
        amazon_mainPage.searchButton.click();
    }
    @Given("verify category header")
    public void verify_category_header() {
        String successMessage = "The Baby Store";
        Assert.assertEquals(baby_page.babyHeader.getText(),successMessage);
    }
    @Then("user close the browser")
    public void user_close_the_browser() {

    }
    @Given("user hovers over Account button")
    public void user_hovers_over_account_button() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(amazon_mainPage.account).perform();
    }
    @Given("user clicks sign in")
    public void user_clicks_sign_in() {
        amazon_mainPage.signin.click();
    }
    @Given("user clicks music library")
    public void user_clicks_music_library() {
        amazon_mainPage.musiclibrary.click();
    }
    @Given("user clicks previous button")
    public void user_clicks_previous_button() {
        amazon_mainPage.previous.click();
        ReusableMethods.waitFor(3);
        amazon_mainPage.previous.click();
    }
}
