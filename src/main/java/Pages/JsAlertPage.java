package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class JsAlertPage {
    private WebDriver driver;
    private By jsAlertButton = By.xpath("//button[text()='Click for JS Alert']");
    private By jsConfirmButton = By.xpath("//button[text()='Click for JS Confirm']");
    private By jsPromptButton = By.xpath("//button[text()='Click for JS Prompt']");
    private By resultText = By.id("result");

    public JsAlertPage(WebDriver driver) {
        this.driver = driver;
    }

    public JsAlertPage clickOnPopAlertButton() {
        driver.findElement(jsAlertButton).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        return this;
    }

    public JsAlertPage clickOnCancelButton() {
        driver.findElement(jsConfirmButton).click();
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
        return this;
    }

    public JsAlertPage alertSetText(String input) {
        driver.findElement(jsPromptButton).click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys(input);
        alert.accept();
        return this;
    }

    public String getResultText() {
        return driver.findElement(resultText).getText();
    }

    public JsAlertPage assertOnAlertMessage() {
        Assert.assertEquals(getResultText(), "You successfuly clicked an alert");
        return this;
    }

    public JsAlertPage assertOnCancelMessage() {
        Assert.assertEquals(getResultText(), "You clicked: Cancel");
        return this;
    }

    public JsAlertPage assertOnTextInput(String expected) {
        Assert.assertEquals(getResultText(), expected);
        return this;
    }
}
