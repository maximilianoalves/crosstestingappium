package com.crosstestingappium.pageobjects;

import com.crosstestingappium.utils.FindTypes;
import com.crosstestingappium.utils.Utils;
import io.appium.java_client.MobileElement;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BasePage extends Utils {

    public MobileElement element(FindTypes type, String locator) {
        MobileElement el = null;
        switch (type) {
            case ID:
                el = getDriver().findElementById(locator);
                break;
            case XPATH:
                el = getDriver().findElementByXPath(locator);
                break;
            case ACCESS_ID:
                el = getDriver().findElementByAccessibilityId(locator);
                break;
            default:
                Assert.fail("Element type not mapping");
                break;
        }
        return el;
    }

    public static void visibilityOf(MobileElement el) {
        wait.until(ExpectedConditions.visibilityOf(el));
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
