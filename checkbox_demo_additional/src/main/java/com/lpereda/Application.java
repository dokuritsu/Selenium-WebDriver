package com.lpereda;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Application {

//    static String msg = "Hello World";
    static WebDriver driver = new ChromeDriver();
    static String url = "https://www.seleniumeasy.com/test/";

//    public static void main(String[] args){
//        Application app = new Application();
//        app.goTo();
//        app.closePopUp();
//        app.clickStartPractice();
//        app.clickCheckboxDemo();
//        app.clickCheckAll();
//        app.allChecked();
//    }

    public void goTo(){
        driver.get(url);
    }

    public void closePopUp(){
        // Close pop-up
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement popUpElement = driver.findElement(By.id("at-cv-lightbox-close"));
        if(popUpElement.isDisplayed())
            popUpElement.click();
    }

    public void clickStartPractice(){
        // Select start practice button
        WebElement startPracticeButton = driver.findElement(By.id("btn_basic_example"));
        startPracticeButton.click();
    }

    public void clickCheckboxDemo(){
        // Select simple form demo
        WebElement checkBoxButton = driver.findElements(By.className("list-group-item")).get(1);
        checkBoxButton.click();
    }

    public void clickCheckAll(){
        WebElement checkAllButton = driver.findElement(By.id("check1"));
        checkAllButton.click();
    }

    public boolean allChecked(){
//        WebElement checkBoxesElement = driver.findElements(By.className("panel-body")).get(2);
//        List<WebElement> checkBoxes = checkBoxesElement.findElements(By.className("checkbox"));
//        for(WebElement checkbox: checkBoxes){
//            System.out.println(checkbox.getText());
//            System.out.println("Am I selected: " + checkbox.isSelected());
//            if(!checkbox.isSelected()){
//                return false;
//            }
//        }
//        return true;
        WebElement hiddenTruth = driver.findElement(By.id("isChkd"));
        return hiddenTruth.getAttribute("value").equals("true");
    }

    public boolean checkAllButtonChanged(){
        WebElement checkAllButton = driver.findElement(By.id("check1"));
        return checkAllButton.getAttribute("value").equals("Uncheck All");
    }

    public void closeBrowser() {
        driver.close();
    }
}
