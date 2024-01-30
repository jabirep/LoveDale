package LessonPlan;
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
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class AnnualLessonPlan {
	
	LogStatus status;
	ExtentReports report=new ExtentReports("/home/jabir/My-eclipse/TestNG_Framework/test-output/EXTEND_REPORT/REPORT.html");
	ExtentTest logger=report.startTest("Browser started", "firefox browser");
	
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  
  @BeforeMethod
  public void setUp() {
    driver = new FirefoxDriver();
    logger.log(LogStatus.INFO, "Browser started up and running ");

    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  
  @AfterMethod
  public void tearDown() {
    driver.quit();
    logger.log(LogStatus.INFO, "Browser closed");
	report.flush();
  }
  @org.testng.annotations.Test
  public void test1() throws InterruptedException {
    driver.get("http://65.2.69.85:8080/smartcampus/login");
    logger.log(LogStatus.INFO, "application started up and running");
    logger.log(LogStatus.INFO, "reached login page");
    driver.manage().window().setSize(new Dimension(1310, 741));
    driver.findElement(By.name("username")).sendKeys("annamma");
    driver.findElement(By.id("pass")).click();
    driver.findElement(By.id("pass")).sendKeys("passwd");
    logger.log(LogStatus.INFO, "user enter username and password");
    driver.findElement(By.cssSelector(".row")).click();
    driver.findElement(By.name("captcha")).click();
    Thread.sleep(8000);
    //driver.findElement(By.name("captcha")).sendKeys("74172");
    driver.findElement(By.cssSelector(".btn")).click();
    logger.log(LogStatus.INFO, "succcesfully logged into lesson plan");

    Thread.sleep(8000);
    driver.findElement(By.xpath("//a[@id='annual']")).click();
    Thread.sleep(5000);
    driver.findElement(By.id("annual")).click();
    Thread.sleep(5000);

    driver.findElement(By.id("addNewButtonText")).click();
    driver.findElement(By.id("classDivDetailsDropdown")).click();
    {
      WebElement dropdown = driver.findElement(By.id("classDivDetailsDropdown"));
      dropdown.findElement(By.xpath("//option[. = 'X B']")).click();
    }
    driver.findElement(By.cssSelector("option:nth-child(38)")).click();
    driver.findElement(By.id("subjectDivDetailsDropdown")).click();
    {
      WebElement dropdown = driver.findElement(By.id("subjectDivDetailsDropdown"));
      dropdown.findElement(By.xpath("//option[. = 'English']")).click();
    }
    driver.findElement(By.cssSelector("#subjectDivDetailsDropdown > option:nth-child(2)")).click();
    driver.findElement(By.id("chapterWiseList0.month")).click();
    {
      WebElement dropdown = driver.findElement(By.id("chapterWiseList0.month"));
      dropdown.findElement(By.xpath("//option[. = 'January']")).click();
    }

    driver.findElement(By.cssSelector("#chapterWiseList0\\.month > option:nth-child(2)")).click();
    driver.findElement(By.id("chapterWiseList0.workingDays")).click();
    driver.findElement(By.id("chapterWiseList0.workingDays")).sendKeys("23");
    driver.findElement(By.id("chapterWiseList0.chapterName")).click();
    driver.findElement(By.id("chapterWiseList0.chapterName")).sendKeys("chapter 1");
    driver.findElement(By.id("chapterWiseList0.activities")).click();
    driver.findElement(By.id("chapterWiseList0.activities")).sendKeys("activities");
    driver.findElement(By.id("chapterWiseList0.remarks")).click();
    driver.findElement(By.id("chapterWiseList0.remarks")).sendKeys("remarks");
    driver.findElement(By.cssSelector(".float-end")).click();
    logger.log(LogStatus.INFO, "added a new annual lesson plan");

    Thread.sleep(8000);

    driver.findElement(By.cssSelector("tr:nth-child(1) .fa-edit")).click();
   // assertThat(driver.switchTo().alert().getText(), is("Do you want to update?"));
    driver.switchTo().alert().accept();
    Thread.sleep(5000);

    driver.findElement(By.id("chapterWiseList0.month")).click();
    {
      WebElement dropdown = driver.findElement(By.id("chapterWiseList0.month"));
      dropdown.findElement(By.xpath("//option[. = 'February']")).click();
    }
    driver.findElement(By.cssSelector("#chapterWiseList0\\.month > option:nth-child(3)")).click();
    driver.findElement(By.id("classDivDetailsDropdown")).click();
    {
      WebElement dropdown = driver.findElement(By.id("classDivDetailsDropdown"));
      dropdown.findElement(By.xpath("//option[. = 'X A']")).click();
    }
    driver.findElement(By.cssSelector("option:nth-child(37)")).click();
    driver.findElement(By.id("subjectDivDetailsDropdown")).click();
    {
      WebElement dropdown = driver.findElement(By.id("subjectDivDetailsDropdown"));
      dropdown.findElement(By.xpath("//option[. = 'Hindi']")).click();
    }
    driver.findElement(By.cssSelector("#subjectDivDetailsDropdown > option:nth-child(4)")).click();
    driver.findElement(By.id("chapterWiseList0.workingDays")).click();
    driver.findElement(By.id("chapterWiseList0.workingDays")).clear();

    driver.findElement(By.id("chapterWiseList0.workingDays")).sendKeys("25");
    driver.findElement(By.id("chapterWiseList0.chapterName")).click();
    driver.findElement(By.id("chapterWiseList0.chapterName")).sendKeys("chapter 2");
    driver.findElement(By.id("chapterWiseList0.activities")).click();
    driver.findElement(By.id("chapterWiseList0.activities")).sendKeys("activities 1");
    driver.findElement(By.id("chapterWiseList0.remarks")).click();
    driver.findElement(By.id("chapterWiseList0.remarks")).sendKeys("remarks 1");
    driver.findElement(By.cssSelector(".float-end")).click();
    logger.log(LogStatus.INFO, "edit and updated the annual lesson plan");

    Thread.sleep(8000);

    driver.findElement(By.cssSelector("tr:nth-child(1) .fa-solid")).click();
    //assertThat(driver.switchTo().alert().getText(), is("Do you want to Submit?"));
    driver.switchTo().alert().accept();
    logger.log(LogStatus.INFO, "submitted annual lesson plan");

    Thread.sleep(8000);

//    driver.findElement(By.cssSelector("tr:nth-child(1) .btn")).click();
//    Thread.sleep(5000);
//
//    driver.findElement(By.cssSelector("tr:nth-child(8) .fa")).click();
//    Thread.sleep(3000);
    driver.findElement(By.xpath("//tbody/tr[1]/td[6]/a[1]"));
    logger.log(LogStatus.INFO, "viewed plan details");

    driver.findElement(By.linkText("Approve")).click();
    //assertThat(driver.switchTo().alert().getText(), is("Do You Want To Approve?"));
    driver.switchTo().alert().accept();
    logger.log(LogStatus.INFO, "principal approved the plan");

    Thread.sleep(8000);

    driver.findElement(By.cssSelector("tr:nth-child(1) .btn-outline-primary > .fa")).click();
    Thread.sleep(5000);

    driver.findElement(By.cssSelector("tr:nth-child(7) .fa")).click();
    Thread.sleep(5000);
    driver.findElement(By.linkText("Annual Lesson Plan")).click();
    System.out.println("annual lesson plan is approved");
    Thread.sleep(8000);
    
    driver.findElement(By.linkText("Annual Lesson Plan")).click();
    logger.log(LogStatus.INFO, "viewed list of added annual lesson plans");

    Thread.sleep(5000);
    
    driver.findElement(By.linkText("Approved AnnualPlan")).click();
    logger.log(LogStatus.INFO, "go to approved tab and viewed list of all approved plans");

    Thread.sleep(8000);
    
    driver.findElement(By.cssSelector("tr:nth-child(11) .fa")).click();
    Thread.sleep(5000);
    
    driver.findElement(By.id("regRejected")).click();
    logger.log(LogStatus.INFO, "go to rejected tab and viewed list of all rejected plans");

    Thread.sleep(8000);

  }
}
