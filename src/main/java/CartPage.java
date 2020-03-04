import org.openqa.selenium.By;

public class CartPage extends Utils
{private By _termsAndCondition=By.id("termsofservice");

    private By _clickOnCheckout=By.id("checkout");


    public void checkTermsAndCondition()
    {
        scrollAndClick(_termsAndCondition);
    }

    public void clickOnCheckout()
    {
        scrollAndClick(_clickOnCheckout);
    }
}
