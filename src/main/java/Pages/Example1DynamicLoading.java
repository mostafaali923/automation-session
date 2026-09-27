package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Example1DynamicLoading {
    private WebDriver driver;
    private WebDriverWait wait;
    private By renderButton = By.xpath("//button[contains(text(),'Start')]");
    private By renderedElement = By.id("finish");

    public Example1DynamicLoading(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public Example1DynamicLoading clickStartButton() {
        wait.until(ExpectedConditions.elementToBeClickable(renderButton)).click();
        return this;
    }

    public Example1DynamicLoading assertOnFinishText() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(renderedElement));
        return this;
    }

    public String getResultText() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(renderedElement)).getText();
    }
}
