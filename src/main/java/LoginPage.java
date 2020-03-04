import org.openqa.selenium.By;

public class LoginPage extends Utils{

    private By enterEmail = By.className("email");
    String emailAddress = "romic.massi@gmail.com";
    private By _login = By.xpath("//input[@value='Log in']");
    private By _password = By.id("Password");
    String password = "Romic@123";

    public void userEnterLoginDetails()
    {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        sendkeys(_enterEmail, emailAddress);

        sendkeys(_password, password);

    try    {

            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    clickOnElement(_login);
        }
}
