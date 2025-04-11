package demoqa.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RadioButtonPage extends BasePage {

    @FindBy(xpath = "//div[@class=\"mb-3\"]")
    public WebElement doYouLike;

    //@FindBy(xpath = "")
}
