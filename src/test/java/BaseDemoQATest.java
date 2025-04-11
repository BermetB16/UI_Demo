import demoqa.driver.Driver;
import demoqa.helper.WebElementActions;
import demoqa.page.ButtonsPage;
import demoqa.page.DynamicPropertiesPage;
import demoqa.page.TextBoxPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;

public abstract class BaseDemoQATest {
    public WebDriver driver;
    TextBoxPage textBoxPage = new TextBoxPage();
    DynamicPropertiesPage dynamicPropertiesPage = new DynamicPropertiesPage();
    WebElementActions webElementActions = new WebElementActions();
    ButtonsPage buttonsPage = new ButtonsPage();
    @BeforeSuite
    public void beforeSuite(){
        driver = Driver.getDriver();
    }
}
