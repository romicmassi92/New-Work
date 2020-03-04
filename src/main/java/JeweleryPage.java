import org.openqa.selenium.By;

public class JeweleryPage extends Utils{

    private By _firstJewelery = By.xpath("//div[@data-productid='40']//div[@class='details']//div//input[contains(@value,'compare ')]");
    private By _secondJewelery = By.xpath("//input[contains(@title,'compare ') and contains(@onclick,'41')]");
    private By _comparisionButton = By.xpath("//a[contains(text(),'comparison')]");
    private By _itemToRefer = By.xpath("//input[contains(@onclick,'41/2')]");
    private By _whishListButton =By.xpath("//a[contains(text(),'wishlist')]");

    public void verifyUserOnJeweleryPage() assertURL("Jewelery");

    public void chooseProductToCompare()
    {
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickOnElement(_firstJewelery);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        clickOnElement(_comparisionButton);
    }
}
