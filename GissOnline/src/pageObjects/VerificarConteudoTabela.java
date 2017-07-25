package pageObjects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import gissOnline.Main;
import utility.Repositorio;

public class VerificarConteudoTabela {
	
	
	Main varMain =  new Main();
	Repositorio varRepo = new Repositorio();
	WebDriver driver;
	
	public void verificarConteudoTabela (
			String varxPathTabelaColuna,
			String varxPathTabelaRow,
			String varNameColuna,
			String varValorPrimeiraColuna,
			String varValorEsperado) {
			
		int contA = 1;
		int contB = 1;
		boolean i =  true;
		this.driver = varRepo.driver;
		WebDriverWait delay = new WebDriverWait(driver, 10);
		WebElement varElemento; 
		
		while(i == true) {
			try {
				varElemento = driver.findElement(By.xpath(varxPathTabelaRow));
				assertEquals(varElemento.getAttribute("textContent"), varValorPrimeiraColuna);
				try {
					varElemento = driver.findElement(By.xpath(varxPathTabelaColuna));
					assertEquals(varElemento.getAttribute("textContent"), varNameColuna);
					break;
				} catch(AssertionError exB) {
					contA
					++;
					varRepo.setPosicaoTabela(contA, contB);
					varxPathTabelaColuna = varRepo.varTableColuna;
				}
			} catch(AssertionError exA) {
				contB++;
				varRepo.setPosicaoTabela(contA, contB);
				varxPathTabelaRow = varRepo.varTableRow;
			}
		}
		varRepo.clearVariaveis();
	}
}
