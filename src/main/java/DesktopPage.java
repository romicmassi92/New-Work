import org.openqa.selenium.By;

public class DesktopPage extends Utils
{
    private By _clickOnItemToRefer = By.xpath("//div[@class='picture']//a//img[contains(@title,'VANQUISH 3')]");

    public void verifyUserIsOnDesktopPage() {assertURL("desktop");}

    public void userSelectItemsToReferFriend()
    {
        clickOnElement(_clickOnItemToRefer);
    }
}
