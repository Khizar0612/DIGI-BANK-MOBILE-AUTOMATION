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
        username.sendKeys("AbdulHaseeb11");

        WebElement password = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"text-input-outlined\" and @text=\"Enter your password\"]"));
        password.sendKeys("1234@!a5678");

        WebElement loginbtn = driver.findElement(By.xpath("(//android.widget.TextView[@text=\"Login\"])[2]"));
        loginbtn.click();
        Thread.sleep(1000);
        
        WebElement beneficiary = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Beneficiary\"]"));
        beneficiary.click();
        Thread.sleep(1000);
        
        WebElement favPayee = driver.findElement(By.xpath("//android.widget.TextView[@text=\"abcbank\"]"));
        favPayee.click();
        Thread.sleep(1000);
        
        WebElement favoriteIcon = driver.findElement(By.xpath("//android.widget.TextView[@text=\"\"]"));
        favoriteIcon.click();
        Thread.sleep(1000);
        
//        WebElement favoriteIndicator = driver.findElement(By.xpath("com.example.yourapp:id/favorite_indicator"));
//        Assert.assertTrue(favoriteIndicator.isDisplayed(), "Payee should be marked as a favorite.");
//
//        favoriteIcon.click();
//
//        Assert.assertFalse(favoriteIndicator.isDisplayed(), "Payee should not be marked as a favorite.");
        
        
	}
	
}
