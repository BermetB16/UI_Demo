package demoqa.advancedLocators;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomeWork extends BaseThing {
    @BeforeClass
    public void beforeClass() {
        driver.get("https://www.expedia.co.uk");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @AfterClass
    public void afterClass() {
        driver.close();
        driver.quit();
    }

    @Test
    public void findByXpathTest() {
        // Locate the "Flights" tab and click it
        driver.findElement(By.xpath("//span[text()='Flights']")).click();

        // Locate the departure city input and enter a value
        driver.findElement(By.xpath("//input[@id='location-field-leg1-origin']")).sendKeys("London");

        // Locate the destination city input and enter a value
        driver.findElement(By.xpath("//input[@id='location-field-leg1-destination']")).sendKeys("New York");

        // Select travel dates (example: 15th Jan - 25th Jan)
        driver.findElement(By.xpath("//button[@id='d1-btn']")).click(); // Open date picker
        driver.findElement(By.xpath("//button[@data-day='15']")).click(); // Select departure date
        driver.findElement(By.xpath("//button[@data-day='25']")).click(); // Select return date
        driver.findElement(By.xpath("//button[@data-stid='apply-date-picker']")).click(); // Apply dates

        // Click the search button
        driver.findElement(By.xpath("//button[@data-testid='submit-button']")).click();

        // Wait to ensure the results load (can be replaced with explicit waits)
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Validate that the results page is displayed
        String expectedTitle = "Flights to New York";
        String actualTitle = driver.getTitle();
        assert actualTitle.contains(expectedTitle) : "Test failed! Title does not contain expected text.";
    }
}