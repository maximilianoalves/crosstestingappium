package com.crosstestingappium.pagefactory;

import com.crosstestingappium.utils.Utils;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BasePage extends Utils {

    public static void visibilityOf(MobileElement el) {
        getDriverWait().until(
                webDriver -> ExpectedConditions.visibilityOf(el).apply(webDriver)
        );
    }

    public static void toBeClickable(MobileElement el) {
        wait.until(ExpectedConditions.elementToBeClickable(el));
    }

    public static void click(MobileElement el) {
        toBeClickable(el);
        el.click();
    }

    public static String getText(MobileElement el) {
        visibilityOf(el);
        return el.getText();
    }

    public static void sendKeys(MobileElement el, String text) {
        visibilityOf(el);
        el.sendKeys(text);
    }
}
