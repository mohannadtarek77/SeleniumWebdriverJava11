package DynamicLoading;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WaitsTests extends BaseTests {

    @Test
    public void testWaitUntilHidden() {
        var loadingPage = homePage.clickDynamicLoading().clickExample1();
        loadingPage.clickStart();
        assertEquals(loadingPage.getLoadedText(), "Hello World!", "Loaded text incorrect");
    }
}
