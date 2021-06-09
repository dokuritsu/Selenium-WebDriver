package com.lpereda;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class PathPages {

    static String url = "https://www.pluralsight.com/";
    static String title = "33% OFF JavaScript Core Language Learning Path | Pluralsight";

    public void goTo() {
        Browser.setProfile();
        Browser.goTo(url);
    }

    public void goToJSPath() {
        Browser.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        Browser.driver.findElement(By.className("cookie_notification--opt_out")).click();

        // Scroll into the div above the element (Because if I scroll to element I want to click, it is obscured by the navigation)
        WebElement divAboveJSPathElement = Browser.driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div/div[3]/div[2]"));
        ((JavascriptExecutor) Browser.driver).executeScript("arguments[0].scrollIntoView(true);", divAboveJSPathElement);
        Browser.driver.findElement(By.cssSelector(".paths-items:nth-child(1) .path-label")).click();
//        ((JavascriptExecutor) Browser.driver).executeScript("arguments[0].scrollIntoView(true);", jsPathElement);
//        if(Browser.driver.findElement(By.id("deny")) != null){
//            Browser.driver.findElement(By.id("deny")).click();
//        }
//        jsPathElement.click();
//        new Actions(Browser.driver).moveToElement(jsPathElement).click().perform();
//        Browser.driver.findElement(By.cssSelector(".paths-items:nth-child(1) .path-label")).click();
//        assertThat(driver.getTitle(), is("(2) New Messages!"));
    }

    public boolean isAt() {
        return Browser.title().equals(title);
    }
}
