package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HPage {
   WebDriver driver = null;

   @FindBy(how = How.ID, using = "designer-index")
     WebElement Designer;

   @FindBy(how = How.XPATH, using = "/html/body/div[1]/header/div[2]/div/div/div[2]/div[1]/div[3]/div[3]/img")
   WebElement searchBox;

   //@FindBy(how = How.CLASS_NAME, using = "form-control search-field pull-left")
   @FindBy(how = How.XPATH,using = "//*[@id=\"search-field\"]")
    WebElement seachBox2;

   @FindBy(how = How.ID,using = "search-submit")
   WebElement seachSubmit;



      public void clickdesigner() {
            Designer.click();

        }

        public void Searchbox() throws InterruptedException {
            searchBox.click();
            seachBox2.sendKeys("Dress");
            seachBox2.submit();

        }



    }

