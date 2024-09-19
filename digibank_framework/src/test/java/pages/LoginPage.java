package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.android.AndroidDriver;

public class LoginPage{

    // Locators
    private By loginButtonLocator = By.xpath("//android.widget.TextView[@text='Login']");
    private By usernameFieldLocator = By.xpath("//android.widget.EditText[@resource-id='text-input-outlined' and @text='Enter your username']");
    private By passwordFieldLocator = By.xpath("//android.widget.EditText[@resource-id='text-input-outlined' and @text='Enter your password']");
    private By submitLoginButtonLocator = By.xpath("(//android.widget.TextView[@text='Login'])[2]");
    
    // Driver
    private AndroidDriver driver;
    
    // Constructor
    public LoginPage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    // Page Actions
    public void clickLoginButton() {
        WebElement loginButton = driver.findElement(loginButtonLocator);
        loginButton.click();
    }
    
    public void enterUsername(String username) {
        WebElement usernameField = driver.findElement(usernameFieldLocator);
        usernameField.sendKeys(username);
    }
    
    public void enterPassword(String password) {
        WebElement passwordField = driver.findElement(passwordFieldLocator);
        passwordField.sendKeys(password);
    }
    
    public void clickSubmitLoginButton() {
        WebElement submitLoginButton = driver.findElement(submitLoginButtonLocator);
        submitLoginButton.click();
    }
    
    // Method to perform login operation
    public void performLogin(String username, String password) throws InterruptedException {
        // Optionally, you can add wait logic here if needed
        Thread.sleep(5000); // Consider using WebDriverWait instead of Thread.sleep
        System.out.println("App Started");
        
        clickLoginButton();
        
        Thread.sleep(5000); // Consider using WebDriverWait instead of Thread.sleep
        
        enterUsername(username);
        enterPassword(password);
        clickSubmitLoginButton();
    }
}
