package pageObjects;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import gissOnline.Main;
import utility.Repositorio;

public class ProcuraElementosxPath {
	Main varMain =  new Main();
	Repositorio varRepo = new Repositorio();
	WebDriver driver;
	
	public void procuraElementosxPath(String varxPath, String varTextoEsperado) {
		int cont = 1;
		boolean i =  true;
		this.driver = varRepo.driver;
		WebElement varElemento;
		
		WebDriverWait delay = new WebDriverWait(driver, 10);
		while(i == true) {
 			try {
 				varElemento = driver.findElement(By.xpath(varxPath));
 				assertEquals(varElemento.getAttribute("textContent"), varTextoEsperado);
 				varElemento.click();
 				break;
 			} catch(AssertionError ex) {
 				cont++;
 				varRepo.setPosicaoLimite(cont);
 				varxPath = varRepo.varModuloBotao;
 			}
 		}
		
		varRepo.clearVariaveis();
	}
	
}
