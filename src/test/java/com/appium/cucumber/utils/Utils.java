package com.appium.cucumber.utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.net.MalformedURLException;
import java.net.URL;
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
            return "ANDROID";
        }
    }

    public static URL getUrlAppium() throws MalformedURLException {
        return new URL("http://127.0.0.1:4723/wd/hub");
    }

    public static void init() throws MalformedURLException {
        Platform platform = Platform.valueOf(getPlatform());
        DesiredCapabilities caps = new DesiredCapabilities();

        switch (platform) {
            case IOS:
                caps.setCapability("automationName", "XCUITest");
                caps.setCapability("deviceName", "Iphone 13 Pro Max");
                caps.setCapability("platformName", "IOS");
                caps.setCapability("platformVersion", "15.0");
                caps.setCapability("autoAcceptAlerts", true);
                caps.setCapability("udid", "14C10049-5022-41D1-B2ED-9B4F21C8932D");
                caps.setCapability("app", System.getProperty("user.dir") + "/apps/ios/ToDo.ipa");

                driver = new IOSDriver<>(getUrlAppium(), caps);
                break;
            case ANDROID:
                caps.setCapability("deviceName", "Pixel");
                caps.setCapability("platformName", "Android");
                caps.setCapability("app",  System.getProperty("user.dir") + "/apps/android/ToDo.apk");

                driver = new AndroidDriver<>(getUrlAppium(), caps);
                break;
        }
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
