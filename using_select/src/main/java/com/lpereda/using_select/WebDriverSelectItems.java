package com.lpereda.using_select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.springframework.boot.SpringApplication;

public class WebDriverSelectItems {
    public static void main(String[] args){
        SpringApplication.run(WebDriverSelectItems.class, args);

        WebDriver driver = new ChromeDriver();
        driver.get("C://Users//lpereda//OneDrive - Capgemini//Desktop//Repos//Selenium-WebDriver//using_select//src//main//webapp//SelectItemTest.html");

        WebElement selectElement = driver.findElement(By.id("select1"));
        Select select = new Select(selectElement);
        select.selectByVisibleText("Maybe");
    }
}
