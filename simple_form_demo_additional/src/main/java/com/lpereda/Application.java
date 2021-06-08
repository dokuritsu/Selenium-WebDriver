package com.lpereda;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Application {

    static String msg = "Hello World";
    static WebDriver driver = new ChromeDriver();
    static String url = "https://www.seleniumeasy.com/test/";

    public void goTo(){
        driver.get(url);
    }

    public void closePopUp(){
        // Close pop-up
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement popUpElement = driver.findElement(By.id("at-cv-lightbox-close"));
        popUpElement.click();
    }

    public void clickStartPractice(){
        // Select start practice button
        WebElement startPracticeButton = driver.findElement(By.id("btn_basic_example"));
        startPracticeButton.click();
    }

    public void clickSimpleFormDemo(){
        // Select simple form demo
        WebElement simpleFormDemoButton = driver.findElements(By.className("list-group-item")).get(0);
        simpleFormDemoButton.click();
    }

    public void insertMsg(){
        // Input msg
        WebElement inputMessageBox = driver.findElement(By.id("user-message"));
        inputMessageBox.sendKeys(msg);
    }

    public void clickShowMsg(){
        // Select show message
        WebElement showMsgBox = driver.findElement(By.className("btn"));
        showMsgBox.click();
    }

    public boolean compareDisplayedMsg(){
        // Determine whether the displayed msg is the same as we passed
        WebElement inputMsgLabel = driver.findElement(By.id("display"));
        return inputMsgLabel.getText().equals(msg);
    }
}
