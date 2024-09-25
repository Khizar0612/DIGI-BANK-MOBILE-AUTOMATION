package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class SearchPayee extends BaseClass {
	
	@Test
	public void test1() throws InterruptedException {
	    // Use WebDriverWait for more reliable element interactions
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
	    // Locate and click on the login button
	    WebElement login = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text=\"Login\"]")));
        login.click();
        
        // Locate username field and input username
        WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.EditText[@resource-id=\"text-input-outlined\" and @text=\"Enter your username\"]")));
        username.sendKeys("jk399999");

        // Locate password field and input password
        WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.EditText[@resource-id=\"text-input-outlined\" and @text=\"Enter your password\"]")));
        password.sendKeys("sassayyyyy");

        // Click on the login button
        WebElement loginbtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//android.widget.TextView[@text=\"Login\"])[2]")));
        loginbtn.click();
        
        // Locate and click on the Beneficiary option
        WebElement beneficiary = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text=\"Beneficiary\"]")));
        beneficiary.click();
        
        // Locate search field, input payee name "JV"
        WebElement searchPayeeName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.EditText[@text=\"Search My Payees\"]")));
        searchPayeeName.sendKeys("JV");

        // Click on search icon
        WebElement searchIcon = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text=\"\"]")));
        searchIcon.click();
        
        // Verify that the search result contains the expected payee "JV"
        WebElement text = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text=\"JV\"]")));
        String actualText = text.getText();
        String expectedText = "JV";
        Assert.assertEquals(actualText, expectedText, "Payee found successfully.");
        
        
	}
}
