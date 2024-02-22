package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckBoxesPage {
    WebDriver driver ;
    private By checkBox1 = By.xpath("//input[@type=\"checkbox\"][1]");
    private By checkBox2 = By.xpath("//input[@type=\"checkbox\"][2]");
    public CheckBoxesPage(WebDriver driver){this.driver=driver;}

    public void checkCheckBox1(){
        driver.findElement(checkBox1).click();
    }
    public Boolean checkBoxStatus(){
        return driver.findElement(checkBox1).isSelected();
    }

}
