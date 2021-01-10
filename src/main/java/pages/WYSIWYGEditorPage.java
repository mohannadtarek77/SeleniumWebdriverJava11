package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WYSIWYGEditorPage {

    private WebDriver driver;
    private By editorIframeId = By.id("mce_0_ifr");
    private By textArea = By.id("tinymce");

    private By decreaseIndentButton = By.cssSelector("#mceu_12 button");

    public WYSIWYGEditorPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clearTextArea() {
        switchToEditArea();
        driver.findElement(textArea).clear();
        switchToMainArea();
    }

    public void setTextArea(String text) {

        switchToEditArea();
        driver.findElement(textArea).sendKeys(text);
        switchToMainArea();
    }

    public String getTextFromEditor() {
        switchToEditArea();
        String text = driver.findElement(textArea).getText();
        switchToMainArea();
        return text;
    }

    public void decreaseIndention() {
        driver.findElement(decreaseIndentButton).click();
    }

    private void switchToEditArea() {
        WebElement iframeID = driver.findElement(editorIframeId);
        driver.switchTo().frame(iframeID);
    }

    private void switchToMainArea() {
        driver.switchTo().parentFrame();
//        when clear happens it gets out of the iframe so i have go back again by switching again to parentFrame
    }
}