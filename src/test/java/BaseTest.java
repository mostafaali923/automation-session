import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BaseTest {
    static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        String Title = driver.getTitle();
        System.out.println("title is  " + Title);
        //  By inputLink = By.cssSelector("a[href='/inputs']");
//        By inputLink = By.linkText("Inputs");
//
//        driver.findElement(inputLink).click();

       List<WebElement> links = driver .findElements(By.tagName("li"));
//        for (WebElement link : links) {
//            link.getSize();
//        }

        System.out.println("links is  " + links.size());
        driver.quit();

    }
}