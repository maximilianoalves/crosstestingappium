package com.crosstestingappium.utils;

import org.junit.Assert;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


public class Utils {
    public static AppiumDriver<MobileElement> driver;
    public static WebDriverWait wait;

    public enum Platform {
        ANDROID,IOS
    }

    public static String getPlatform() {
        String env = System.getProperty("platform");
        if (env != null) {
            return env.toUpperCase();
        } else {
            Assert.fail("Platform not defined. \n Example: -Dplatform:ANDROID");
            return null;
        }
    }

    public static void init() throws MalformedURLException {
        Platform platform = Platform.valueOf(getPlatform());
        DesiredCapabilities caps = new DesiredCapabilities();

        switch (platform) {
            case IOS:
                caps.setCapability("automationName", "XCUITest");
                caps.setCapability("deviceName", "Iphone 11 Pro Max");
                caps.setCapability("platformName", "IOS");
                caps.setCapability("platformVersion", "13.2");
                caps.setCapability("autoAcceptAlerts", true);
                caps.setCapability("udid", "14C10049-5022-41D1-B2ED-9B4F21C8932D");
                caps.setCapability("app", System.getProperty("user.dir") + "/apps/ios/SimpleCalculator.app");
                break;
            case ANDROID:
                caps.setCapability("deviceName", "Galaxy J5 Prime");
                caps.setCapability("platformName", "Android");
                caps.setCapability("appPackage", "com.example.leonardomenezes.simplecalculatorandroid");
                caps.setCapability("appActivity", ".MainActivity");
                caps.setCapability("app",  System.getProperty("user.dir") + "/apps/android/app-android-calculator.apk");
                break;
        }

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AppiumDriver<MobileElement>(url, caps);
        wait = new WebDriverWait(driver, 6000);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    public static void quit() {
        driver.quit();
    }

    public static AppiumDriver<MobileElement> getDriver() {
        return driver;
    }

    public static WebDriverWait getDriverWait() {
        return wait;
    }
}
