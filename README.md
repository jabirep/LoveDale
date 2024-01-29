# LoveDale
automation test script for smart campus project

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
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class AnnualLessonPlan2 {
LogStatus status;
ExtentReports report=new ExtentReports("/home/jabir/My-eclipse/TestNG_Framework/test-output/EXTEND_REPORT/REPORT.html");
ExtentTest logger=report.startTest("approve and reject scenario", "firefox browser");
private WebDriver driver;
private Map<String, Object> vars;
JavascriptExecutor js;
@BeforeClass
public void setUp() throws InterruptedException 
{	driver = new FirefoxDriver();
 	js = (JavascriptExecutor) driver;
 	vars = new HashMap<String, Object>();
	driver.get("http://65.2.69.85:8080/smartcampus/login");
    logger.log(LogStatus.INFO, "application started up and running");
    logger.log(LogStatus.INFO, "reached login page");
    //driver.manage().window().setSize(new Dimension(1310, 741));
    driver.findElement(By.name("username")).sendKeys("annamma");
    driver.findElement(By.id("pass")).click();
    driver.findElement(By.id("pass")).sendKeys("passwd");
    logger.log(LogStatus.INFO, "user entered username and password");
    driver.findElement(By.cssSelector(".row")).click();
    driver.findElement(By.name("captcha")).click();
    Thread.sleep(8000);
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    logger.log(LogStatus.INFO, "succesfully logged into lesson plan");}
@AfterClass
public void tearDown() 
{driver.quit();
 logger.log(LogStatus.INFO, "Browser closed");
 report.flush();}

@Test(priority=0)
public void ApproveAnnualPlan() throws InterruptedException {
 Thread.sleep(8000);
 driver.findElement(By.id("annual")).click();
 Thread.sleep(5000);
 driver.findElement(By.id("addNewButtonText")).click();
 driver.findElement(By.id("classDivDetailsDropdown")).click();
 {
   WebElement dropdown = driver.findElement(By.id("classDivDetailsDropdown"));
   dropdown.findElement(By.xpath("//option[. = 'Play A']")).click();
 }
 driver.findElement(By.cssSelector("#classDivDetailsDropdown > option:nth-child(2)")).click();
 driver.findElement(By.id("classDivDetailsDropdown")).click();
 {
   WebElement dropdown = driver.findElement(By.id("classDivDetailsDropdown"));
   dropdown.findElement(By.xpath("//option[. = 'X A']")).click();
 }
 driver.findElement(By.cssSelector("option:nth-child(37)")).click();
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
 driver.findElement(By.id("chapterWiseList0.chapterName")).sendKeys("chapter name");
 driver.findElement(By.id("chapterWiseList0.activities")).click();
 driver.findElement(By.id("chapterWiseList0.activities")).sendKeys("activitiy");
 driver.findElement(By.id("chapterWiseList0.remarks")).click();
 driver.findElement(By.id("chapterWiseList0.remarks")).sendKeys("remark");
 driver.findElement(By.cssSelector(".float-end")).click();
 System.out.println("saved details");
 logger.log(LogStatus.INFO, "added new annual lesson plan");
 Thread.sleep(5000);
 driver.findElement(By.cssSelector("tr:nth-child(1) .btn-outline-primary > .fa")).click();
 //assertThat(driver.switchTo().alert().getText(), is("Do you want to update?"));
 driver.switchTo().alert().accept();
 Thread.sleep(5000);
 driver.findElement(By.id("classDivDetailsDropdown")).click();
 {
   WebElement dropdown = driver.findElement(By.id("classDivDetailsDropdown"));
   dropdown.findElement(By.xpath("//option[. = 'X B']")).click();
 }
 driver.findElement(By.cssSelector("option:nth-child(38)")).click();
 driver.findElement(By.id("subjectDivDetailsDropdown")).click();
 {
   WebElement dropdown = driver.findElement(By.id("subjectDivDetailsDropdown"));
   dropdown.findElement(By.xpath("//option[. = 'Computer']")).click();
 }
 driver.findElement(By.cssSelector("#subjectDivDetailsDropdown > option:nth-child(13)")).click();
 driver.findElement(By.id("chapterWiseList0.month")).click();
 {
   WebElement dropdown = driver.findElement(By.id("chapterWiseList0.month"));
   dropdown.findElement(By.xpath("//option[. = 'March']")).click();
 }
 driver.findElement(By.cssSelector("#chapterWiseList0\\.month > option:nth-child(4)")).click();
 driver.findElement(By.id("chapterWiseList0.workingDays")).click();
 driver.findElement(By.id("chapterWiseList0.workingDays")).clear();
 driver.findElement(By.id("chapterWiseList0.workingDays")).sendKeys("27");
 driver.findElement(By.id("chapterWiseList0.chapterName")).click();
 driver.findElement(By.id("chapterWiseList0.chapterName")).sendKeys("chapter name is updated");
 driver.findElement(By.id("chapterWiseList0.activities")).click();
 driver.findElement(By.id("chapterWiseList0.activities")).sendKeys("activitiy updated");
 driver.findElement(By.id("chapterWiseList0.remarks")).click();
 driver.findElement(By.id("chapterWiseList0.remarks")).sendKeys("remark updated");
 driver.findElement(By.cssSelector(".float-end")).click();
 Thread.sleep(5000);
 System.out.println("edited and updated");
 logger.log(LogStatus.INFO, "edited and updated plan");
 driver.findElement(By.cssSelector("tr:nth-child(1) .fa-solid")).click();
 driver.switchTo().alert().accept();
 System.out.println("submitted lesson plan");
 logger.log(LogStatus.INFO, "submitted plan to principal");
 Thread.sleep(5000);
 driver.findElement(By.cssSelector("tr:nth-child(1) .fa")).click();
 Thread.sleep(5000);
 System.out.println("viewed");
 logger.log(LogStatus.INFO, "principal viewed annual plan");
 driver.findElement(By.linkText("Approve")).click();
 driver.switchTo().alert().accept();
 System.out.println("approved");
 logger.log(LogStatus.INFO, "principal approved annual plan");
 Thread.sleep(5000);
 driver.findElement(By.linkText("Approved AnnualPlan")).click();
 Thread.sleep(5000);
 System.out.println("see list of approved plans");
 logger.log(LogStatus.INFO, "view list of all approved plan");
 driver.findElement(By.id("regRejected")).click();
 System.out.println("see list of rejected plans");
 logger.log(LogStatus.INFO, "view list of all rejected plans");
 Thread.sleep(5000);
 logger.log(LogStatus.INFO, "APPROVE SCENARIO IS COMPLETED");
}
@Test(priority=1)
public void RejectAnnualPlan() throws InterruptedException {
 Thread.sleep(5000);
 logger.log(LogStatus.INFO, "Reject scenario started");
 driver.findElement(By.id("annual")).click();
 Thread.sleep(5000);
 driver.findElement(By.id("addNewButtonText")).click();
 driver.findElement(By.id("classDivDetailsDropdown")).click();
 {
   WebElement dropdown = driver.findElement(By.id("classDivDetailsDropdown"));
   dropdown.findElement(By.xpath("//option[. = 'Play A']")).click();
 }
 driver.findElement(By.cssSelector("#classDivDetailsDropdown > option:nth-child(2)")).click();
 driver.findElement(By.id("classDivDetailsDropdown")).click();
 {
   WebElement dropdown = driver.findElement(By.id("classDivDetailsDropdown"));
   dropdown.findElement(By.xpath("//option[. = 'X A']")).click();
 }
 driver.findElement(By.cssSelector("option:nth-child(37)")).click();
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
 driver.findElement(By.id("chapterWiseList0.chapterName")).sendKeys("chapter name");
 driver.findElement(By.id("chapterWiseList0.activities")).click();
 driver.findElement(By.id("chapterWiseList0.activities")).sendKeys("activitiy");
 driver.findElement(By.id("chapterWiseList0.remarks")).click();
 driver.findElement(By.id("chapterWiseList0.remarks")).sendKeys("remark");
 driver.findElement(By.cssSelector(".float-end")).click();
 System.out.println("saved details");
 logger.log(LogStatus.INFO, "added new annual lesson plan");
 Thread.sleep(5000);
 driver.findElement(By.cssSelector("tr:nth-child(1) .btn-outline-primary > .fa")).click();
 driver.switchTo().alert().accept();
 Thread.sleep(5000);
 driver.findElement(By.id("classDivDetailsDropdown")).click();
 {
   WebElement dropdown = driver.findElement(By.id("classDivDetailsDropdown"));
   dropdown.findElement(By.xpath("//option[. = 'X B']")).click();
 }
 driver.findElement(By.cssSelector("option:nth-child(38)")).click();
 driver.findElement(By.id("subjectDivDetailsDropdown")).click();
 {
   WebElement dropdown = driver.findElement(By.id("subjectDivDetailsDropdown"));
   dropdown.findElement(By.xpath("//option[. = 'Computer']")).click();
 }
 driver.findElement(By.cssSelector("#subjectDivDetailsDropdown > option:nth-child(13)")).click();
 driver.findElement(By.id("chapterWiseList0.month")).click();
 {
   WebElement dropdown = driver.findElement(By.id("chapterWiseList0.month"));
   dropdown.findElement(By.xpath("//option[. = 'March']")).click();
 }
 driver.findElement(By.cssSelector("#chapterWiseList0\\.month > option:nth-child(4)")).click();
 driver.findElement(By.id("chapterWiseList0.workingDays")).click();
 driver.findElement(By.id("chapterWiseList0.workingDays")).clear();
 driver.findElement(By.id("chapterWiseList0.workingDays")).sendKeys("27");
 driver.findElement(By.id("chapterWiseList0.chapterName")).click();
 driver.findElement(By.id("chapterWiseList0.chapterName")).sendKeys("chapter name is updated");
 driver.findElement(By.id("chapterWiseList0.activities")).click();
 driver.findElement(By.id("chapterWiseList0.activities")).sendKeys("activitiy updated");
 driver.findElement(By.id("chapterWiseList0.remarks")).click();
 driver.findElement(By.id("chapterWiseList0.remarks")).sendKeys("remark updated");
 driver.findElement(By.cssSelector(".float-end")).click();
 Thread.sleep(5000);
 System.out.println("edited and updated");
 logger.log(LogStatus.INFO, "edited and updated plan");
 driver.findElement(By.cssSelector("tr:nth-child(1) .fa-solid")).click();
 Thread.sleep(5000);
 driver.switchTo().alert().accept();
 System.out.println("submitted lesson plan");
 logger.log(LogStatus.INFO, "submitted plan to principal");
 Thread.sleep(5000);
 driver.findElement(By.cssSelector("tr:nth-child(1) .btn")).click();
 Thread.sleep(5000);
 logger.log(LogStatus.INFO, "view submitted plan by principal");
 driver.findElement(By.id("annualRejectStatus")).click();
 Thread.sleep(5000);
 driver.switchTo().alert().accept();
 logger.log(LogStatus.INFO, "click on reject the submitted plan by principal");
 driver.findElement(By.name("princiRejectionRemarks")).click();
 Thread.sleep(5000);
 driver.findElement(By.name("princiRejectionRemarks")).sendKeys("rejecte remark");
 driver.findElement(By.cssSelector(".btn-primary")).click();
 Thread.sleep(5000);
 logger.log(LogStatus.INFO, "principal added remark for rejection");
 logger.log(LogStatus.INFO, "succesfully rejected annual plan by principal");
 logger.log(LogStatus.INFO, "REJECT SCENARIO IS COMPLETED");
 driver.findElement(By.id("annual")).click();
 Thread.sleep(5000);
}
@Test(priority=2)
public void DeleteAnnualPlan() throws InterruptedException {
	logger.log(LogStatus.INFO, "DELETE ANNUAL PLAN SCENARIO STARTED");
	driver.findElement(By.id("annual")).click();
	Thread.sleep(4000);
    driver.findElement(By.id("addNewButtonText")).click();
	Thread.sleep(4000);
    driver.findElement(By.id("classDivDetailsDropdown")).click();
    {
      WebElement dropdown = driver.findElement(By.id("classDivDetailsDropdown"));
      dropdown.findElement(By.xpath("//option[. = 'LKG A']")).click();
    }
    driver.findElement(By.cssSelector("#classDivDetailsDropdown > option:nth-child(4)")).click();
    driver.findElement(By.id("subjectDivDetailsDropdown")).click();
    {
      WebElement dropdown = driver.findElement(By.id("subjectDivDetailsDropdown"));
      dropdown.findElement(By.xpath("//option[. = 'Malayalam Oral']")).click();
    }
    driver.findElement(By.cssSelector("#subjectDivDetailsDropdown > option:nth-child(4)")).click();
    driver.findElement(By.id("chapterWiseList0.month")).click();
    {
      WebElement dropdown = driver.findElement(By.id("chapterWiseList0.month"));
      dropdown.findElement(By.xpath("//option[. = 'February']")).click();
    }
    driver.findElement(By.cssSelector("#chapterWiseList0\\.month > option:nth-child(3)")).click();
    driver.findElement(By.id("chapterWiseList0.workingDays")).click();
    driver.findElement(By.id("chapterWiseList0.workingDays")).sendKeys("21");
    driver.findElement(By.cssSelector(".col-md-5")).click();
    driver.findElement(By.id("chapterWiseList0.chapterName")).click();
    driver.findElement(By.id("chapterWiseList0.chapterName")).sendKeys("rfhfg");
    driver.findElement(By.id("chapterWiseList0.activities")).click();
    driver.findElement(By.id("chapterWiseList0.activities")).sendKeys("jgjjj");
    driver.findElement(By.id("chapterWiseList0.remarks")).click();
    driver.findElement(By.id("chapterWiseList0.remarks")).sendKeys("jgfjgj");
    driver.findElement(By.cssSelector(".float-end")).click();
    logger.log(LogStatus.INFO, "added a new lesson plan");
	Thread.sleep(4000);
    driver.findElement(By.cssSelector("tr:nth-child(1) .btn-outline-danger > .fa")).click();
	Thread.sleep(4000);
    driver.switchTo().alert().accept();
    logger.log(LogStatus.INFO, "successfully deleted the added annual plan");
	logger.log(LogStatus.INFO, "DELETE ANNUAL PLAN SCENARIO HAS BEEN COMPLETED");
	Thread.sleep(8000);
}
@Test(priority=3)
public void DeleteRejectedAnnualPlan() throws InterruptedException {
	logger.log(LogStatus.INFO, "DELETE REJECTED ANNUAL PLAN SCENARIO STARTED");
	driver.findElement(By.id("annual")).click();
	Thread.sleep(6000);
    driver.findElement(By.id("addNewButtonText")).click();
	Thread.sleep(4000);
    driver.findElement(By.id("classDivDetailsDropdown")).click();
    {
      WebElement dropdown = driver.findElement(By.id("classDivDetailsDropdown"));
      dropdown.findElement(By.xpath("//option[. = 'LKG A']")).click();
    }
    driver.findElement(By.cssSelector("#classDivDetailsDropdown > option:nth-child(4)")).click();
    driver.findElement(By.id("subjectDivDetailsDropdown")).click();
    {
      WebElement dropdown = driver.findElement(By.id("subjectDivDetailsDropdown"));
      dropdown.findElement(By.xpath("//option[. = 'Malayalam Oral']")).click();
    }
    driver.findElement(By.cssSelector("#subjectDivDetailsDropdown > option:nth-child(4)")).click();
    driver.findElement(By.id("chapterWiseList0.month")).click();
    {
      WebElement dropdown = driver.findElement(By.id("chapterWiseList0.month"));
      dropdown.findElement(By.xpath("//option[. = 'February']")).click();
    }
    driver.findElement(By.cssSelector("#chapterWiseList0\\.month > option:nth-child(3)")).click();
    driver.findElement(By.id("chapterWiseList0.workingDays")).click();
    driver.findElement(By.id("chapterWiseList0.workingDays")).sendKeys("21");
    driver.findElement(By.cssSelector(".col-md-5")).click();
    driver.findElement(By.id("chapterWiseList0.chapterName")).click();
    driver.findElement(By.id("chapterWiseList0.chapterName")).sendKeys("rfhfg");
    driver.findElement(By.id("chapterWiseList0.activities")).click();
    driver.findElement(By.id("chapterWiseList0.activities")).sendKeys("jgjjj");
    driver.findElement(By.id("chapterWiseList0.remarks")).click();
    driver.findElement(By.id("chapterWiseList0.remarks")).sendKeys("jgfjgj");
    driver.findElement(By.cssSelector(".float-end")).click();
    logger.log(LogStatus.INFO, "added a new lesson plan");
	Thread.sleep(4000);
	driver.findElement(By.cssSelector("tr:nth-child(1) .fa-solid")).click();
	Thread.sleep(4000);
    driver.switchTo().alert().accept();
    logger.log(LogStatus.INFO, "submitted annual plan");
    Thread.sleep(5000);
    driver.findElement(By.cssSelector("tr:nth-child(1) .fa")).click();
    logger.log(LogStatus.INFO, "view submitted plan");
	Thread.sleep(7000);
    driver.findElement(By.xpath("//button[@id='annualRejectStatus']")).click();
	Thread.sleep(4000);
    driver.switchTo().alert().accept();
    driver.findElement(By.name("princiRejectionRemarks")).click();
	Thread.sleep(4000);
    driver.findElement(By.name("princiRejectionRemarks")).sendKeys("jfgj");
    driver.findElement(By.cssSelector(".btn-primary")).click();
    logger.log(LogStatus.INFO, "rejected submitted plan");
	Thread.sleep(4000);
    driver.findElement(By.id("annual")).click();
	Thread.sleep(4000);
	System.out.println("clicked annual tab");
    driver.findElement(By.cssSelector("tr:nth-child(1) .btn-outline-danger > .fa")).click();
	Thread.sleep(4000);
	System.out.println("clicked delete button");
    driver.switchTo().alert().accept();
	System.out.println("deleted");
    logger.log(LogStatus.INFO, "succesfully deleted rejected plan");
	logger.log(LogStatus.INFO, "DELETE REJECTED ANNUAL PLAN SCENARIO HAS BEEN COMPLETED");
	Thread.sleep(4000);
}
}
