package com.lpereda;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Browser {

    static WebDriver driver;

    public static void goTo(String url){
        driver.get(url);
    }

    public static String title() {
        return driver.getTitle();
    }

    public static void close() {
        driver.close();
    }

    public static void setProfile() {
        FirefoxOptions options = new FirefoxOptions();
        FirefoxProfile customProfile = new FirefoxProfile();
        customProfile.setPreference("dom.disable_beforeunload", true);
        options.setProfile(customProfile);
        driver = new FirefoxDriver(options);

    }
}
