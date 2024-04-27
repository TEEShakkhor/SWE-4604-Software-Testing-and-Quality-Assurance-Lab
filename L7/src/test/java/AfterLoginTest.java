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

public class AfterLoginTest {
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
  public void profilePage() {
    driver.get("https://practicesoftwaretesting.com/#/auth/login");
    driver.manage().window().setSize(new Dimension(1552, 840));
    driver.findElement(By.cssSelector("*[data-test=\"email\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"email\"]")).sendKeys("customer@practicesoftwaretesting.com");
    driver.findElement(By.cssSelector("*[data-test=\"password\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"password\"]")).sendKeys("welcome01");
    driver.findElement(By.cssSelector("*[data-test=\"login-submit\"]")).click();
    driver.findElement(By.cssSelector(".fa-address-card")).click();
  }
  @Test
  public void buyNowPayLater() {
    driver.get("https://practicesoftwaretesting.com/#/auth/login");
    driver.manage().window().setSize(new Dimension(1552, 840));
    driver.findElement(By.cssSelector("*[data-test=\"email\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"email\"]")).sendKeys("customer@practicesoftwaretesting.com");
    driver.findElement(By.cssSelector("*[data-test=\"password\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"password\"]")).sendKeys("welcome01");
    driver.findElement(By.cssSelector("*[data-test=\"login-submit\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"nav-home\"]")).click();
    driver.findElement(By.cssSelector(".card:nth-child(8) .card-img-top")).click();
    driver.findElement(By.cssSelector("*[data-test=\"add-to-cart\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"cart-quantity\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"proceed-1\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"proceed-2\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"state\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"state\"]")).sendKeys("f");
    driver.findElement(By.cssSelector("*[data-test=\"postcode\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"postcode\"]")).sendKeys("3");
    driver.findElement(By.cssSelector("*[data-test=\"proceed-3\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"payment-method\"]")).click();
    {
      WebElement dropdown = driver.findElement(By.cssSelector("*[data-test=\"payment-method\"]"));
      dropdown.findElement(By.xpath("//option[. = 'Buy Now Pay Later']")).click();
    }
    driver.findElement(By.cssSelector("*[data-test=\"monthly_installments\"]")).click();
    {
      WebElement dropdown = driver.findElement(By.cssSelector("*[data-test=\"monthly_installments\"]"));
      dropdown.findElement(By.xpath("//option[. = '12 monthly installments']")).click();
    }
    driver.findElement(By.cssSelector("*[data-test=\"finish\"]")).click();
  }
  @Test
  public void payWithCreditCard() {
    driver.get("https://practicesoftwaretesting.com/#/auth/login");
    driver.manage().window().setSize(new Dimension(1552, 840));
    driver.findElement(By.cssSelector("*[data-test=\"email\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"email\"]")).sendKeys("customer@practicesoftwaretesting.com");
    driver.findElement(By.cssSelector("*[data-test=\"password\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"password\"]")).sendKeys("welcome01");
    driver.findElement(By.cssSelector("*[data-test=\"login-submit\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"nav-home\"]")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".card:nth-child(2) .card-img-top"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.cssSelector(".card:nth-child(9) .card-img-top")).click();
    driver.findElement(By.cssSelector("*[data-test=\"add-to-cart\"]")).click();
    {
      WebElement element = driver.findElement(By.cssSelector("*[data-test=\"nav-menu\"]"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.cssSelector(".nav-link > .fa")).click();
    {
      WebElement element = driver.findElement(By.cssSelector("*[data-test=\"nav-menu\"]"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.cssSelector("*[data-test=\"proceed-1\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"proceed-2\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"state\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"state\"]")).sendKeys("c");
    driver.findElement(By.cssSelector("*[data-test=\"postcode\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"postcode\"]")).sendKeys("2");
    driver.findElement(By.cssSelector("*[data-test=\"proceed-3\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"payment-method\"]")).click();
    {
      WebElement dropdown = driver.findElement(By.cssSelector("*[data-test=\"payment-method\"]"));
      dropdown.findElement(By.xpath("//option[. = 'Credit Card']")).click();
    }
    driver.findElement(By.cssSelector("*[data-test=\"credit_card_number\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"credit_card_number\"]")).sendKeys("0000-0000-0000-0000");
    driver.findElement(By.cssSelector("*[data-test=\"expiration_date\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"expiration_date\"]")).sendKeys("09/2027");
    driver.findElement(By.cssSelector("*[data-test=\"cvv\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"cvv\"]")).sendKeys("233");
    {
      WebElement element = driver.findElement(By.cssSelector("*[data-test=\"card_holder_name\"]"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector("*[data-test=\"card_holder_name\"]"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector("*[data-test=\"card_holder_name\"]"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    driver.findElement(By.cssSelector("*[data-test=\"card_holder_name\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"card_holder_name\"]")).sendKeys("tawfiq");
    driver.findElement(By.cssSelector("*[data-test=\"finish\"]")).click();
  }
  @Test
  public void favouritePage() {
    driver.get("https://practicesoftwaretesting.com/#/auth/login");
    driver.manage().window().setSize(new Dimension(1552, 840));
    driver.findElement(By.cssSelector("*[data-test=\"email\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"email\"]")).sendKeys("customer@practicesoftwaretesting.com");
    driver.findElement(By.cssSelector("*[data-test=\"password\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"password\"]")).sendKeys("welcome01");
    driver.findElement(By.cssSelector("*[data-test=\"login-submit\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"nav-favorites\"]")).click();
  }
}
