import org.openqa.selenium.By;

public class RegistrationPage extends Utils{
    private By _firstName = By.id("FirstName");
    private By _LastName = By.id("LastName");
    private By _email = By.id("Email");
    private By _registerClickable = By.id("register-button");
    private By _password = By.id("Password");
    private By _confirmPassword = By.id("ConfirmPassword");
    private By _registerButton = By.name("register-button");

    private String firstName = "Romic";
    private String lastName = "Masih";
    private String timeStamp = timeStamp();
    private String password = "abcd@123";
    private String confirmPassword = "abcd@123";

    public void verifyUserIsOnRegistrationPage(){ assertURL("registry");}

    public void userEnterRegistrationDetails()

    {waitForClickable(_registerClickable, 40);
    try {
        Thread.sleep(2000);
    } catch (InterruptedException e){
        e.printStackTrace();
    }
    sendkeys(_firstName, firstName);
    sendkeys(_LastName, lastName);
    sendkeys(_email, "romic.massi"+timeStamp+"@gmail.com");
    sendkeys(_password, password);
    sendkeys(_confirmPassword, confirmPassword);
    clickOnElement(_registerButton);
    }
}
