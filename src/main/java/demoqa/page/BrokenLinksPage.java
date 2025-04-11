package demoqa.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BrokenLinksPage extends BasePage {

    @FindBy(xpath = "//a[@href=\"http://demoqa.com\"]")
    public WebElement validLink;

    @FindBy(xpath = "//a[@href=\"http://the-internet.herokuapp.com/status_codes/500\"]")
    public WebElement brokenLink;



}
