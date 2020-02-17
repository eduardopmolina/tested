package Edureka;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;
import java.io.File;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.exec.environment.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class FirstSeleniumScript {
	private WebDriver driver;
	private static Map<String, Object> vars;
	public class InstandaTest002Test {
		  private WebDriver driver;
		  private Map<String, Object> vars;
		  JavascriptExecutor js;
	};
	  public static String waitForWindow(int timeout) {
		    try {
		      Thread.sleep(timeout);
		    } catch (InterruptedException e) {
		      e.printStackTrace();
		    }
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		    Set<String> whNow = driver.getWindowHandles();
		    Set<String> whThen = (Set<String>) vars.get("window_handles");
		    if (whNow.size() > whThen.size()) {
		      whNow.removeAll(whThen);
		    }
		    return whNow.iterator().next();
		  };
		  
   
	  
public static void main(String[] args) throws InterruptedException{
	
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.get("https://design.instanda.us/Help/Home");
	
    driver.findElement(By.id("UserName")).click();
    driver.findElement(By.id("UserName")).sendKeys("Eduardo.Molina");
    driver.findElement(By.cssSelector(".col-lg-12")).click();
    driver.findElement(By.id("Password")).click();
    driver.findElement(By.id("Password")).sendKeys("EdMo2020!");
    driver.findElement(By.id("rememberMe")).click();
    driver.findElement(By.cssSelector(".btn")).click();
    
    driver.findElement(By.cssSelector(".messages-link")).click();
    driver.findElement(By.linkText("onlinepayment.instanda.us")).click();
    driver.findElement(By.id("publish_noValidate")).click();
    driver.getWindowHandles();
    driver.findElement(By.id("PublishTestSiteButton")).click();
    driver.getWindowHandle();
    //vars.put("win1427", waitForWindow(2000));
    driver.findElement(By.id("ViewTestButton")).click();
    driver.getWindowHandles();

    //vars.put("win3987", waitForWindow(2000));
    //driver.switchTo().window(vars.get("win3987").toString());
//    driver.findElement(By.id("WaitingOpaqueBox")).click();
 //   driver.findElement(By.cssSelector(".collapse")).click();
    
    String currentTab = driver.getWindowHandle();
    for (String tab : driver.getWindowHandles()) {
        if (!tab.equals(currentTab)) {
            driver.switchTo().window(tab); 
        }       
    }

    driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/nav/div/div[2]")).click();
    driver.findElement(By.linkText("Get a quote")).click();

    driver.findElement(By.linkText("Get a quote")).click();
    driver.findElement(By.id("AseguradoRutQQ")).click();
    driver.findElement(By.id("AseguradoRutQQ")).sendKeys("8.407224-9");
    driver.findElement(By.cssSelector(".radio:nth-child(1) > .instanda-unselected")).click();
    driver.findElement(By.id("TipoPlanYes")).click();
    driver.findElement(By.id("AseguradoCorreo")).click();
    driver.findElement(By.id("AseguradoCorreo")).sendKeys("eduardopmolina@hotmail.com");
    driver.findElement(By.id("clientequestion")).click();
    driver.findElement(By.id("clientequestion")).sendKeys("test2");
    driver.findElement(By.name("continueButton")).click();
    driver.findElement(By.cssSelector(".col-md-6:nth-child(1) .btn")).click();
    driver.findElement(By.id("AseguradoRut")).click();
    driver.findElement(By.id("AseguradoRut")).sendKeys("8407224-9");
    driver.findElement(By.id("AseguradoNombre")).click();
    driver.findElement(By.id("AseguradoNombre")).sendKeys("Ed");
    driver.findElement(By.id("AseguradoApellido")).click();
    driver.findElement(By.id("AseguradoApellido")).sendKeys("Molina");
    driver.findElement(By.id("AseguradoEstatura")).click();
    driver.findElement(By.id("AseguradoEstatura")).sendKeys("120");
    driver.findElement(By.id("AseguradoPeso")).click();
    driver.findElement(By.id("AseguradoPeso")).sendKeys("200");
    driver.findElement(By.name("continueButton")).click();
    driver.findElement(By.id("continueButton")).click();
    driver.findElement(By.id("AddressLine1")).click();
    driver.findElement(By.id("AddressLine1")).sendKeys("5530 Glen Erin Dr");
    driver.findElement(By.id("City")).sendKeys("Mississauga");
    driver.findElement(By.id("Postcode109336")).sendKeys("L5M 6E8");
    driver.findElement(By.id("FirstName")).sendKeys("Eduardo");
    driver.findElement(By.id("City")).click();
    driver.findElement(By.id("City")).click();
    {
      WebElement element = driver.findElement(By.id("City"));
      Actions builder = new Actions(driver);
      builder.doubleClick(element).perform();
    }
    driver.findElement(By.id("Postcode109336")).click();
    driver.findElement(By.id("Postcode109336")).click();
    driver.findElement(By.id("Title")).click();
    driver.findElement(By.id("Title")).click();
    driver.findElement(By.id("FirstName")).click();
    driver.findElement(By.id("FirstName")).click();
    {
      WebElement element = driver.findElement(By.id("FirstName"));
      Actions builder = new Actions(driver);
      builder.doubleClick(element).perform();
    }
    driver.findElement(By.id("LastName")).click();
    driver.findElement(By.id("LastName")).click();
    driver.findElement(By.id("PaymentType")).click();
    driver.findElement(By.name("continueButton")).click();
    driver.findElement(By.id("boltPayButton")).click();
    driver.switchTo().frame(0);
 //   vars.put("window_handles", driver.getWindowHandles());
    driver.findElement(By.cssSelector("form > .btn-primary")).click();
    //vars.put("win3099", waitForWindow(2000));
    driver.getWindowHandles();
    
//    driver.switchTo().window(vars.get("win3099").toString());

    String currentTab2 = driver.getWindowHandle();
    for (String tab2 : driver.getWindowHandles()) {
        if (!tab2.equals(currentTab2)) {
            driver.switchTo().window(tab2); 
        }       
    }
    
    driver.getWindowHandles();
    
    {
        WebElement element = driver.findElement(By.cssSelector("li:nth-child(4)"));
        Actions builder = new Actions(driver);
        builder.moveToElement(element).clickAndHold().perform();
      }
      {
        WebElement element = driver.findElement(By.cssSelector(".method:nth-child(2) > ul"));
        Actions builder = new Actions(driver);
        builder.moveToElement(element).release().perform();
      }

    
    driver.findElement(By.id("visa-card-show")).click();
    driver.findElement(By.id("visa-card-show")).sendKeys("4051885600446623");
    driver.findElement(By.name("month")).click();
    {
      WebElement dropdown = driver.findElement(By.name("month"));
      dropdown.findElement(By.xpath("//option[. = '07']")).click();
    }
    driver.findElement(By.name("month")).click();
    driver.findElement(By.name("year")).click();
    {
      WebElement dropdown = driver.findElement(By.name("year"));
      dropdown.findElement(By.xpath("//option[. = '2033']")).click();
    }
    driver.findElement(By.name("year")).click();
    driver.findElement(By.id("password-invalid")).click();
    driver.findElement(By.id("password-invalid")).sendKeys("123");
    driver.findElement(By.cssSelector(".button")).click();
    
    driver.findElement(By.cssSelector(".dues-option")).click();
    {
      WebElement dropdown = driver.findElement(By.cssSelector(".dues-option"));
      dropdown.findElement(By.xpath("//option[. = '15']")).click();
    }
    
    driver.getWindowHandles();

      {
        WebElement element = driver.findElement(By.cssSelector(".button"));
        Actions builder = new Actions(driver);
        builder.doubleClick(element).perform();
      }

      {
          WebElement element = driver.findElement(By.cssSelector(".button"));
          Actions builder = new Actions(driver);
          builder.click(element).perform();
       }
      
    driver.findElement(By.cssSelector(".button")).click();
    //driver.findElement(By.cssSelector("td:nth-child(1) > input:nth-child(1)")).click();
        for (Object element : driver.findElements(By.className("button new-marg next-padd"))) {
        	((WebElement) element).click();
        }
        //driver.findElement(By.cssSelector("td:nth-child(1) > input:nth-child(1)")).click();
        //driver.findElement(By.cssSelector("td > input")).click();
        
        driver.switchTo().frame(1);
        driver.findElement(By.id("rutClient")).click();
        driver.findElement(By.id("rutClient")).sendKeys("11.111.111-1");
        driver.findElement(By.id("passwordClient")).click();
        driver.findElement(By.id("passwordClient")).sendKeys("123");
        driver.findElement(By.cssSelector("td:nth-child(1) > input:nth-child(1)")).click();
        driver.findElement(By.cssSelector("td > input")).click();
       
        
        String logFileName = new SimpleDateFormat("yyyyMMddHHmm").format(new Date());
        
        TakesScreenshot ts = (TakesScreenshot)driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        try {
			FileUtils.copyFile(source, new File("./Screenshots/Screen" + logFileName + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("the Screenshot is taken");
        
        String currentTab3 = driver.getWindowHandle();
        for (String tab3 : driver.getWindowHandles()) {
        	driver.switchTo().window(tab3);
        	logFileName = new SimpleDateFormat("yyyyMMddHHmm").format(new Date());
            ts = (TakesScreenshot)driver;
            source = ts.getScreenshotAs(OutputType.FILE);
            try {
    			FileUtils.copyFile(source, new File("./Screenshots/Screen" + logFileName + ".png"));
    		} catch (IOException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
            System.out.println("the Screenshot is taken");
            if (!tab3.equals(currentTab3)){
                driver.switchTo().window(tab3); 
            }       
        }
        

        
        //driver.quit();
  }
} 
