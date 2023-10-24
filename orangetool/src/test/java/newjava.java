import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class newjava{
    WebDriver driver;
    @BeforeClass
    public void test1(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test(groups ={"view_web_page"},priority = 1)
    void view_web_page(){
       driver.get("https://qa.orangetoolz.net/contact-us/");
    }

    @Test(groups ={"Testing Scroll down to element"},priority = 2)
    void scroll_down_element() throws InterruptedException {

            JavascriptExecutor js = (JavascriptExecutor) driver; // First step  to scroll down
            WebElement contact_us = driver.findElement(By.xpath(" /html/body/div/div[2]/div/div/main/article/div/div/div[2]/div/div[2]/div/h2")); // Find the element where wanted to stop
            js.executeScript("arguments[0].scrollIntoView()", contact_us); // Scroll down  till element by
        Thread.sleep(2000);

    }

    @Test(groups ={"Contact_us "},priority = 3)
    void full_form_submit(){

        // Contact us form fill up
        WebElement contact_us1= (WebElement) driver.findElement(By.xpath("/html/body/div/div[2]/div/div/main/article/div/div/div[2]/div/div[4]/div/div[2]/div[1]/div/div/form/div[1]/div[1]/input"));
        contact_us1.sendKeys("Md Murad Alahi");

        WebElement contact_us2= (WebElement) driver.findElement(By.xpath("/html/body/div/div[2]/div/div/main/article/div/div/div[2]/div/div[4]/div/div[2]/div[1]/div/div/form/div[1]/div[2]/input"));
        contact_us2.sendKeys("Misu");

        WebElement contact_us3= (WebElement) driver.findElement(By.xpath(" /html/body/div/div[2]/div/div/main/article/div/div/div[2]/div/div[4]/div/div[2]/div[1]/div/div/form/div[1]/div[3]/input"));
        contact_us3.sendKeys("muradmisu663@gmail.com");

        WebElement contact_us4= (WebElement) driver.findElement(By.xpath(" /html/body/div/div[2]/div/div/main/article/div/div/div[2]/div/div[4]/div/div[2]/div[1]/div/div/form/div[1]/div[4]/textarea"));
        contact_us4.sendKeys(" I want to know more about your business please contact with me");

        WebElement contact_us5= (WebElement) driver.findElement(By.xpath("/html/body/div/div[2]/div/div/main/article/div/div/div[2]/div/div[4]/div/div[2]/div[1]/div/div/form/div[1]/div[5]/ul/li/input"));
        contact_us5.click();

        WebElement contact_us6= (WebElement) driver.findElement(By.xpath("/html/body/div/div[2]/div/div/main/article/div/div/div[2]/div/div[4]/div/div[2]/div[1]/div/div/form/div[3]/button"));
        contact_us6.click(); // Click on submit button
        // allure generate target/allure-results (in terminal)

    }
    @AfterClass
    public void windowhandle() throws InterruptedException {
        //Thread.sleep(20000);
        driver.quit();
    }
}
