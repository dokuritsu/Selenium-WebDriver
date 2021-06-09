import com.lpereda.Application;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;

public class CheckBoxTests {
    static Application app = new Application();

    @Test
    public void clickingCheckAll() {
        app.goTo();
        app.closePopUp();
        app.clickStartPractice();
        app.clickCheckboxDemo();
        app.clickCheckAll();
        Assert.assertTrue(app.allChecked());
    }

    @Test
    public void canCheckAllChange() {
        app.goTo();
        app.closePopUp();
        app.clickStartPractice();
        app.clickCheckboxDemo();
        app.clickCheckAll();
        Assert.assertTrue(app.checkAllButtonChanged());
    }

    @AfterClass
    public static void afterClass() throws Exception {
        app.closeBrowser();
    }
}
