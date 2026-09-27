package utilities;

import org.openqa.selenium.WebDriver;

import java.util.Set;

public class WindowManager {

    private WebDriver driver;

    public WindowManager(WebDriver driver) {
        this.driver = driver;
    }
    public void goBack() {
        driver.navigate().back();
    }
    public void goForward() {
        driver.navigate().forward();
    }
    public void goToUrl(String url) {
        driver.navigate().to(url);
    }

    public void refreshPage() {
        driver.navigate().refresh();
    }
    public void maximum(){
        driver.manage().window().maximize();
    }
    public void switchTab(String Title){
        Set<String> windows = driver.getWindowHandles();
        System.out.println("Number of windows: " + windows.size());
        for (String window : windows) {
            driver.switchTo().window(window);
            if (driver.getTitle().equals(Title)) {
                break;
            }
        }
    }
}
