package navigation;

import Pages.MultibleWindowsPage;
import base.Base;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WindowManager;


public class NavigationTest extends Base {


    WindowManager windowManager;
    MultibleWindowsPage multibleWindowsPage;
    @BeforeMethod
    public void beforeMethod() {
        windowManager = getWindowManager();

        multibleWindowsPage = new MultibleWindowsPage(driver);
    }

    @Test
    public void testNavigation() {
        homePage.clickMultibleWindowLink();
//        windowManager.goBack();
//        windowManager.goForward();
//        windowManager.refreshPage();
        multibleWindowsPage.clickHereLink();
        windowManager.switchTab("The Internet");

//        windowManager.goToUrl("https://google.com/");

    }


}
