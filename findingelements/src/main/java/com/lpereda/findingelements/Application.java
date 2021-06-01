package com.lpereda.findingelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		// Get element by className
		WebElement searchField = driver.findElement(By.tagName("INPUT"));
		// driver.findElement(By.className("gLFyf gsfi"));
		searchField.sendKeys("pluralsight");
	}

}
