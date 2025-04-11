package demoqa.advancedLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class FindByAbsXpath {
    WebDriver driver = new ChromeDriver();

    @BeforeClass
    public void beforeClass(){
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test(description = "Text box form by Xpath")
    public void findByAbsolutXpathTest(){
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[5]//button")).sendKeys("John Doe");
        try{
            Thread.sleep(3000);
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }

    @AfterClass
    public void afterClass(){
        driver.close();
        driver.quit();
    }

}
