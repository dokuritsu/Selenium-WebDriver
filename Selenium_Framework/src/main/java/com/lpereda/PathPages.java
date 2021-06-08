package com.lpereda;

import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class PathPages {

    static String url = "https://www.pluralsight.com/";
    static String title = "33% OFF JavaScript Core Language Learning Path | Pluralsight";

    public void goTo() {
        Browser.goTo(url);
    }

    public void goToJSPath() {
        Browser.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Browser.driver.findElement(By.cssSelector(".paths-items:nth-child(1) .path-label")).click();
//        assertThat(driver.getTitle(), is("(2) New Messages!"));
    }

    public boolean isAt() {
        return Browser.title().equals(title);
    }
}
