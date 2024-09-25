package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FavoritePayee extends BaseClass{

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
        
         // Adjust as necessary
    	
        
        
     // Replace "Test" with the actual name of the beneficiary you want to favorite
        String beneficiaryNameToFavorite = "Test"; 

        // Locate the favorite icon next to the specific beneficiary
        WebElement favoriteIcon = driver.findElement(By.xpath("(//android.widget.TextView[@text=\"\"])[2]")); // Assuming this points to the heart icon

        // Click the favorite icon
        favoriteIcon.click();
        Thread.sleep(1000); // Wait for the action to complete

        // Now, verify that the beneficiary is marked as favorite by checking the UI
        WebElement favoritedItem = driver.findElement(By.xpath("//android.widget.TextView[@text=\"" + beneficiaryNameToFavorite + "\"]"));

        // Assert that the beneficiary is displayed correctly
        Assert.assertTrue(favoritedItem.isDisplayed(), "The beneficiary is marked as favorite correctly.");
        


	}
	
}
