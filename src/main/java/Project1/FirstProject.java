package Project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProject {
     WebDriver driver = new ChromeDriver();

    public  void navigateTo(){
        driver.get("https://www.amazon.eg/");
       // driver.navigate().to("https://www.facebook.com/");

        String Title= driver.getTitle();
        System.out.println(Title);

        driver.manage().window().maximize();
        // to close window only
       // driver.close();

        //quite     to close and delete in ram
        driver.quit();


    }
}
