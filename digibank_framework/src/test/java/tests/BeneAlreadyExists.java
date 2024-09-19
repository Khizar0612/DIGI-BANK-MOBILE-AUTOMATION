package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class BeneAlreadyExists extends BaseClass{
	
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
        
        WebElement addNewBene= driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Add New Beneficiary\"]"));
        addNewBene.click();
        Thread.sleep(1000);
        
        WebElement digiBank= driver.findElement(By.xpath("//android.widget.TextView[@text=\"DIGI Bank\"]"));
        digiBank.click();
        Thread.sleep(1000);
        
        WebElement accNum_IBAN = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"text-input-outlined\"]"));
        accNum_IBAN.sendKeys("zanbeel-551a876");
        
        WebElement addBtn= driver.findElement(By.xpath("//android.widget.TextView[@text=\"Add\"]"));
        addBtn.click();
        Thread.sleep(1000);
        
        WebElement nickName = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"text-input-outlined\" and @text=\"Enter your name here\"]"));
        nickName.sendKeys("abcbank");
        Thread.sleep(1000);
        
        WebElement scrollViewForBtn = driver.findElement(By.xpath("//android.widget.ScrollView/android.view.ViewGroup"));
        
        WebElement addBtn2 = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Add\"]"));


        WebElement text = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"android:id/message\"]"));
        String actualText = text.getText();
        String expectedText = "This Account already exists";
        Assert.assertEquals(actualText, expectedText);
        Thread.sleep(1000);
        
        
	}
        
}
