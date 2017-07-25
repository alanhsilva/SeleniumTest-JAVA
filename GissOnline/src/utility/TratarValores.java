package utility;

public class TratarValores {
	
	Repositorio varRepo = new Repositorio();
	
	public void tratarValores(String varValor, String varDivisorText) {
		int i = varValor.indexOf(varDivisorText);
		varValor = varValor.substring(i + 3);
		varValor = varValor.replace(",", ".");
		
		varRepo.varValue = Double.parseDouble(varValor);
		
	}

}
