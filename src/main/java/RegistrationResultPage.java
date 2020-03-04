import org.openqa.selenium.By;

public class RegistrationResultPage extends Utils
{
    private String expected = "Your Registration Completed";
    private By _actualRegistrationSuccessMessage = By.cssSelector("div.result");
    public void verifyUserSeeRegistrationSuccessMessage()
    {
        assertURL("registerresult");

        assertTextMessgae("pass", expected,_actualRegistrationSuccessMessage);
    }
}
