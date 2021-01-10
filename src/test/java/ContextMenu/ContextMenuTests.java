package ContextMenu;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextMenuTests extends BaseTests {
    @Test
    public void testVisibleText() {
        var contextMenuPage = homePage.clickContextMenu();
        contextMenuPage.clickRightClick();
        var text = contextMenuPage.getText();
        assertEquals(text, "You selected a context menu", "Alert text is incorrect");
    }

    @Test
    public void testClickOkOnAlert() {
        var contextMenuPage = homePage.clickContextMenu();
        contextMenuPage.clickRightClick();
        contextMenuPage.clickOK();

    }
}
