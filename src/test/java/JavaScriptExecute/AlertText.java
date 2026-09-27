package JavaScriptExecute;

import Pages.JsAlertPage;
import base.Base;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertText extends Base {

    private JsAlertPage jsAlertPage;

    @BeforeMethod
    public void beforeMethod() {
        jsAlertPage = new JsAlertPage(driver);
    }

    @Test
    public void testAlert() {

        homePage.clickJavaScriptAlert();

        jsAlertPage
                .clickOnPopAlertButton()
                .assertOnAlertMessage();
    }

    @Test
    public void testConfirmButton() {

        homePage.clickJavaScriptAlert();

        jsAlertPage
                .clickOnCancelButton()
                .assertOnCancelMessage();
    }

    @Test
    public void promptTest() {

        String text = "ROUTE!";

        homePage.clickJavaScriptAlert();

        jsAlertPage
                .alertSetText(text)
                .assertOnTextInput("You entered: " + text);
    }
}