import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class BrowserSelector extends BasePage
{
    public void setUpBrowser() {
        LoadProp loadProp = new LoadProp();
        String browser = loadProp.getProperty("browser");
        System.out.println("We are using " + browser + " browser");

        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "src\\test\\Resources\\BrowsersDriver\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
            driver.manage().window().fullscreen();
            driver.get("https://demo.nopcommerce.com/");
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "src\\test\\Resources\\BrowserDrivers\\geckodriver.exe");
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
            driver.get("https://demo.nopcommerce.com/");
        } else if (browser.equalsIgnoreCase("IE")) {
            System.setProperty("webdriver.ie.driver", "src\\test\\Resources\\BrowserDrivers\\IEDriverServer.exe");
            DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();

            ieCapabilities.setCapability("nativeEvents", false);
            ieCapabilities.setCapability("unexpectedAlertBehaviour", "accept");
            ieCapabilities.setCapability("ignoreProtectModeSetting", "True");
            ieCapabilities.setCapability("disable-popup-blocking", "True");
            ieCapabilities.setCapability("enablePersistentHover", "True");
            ieCapabilities.setCapability(InternetExplorerDriver.IE_SWITCHES, "-private");
            ieCapabilities.setCapability("requireWindowFocus", "false");

            driver = new InternetExplorerDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
            driver.get("https://demo.nopcommerce.com/");
        } else
            System.out.println("No Matching Browser " + browser);
    }


    public static void closeBrowser() driver.close();
    }
}
