import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class websiteTest_cicddockerproject extends base {

    @Test
    public void WebsiteHomeTitle(){
        driver.get("https://cicddockerwebapprafi.azurewebsites.net/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[normalize-space()='building Web apps with ASP.NET Core']")).click();
        String text1=driver.findElement(By.xpath("//h1[@id='hero-title']")).getText();
        String text2="ASP.NET documentation";
        Assert.assertEquals(text1,text2);
    }
    @Test
    public void headersTestMenu1(){
        driver.get("https://cicddockerwebapprafi.azurewebsites.net/");
        driver.manage().window().maximize();
        Assert.assertTrue(driver.findElement(By.xpath("//a[normalize-space()='WebApplication5']")).isDisplayed());
    }
    @Test
    public void headersTestMenu2(){
        driver.get("https://cicddockerwebapprafi.azurewebsites.net/");
        driver.manage().window().maximize();
        Assert.assertTrue(driver.findElement(By.xpath("//a[normalize-space()='Home']")).isDisplayed());
    }
}
