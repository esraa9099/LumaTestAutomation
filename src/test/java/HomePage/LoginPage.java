package HomePage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.openqa.selenium.By.xpath;

public class LoginPage {
    @Test
    public void homePage (){

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        driver.get("https://magento.softwaretestingboard.com/");
        driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a")).click();
        driver.findElement(xpath("//*[@id=\"email\"]")).sendKeys("akimatmaksimowka@aircourriel.com");
        driver.findElement(xpath("//*[@id=\"pass\"]")).sendKeys("A@B123456*");
        driver.findElement(xpath("//*[@id=\"send2\"]/span")).click();


}}
