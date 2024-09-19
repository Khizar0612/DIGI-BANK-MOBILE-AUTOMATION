package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeletePayee extends BaseClass{
	
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
        
        WebElement deletePayee = driver.findElement(By.xpath("//android.widget.TextView[@text=\"abcbank\"]"));
        deletePayee.click();
        Thread.sleep(1000);
        
        WebElement deleteIcon = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"\"]"));
        deleteIcon.click();
        Thread.sleep(1000);
        
        WebElement text = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"android:id/message\"]"));
        String actualText = text.getText();
        String expectedText = "Beneficiary deleted successfully";
        Assert.assertEquals(actualText, expectedText);
        Thread.sleep(1000);
        
	}
        
}


