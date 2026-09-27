package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class nestedFrame {
    private WebDriver driver;
    private WebDriverWait wait;
    private By topFrame = By.name("frame-top");
    private By leftFrame = By.name("frame-left");
    private By bottomFrame = By.name("frame-bottom");
    private By leftFrameBody = By.tagName("body");

    public nestedFrame(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void switchToTopFrame() {
        driver.switchTo().defaultContent();
        wait.until(ExpectedConditions.presenceOfElementLocated(topFrame));
        driver.switchTo().frame(driver.findElement(topFrame));
    }

    public String switchToLeftFrame() {
        driver.switchTo().defaultContent();
        switchToTopFrame();
        wait.until(ExpectedConditions.presenceOfElementLocated(leftFrame));
        driver.switchTo().frame(driver.findElement(leftFrame));
        String text = driver.findElement(leftFrameBody).getText();
        driver.switchTo().defaultContent();
        return text;
    }

    public String switchToBottomFrame() {
        driver.switchTo().defaultContent();
        wait.until(ExpectedConditions.presenceOfElementLocated(bottomFrame));
        driver.switchTo().frame(driver.findElement(bottomFrame));
        String text = driver.findElement(leftFrameBody).getText();
        driver.switchTo().defaultContent();
        return text;
    }

    public void switchToDefaultContent() {
        driver.switchTo().defaultContent();
    }

    public String getNestedFrameText() {
        return driver.findElement(leftFrameBody).getText();
    }
}
