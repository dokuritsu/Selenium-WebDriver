package com.lpereda;

public class HomePage {

    static String url = "https://www.pluralsight.com/";
    static String title = "Pluralsight | The tech workforce development company";

    public void goTo() {
        Browser.setProfile();
        Browser.goTo(url);
    }

    public boolean isAt() {
        return Browser.title().equals(title);
    }
}
