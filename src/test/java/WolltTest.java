

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;



public class WolltTest {
    WebDriver driver;

    @BeforeClass
    public void openBrowser()
    {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");


        driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.get("https://wolt.com/he/discovery");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }
    @Test
    public void test01_po() throws InterruptedException {


        WebElement buttonAcceptCookies=driver.findElement(By.xpath("/html/body/div[5]/div/div/div/button[2]"));
        buttonAcceptCookies.click();

        WebElement buttonEnter=driver.findElement(By.xpath("//*[@id='mainContent']/div[1]/div/div[1]/header/div[2]/div[3]/div/div/button"));
        buttonEnter.click();
        Thread.sleep(3000);


        WebElement buttonContinueGoogle=driver.findElement(By.xpath("//*[contains(text(),'כניסה דרך גוגל')]"));
        buttonContinueGoogle.click();

        //anuther Page
        WebElement inputEmail=driver.findElement(By.id("identifierId"));
        inputEmail.sendKeys("ayala.revivo@verisoft.co");

        WebElement buttonNextEmail=driver.findElement(By.xpath("//*[@id='identifierNext']/div/button"));
        buttonNextEmail.click();


        Thread.sleep(3000);
        //anuther Page
        WebElement inputPass=driver.findElement(By.name("Passwd"));
        inputPass.sendKeys("AYALAREVIVO1!");

        WebElement buttonNextPass=driver.findElement(By.xpath("//*[@id='passwordNext']/div/button"));
        buttonNextPass.click();

        Thread.sleep(4000);
        Thread.sleep(4000);

        //anuther page
        WebElement buttonGiftCard=driver.findElement(By.xpath("//*[@id='mainContent']/div[3]/div/div/div[22]/div/div/div/div[4]/a"));
        buttonGiftCard.click();

//        $x("//*[@id='mainContent']/div[3]/div/div/div[22]/div/div/div/div[4]/a")
        Thread.sleep(4000);

        WebElement buttonAdd45=driver.findElement(By.xpath("//*[@id='app']/div[2]/div[1]/div[2]/main/div[4]/div/div[1]/div/div/div/div[3]/div[6]/div/div/div/button[3]"));
        buttonAdd45.click();

        Thread.sleep(4000);

        WebElement buttonViewOrder=driver.findElement(By.xpath("//*[@id='app']/div[2]/div[1]/div[1]/div[1]/div/div/header/div[2]/div[3]/div/div/div/div/button"));
        buttonViewOrder.click();

        Thread.sleep(4000);

        WebElement buttonBeyondPayment=driver.findElement(By.xpath("//*[@id='app']/div[2]/div[2]/div[2]/div/aside/div[2]/div/div[1]/footer/div/div/button"));
        buttonBeyondPayment.click();

        Thread.sleep(4000);

        WebElement buttonPaymentDetails=driver.findElement(By.xpath("//*[@id='mainContent']/div[5]/div[2]/div[1]/ul[2]/li/a/div[3]"));
        buttonPaymentDetails.click();

        WebElement buttonSibus=driver.findElement(By.xpath("/html/body/div[11]/div/aside/div[2]/div/div[1]/div/div[3]/button"));
        buttonSibus.click();
        Thread.sleep(4000);

        WebElement buttonClickOrder=driver.findElement(By.xpath("//*[contains(text(),'לחצו להזמנה')]"));
        buttonClickOrder.click();
        Thread.sleep(4000);

        //page connect to sibus

//
        driver.switchTo().frame("cibus-frame");

        WebElement inputEmailSibus=driver.findElement(By.xpath("//*[@id='txtUserName']"));
        inputEmailSibus.sendKeys("ayala.revivo@verisoft.co");


        WebElement inputPassSibus=driver.findElement(By.id("txtPassword"));
        inputPassSibus.sendKeys("AYALAREVIVO1!");

        WebElement buttonLoginAccount=driver.findElement(By.id("btnSubmit"));
        buttonLoginAccount.click();


        WebElement buttonConfirmationPaymentSibus=driver.findElement(By.id("btnPay"));
        buttonConfirmationPaymentSibus.click();


        driver.switchTo().defaultContent();


        System.out.println("DONE");
    }



    @AfterClass
    public void closeBrowser()
    {
//        driver.quit();
    }



    }









