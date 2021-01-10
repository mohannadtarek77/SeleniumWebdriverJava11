package Alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {

    @Test
    public void testFileUpload() {
        var uploadPage = homePage.clickFileUpload();
        uploadPage.uploadFile("D:\\Mohannad's Resume\\MohannadTarek.pdf");
        assertEquals(uploadPage.getUploadedFiles(), "MohannadTarek.pdf", "Uploaded files is incorrect");
    }
}