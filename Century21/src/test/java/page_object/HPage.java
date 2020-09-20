package page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

public class HPage {
   WebDriver driver = null;

   @FindBy(how = How.ID, using = "designer-index")
     WebElement Designer;
   @FindBy(how = How.XPATH,using = "/html/body/div[1]/div[3]/div/h1")
   WebElement DesignPagetitle;

   @FindBy(how = How.XPATH, using = "/html/body/div[1]/header/div[2]/div/div/div[2]/div[1]/div[3]/div[3]/img")
   WebElement searchBox;

   //@FindBy(how = How.CLASS_NAME, using = "form-control search-field pull-left")
   @FindBy(how = How.XPATH,using = "//*[@id=\"search-field\"]")
    WebElement seachBox2;

   @FindBy(how = How.ID,using = "search-submit")
   WebElement seachSubmit;

   @FindBy(how = How.CLASS_NAME,using = "number-results")
   WebElement TotalNumberofDress;




      public void clickdesigner() {
            Designer.click();
          TestLogger.log("Clicked on Designer button");


      }

      public String getDesignPagetitle(){
          String Dtitle = DesignPagetitle.getText();
          return Dtitle;
      }



        public void Searchbox() throws InterruptedException {
            searchBox.click();
            TestLogger.log("Clicked on search Button");
            seachBox2.sendKeys("Dress");
            TestLogger.log("Sending keys to  search box");
            seachBox2.submit();
            TestLogger.log("Clicked on Submit");
        }

        public String getDressQuantity(){
          String dressQuantity = TotalNumberofDress.getText();
          return dressQuantity;
        }




        public void mouseOver() throws NullPointerException {
            Actions actions = new Actions(driver);
            WebElement NewArrival = driver.findElement(By.xpath("//*[@id='new-arrivals']"));
            actions.moveToElement(NewArrival).perform();
            driver.close();

        }




    }

