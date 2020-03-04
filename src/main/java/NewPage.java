import org.openqa.selenium.By;

public class NewPage extends Utils
{
    private By _details=By.xpath("//div[@class=\"page news-list-page\"]/div[2]/div[1]/div[1]/div[3]/a");

    public void clickOnDetails()
    {
        scrollAndClick(_details);
        timeDelay(3);
    }
}
