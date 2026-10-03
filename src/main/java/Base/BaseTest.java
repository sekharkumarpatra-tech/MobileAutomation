package Base;

import java.io.File;
import java.time.Duration;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import utils.ConfigReader;
import utils.DriverFactory;

public class BaseTest {

    // Driver is created by DriverFactory
    public static AppiumDriver driver;

    // Appium server
    public static AppiumDriverLocalService service;

    // Start Appium Server before the test suite
    @BeforeSuite
    public void startAppiumServer() throws Exception {

        ConfigReader.loadProperties();

        String appiumJSPath =
                ConfigReader.getProperty("appiumJSPath");

        String ip =
                ConfigReader.getProperty("appiumServerIP");

        int port =
                Integer.parseInt(
                        ConfigReader.getProperty("appiumServerPort"));

        File appiumJSFile = new File(appiumJSPath);

        service = new AppiumServiceBuilder()
                .withAppiumJS(appiumJSFile)
                .withIPAddress(ip)
                .usingPort(port)
                .withTimeout(Duration.ofSeconds(90))
                .build();

        service.start();

        System.out.println("========== Appium Server Started ==========");
    }

    // Create driver before each test class
    @BeforeClass
    public void initializeDriver() throws Exception {

        DriverFactory.initializeDriver();

        // Get the driver created by DriverFactory
        driver = DriverFactory.driver;

        System.out.println("========== Android Driver Created ==========");
    }

    // Stop Appium server after suite
    @AfterSuite
    public void tearDown() {

        if (driver != null) {
            driver.quit();
        }

        if (service != null) {
            service.stop();
        }

        System.out.println("========== Appium Server Stopped ==========");
    }
}