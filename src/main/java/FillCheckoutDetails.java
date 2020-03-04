import org.openqa.selenium.By;

public class FillCheckoutDetails extends Utils
{
    LoadProp loadProp=new LoadProp();
    private By _firstName=By.id("BillingNewAddress_FirstName");

    private By _lastName=By.id("BillingNewAddress_LastName");

    private By _email=By.id("BillingNewAddress_Email");

    private By _selectCountry=By.id("BillingNewAddress_CountryId");

    private By _city=By.id("BillingNewAddress_City");

    private By _address=By.id("BillingNewAddress_Address1");

    private By _zip=By.id("BillingNewAddress_ZipPostalCode");

    private By _phoneNo=By.id("BillingNewAddress_PhoneNumber");

    private By _continueBA=By.xpath("//div[@id=\"billing-buttons-container\"]/input");

    private By _continueSA=By.xpath("//div[@id=\"shipping-method-buttons-container\"]/input");

    private By _paymentMethodCard=By.xpath("//*[@id=\"payment-method-block\"]/li[2]/div/div[2]/input");

    private By _continuePM=By.xpath("//div[@id=\"payment-method-buttons-container\"]/input");

    private By _selectCreditCard=By.xpath("//*[@class=\"info\"]/table/tbody/tr/td[2]/select/option[2]");

    private By _cardHoldersName=By.id("CardholderName");

    private By _cardNo=By.id("CardNumber");

    private By _expireYear=By.id("ExpireYear");

    private By _cardCode=By.id("CardCode");

    private By _paymentInfoContinue=By.xpath(("//*[@id=\"payment-info-buttons-container\"]/input"));

    private By _confirm=By.xpath("//*[@id=\"confirm-order-buttons-container\"]/input");



    public void fillCheckoutDetails()
    {


        String firstName = loadProp.getProperty("firstname");

        enterText(_firstName, firstName);

        String lastName = loadProp.getProperty("lastname");

        enterText(_lastName, lastName);

        String emailAddress = loadProp.getProperty("email");

        scrollAndClick(_email);

        enterText(_email, emailAddress);

        selectFromDropdownByValue(_selectCountry, "212");

        String city = loadProp.getProperty("city");

        scrollAndClick(_city);

        enterText(_city, city);

        String address = loadProp.getProperty("address");

        enterText(_address, address);

        String zip = loadProp.getProperty("zip");

        enterText(_zip, zip);

        String phoneNo = loadProp.getProperty("phoneno");

        enterText(_phoneNo, phoneNo);

        clickOnElement(_continueBA);

        timeDelay(2);
        clickOnElement(_continueSA);

        clickOnElement(_paymentMethodCard);

        clickOnElement(_continuePM);

        clickOnElement(_selectCreditCard);

        String cardHoldersName = loadProp.getProperty("cardholdersName");

        enterT_cardHoldersName, cardHoldersName);

        String cardNo = loadProp.getProperty("cardNo");

        enterText(_cardNo, cardNo);

        selectFromDropdownByValue(_expireYear, "2023");

        String cardCode = loadProp.getProperty("cardCode");

        enterText(_cardCode, cardCode);

        clickOnElement(_paymentInfoContinue);

        timeDelay(2);
        clickOnElement(_confirm);
    }
}
