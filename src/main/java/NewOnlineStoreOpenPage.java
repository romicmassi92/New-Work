import org.openqa.selenium.By;

public class NewOnlineStoreOpenPage extends Utils
{
    private By _title=By.xpath("//input[@class=\"enter-comment-title\"]");

    LoadProp loadProp=new LoadProp();

    private By _comment=By.xpath("//*[@id=\"AddNewComment_CommentText\"]");

    private By _newComment=By.xpath("//*[@id=\"comments\"]/form/div[2]/input");

    private By _successmessege=By.xpath("//div[@class=\"notifications\"]/div");



    public void addNewComment()
    {

        scrollAndClick(_title);

        String title=loadProp.getProperty("title");

        enterText(_title,title);

        String comment=loadProp.getProperty("comment");

        enterText(_comment,comment);

        clickOnElement(_newComment);
    }

    public void verifySuccessMessageOfComment()
    {
        String expected="News comment is successfully added.";

        timeDelay(2);
        assertTextMessage("New Comment is not added successfully",expected,_successmessege);
    }
}
