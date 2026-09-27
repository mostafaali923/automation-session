package DynamicLoading;

import Pages.DynamicLoadingPage;
import Pages.Example1DynamicLoading;
import base.Base;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Example1dynamicLoadingTest extends Base {
    DynamicLoadingPage dynamicLoadingPage;
        Example1DynamicLoading example1DynamicLoading;


        @BeforeMethod
    public void beforeMethod() {
        dynamicLoadingPage = new DynamicLoadingPage(driver);
        example1DynamicLoading = new Example1DynamicLoading(driver);
    }
    @Test
    public void testExample1DynamicLoading() {
        homePage.clickDynamicLoading();
        dynamicLoadingPage.clickExample1Link().assertContentText();
        example1DynamicLoading.clickStartButton().assertOnFinishText();
//        String resultText = example1DynamicLoading.getResultText();
//        System.out.println("Result Text: " + resultText);
    }

}
