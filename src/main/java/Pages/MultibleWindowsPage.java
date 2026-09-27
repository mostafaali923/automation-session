package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultibleWindowsPage {
    private WebDriver driver;
    private By clickHereLink = By.linkText("Click Here");

    public MultibleWindowsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickHereLink() {
        driver.findElement(clickHereLink).click();
    }

    public void switchToNewWindow() {
        for (String windowHandle : driver.getWindowHandles()) {
            driver.switchTo().window(windowHandle);
        }
    }
}
