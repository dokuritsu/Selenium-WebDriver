package com.lpereda.using_tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.SpringApplication;

public class WebDriverTables {
    public static void main(String[] args){
        SpringApplication.run(WebDriverTables.class, args);

        WebDriver driver = new ChromeDriver();
        driver.get("C://Users//lpereda//OneDrive - Capgemini//Desktop//Repos//Selenium-WebDriver//using_tables//src//main//webapp//TablesTest.html");

        // Brute force method
//        WebElement outerTable = driver.findElement(By.tagName("table"));
//        WebElement innerTable = outerTable.findElement(By.tagName("table"));
//
//        WebElement row = innerTable.findElements(By.tagName("td")).get(1);
//
//        System.out.println(row.getText());

        // Xpath method
        WebElement row = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[2]/table/tbody/tr[2]/td"));
        System.out.println(row.getText());
    }
}
