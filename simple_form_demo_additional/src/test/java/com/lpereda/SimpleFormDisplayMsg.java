package com.lpereda;
import org.junit.Test;
//import org.junit.jupiter.api.Test;

import org.junit.Assert;

public class SimpleFormDisplayMsg {

    @Test
    public void canDisplayGivenMsg() {
        Application app = new Application();
        app.goTo();
        app.closePopUp();
        app.clickStartPractice();
        app.clickSimpleFormDemo();
        app.insertMsg();
        app.clickShowMsg();
        Assert.assertTrue(app.compareDisplayedMsg());
    }
}