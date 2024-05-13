import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class base {

    static WebDriver driver=null;

    @BeforeTest
    static void setupClass() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
//        options.setExperimentalOption("prefs", chromePrefs);
//        options.addArguments("--no-sandbox");
//        options.addArguments("--headless"); //!!!should be enabled for Jenkins
//        options.addArguments("--disable-dev-shm-usage"); //!!!should be enabled for Jenkins
//        options.addArguments("--window-size=1920x1080"); //!!!should be enabled for Jenkins
        driver = new ChromeDriver(options);
//        driver = new ChromeDriver();
    }

    @AfterTest
    void teardown() {
        driver.quit();
    }
}
