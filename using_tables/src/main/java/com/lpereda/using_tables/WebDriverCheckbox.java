package com.lpereda.using_tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.SpringApplication;

public class WebDriverCheckbox {
    public static void main (String[] args){
        SpringApplication.run(WebDriverCheckbox.class, args);

        WebDriver driver = new ChromeDriver();
        driver.get("C://Users//lpereda//OneDrive - Capgemini//Desktop//Repos//Selenium-WebDriver//select_checkbox//src//main//webapp//CheckBoxesTest.html");

        WebElement checkBox = driver.findElement(By.id("lettuceCheckbox"));
        checkBox.click();

        // To toggle back off
//        checkBox.click();
    }
}
