package com.lpereda.webdriverdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		// Additional code needed: Show path to gecko driver OR set up system var GECKO_PATH
		// System.setProperty("webdriver.gecko.driver", "C:/Users/lpereda/OneDrive - Capgemini/Desktop/Tools/GeckoDriver/geckodriver.exe");

		// Create a driver
		WebDriver driver = new FirefoxDriver();

		// Navigate to website
		driver.get("https://app.pluralsight.com/library/");
	}

}
