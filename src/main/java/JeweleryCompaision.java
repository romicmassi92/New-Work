import static org.openqa.selenium.support.ui.ExpectedConditions.urlContains;

public class JeweleryCompaision extends Utils {

    public void verifyUserIsOnJeweleryComparision()
    {
        assertURL("compareproducts");
        urlContains ("compareproducts");
    }
}
