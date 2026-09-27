package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    private WebDriver driver;
    private WebDriverWait wait;
    private By formAuthLink = By.linkText("Form Authentication");
    private By loginLink = By.linkText("Login Page");
    private By dynamicLoadingLink = By.linkText("Dynamic Loading");
    private By jsAlertLink = By.linkText("JavaScript Alerts");
    private By infinityScrollLink = By.linkText("Infinite Scroll");
    private By notificationLink = By.linkText("Notification Messages");
    private By dropdownLink = By.linkText("Dropdown");
    private By multipleWindowsLink = By.linkText("Multiple Windows");
    private By frameLink = By.linkText("Frames");

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void clickLoginLink() {
        wait.until(ExpectedConditions.elementToBeClickable(formAuthLink)).click();
    }

    public void clickFormAuthLink() {
        wait.until(ExpectedConditions.elementToBeClickable(formAuthLink)).click();
    }

    public void clickDynamicLoading() {
        wait.until(ExpectedConditions.elementToBeClickable(dynamicLoadingLink)).click();
    }

    public void clickJavaScriptAlert() {
        wait.until(ExpectedConditions.elementToBeClickable(jsAlertLink)).click();
    }

    public void clickInfinityScrollLink() {
        wait.until(ExpectedConditions.elementToBeClickable(infinityScrollLink)).click();
    }

    public void clickNotificationMessageLink() {
        wait.until(ExpectedConditions.elementToBeClickable(notificationLink)).click();
    }

    public void clickDropDownLink() {
        wait.until(ExpectedConditions.elementToBeClickable(dropdownLink)).click();
    }

    public void clickMultibleWindowLink() {
        wait.until(ExpectedConditions.elementToBeClickable(multipleWindowsLink)).click();
    }

    public void clickFrameLink() {
        wait.until(ExpectedConditions.elementToBeClickable(frameLink)).click();
    }
}
