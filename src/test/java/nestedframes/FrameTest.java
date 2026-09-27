package nestedframes;
import Pages.Frames;
import Pages.nestedFrame;

import base.Base;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FrameTest extends Base {
    private Frames frames;
    private nestedFrame nestedFrames;

    @BeforeMethod
    public void beforeMethod() {
        frames = new Frames(driver);
        nestedFrames = new nestedFrame(driver);
    }
    @Test
    public void testNestedFrames() {
        homePage.clickFrameLink();
        frames.clickNestedFrameLink();

        Assert.assertEquals(nestedFrames.switchToLeftFrame(), "LEFT", "you are not in the correct frame");
        Assert.assertEquals(nestedFrames.switchToBottomFrame(), "BOTTOM", "you are not in the correct frame");
    }



}
