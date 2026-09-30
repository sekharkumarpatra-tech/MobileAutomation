/*
 * package AppiumRun;
 * 
 * import java.security.PublicKey; import java.sql.Driver; import
 * java.time.Duration; import java.util.Timer;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.DeviceRotation;
 * import org.openqa.selenium.JavascriptExecutor; import
 * org.openqa.selenium.WebElement; import
 * org.openqa.selenium.remote.RemoteWebElement; import
 * org.openqa.selenium.support.ui.ExpectedConditions; import
 * org.openqa.selenium.support.ui.Sleeper; import
 * org.openqa.selenium.support.ui.WebDriverWait; import
 * org.testng.annotations.BeforeClass; import org.testng.annotations.Test;
 * 
 * import com.google.common.collect.ImmutableMap;
 * 
 * import Base.BaseTest; import io.appium.java_client.AppiumBy; import
 * io.appium.java_client.android.Activity; import
 * io.appium.java_client.android.nativekey.AndroidKey; import
 * io.appium.java_client.android.nativekey.KeyEvent;
 * 
 * public class DragandDrop extends BaseTest {
 * 
 * @BeforeClass public void launchApp() throws Exception {
 * 
 * initializeDriver();
 * 
 * 
 * }
 * 
 * @Test(priority = 0) public void DragandDrop() throws InterruptedException {
 * 
 * driver.findElement(AppiumBy.accessibilityId("go-to-drag-drop-screen")).click(
 * );
 * 
 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
 * WebElement source = wait.until(
 * ExpectedConditions.presenceOfElementLocated(By.id(
 * "com.expandtesting.practice:id/paper")) );
 * 
 * // WebElement source=
 * driver.findElement(By.id("com.expandtesting.practice:id/paper"));
 * 
 * // Java ((JavascriptExecutor) driver).executeScript("mobile: dragGesture",
 * ImmutableMap.of( "elementId", ((RemoteWebElement) source).getId(), "endX",
 * 793, "endY", 1785 )); }
 * 
 * @Test(priority = 1) public void Rotate() { DeviceRotation landScapeMode =new
 * DeviceRotation(0, 0, 90); driver.rotate(landScapeMode); DeviceRotation
 * Potrite =new DeviceRotation(0, 0, 0); driver.rotate(Potrite); }
 * 
 * @Test(priority = 2) public void Rotat1e(){ driver.pressKey(new
 * KeyEvent(AndroidKey.HOME));
 * 
 * 
 * } }
 * 
 * 
 * 
 */