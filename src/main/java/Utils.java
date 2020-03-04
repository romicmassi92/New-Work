import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class Utils extends BasePage {
    public static void clickOnElement(By by) {
        driver.findElement(by).click();
    }


    public static void sendKeys(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }


    public static void assertURL(String text) {
        Assert.assertTrue(driver.getCurrentUrl().contains(text));
    }


    public static String timeStamp() {
        return new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
    }


    public static void waitForClickable(By by, int time) {
        WebDriverWait Wait = new WebDriverWait(driver, time);
        Wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public static String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }


    public static void assertTextMessage(String message, String expected, By by) {
        String actual = getTextFromElement(by);
        Assert.assertEquals(actual, expected, "Failed");
    }


    public static void urlContains(String text) {
        driver.getPageSource().contains(text);
    }


    public void selectFromDropDownByText(By by, String text) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }

    public static String timeStamp() {
        DateFormat dateFormat = new SimpleDateFormat("ddMMyyHHmmss");
        Date date = new Date();
        return (dateFormat.format(date));
    }

    public void clickOnElement(By by) {
        driver.findElement(by).click();
    }


    public void enterText(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }


    public static String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    public static void waitForClickable(By by, int time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(elementToBeClickable(by));
    }


    public static void waitForVisible(By by, int time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(visibilityOfElementLocated(by));
    }

    public static void waitForElementPresent(By by, int time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(presenceOfElementLocated(By.id("FirstName")));

    }


    public static void selectFromDropdownByIndex(By by, int index) {
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(index);
    }

    public static void selectFromDropdownByValue(By by, String value) {
        Select select = new Select(driver.findElement(by));
        select.selectByValue(value);

    }

    //To select from drop down box by text
    public static void selectFromDropdownByText(By by, String text) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }



    public static void assertTextMessage(String message, String expected, By by) {
        String actual = getTextFromElement(by);
        Assert.assertEquals(message, expected, actual);
    }

    public static void assertURL(String text) {
        Assert.assertTrue(driver.getCurrentUrl().contains(text));
    }


    public void compareArray(String accepted[], String actual[]) {
        Assert.assertArrayEquals("price is Not high to low", accepted, actual);
    }


    public void explicitWait(int time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
    }


    public static void timeDelay(int time) {
        try {
            Thread.sleep(time * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static void verifyElementIsDisplayed(By by) {
        Assert.assertTrue("add to cart is not there", driver.findElement(by).isDisplayed());
    }


    public static void scrollAndClick(By by) {
        WebElement element = driver.findElement(by);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();

    }


    public void getTextFromListAndVerify(By by, String c) {

        SoftAssert softAssert = new SoftAssert();

        List<WebElement> allProduct = driver.findElements(by);

        for (WebElement product : allProduct) {

            System.out.println(product.getText());

            softAssert.assertTrue(product.getText().contains(c), "price does not contain " + c);
        }
        softAssert.assertAll();


    }
}
