import org.openqa.selenium.By;

public class CheckoutResult extends Utils
{
    private By _checkoutSuccessMessege=By.xpath("//div[@class=\"section order-completed\"]/div[1]/strong");

    String accepted ="Your order has been successfully processed!";


    public void verifyCheckoutSuccessMessage()
    {
        timeDelay(3);

        assertURL("checkout/completed/");

        assertTextMessage("Checkout is not successful",accepted,_checkoutSuccessMessege);
    }

}
