package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.qameta.allure.Step;
import io.qameta.allure.Feature;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;

@Epic("Swag Labs")
@Feature("Authentication")
@Story("User Login")
public class LoginPage {
    private WebDriver driver;
    private By userNameField = By.id("username");
    private By passwordField = By.id("password");
    private By loginButton = By.tagName("button");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    @Step("Enter username: {0} and password: {1}")
    public LoginPage login(String username , String pass){
        driver.findElement(userNameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(pass);
        return this ;
    }

    @Step("Click login button")
    public LoginPage clickLoginButton(){
        driver.findElement(loginButton).click();
        return this ;
    }

    @Step("Click login button (wrapper)")
    public LoginPage ClickLoginButton(){
        return clickLoginButton();
    }
}
