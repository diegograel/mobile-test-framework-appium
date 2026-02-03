import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.*;
import java.net.MalformedURLException;
import java.net.URL;

public class tests {

    static AppiumDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setCapability("platformName", "Android");
        options.setCapability("deviceName", "Galaxy S20");
        options.setCapability("automationName", "UiAutomator2");
        options.setCapability("appPackage", "com.coppi.bestbuy");
        options.setCapability("appActivity", "com.bestbuy.android.activity.HomeScreenActivity");
        options.setCapability("noReset", false);

        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), options);
    }

    @Test
    public void appStart() {
        actions.startAppAsGuest();
    }

    @Test(dependsOnMethods = "appStart")
    public void searchItem() {
        actions.itemSearch();
    }

    @Test(dependsOnMethods = "searchItem")
    public void addingItemToCart() {
        actions.addItemToCart();
    }

    @Test(dependsOnMethods = "addingItemToCart")
    public void changingItemQuantity() {
        actions.changeItemQuantity();
    }

    @Test(dependsOnMethods = "changingItemQuantity")
    public void removingItemFromCart() {
        actions.removeItemFromCart();
    }

    @AfterClass
    public void tearDown() {
        actions.finishTest();
    }
}
