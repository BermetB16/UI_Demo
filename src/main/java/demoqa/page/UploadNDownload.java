package demoqa.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UploadNDownload {

    @FindBy(xpath = "//input[@id=\"uploadFile\"]")
    public WebElement chooseFile;

    @FindBy(xpath = "//div//div//a[@id= \"downloadButton\"]")
    public WebElement downloadBtn;

}
