package Test;

import org.testng.annotations.Test;

import Base.BaseTest;

public class DriverTest extends BaseTest {

    @Test
    public void verifyAppLaunch() {

        System.out.println("========== Test Started ==========");

        System.out.println("Current App Package: "
                + driver.getCapabilities().getCapability("appium:appPackage"));

        System.out.println("========== Test Completed ==========");
    }
}