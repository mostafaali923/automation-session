package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class infinitScrollPage {
    private WebDriver driver;

    public infinitScrollPage(WebDriver driver) {
        this.driver = driver;
    }

    public void scrollToParagraph(int paragraphNumber) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        for (int i = 0; i < paragraphNumber; i++) {
            js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void scrollToBottom() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    }

    public void scrollToElement(By locator) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(locator));
    }

    public void scrollUp() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
    }
}
