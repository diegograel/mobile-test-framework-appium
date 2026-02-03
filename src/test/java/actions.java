import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;


public class actions extends tests {

    static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    public static void startAppAsGuest() {
        Assert.assertTrue(driver.findElement(locators.WELCOME_TITLE).isDisplayed());
        Assert.assertTrue(driver.findElement(locators.CONTINUE_GUEST_BTN).isDisplayed());
        driver.findElement(locators.CONTINUE_GUEST_BTN).click();
        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(locators.SHARE_LOCATION_TITLE)).isDisplayed());
        driver.findElement(locators.CONTINUE_BTN).click();
        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(locators.SHARE_LOCATION_WHEN_USING_APP)).isDisplayed());
        driver.findElement(locators.SHARE_LOCATION_WHEN_USING_APP).click();
        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(locators.CONTINUE_BTN)).isDisplayed());
        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(locators.STAY_IN_LOOP_TITLE)).isDisplayed());
        wait.until(ExpectedConditions.visibilityOfElementLocated(locators.CONTINUE_BTN)).click();
        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(locators.ALLOW_NOTIFICATION_BTN)).isDisplayed());
        driver.findElement(locators.ALLOW_NOTIFICATION_BTN).click();
        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(locators.BEST_BUY_LOGO)).isDisplayed());
    }

    public static void itemSearch(){
        driver.findElement(locators.SEARCH_FIELD).click();
        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(locators.SEARCH_FIELD_EDIT)).isDisplayed());
        driver.findElement(locators.SEARCH_FIELD_EDIT).sendKeys(locators.ITEM_SEARCH_TEXT);
        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(locators.SEARCH_RESULT_TEXT)).isDisplayed());
        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(locators.SEARCH_RESULT_OPTION)).isDisplayed());
        driver.findElement(locators.SEARCH_RESULT_OPTION).click();
        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(locators.RESULT_COUNT)).isDisplayed());
//        for (int i = 0; i < 3; i++) { // Swipe 3 times
//            scrollFunction.swipeUp(driver);
//        }
        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(locators.CHOSEN_ITEM)).isDisplayed());
        driver.findElement(locators.CHOSEN_ITEM).click();
        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(locators.ITEM_TITLE)).isDisplayed());
        WebElement item_title = driver.findElement(locators.ITEM_TITLE);
        String actualTitle = item_title.getText();
        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(locators.ITEM_TITLE)).isDisplayed());
        Assert.assertEquals(actualTitle, locators.CHOSEN_ITEM_NAME);
    }

    public static void addItemToCart(){
        utils.swipeUp(driver);
        driver.findElement(locators.ADD_TO_CART_BTN).click();
        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(locators.CART_CONFIRMATION)).isDisplayed());
        driver.findElement(locators.VIEW_CART_BTN).click();
        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(locators.PRIVACY_POPUP)).isDisplayed());
        driver.findElement(locators.PRIVACY_POPUP_CLOSE_BTN).click();
        Assert.assertTrue(wait.until(ExpectedConditions.invisibilityOfElementLocated(locators.PRIVACY_POPUP)));
        utils.swipeUp(driver);
        WebElement item_quantity_base = wait.until(ExpectedConditions.visibilityOfElementLocated(locators.ITEM_QUANTITY_ONE));
        String actualQuantity = item_quantity_base.getText();
        Assert.assertEquals(actualQuantity, locators.QUANTITY_ONE);
    }

    public static void changeItemQuantity(){
        driver.findElement(locators.INCREASE_ITEM_QTY).click();
        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(locators.ITEM_QUANTITY_TWO)).isDisplayed());
        WebElement item_quantity = driver.findElement(locators.ITEM_QUANTITY_TWO);
        String item_quantity_add = item_quantity.getText();
        Assert.assertEquals(item_quantity_add, locators.QUANTITY_TWO);
        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(locators.DECREASE_ITEM_QTY)).isEnabled());
        driver.findElement(locators.DECREASE_ITEM_QTY).click();
        //wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.DECREASE_ITEM_QTY)).click();
        //Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.ITEM_QUANTITY_ONE)).isDisplayed());
        WebElement item_quantity_remove = driver.findElement(locators.ITEM_QUANTITY_ONE);
        String oldQuantity = item_quantity_remove.getText();
        Assert.assertEquals(oldQuantity, locators.QUANTITY_ONE);
    }

    public static void removeItemFromCart(){
        driver.findElement(locators.REMOVE_ITEM_BUTTON).click();
        utils.swipeDown(driver);
        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(locators.YOUR_CART)).isDisplayed());
        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(locators.IS_EMPTY)).isDisplayed());
        driver.findElement(locators.CLOSE_BTN).click();
        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(locators.ITEM_TITLE)).isDisplayed());
    }

    public static void finishTest(){
        if (driver != null) {
            try {
                driver.quit();
            } catch (Exception e) {
                System.err.println("Driver quit failed: " + e.getMessage());
            }
        }
    }
}