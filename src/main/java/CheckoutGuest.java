import org.openqa.selenium.By;

public class CheckoutGuest extends Utils
{
    private By _checkoutAsGuest=By.xpath("//*[@class=\"button-1 checkout-as-guest-button\"]");


    public void clickOnCheckoutAsGuest()
    {
        timeDelay(2);
        scrollAndClick(_checkoutAsGuest);
    }
}
