package Dropdown;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropdownTests extends BaseTests {
    @Test
    public void testSelectOption() {
        var dropdownPage = homePage.clickDropDown();
        String option = "Option 1";
        dropdownPage.selectFromDropDown(option);
        var selectedOptions = dropdownPage.getSelectedOptions();
        assertEquals(selectedOptions.size(), 1, "Incorrect number of selections ");
        assertTrue(selectedOptions.contains(option), "Option not selected");
    }
}
