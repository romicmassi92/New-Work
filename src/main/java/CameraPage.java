import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class CameraPage extends Utils
{
    private By_dropDown = By.id("products-orderby");
    private String priceHighToLow = "Price: High to Low";
    public void useSelectFromPositionPriceHighToLow() {selectFromDropDownByText(_dropDown, priceHighToLow)};
    public void pricesFromElement(){

        List<WebElement> myList = driver.findElements(By.className("prices"));

        List<String> all_elements_text = new ArrayList<>();

        for (int i=0; i < mylist.size();i++){
            all_elements_text.add(myList.get(i).getText());

            System.out.println(myList.get(i).getText());
        }
    }
}
