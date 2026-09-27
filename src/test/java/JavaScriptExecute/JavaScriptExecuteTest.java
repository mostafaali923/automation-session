package JavaScriptExecute;

import Pages.infinitScrollPage;
import base.Base;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JavaScriptExecuteTest extends Base {

    private infinitScrollPage infinitScrollPage;

    @BeforeMethod
    public void beforeMethod() {
        infinitScrollPage = new infinitScrollPage(driver);
    }

    @Test
    public void testInfiniteScroll() {
        homePage.clickInfinityScrollLink();
        infinitScrollPage.scrollToParagraph(10);
        System.out.println("Scrolled to paragraph 5");
    }
}



