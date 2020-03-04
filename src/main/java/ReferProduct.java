import org.openqa.selenium.By;

public class ReferProduct extends Utils
{
    private By_clickOnEmailFriend = By.xpath("//input[@value='Email a friend']");

    public void emailProduct() {clickOnElement(_clickOnEmailFriend);}
}
