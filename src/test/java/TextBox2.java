import demoqa.page.TextBoxPage;
import org.testng.annotations.Test;

public class TextBox2  extends BaseDemoQATest {

  TextBoxPage textBoxPage = new TextBoxPage();
    @Test
    void testTextBox2(){
        driver.get("https://demoqa.com/text-box");
        textBoxPage.fillUserName("Bermet")
                .fillUserEmail("bermet160606@gmail.com")
                .fillCurrentAddress("123 Main St")
                .fillPermanentAddress("234 Main St")
                .clickSubmit();
    }
}
