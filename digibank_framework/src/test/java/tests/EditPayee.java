package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class EditPayee extends BaseClass{

	public void Test1() throws InterruptedException {
		
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
        
        WebElement editPayee = driver.findElement(By.xpath("//android.widget.TextView[@text=\"\"]"));
        editPayee.click();
        Thread.sleep(1000);
        
        WebElement editNickName = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"text-input-outlined\" and @text=\"abcbank\"]"));
        editNickName.sendKeys("abcbankkk");
        Thread.sleep(1000);
        
        WebElement editMobNum = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"text-input-outlined\" and @text=\"92123456789\"]"));
        editMobNum.sendKeys("92123336789");
        Thread.sleep(1000);
        
        WebElement saveBtn = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Save\"]"));
        saveBtn.click();
        Thread.sleep(1000);
		
        WebElement text = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"android:id/message\"]"));
        String actualText = text.getText();
        String expectedText = "Beneficiary updated successfully";
        Assert.assertEquals(actualText, expectedText);
        Thread.sleep(1000);
            
        
	}
	
}
