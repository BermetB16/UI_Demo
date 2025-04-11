package demoqa.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LinksPage extends BasePage{
    @FindBy(xpath = "//div//p//a[@id=\"simpleLink\"]")
    public WebElement home;

    @FindBy(xpath = "//div//p//a[@id=\"dynamicLink\"]")
    public WebElement homeFS0yX;

    @FindBy(xpath = "//div//p//a[@id=\"created\"]")
    public WebElement created;

    @FindBy(xpath = "//div//p//a[@id=\"no-content\"]")
    public WebElement noContent;

    @FindBy(xpath = "//div//p//a[@id=\"moved\"]")
    public WebElement moved;

    @FindBy(xpath = "//div//p//a[@id=\"bad-request\"]")
    public WebElement badRequest;

    @FindBy(xpath = "//div//p//a[@id=\"unauthorized\"]")
    public WebElement unauthorized;

    @FindBy(xpath = "//div//p//a[@id=\"forbidden\"]")
    public WebElement forbidden;

    @FindBy(xpath = "//div//p//a[@id=\"invalid-url\"]")
    public WebElement notFound;

}
