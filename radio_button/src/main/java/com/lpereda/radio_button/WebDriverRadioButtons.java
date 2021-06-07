package com.lpereda.radio_button;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.SpringApplication;

import java.util.List;

public class WebDriverRadioButtons {
    public static void main(String[] args){
        SpringApplication.run(WebDriverRadioButtons.class, args);
        WebDriver driver = new ChromeDriver();

        // Connect to local html page
        driver.get("C://Users//lpereda//OneDrive - Capgemini//Desktop//Repos//Selenium-WebDriver//radio_button//src//main//webapp//RadioButtonTest.html");

        // Grab list of radio buttons
        List<WebElement> radioButtons = driver.findElements(By.name("color"));

        // Select the second radio button
        radioButtons.get(1).click();
    }
}
