import org.openqa.selenium.By;

public class ElectronicPage extends Utils{
    private By _cameraAndPhotos = By.xpath("//h2[@class='title']//a[contains(@title,'Camera')]");

    public void clickOnCameraAndPhotos() clickOnElement(_cameraAndPhotos);

}
