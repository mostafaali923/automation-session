package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class SecurePage {
    private WebDriver driver;
    private WebDriverWait wait;
    private By successMessage = By.id("flash");

    public SecurePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void assertOnTextBox() {
        String message = wait.until(ExpectedConditions.visibilityOfElementLocated(successMessage)).getText();
        Assert.assertTrue(message.contains("You logged into a secure area"));
    }
}
