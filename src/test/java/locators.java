import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class locators extends actions {

    //Texts
    public static final By WELCOME_TITLE = AppiumBy.androidUIAutomator("new UiSelector().text(\"Welcome!\")");
    public static final By SHARE_LOCATION_TITLE = AppiumBy.androidUIAutomator("new UiSelector().text(\"Share your location\")");
    public static final By STAY_IN_LOOP_TITLE = AppiumBy.androidUIAutomator("new UiSelector().text(\"Stay in the loop\")");
    public static final By ITEM_TITLE = AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"pdp_title_text\")");
    public static final By SEARCH_RESULT_OPTION = AppiumBy.androidUIAutomator("new UiSelector().text(\"in Headphones\")");
    public static final By SEARCH_RESULT_TEXT = AppiumBy.androidUIAutomator("new UiSelector().text(\"apple airpods\")");
    public static final By RESULT_COUNT = AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"plp_results_count\")");
    public static final By CHOSEN_ITEM = AppiumBy.androidUIAutomator("new UiSelector().text(\"Open Box - Apple AirPods Pro (2nd generation) Noise Cancelling True Wireless Earbuds with USB-C MagSafe Charging Case\")");
    public static final By CART_CONFIRMATION = AppiumBy.androidUIAutomator("new UiSelector().text(\"This item has been added to your cart.\")");
    public static final By PRIVACY_POPUP = AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"onetrust-policy\")");
    public static final By ITEM_QUANTITY_ONE = AppiumBy.androidUIAutomator("new UiSelector().text(\"1\")");
    public static final By ITEM_QUANTITY_TWO = AppiumBy.androidUIAutomator("new UiSelector().text(\"2\")");
    public static final By YOUR_CART = AppiumBy.androidUIAutomator("new UiSelector().text(\"Your Cart\")");
    public static final By IS_EMPTY = AppiumBy.androidUIAutomator("new UiSelector().text(\"Looks like it's empty!\")");
    //Buttons
    public static final By CONTINUE_GUEST_BTN = AppiumBy.accessibilityId("Continue as a Guest");
    public static final By CONTINUE_BTN = AppiumBy.accessibilityId("Continue");
    public static final By ALLOW_NOTIFICATION_BTN = AppiumBy.id("com.android.permissioncontroller:id/permission_deny_button");
    public static final By ADD_TO_CART_BTN = AppiumBy.accessibilityId("Add to Cart");
    public static final By VIEW_CART_BTN = AppiumBy.androidUIAutomator("new UiSelector().text(\"View Cart\")");
    public static final By PRIVACY_POPUP_CLOSE_BTN = AppiumBy.accessibilityId("Close");
    public static final By INCREASE_ITEM_QTY = AppiumBy.androidUIAutomator("new UiSelector().description(\"Increase quantity by 1\")");
    public static final By DECREASE_ITEM_QTY = AppiumBy.androidUIAutomator("new UiSelector().description(\"Decrease quantity by 1\")");
    public static final By REMOVE_ITEM_BUTTON = AppiumBy.androidUIAutomator("new UiSelector().text(\"Remove\")");
    public static final By CLOSE_BTN = AppiumBy.accessibilityId("bestBuyToolBarCloseButton");

    //Android Popups
    public static final By SHARE_LOCATION_WHEN_USING_APP = AppiumBy.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button");

    //Images or logos
    public static final By BEST_BUY_LOGO = AppiumBy.id("com.coppi.bestbuy:id/bbyLogo");

    //Fields
    public static final By SEARCH_FIELD = AppiumBy.id("com.coppi.bestbuy:id/searchBarContainer");
    public static final By SEARCH_FIELD_EDIT = AppiumBy.id("com.coppi.bestbuy:id/search_edit_text");

    //Strings
    public static final String ITEM_SEARCH_TEXT = "apple airpods";
    public static final String CHOSEN_ITEM_NAME = "Open Box - Apple AirPods Pro (2nd generation) Noise Cancelling True Wireless Earbuds with USB-C MagSafe Charging Case";
    public static final String QUANTITY_ONE = "1";
    public static final String QUANTITY_TWO = "2";
}