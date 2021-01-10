package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {
    WebDriver driver;
    private By hotSpot = By.id("hot-spot");

    public ContextMenuPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickRightClick() {
        WebElement HotSpot = driver.findElement(hotSpot);
        Actions actions = new Actions(driver);
        actions.contextClick(HotSpot).perform();
    }

    public String getText() {
        return driver.switchTo().alert().getText();
    }

    public void clickOK() {
        driver.switchTo().alert().accept();
    }
}
