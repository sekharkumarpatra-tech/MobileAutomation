package AppiumRun;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base.BaseTest;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class MyfirtsExampleRun extends BaseTest{

	@BeforeClass
	public void launchApp() throws Exception {
		
		initializeDriver();
	}
	@Test
	public void AppLunch() throws InterruptedException {

		System.out.println("Application Started Successfully");

		driver.findElement(AppiumBy.accessibilityId("go-to-counter-screen")).click();
		//increment-the-counter
		driver.findElement(AppiumBy.accessibilityId("increment-the-counter")).click();
		driver.findElement(AppiumBy.accessibilityId("reset-the-counter")).click();
		driver.findElement(AppiumBy.accessibilityId("go-to-counter-screen")).click();
		driver.findElement(AppiumBy.accessibilityId("decrement-the-counter")).click();
		
		 
		
		Thread.sleep(5000);

		//driver.quit();

	}

}