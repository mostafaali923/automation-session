package NotificationMessage;

import Pages.NotificationMessagePage;
import base.Base;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NotificationMessageTest extends Base {
    NotificationMessagePage notificationMessagePage;
    @BeforeMethod
    public void beforeMethod() {
        notificationMessagePage = new NotificationMessagePage(driver);
    }
    @Test
    public void testNotificationMessage() {
        homePage.clickNotificationMessageLink();
        notificationMessagePage.clickHereLink().assertOnTextNotification();
    }
}
