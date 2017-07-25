package pageObjects;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import gissOnline.Main;
import utility.Repositorio;

public class ProcuraElementosID {
	Main varMain =  new Main();
	Repositorio varRepo = new Repositorio();
	WebDriver driver;
	
	public void procuraElementosID(String varID, String varTextoEsperado) {
		this.driver = varRepo.driver;
		WebElement varElemento =  driver.findElement(By.id(varID));
		assertTrue(varElemento.getAttribute("innerText").equals(varTextoEsperado));
	}
	
}
