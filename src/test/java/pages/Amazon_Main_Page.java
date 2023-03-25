package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
public class Amazon_Main_Page {

    public Amazon_Main_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "searchDropdownBox")
    public WebElement dropdown;
    @FindBy(id = "nav-search-submit-button")
    public WebElement searchButton;
    @FindBy(xpath = "//a[@id='nav-link-accountList']")
    public WebElement account;
    @FindBy(xpath = "(//span[@class='nav-action-inner'])[1]")
    public WebElement signin;
    @FindBy(xpath = "//span[contains(text(),'Music Library')]")
    public WebElement musiclibrary;
    @FindBy(xpath = "//i[@class='a-icon a-icon-previous-rounded']")
    public WebElement previous;

}
