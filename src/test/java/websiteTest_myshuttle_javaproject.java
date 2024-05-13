import com.sun.source.tree.AssertTree;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class websiteTest_myshuttle_javaproject extends base {

    @Test
    public void googleImageTest() throws InterruptedException {
        driver.get("https://www.google.com");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Assert.assertTrue(driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed());

    }

/*    @Test
    public void myShuttleTitleCheck() throws InterruptedException {
        driver.get("https://rafi-javawebapp-1.azurewebsites.net/myshuttledev/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        String text1=driver.findElement(By.xpath("//title[normalize-space()='MyShuttle Login']")).getText();
        String text2="MyShuttle Login";
        Assert.assertEquals(text1,text2);
    }

    @Test
    public void myShuttleImageExists() throws InterruptedException {
        driver.get("https://cicddockerwebapprafi.azurewebsites.net/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Assert.assertTrue(driver.findElement(By.xpath("//img[@src='Content/Images/logologin.png']")).isDisplayed());
    }
    @Test
    public void loginErrorVerify() throws InterruptedException {
        driver.get("https://cicddockerwebapprafi.azurewebsites.net/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@value='Log in']")).click();
        Thread.sleep(2000);
        String errorText= driver.findElement(By.xpath("//div[@id='bodyHeadline']")).getText();
        Assert.assertTrue(errorText.contains("500"));
    }*/
}
