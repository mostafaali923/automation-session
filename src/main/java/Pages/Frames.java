package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Frames {
    private WebDriver driver;
    private WebDriverWait wait;
    private By nestedFrameLink = By.linkText("Nested Frames");
    private By frameElement = By.id("mce_0_ifr");
    private By bodyText = By.id("tinymce");

    public Frames(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void clickNestedFrameLink() {
        wait.until(ExpectedConditions.elementToBeClickable(nestedFrameLink)).click();
    }

    public void switchToFrame() {
        driver.switchTo().frame(driver.findElement(frameElement));
    }

    public void switchToDefaultContent() {
        driver.switchTo().defaultContent();
    }

    public String getBodyText() {
        return driver.findElement(bodyText).getText();
    }

    public void sendTextToFrame(String text) {
        driver.findElement(bodyText).sendKeys(text);
    }
}
