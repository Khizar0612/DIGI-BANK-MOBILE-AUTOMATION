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
        username.sendKeys("jk399999");

        WebElement password = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"text-input-outlined\" and @text=\"Enter your password\"]"));
        password.sendKeys("sassayyyyy");

        WebElement loginbtn = driver.findElement(By.xpath("(//android.widget.TextView[@text=\"Login\"])[2]"));
        loginbtn.click();
        Thread.sleep(1000);
        
        WebElement beneficiary = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Beneficiary\"]"));
        beneficiary.click();
        Thread.sleep(1000);
        
<<<<<<< HEAD

=======
//        WebElement deletePayee = driver.findElement(By.xpath("//android.widget.TextView[@text=\"abcbank\"]"));
//        deletePayee.click();
//        Thread.sleep(1000);
>>>>>>> 24110feab70cff400115049d8a5e3729d6788f99
        
        
        String beneficiaryNameToDelete = "Warisha"; 

     // Locate the delete icon/button next to the specific beneficiary

        WebElement deleteIcon = driver.findElement(By.xpath("(//android.widget.TextView[@text=\"\"])[3]"));
	     // Click the delete icon/button
	     deleteIcon.click();
	     Thread.sleep(1000); // Wait for the action to complete
	
	     // Verify that the beneficiary has been deleted by checking that the name is no longer displayed
	     boolean isBeneficiaryDeleted = driver.findElements(By.xpath("//android.widget.TextView[@text=\"" + beneficiaryNameToDelete + "\"]")).isEmpty();
	     Assert.assertTrue(isBeneficiaryDeleted, "The beneficiary has been deleted successfully.");

        
	}
        
}


