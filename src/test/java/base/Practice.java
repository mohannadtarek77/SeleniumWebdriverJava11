package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Practice {
        private WebDriver driver;
        public void setUp(){
            System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
            driver=new ChromeDriver();
            driver.get("http://the-internet.herokuapp.com/");
            driver.manage().window().maximize();
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());

        WebElement inputsLink=driver.findElement(By.linkText("Inputs"));
        inputsLink.click();
        System.out.println(driver.getTitle());
        driver.quit();
        WebElement shiftingContentLink= driver.findElement(By.linkText("Shifting Content"));
        shiftingContentLink.click();
        WebElement menu= driver.findElement(By.linkText("Example 1: Menu Element"));
        menu.click();
        List<WebElement> boxes=driver.findElements(By.tagName("li"));
        System.out.println(boxes.size());
        }

        public static void main(String args[]){
            base.BaseTests test= new base.BaseTests();
            test.setUp();
        }
    }

