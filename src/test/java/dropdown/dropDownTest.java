package dropdown;
import Pages.HomePage;
import Pages.dropDownPage;
import base.Base;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class dropDownTest extends Base {

 private String option = "Option 1";
 private dropDownPage dropdownPage ;
@BeforeMethod
   public void beforeMethod(){
    dropdownPage = new dropDownPage(driver);
}
    @Test
   public void selectDropdown() {

    homePage.clickDropDownLink();
    dropdownPage.selectFromDropDown(option);

     var selectOption =dropdownPage.getDropdownList();
    Assert.assertFalse(selectOption.isEmpty(), "the selected option is empty");
    Assert.assertTrue(selectOption.contains(option),"the selected option is not in the list");

    }
}
