package br.com.crosstestingappium.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static com.sun.tools.internal.ws.wsdl.parser.Util.fail;


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
            fail("Platform not defined. \n Example: -Dplatform:ANDROID");
            return null;
        }
    }

    public static void init() throws MalformedURLException {
        Platform platform = Platform.valueOf(getPlatform());
        DesiredCapabilities caps = new DesiredCapabilities();

        switch (platform) {
            case IOS:
                //TODO: implements init config for ios
            case ANDROID:
                caps.setCapability("deviceName", "Galaxy J5 Prime");
                caps.setCapability("platformName", "Android");
                caps.setCapability("platformVersion", "8.0.0");
                caps.setCapability("appPackage", "com.hedo.troopersapp");
                caps.setCapability("appActivity", ".MainActivity");
                caps.setCapability("app",  System.getProperty("user.dir") + "/apps/android/app-android-calculator.apk");
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
