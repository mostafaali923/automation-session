package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.qameta.allure.Step;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import io.qameta.allure.Epic;

@Epic("Swag Labs")
@Feature("Inventory")
@Story("Products Listing")
public class InventoryPage{
    private WebDriver driver;
    private By cartIcon = By.className("shopping_cart_link");
    private By products = By.className("inventory_item");


    public InventoryPage(WebDriver driver){
        this.driver = driver;
    }

    @Step("Get page title")
    public String getTitle() {
        return driver.getTitle();
    }

    @Step("Check if cart icon is displayed")
    public boolean isCartDisplayed() {
        return driver.findElement(cartIcon).isDisplayed();
    }

    @Step("Get products count")
    public int getProductsCount() {
        return driver.findElements(products).size();
    }
}
