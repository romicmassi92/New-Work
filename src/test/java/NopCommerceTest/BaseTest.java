package NopCommerceTest;

import NopCommerceTest.BrowserSelector;
import org.junit.After;
import org.junit.Before;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import sun.plugin.com.Utils;

public class BaseTest extends Utils
{

    @BeforeTest
    public void openBrowser() BrowserSelector.setUpBrowser();
    @AfterTest
    public void closeBrowser() {
    }

}
