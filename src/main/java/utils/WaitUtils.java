package utils;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;


public class WaitUtils {


    // =================================================
    // Wait until element is visible
    // =================================================

    public static WebElement waitForVisibility(
            AndroidDriver driver,
            By locator) {


        WebDriverWait wait = new WebDriverWait(
                        driver,
                        Duration.ofSeconds(20)
                );


        return wait.until(
                ExpectedConditions
                .visibilityOfElementLocated(locator)
        );

    }




    // =================================================
    // Wait until element is clickable
    // =================================================

    public static WebElement waitForClickable(
            AndroidDriver driver,
            By locator) {


        WebDriverWait wait =
                new WebDriverWait(
                        driver,
                        Duration.ofSeconds(20)
                );


        return wait.until(
                ExpectedConditions
                .elementToBeClickable(locator)
        );

    }




    // =================================================
    // Wait until element is present in DOM
    // =================================================

    public static WebElement waitForPresence(
            AndroidDriver driver,
            By locator) {


        WebDriverWait wait =
                new WebDriverWait(
                        driver,
                        Duration.ofSeconds(20)
                );


        return wait.until(
                ExpectedConditions
                .presenceOfElementLocated(locator)
        );

    }





    // =================================================
    // Wait until text appears
    // =================================================

    public static boolean waitForText(
            AndroidDriver driver,
            By locator,
            String text) {


        WebDriverWait wait =
                new WebDriverWait(
                        driver,
                        Duration.ofSeconds(20)
                );


        return wait.until(
                ExpectedConditions
                .textToBePresentInElementLocated(
                        locator,
                        text
                )
        );

    }

}
