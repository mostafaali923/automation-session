package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadingPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private By example1Link = By.linkText("Example 1: Element on page that is hidden");
    private By example2Link = By.linkText("Example 2: Element rendered after the fact");
    private By startButton = By.id("start");
    private By loadingElement = By.id("loading");
    private By finishText = By.id("finish");

    public DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public DynamicLoadingPage clickExample1Link() {
        wait.until(ExpectedConditions.elementToBeClickable(example1Link)).click();
        return this;
    }

    public DynamicLoadingPage clickExample2Link() {
        wait.until(ExpectedConditions.elementToBeClickable(example2Link)).click();
        return this;
    }

    public DynamicLoadingPage assertContentText() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(startButton));
        return this;
    }

    public DynamicLoadingPage clickStart() {
        wait.until(ExpectedConditions.elementToBeClickable(startButton)).click();
        return this;
    }

    public void waitForLoadingToFinish() {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingElement));
    }

    public void verifyFinishText() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(finishText));
    }
}
