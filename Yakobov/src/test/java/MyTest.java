import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MyTest {
    private static WebDriver driver;
    @BeforeClass
    public static  void  bc() {
        System.setProperty("webdriver.chrome.driver", "C:\\לא למחוק קשור ללימודי אוטומציה\\chromedriver.exe");
         driver = new ChromeDriver();
        driver.get("https://translate.google.co.il/?hl=iw");


    }
        @Test
    public void test01_login(){
        driver.findElement (By.tagName("input")).click();


        }
}
