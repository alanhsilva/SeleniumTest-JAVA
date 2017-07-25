package pageObjects;

import org.testng.annotations.Test;

import utility.Repositorio;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;
import org.apache.commons.io.FileUtils;

public class PrintScreenObj {
	
	WebDriver driver;
	Repositorio varRepo = new Repositorio();
	
    public void printScreenObj() throws Exception
    {
    	this.driver = varRepo.driver;
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         //The below method will save the screen shot in d drive with name "screenshot.png"
        FileUtils.copyFile(scrFile, new File("C:\\Users\\alhonorio\\eclipse-workspace\\GissOnline\\ScrenShots\\screenshot.png"));
    }
}
