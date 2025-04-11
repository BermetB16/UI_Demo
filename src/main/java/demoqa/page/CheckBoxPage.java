package demoqa.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckBoxPage extends BasePage {

    @FindBy(xpath = "//button[@class= \"rct-collapse rct-collapse-btn\"]")
    public WebElement toggleBtn;

    

}
