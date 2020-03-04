import org.openqa.selenium.By;

public class EmailWishList extends Utils
{
    private By _friendEmail = By.id("FriendEMail");
    private By _sendEmail = By.name("send-email");
    String expected = "Your message has been sent.";
    private By _actual = By.className("result");
    String _notRegisterExpected = "Enter your email";
    private By _notRegisterActual = By.id("YourEmailAddress-error");

    public void enterEmailAddressofFriend() sendkeys(_friendEmail,"romic.massi@gmail.com");
    public void sendEmailToFriend() clickOnElement(_sendEmail);
    public void verifyUserSeeEmailSentMessage()assertTextMessage("Email not send",expected, actual);
    public void verifyNotRegisterUserSeeErrorMessage()
    {
        assertTextMessage("Fail",_notRegisterExpected,_notRegisterActual);
    }
}
