// Generated by Selenium IDE
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class ContactPageTest {
  private static WebDriver driver;
  private static Map<String, Object> vars;
  static JavascriptExecutor js;
  @BeforeAll
  public static void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    System.setProperty("webdriver.chrome.driver", "E:\\Lab works\\6th Semester\\Testing_QA\\chromedriver-win64\\chromedriver.exe");
    vars = new HashMap<String, Object>();
  }
  @AfterAll
  public static void tearDown() {
    driver.quit();
  }

  @AfterEach
  public void refreshPage(){
      driver.navigate().refresh();
  }
  @Test
  public void contact() {
    driver.get("https://practicesoftwaretesting.com/#/contact");
    driver.manage().window().setSize(new Dimension(1552, 840));
    driver.findElement(By.cssSelector("*[data-test=\"first-name\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"first-name\"]")).sendKeys("Jane");
    driver.findElement(By.cssSelector("*[data-test=\"last-name\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"last-name\"]")).sendKeys("Doe");
    driver.findElement(By.cssSelector("*[data-test=\"email\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"email\"]")).sendKeys("customer@practicesoftwaretesting.com");
    driver.findElement(By.cssSelector("*[data-test=\"subject\"]")).click();
    {
      WebElement dropdown = driver.findElement(By.cssSelector("*[data-test=\"subject\"]"));
      dropdown.findElement(By.xpath("//option[. = 'Payments']")).click();
    }
    driver.findElement(By.cssSelector("*[data-test=\"message\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"message\"]")).sendKeys("vsnovubnsvkjbskvhbbksdfvbkhfbvkjbfdkjvbdkjvbkjdfbvkjbdfkvjbdjkfvbkjbkvfjdbjkdfv");
    driver.findElement(By.cssSelector("*[data-test=\"contact-submit\"]")).click();
  }
}
