package page_objects_test;

import browserdriver.BrowserDriver;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import page_objects.HomePage;
import page_objects.TransformationPage;

public class HomePageTest extends BrowserDriver  {
    HomePage homePage = null;
    TransformationPage transformationPage = null;

   @Test
    public void SearchboxTest() {
       homePage.clickSearchbutton();
       //homePage.getPageTitle();
//        homePage.PopUp();
//

       //}
//    @Test
//    public void PopUpTest(){
//        //driver.findElement(By.className("close-cross")).click();
//       homePage.PopUp();
//    }
   }
   @Test
    public void TransferTest(){
       transformationPage.clickTransfer();

   }
}
