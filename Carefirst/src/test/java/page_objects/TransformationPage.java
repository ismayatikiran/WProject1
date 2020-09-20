package page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

public class TransformationPage {

    @FindBy(how = How.XPATH, using = "//*[@id='1528466918934']/nav/div/ul/li[6]/a")
    WebElement transformation;

    public void clickTransfer(){
        transformation.click();
        TestLogger.log("Clicking Transformation button");
    }
}
