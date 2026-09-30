package AppiumRun;

import java.util.Timer;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import Base.BaseTest;
import io.appium.java_client.AppiumBy;

public class MyfirtsGuestreRun extends BaseTest {

	@BeforeClass
	public void launchApp() throws Exception {

		initializeDriver();
	}

	@Test(priority = 0)
	public void Guestrure_Tap() {

		WebElement el1 = driver.findElement(AppiumBy.accessibilityId("go-to-gesture-screen"));
		System.out.println("This Has Benn Prointred " + el1.getText());
		el1.click();

	}

	@Test(priority = 1)
	public void Tap() throws InterruptedException {

		WebElement el2 = driver.findElement(By.id("com.expandtesting.practice:id/btnTap"));
		System.out.println("sssssssssssssssssssssssss" + el2.getText());
		Thread.sleep(2000);
		el2.click();
	}

	@Test(priority = 2)
	public void Double_Tap() throws InterruptedException {

		WebElement doubleTapButton = driver.findElement(By.id("com.expandtesting.practice:id/btnDoubleTap"));

		((JavascriptExecutor) driver).executeScript("mobile: doubleClickGesture",
				ImmutableMap.of("elementId", ((RemoteWebElement) doubleTapButton).getId()));
	}
}
