package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private void clickLink(String linktext) {
        driver.findElement(By.linkText(linktext)).click();

    }

    public LoginPage clickFormAuthenticationLink() {
        clickLink("Form Authentication");
        return new LoginPage(driver);

    }

    public DropdownPage clickDropDown() {
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }

    public HoversPage clickHover() {
        clickLink("Hovers");
        return new HoversPage(driver);
    }

    public KeyPressesPage clickKeyPresses() {
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }

    public AlertsPage clickJavascriptAlerts() {
        clickLink("JavaScript Alerts");
        return new AlertsPage(driver);
    }

    public FileUploadPage clickFileUpload() {
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }

    public ContextMenuPage clickContextMenu() {
        clickLink("Context Menu");
        return new ContextMenuPage(driver);
    }
    public WYSIWYGEditorPage clickWYSIWYGEditor() {
        clickLink("WYSIWYG Editor");
        return new WYSIWYGEditorPage(driver);
    }
    public DynamicLoadingPage clickDynamicLoading(){
        clickLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }
}
