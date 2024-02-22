package checkBoxTest;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckBoxesPage;

public class CheckBoxTest extends BaseTest {
    @Test
    public void checkBox(){
        CheckBoxesPage checkBoxPage = homepage.clickOnCheckBoxPage();
        checkBoxPage.checkCheckBox1();
        Assert.assertTrue(checkBoxPage.checkBoxStatus());
    }
}
