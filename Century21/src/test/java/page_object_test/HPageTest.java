package page_object_test;

import browserdriver.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page_object.HPage;

public class HPageTest extends BrowserDriver {

    HPage hPage = null;


    @BeforeMethod
    public void initializedPages (){
        hPage = PageFactory.initElements(driver,HPage.class);
    }

   @Test
 public void testClickdesigner(){
        hPage.clickdesigner();
        String actualTitle = hPage.getDesignPagetitle();
       Assert.assertEquals(actualTitle, "SHOP BY DESIGNERS AND FASHION BRANDS");
   }
    @Test
   public void testSearchbox() throws InterruptedException {
      hPage.Searchbox();
      String actualDressQunatity = hPage.getDressQuantity();
      Assert.assertEquals(actualDressQunatity,"1,015 items");
    }

    @Test
    public void testMouseover() throws InterruptedException{
        hPage.mouseOver();
        String actualWomenlist = hPage.getWomenBtitle();
        Assert.assertEquals(actualWomenlist,"Boutiques");
    }

    @Test
    public void testClicknewArrival(){
        hPage.clickonNewarrival();
    }

}
