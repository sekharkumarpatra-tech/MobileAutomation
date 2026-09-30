package utils;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class DriverFactory {

    public static AppiumDriver driver;

    public static void initializeDriver()
            throws IOException, MalformedURLException {

        // Load Config.properties
        ConfigReader.loadProperties();

        // Read configuration
        String ip =
                ConfigReader.getProperty("appiumServerIP");

        String port =
                ConfigReader.getProperty("appiumServerPort");

        String platformName =
                ConfigReader.getProperty("platformName");

        String deviceName =
                ConfigReader.getProperty("deviceName");

        String automationName =
                ConfigReader.getProperty("automationName");

        String platformVersion =
                ConfigReader.getProperty("platformVersion");

        String appPackage =
                ConfigReader.getProperty("appPackage");

        String appActivity =
                ConfigReader.getProperty("appActivity");

        // Appium Server URL
        String serverUrl =
                "http://" + ip + ":" + port;

        // Android Options
        UiAutomator2Options options =
                new UiAutomator2Options();

        options.setPlatformName(platformName);
        options.setAutomationName(automationName);
        options.setDeviceName(deviceName);
        options.setPlatformVersion(platformVersion);
        options.setAppPackage(appPackage);
        options.setAppActivity(appActivity);

        // Create Android Driver
        driver = new AndroidDriver(
                new URL(serverUrl),
                options
        );

        System.out.println(
                "========== Android Driver Created ==========");
    }
}