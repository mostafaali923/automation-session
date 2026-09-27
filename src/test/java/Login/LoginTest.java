package Login;

import Pages.LoginPage;
import Pages.SecurePage;
import base.Base;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends Base {
    private LoginPage loginPage;
    private SecurePage securePage;

    @BeforeMethod
    public void beforeMethod() {
        loginPage = new LoginPage(driver);
    }

    @Test
    public void FormLogin() {
        homePage.clickLoginLink();
        loginPage.login("tomsmith", "SuperSecretPassword!").ClickLoginButton();

        securePage = new SecurePage(driver);
        securePage.assertOnTextBox();
    }
}
