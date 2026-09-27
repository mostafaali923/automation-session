package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class NotificationMessagePage {
    private WebDriver driver;
    private WebDriverWait wait;
    private By clickHereLink = By.linkText("Click here");
    private By notificationMessage = By.id("flash-messages");

    public NotificationMessagePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public NotificationMessagePage clickHereLink() {
        wait.until(ExpectedConditions.elementToBeClickable(clickHereLink)).click();
        return this;
    }

    public String getNotificationMessage() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(notificationMessage)).getText();
    }

    public NotificationMessagePage assertOnTextNotification() {
        Assert.assertFalse(getNotificationMessage().isEmpty(), "Notification message is empty");
        return this;
    }
}
