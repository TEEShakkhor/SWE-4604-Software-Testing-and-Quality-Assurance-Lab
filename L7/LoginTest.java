// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class LoginTest {
  
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;

  @BeforeAll
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    System.setProperty("webdriver.chrome.driver", "E:\\Lab works\\6th Semester\\Testing_QA\\chromedriver-win64\\chromedriver.exe");
    vars = new HashMap<String, Object>();
  }
  @AfterAll
  public void tearDown() {
    driver.quit();
  }

  @AfterEach
  public void refreshPage(){
      driver.navigate().refresh();
  }
  @Test
  public void validlogin() {
    driver.get("https://practicesoftwaretesting.com/#/auth/login");
    driver.manage().window().setSize(new Dimension(1552, 840));
    driver.findElement(By.cssSelector("*[data-test=\"email\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"email\"]")).sendKeys("customer@practicesoftwaretesting.com");
    driver.findElement(By.cssSelector("*[data-test=\"password\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"password\"]")).sendKeys("welcome01");
    driver.findElement(By.cssSelector("*[data-test=\"login-submit\"]")).click();
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"menu\"]")));
    String actualUrl=chrome.getCurrentUrl();
    String expectedUrl="https://practicesoftwaretesting.com/#/account";
    assertEquals(expectedUrl,actualUrl);
  }
  @Test
  public void invalidPass() {
    driver.get("https://practicesoftwaretesting.com/#/auth/login");
    driver.manage().window().setSize(new Dimension(1552, 840));
    driver.findElement(By.cssSelector("*[data-test=\"email\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"email\"]")).sendKeys("customer@practicesoftwaretesting.com");
    driver.findElement(By.cssSelector("*[data-test=\"password\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"password\"]")).sendKeys("abc");
    driver.findElement(By.cssSelector("*[data-test=\"login-submit\"]")).click();
    WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/div/app-login/div/div/div/form/div[4]/div")));
    String expected="Invalid email or password";
    String actual=element.getText();
    assertEquals(expected,actual);
  }
  @Test
  public void invalidEmail() {
    driver.get("https://practicesoftwaretesting.com/#/auth/login");
    driver.manage().window().setSize(new Dimension(1552, 840));
    driver.findElement(By.cssSelector("*[data-test=\"email\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"email\"]")).sendKeys("abc@gmail.com");
    driver.findElement(By.cssSelector("*[data-test=\"password\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"password\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"password\"]")).sendKeys("welcome01");
    driver.findElement(By.cssSelector("*[data-test=\"login-submit\"]")).click();
    WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/div/app-login/div/div/div/form/div[4]/div")));
    String expected="Invalid email or password";
    String actual=element.getText();
    assertEquals(expected,actual);
  }
  @Test
  public void emptyPass() {
    driver.get("https://practicesoftwaretesting.com/#/auth/login");
    driver.manage().window().setSize(new Dimension(1552, 840));
    driver.findElement(By.cssSelector("*[data-test=\"email\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"email\"]")).sendKeys("customer@practicesoftwaretesting.com");
    driver.findElement(By.cssSelector("*[data-test=\"login-submit\"]")).click();
    WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/div/app-login/div/div/div/form/div[3]/div")));
    String expected="Password is required.";
    String actual=element.getText();
    assertEquals(expected,actual);
  }
  @Test
  public void emptyEmail() {
    driver.get("https://practicesoftwaretesting.com/#/auth/login");
    driver.manage().window().setSize(new Dimension(1552, 840));
    driver.findElement(By.cssSelector("*[data-test=\"password\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"password\"]")).sendKeys("welcome01");
    driver.findElement(By.cssSelector("*[data-test=\"login-submit\"]")).click();
    WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/div/app-login/div/div/div/form/div[2]/div")));
    String expected="E-mail is required.";
    String actual=element.getText();
    assertEquals(expected,actual);
  }
}
