import demoqa.page.BasePage;
import org.testng.annotations.Test;

public class DynamicPropertiesTest extends BaseDemoQATest{

    @Test
    public void dynamicPropertiesTest(){
        driver.get("https://demoqa.com/dynamic-properties");

       // dynamicPropertiesPage.clickEnableAfter();
        dynamicPropertiesPage.clickColorChange();
    }
}
