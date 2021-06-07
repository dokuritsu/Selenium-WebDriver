package com.lpereda.sel_server;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.MalformedURLException;
import java.net.URL;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws MalformedURLException {
		SpringApplication.run(Application.class, args);

//		WebDriver driver = new ChromeDriver();
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),
				DesiredCapabilities.chrome());
		driver.get("https://www.google.com/");

		WebElement searchField = driver.findElement(By.name("q"));
		// driver.findElement(By.tagName("INPUT"));
		searchField.sendKeys("pluralsight");

		// Executes searchfield
		searchField.submit();

		// // Vavigating to Images tab
		WebElement imagesLink = driver.findElements(By.linkText("Images")).get(0);
		imagesLink.click();
	}

}
