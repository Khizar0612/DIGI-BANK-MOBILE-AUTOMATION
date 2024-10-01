package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration; // Use java.time.Duration for WebDriverWait

public class FavoritePayee extends BaseClass {

    @Test
    public void test1() throws InterruptedException {
        
        WebElement login = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Login\"]"));
        login.click();
        Thread.sleep(1000);

        WebElement username = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"text-input-outlined\" and @text=\"Enter your username\"]"));
        username.sendKeys("jk399999");

        WebElement password = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"text-input-outlined\" and @text=\"Enter your password\"]"));
        password.sendKeys("sassayyyyy");

        WebElement loginbtn = driver.findElement(By.xpath("(//android.widget.TextView[@text=\"Login\"])[2]"));
        loginbtn.click();
        Thread.sleep(1000);
        
        WebElement beneficiary = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Beneficiary\"]"));
        beneficiary.click();
        Thread.sleep(1000);

        // Replace "Test" with the actual name of the beneficiary you want to favorite
        String beneficiaryNameToFavorite = "Test";

        // Locate the favorite icon next to the specific beneficiary
        WebElement favoriteIcon = driver.findElement(By.xpath("(//android.widget.TextView[@text=''])[2]")); // Assuming this points to the heart icon

        // Click the favorite icon
        favoriteIcon.click();

        // Add explicit wait to ensure the UI has updated
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement favoritedItem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='" + beneficiaryNameToFavorite + "']")));

        // Now, verify that the beneficiary is marked as favorite by checking the UI
        Assert.assertTrue(favoritedItem.isDisplayed(), "The beneficiary was not marked as favorite correctly.");
    }
}
