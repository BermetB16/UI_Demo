package demoqa.advancedLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class FindByXpath extends BaseThing {
    @BeforeClass
    public void beforeClass(){
        driver.get("https://www.expedia.co.uk");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @AfterClass
    public void afterClass(){
        driver.close();
        driver.quit();
    }

    @Test
    public void findByXpathTest(){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        ////span[text()='Stays']
        ////span[text()='Flights']
        ////span[text()='Cars']

        WebElement thingsToDoButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Things to do']")));
        thingsToDoButton.click();

        WebElement goingToField;
        goingToField = By.name("Going to").findElement(driver);
        goingToField.sendKeys("Mexico City", Keys.ENTER);

        WebElement searchBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("Search")));
        searchBtn.click();
    }
}
