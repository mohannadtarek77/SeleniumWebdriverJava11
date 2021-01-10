package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {
    private WebDriver driver;
    private By triggerAlertButtton = By.xpath(".//button[text()='Click for JS Alert']");
    private By triggerConfirmButtton = By.xpath(".//button[text()='Click for JS Confirm']");
    private By triggerPromptButtton = By.xpath(".//button[text()='Click for JS Prompt']");

    private By results = By.id("result");


    public AlertsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void triggerAlert() {
        driver.findElement(triggerAlertButtton).click();
    }

    public void triggerConfirm() {
        driver.findElement(triggerConfirmButtton).click();
    }

    public void triggerPrompt() {
        driver.findElement(triggerPromptButtton).click();
    }

    public void alert_clickToAccept() {
        driver.switchTo().alert().accept();
    }

    public void alert_clickToDismiss() {
        driver.switchTo().alert().dismiss();
    }

    public String alert_getText() {
        return driver.switchTo().alert().getText();
    }

    public void alert_setInput(String text) {
        driver.switchTo().alert().sendKeys(text);
    }

    public String getResult() {
        return driver.findElement(results).getText();
    }
}