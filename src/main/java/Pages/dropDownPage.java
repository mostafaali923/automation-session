package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class dropDownPage {
    private WebDriver driver;
    private By dropdown = By.id("dropdown");

    public dropDownPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectFromDropDown(String value) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(dropdown));
        Select select = new Select(driver.findElement(dropdown));
        select.selectByVisibleText(value);
    }

    public String getDropdownList() {
        Select select = new Select(driver.findElement(dropdown));
        return select.getFirstSelectedOption().getText();
    }

    public int getDropdownSize() {
        Select select = new Select(driver.findElement(dropdown));
        return select.getOptions().size();
    }
}
