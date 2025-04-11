package demoqa.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTablePage {

    public WebTablePage(WebDriver driver) {
        PageFactory.initElements(driver, WebTablePage.class);
    }

    @FindBy(xpath = "//input[@placeholder=\"Type to search\"]")
    public WebElement search;

    @FindBy(xpath = "//button[@id= \"addNewRecordButton\"]")
    public WebElement addNewRecBtn;


}
