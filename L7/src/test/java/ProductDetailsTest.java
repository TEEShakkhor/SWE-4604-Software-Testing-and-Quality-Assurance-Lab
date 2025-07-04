// Generated by Selenium IDE

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
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
public class ProductDetailsTest {
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
  public void productDetails() {
    driver.get("https://practicesoftwaretesting.com/#/auth/login");
    driver.manage().window().setSize(new Dimension(1552, 840));
    driver.findElement(By.cssSelector("*[data-test=\"email\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"email\"]")).sendKeys("customer@practicesoftwaretesting.com");
    driver.findElement(By.cssSelector("*[data-test=\"password\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"password\"]")).sendKeys("welcome01");
    driver.findElement(By.cssSelector("*[data-test=\"login-submit\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"nav-home\"]")).click();
    {
      WebElement element = driver.findElement(By.cssSelector("*[data-test=\"nav-home\"]"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.cssSelector(".card:nth-child(3) .card-img-top")).click();
    driver.findElement(By.cssSelector("*[data-test=\"increase-quantity\"]")).click();
    driver.findElement(By.cssSelector(".fa-minus")).click();
    driver.findElement(By.cssSelector("*[data-test=\"add-to-cart\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"add-to-favorites\"]")).click();
  }
}
