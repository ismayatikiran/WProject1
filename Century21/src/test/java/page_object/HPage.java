package page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import reporting.TestLogger;

import java.util.List;

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

   @FindBy(how = How.CSS,using = "a[href^=\"/categories/new-arrivals\"]")
   WebElement newArrival;

   @FindBy(how = How.XPATH,using = "//*[@id=\"women-boutiques\"]")
   WebElement WomenBtitle;

   @FindBy(how = How.XPATH,using = "//*[@id=\"women\"]")
   WebElement Womenbutton;
   @FindBy(how= How.XPATH,using = "//*[@id=\"refinements-bar\"]/div/div[2]/div/div[2]/div[1]")
   WebElement Wdesigner;



public void ClickWomenbutton(){
    Womenbutton.click();
}
public void clickWdesign() throws InterruptedException {
    Wdesigner.click();
    driver.findElement(By.cssSelector("a[href^=\"/categories/women?prefn1=brand&prefv1=Berkshire\"]")).click();
}

//Clicking the page and getting the title of the page for to validate the page title
      public void clickdesigner() {
            Designer.click();
          TestLogger.log("Clicked on Designer button");

      }

      public String getDesignPagetitle(){
          String Dtitle = DesignPagetitle.getText();
          return Dtitle;

      }



      //Validating the Quantity of the Dress
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

public String getWomenBtitle(){
          String WBoutiqTitle = WomenBtitle.getText();
          return WBoutiqTitle;
}


        public void mouseOver() throws InterruptedException{
            Actions actions = new Actions(driver);
           // WebElement Womenlist = driver.findElement(By.cssSelector("a[href^=\"/categories/new-arrivals\"]"));
            WebElement Womenlist = driver.findElement(By.xpath("//*[@id=\"women\"]"));
            actions.moveToElement(Womenlist).build().perform();
        }

        //DropDown and how many options are present
    public void clickonNewarrival(){
         // newArrival.click();
//        Select dropdown = new Select(newArrival);
        Select dropdown = new Select(driver.findElement(By.cssSelector("a[href^=\"/categories/new-arrivals\"]")));
        //dropdown.getOptions().size();
        TestLogger.log("Number of options present in dropdown: "+ dropdown.getOptions().size());
        List<WebElement> options = dropdown.getOptions();

        for(WebElement e:options)
        {
            TestLogger.log(e.getText());
        }

      }




    }

