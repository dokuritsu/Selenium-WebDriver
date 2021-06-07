package com.lpereda.css_selector;

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

		WebElement searchField = driver.findElement(By.name("q"));
		searchField.sendKeys("pluralsight");

		searchField.submit();

		WebElement imagesLink = driver.findElements(By.linkText("Images")).get(0);
		imagesLink.click();

		// 	Find 
//		WebElement imageElement = driver.findElement(By.className("wXeWr islib nfEiy mM5pbd"));
////		driver.findElements(By.cssSelector("a[class=wXeWr islib nfEiy mM5pbd]")).get(0);	//anchor
//		WebElement divImgElement = imageElement.findElements(By.className("bRMDJf islir")).get(0);
//		WebElement imageLink = divImgElement.findElements(By.tagName("img")).get(0);
//		imageLink.click();

		WebElement imageElement = driver.findElement(By.cssSelector(".isv-r:first-child"));
		WebElement imageLink = imageElement.findElement(By.cssSelector(".rg_i"));
		imageLink.click();
	}

}
