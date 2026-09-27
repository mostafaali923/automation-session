package base;

import Pages.HomePage;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utilities.WindowManager;

import java.io.File;
import java.nio.file.Files;

import static java.io.File.*;

public class Base {
    protected WebDriver driver;
    protected HomePage homePage;

    @BeforeMethod
    public  void Setup(){
        driver=new ChromeDriver(getChromeOptions());
        homePage = new HomePage(driver);
        driver.get("https://the-internet.herokuapp.com/");
     //   driver.manage().window().maximize();
    }
    @AfterMethod
    public void tearDown(ITestResult result) {
        // Capture screenshot BEFORE quitting the driver
        if (ITestResult.FAILURE == result.getStatus()) {
            try {
                var screenshot = (TakesScreenshot) driver;
                File screenshotFile = screenshot.getScreenshotAs(OutputType.FILE);
                Files.move(screenshotFile.toPath(), new File("src/main/resources/screenshots/" + result.getName() + ".png").toPath());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        driver.quit();
    }

    public WindowManager getWindowManager() {
        return new WindowManager(driver);
    }

    private ChromeOptions getChromeOptions() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--incognito");
//        options.addArguments("--headless");
        options.addArguments("--disable-notifications");
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});



        return options;
    }
    private EdgeOptions getEdgeOptions() {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--incognito");
        return options;
    }

}
