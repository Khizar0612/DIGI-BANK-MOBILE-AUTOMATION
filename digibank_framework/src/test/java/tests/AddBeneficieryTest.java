package tests;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddBeneficieryTest extends BaseClass{

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
        
        //optional
        WebElement mobNum = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"text-input-outlined\" and @text=\"Enter your mobile number\"]"));
        mobNum.sendKeys("92123456789");
        Thread.sleep(1000);
             
//        WebElement scrollToAddBtn = driver.findElement(By.xpath("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Add"));
//        scrollToAddBtn.click();
        
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("//android.widget.TextView[@text=\"Add\"]")));
        
//        driver.findElement(By.id("//android.widget.TextView[@text=\"Add\"]")).click();
        
//        WebElement addBtn2 = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Add\"]"));
//        addBtn2.click();
//        Thread.sleep(1000);
        
//        WebElement successMessage = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"android:id/message\"]"));
//        String actualText = successMessage.getText();
//        String expectedText = "Beneficiary created successfully";
//        AssertJUnit.assertEquals(actualText, expectedText);
//        Thread.sleep(1000);
        
        WebElement scrollViewForBtn = driver.findElement(By.xpath("//android.widget.ScrollView/android.view.ViewGroup"));
        
        WebElement addBtn2 = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Add\"]"));

        if (addBtn2.isDisplayed()) {
            // Perform actions
        	addBtn2.click();
            String elementText = addBtn2.getText();
            System.out.println("Text of the element: " + elementText);
        } else {
            System.out.println("Target element is not visible");
        }
        		
	}
	
}
