package utility;

import org.openqa.selenium.WebDriver;

public class Repositorio {

	static int varPosicaoA = 1;
	static int  varPosicaoB = 1;
	static String varLabel;
	public static double varValue = 0.00;
	/*Classe utilizada para armazenamento dos caminhos utilizados
	 *pelos objetos de testes das plataformas assim vinculados
	 *Separados pela forma de mapeamento para assim facilitar a 
	 *manutenção do mesmo*/
	
	//Nota: Todas as variaveis devem ser publicas

	//Parametros Globais
	public static String varDriverNav = "webdriver.gecko.driver";
	public static String varCaminhoDriver = "C:\\DriversNavegadores\\Firefox\\geckodriver.exe";
	public static String varCaminhoExeNav = "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe";
	public static String varURLDomain = "http://nova.giss.com.br/login/"; 
	
	
	//Variaveis a serem utilizadas em tempo de execução
	public static WebDriver driver;
	
	//Mapeado por ID
	public static String varEmailLogin = "inputEmail";
	public static String varSenhaLogin = "inputPassword";
	
	
	//Mapeado por Class
	
	
	//Mapeado por Type
	
	
	/* Mapeado por xPath */
	//Login
	public static String varBotaoSeguinte = "//div[@class=\"form-group\"]/button[@type=\"submit\"]";
	
	//Home Page
	public static String varMsgBoasVindas = "//div[@class=\"col-12 mt-3\"]/span";
	public static String varMenuModulos = "//li[@class=\"nav-item dropdown\"]/a/i";
	public static String varTituloModulo = "//div[@class=\"w-100 l-padConteudo\"]//hgroup/h1";
	
	//Modulos
	public static String varModuloBotao = "//div[@class=\"ng-scope\"]/div/div[" + varPosicaoA + "]/a/div/p";
	
	//Operação>Prestador>>Emitir NFS-e
	
	//Tela 1
	public static String varDadosTomador = "//div[@class=\"ng-scope\"]/form/div[1]/div/div[1]/div";
	public static String varDadosTomadorLabel = "//div[@class=\"ng-scope\"]/form/div[1]/div/div[2]/div/label";
	public static String varDadosTomadorInput = "//div[@class=\"ng-scope\"]/form/div[1]/div/div[2]/div/div/input";
	public static String varDadosTomadorBotaoPesquisar = "//div[@class=\"ng-scope\"]/form/div[1]/div/div[2]/div/div/button";
	
	//Tela 2
	public static String varCompetenciaLabel = "//div[@class=\"ng-scope\"]/form/div[1]/div/div[@class=\"form-group\"]/label[@for=\"dataComp\"]";
	public static String varCompetenciaInput = "//div[@class=\"ng-scope\"]/form/div[1]/div/div[@class=\"form-group\"]/input[@id=\"dataComp\"]";
	public static String varLocalPrestacaoLabel = "//div[@class=\"ng-scope\"]/form/div[1]/div/div[@class=\"form-group\"]/label[@for=\"dataLocal\"]";
	public static String varLocalPrestacaoBotao = "//div[@class=\"ng-scope\"]/form/div[1]/div/div[@class=\"form-group\"]/select[@id=\"dataLocal\"]";
	public static String varLocalPrestacaoOpcao = "//div[@class=\"ng-scope\"]/form/div[1]/div/div[@class=\"form-group\"]/select[@id=\"dataLocal\"]/option[@label=\""+ varLabel +"\"]";
	public static String varEstadoLabel = "//div[@class=\"ng-scope\"]/form/div[1]/div/div[@class=\"form-group\"]/label[@for=\"statelUser\"]";
	public static String varEstadoBotao = "//div[@class=\"ng-scope\"]/form/div[1]/div/div[@class=\"form-group\"]/select[@id=\"statelUser\"]";
	public static String varEstadoOpcao = "//div[@class=\"ng-scope\"]/form/div[1]/div/div[@class=\"form-group\"]/select[@id=\"statelUser\"]/option[@label=\"" + varLabel + "\"]";
	public static String varCidadeLabel = "//div[@class=\"ng-scope\"]/form/div[1]/div/div[@class=\"form-group\"]/label[@for=\"citylUser\"]";
	public static String varCidadeBotao = "//div[@class=\"ng-scope\"]/form/div[1]/div/div[@class=\"form-group\"]/select[@id=\"citylUser\"]";
	public static String varCidadeOpcao = "//div[@class=\"ng-scope\"]/form/div[1]/div/div[@class=\"form-group\"]/select[@id=\"citylUser\"]/option[@label=\"" + varLabel + "\"]";
	public static String varCodigoServicoLabel = "//div[@class=\"ng-scope\"]/form/div[1]/div/div[@class=\"form-group\"]/label[@for=\"dataCode\"]";
	public static String varCodigoServicoBotao = "//div[@class=\"ng-scope\"]/form/div[1]/div/div[@class=\"form-group\"]/select[@id=\"dataCode\"]";
	public static String varCodigoServicoOpcao = "//div[@class=\"ng-scope\"]/form/div[1]/div/div[@class=\"form-group\"]/select[@id=\"dataCode\"]/option[@label=\""+ varLabel +"\"]";
	public static String varAliquotaLabel = "//div[@class=\"ng-scope\"]/form/div[1]/div/div[@class=\"form-group\"]/label[@for=\"dataPercent\"]";
	public static String varAliquotaInput = "//div[@class=\"ng-scope\"]/form/div[1]/div/div[@class=\"form-group\"]/input[@id=\"dataPercent\"]";
	public static String varDescricaoLabel = "//div[@class=\"ng-scope\"]/form/div[1]/div/div[@class=\"form-group\"]/label[@for=\"dataMesage\"]";
	public static String varDescricaoInput = "//div[@class=\"m-formGroupA_wrap\"]/textarea";
	public static String varConstrucaoCivilButton = "//form[@name=\"dadosServico\"]/div[2]/p/span[@class=\"m-linkA\"]";
	public static String varListaObrasCadastradas = "//form[@name=\"dadosServico\"]//label[@for=\"dataConstructionList\"]";
	public static String varListaObrasCadastradasButton = "//form[@name=\"dadosServico\"]//select[@id=\"dataConstructionList\"]";
	public static String varListaObrasCadastradasSelect = "//form[@name=\"dadosServico\"]//select[@id=\"dataConstructionList\"]/option[@label=\"" + varLabel +"\"]";
	public static String varCodigoART = "//form[@name=\"dadosServico\"]//label[@for=\"dataArt\"]";
	public static String varCodigoARTInput = "//form[@name=\"dadosServico\"]//input[@id=\"dataArt\"]";
	public static String varCodigoObra = "//form[@name=\"dadosServico\"]//label[@for=\"constructionCode\"]";
	public static String varCodigoObraInput = "//form[@name=\"dadosServico\"]//input[@id=\"constructionCode\"]";
	public static String varServicosPrestados = "//form[@name=\"dadosServico\"]/div[3]/div[1]/div/label[@class=\"form-control-label\"]";
	public static String varServicosPrestadosInput = "//form[@name=\"dadosServico\"]/div[3]/div[1]/div/input[@class=\"form-control form-control-sm\"]";
	public static String varDeducoes = "//form[@name=\"dadosServico\"]/div[3]/div[2]/div/label[@class=\"form-control-label\"]";
	public static String varDeducoesInput = "//form[@name=\"dadosServico\"]/div[3]/div[2]/div/input[@class=\"form-control form-control-sm\"]";
	public static String varDescIncondicionados = "//form[@name=\"dadosServico\"]/div[3]/div[3]/div/label[@class=\"form-control-label\"]";
	public static String varDescIncondicionadosInput = "//form[@name=\"dadosServico\"]/div[3]/div[3]/div/input[@class=\"form-control form-control-sm\"]";
	
	
	//Tela 3
	public static String varTotalizadorLabel = "//form[@name=\"emitirNota\"]/div[1]/div[1]/p";
	public static String varBaseDeCalculo = "//form[@name=\"emitirNota\"]/div/div[2]/p/strong";
	public static String varBaseDeCalculoValor = "//form[@name=\"emitirNota\"]/div/div[2]/p";
	public static String varValorLiquidoNota = "//form[@name=\"emitirNota\"]/div/div[3]/p/strong";
	public static String varValorLiquidoNotaValor = "//form[@name=\"emitirNota\"]/div/div[3]/p";
	public static String varValorDoISS = "//form[@name=\"emitirNota\"]/div/div[4]/p/strong";
	public static String varValorDoISSValor = "//form[@name=\"emitirNota\"]/div/div[4]/p";
	public static String varIdentificacaoLabel = "//form[@name=\"emitirNota\"]/div[2]/div/div/h6";
	public static String varTomadorLabel = "//form[@name=\"emitirNota\"]/div[3]/div/div/strong";
	public static String varTomadorValor = "//form[@name=\"emitirNota\"]/div[3]/div/div";
	public static String varCNPJLabel = "//form[@name=\"emitirNota\"]/div[3]/div/div[2]/strong";
	public static String varCNPJValor = "//form[@name=\"emitirNota\"]/div[3]/div/div[2]";
	public static String varIMLabel = "//form[@name=\"emitirNota\"]/div[3]/div/div[3]/strong";
	public static String varIMValor = "//form[@name=\"emitirNota\"]/div[3]/div/div[3]";
	public static String varRazaoSocialLabel = "//form[@name=\"emitirNota\"]/div[3]/div/div[4]/strong";
	public static String varRazaoSocialValor = "//form[@name=\"emitirNota\"]/div[3]/div/div[4]";
	public static String varDadosServicos = "//form[@name=\"emitirNota\"]/div[4]/div/div/h6";
	public static String varDadosServicosCompetenciaLabel = "//form[@name=\"emitirNota\"]/div[5]/div/div[1]/strong";
	public static String varDadosServicosCompetenciaValor = "//form[@name=\"emitirNota\"]/div[5]/div/div[1]";
	public static String varLocalPrestacaoServicoLabel = "//form[@name=\"emitirNota\"]/div[5]/div/div[2]/strong";
	public static String varLocalPrestacaoServicoValor = "//form[@name=\"emitirNota\"]/div[5]/div/div[2]";
	public static String varNaturezaOperacaoLabel = "//form[@name=\"emitirNota\"]/div[5]/div/div[3]/strong";
	public static String varNaturezaOperacaoValor = "//form[@name=\"emitirNota\"]/div[5]/div/div[3]";
	public static String varServicoAtividadeLabel = "//form[@name=\"emitirNota\"]/div[5]/div/div[4]/strong";
	public static String varServicoAtividadeValor = "//form[@name=\"emitirNota\"]/div[5]/div/div[4]";
	public static String varDadosServicosAliquotaLabel = "//form[@name=\"emitirNota\"]/div[5]/div/div[5]/strong";
	public static String varDadosServicosAliquotaValor = "//form[@name=\"emitirNota\"]/div[5]/div/div[5]";
	public static String varValorServicosPrestadosLabel = "//form[@name=\"emitirNota\"]/div[5]/div/div[6]/strong";
	public static String varValorServicosPrestadosValor = "//form[@name=\"emitirNota\"]/div[5]/div/div[6]";
	public static String varValorDeducoesLabel = "//form[@name=\"emitirNota\"]/div[5]/div/div[7]/strong";
	public static String varValorDeducoesValor = "//form[@name=\"emitirNota\"]/div[5]/div/div[7]";
	public static String varISSRetidoLabel = "//form[@name=\"emitirNota\"]/div[5]/div/div[8]/strong";
	public static String varISSRetidoValor = "//form[@name=\"emitirNota\"]/div[5]/div/div[8]";
	public static String varVIISSRetidoLabel = "//form[@name=\"emitirNota\"]/div[5]/div/div[9]/strong";
	public static String varVIISSRetidoValor = "//form[@name=\"emitirNota\"]/div[5]/div/div[9]";
	
	public static String varBotaoProximo = "//div[@class=\"d-flex justify-content-end align-items-end pl-3 pr-3\"]/a[@class=\"btn btn-sm btn-primary\"]";
	public static String varBotaoEmitirNota = "//button[@class=\"btn btn-sm btn-primary\"]";
	
	//Operação>Prestador>>Consultar NFS-e
	public static String varBuscarPorLabel = "//label[@for=\"filterNf\"]";
	public static String varBuscarPorButton = "//select[@id=\"filterNf\"]";
	public static String varBuscarPorSelect = "//select[@id=\"filterNf\"]/option[@label=\"" + varLabel + "\"]";
	public static String varNFSeLabel = "//label[@for=\"searchNf\"]"; 
	public static String varNFSeInput = "//input[@id=\"searchNf\"]"; 
	public static String varInicioIntervaloLabel= "//label[@for=\"numberInit\"]";
	public static String varInicioIntervaloInput= "//input[@id=\"numberInit\"]";
	public static String varFimIntervaloLabel= "//label[@for=\"numberEnd\"]";
	public static String varFimIntervaloInput= "//input[@id=\"numberEnd\"]";
	public static String varPesquisarLabel = "//label[@for=\"filtrarTabela\"]";
	public static String varPesquisarInput = "//input[@id=\"filtrarTabela\"]";
	public static String varExibirLabel = "//label[@for=\"quantidade\"]";
	public static String varExibirInput = "//input[@id=\"quantidade\"]";
	public static String varInicioPeriodoLabel = "//label[@for=\"dateStart\"]";
	public static String varInicioPeriodoInput = "//input[@id=\"dateStart\"]";
	public static String varFimPeriodoLabel = "//label[@for=\"dateEnd\"]";
	public static String varFimPeriodoInput = "//input[@id=\"dateEnd\"]";
	
	public static String varBuscarButton = "//button[@class=\"btn  btn-primary btn-sm\"]";
	
	//Tabela Consulta NFS-e
	public static String varTableColuna = "//table[@id=\"example\"]/thead/tr/th[" + varPosicaoA + "]";
	public static String varTableRow = "//table[@id=\"example\"]/tbody/tr[" + varPosicaoB + "]/td[" + varPosicaoA + "]";
	public static String varTableNumberElements = "//table[@id=\"example\"]/tbody";
	
	//Operação>Tomador>Emissão de nova NFTS-e
	//Tela 1
	public static String varTituloModuloLabel = "//form[@name=\"nfTomador\"]/h6[@class=\"m-titleA--borderBottom\"]";	
	public static String varCPFCNPJLabel = "//label[@for=\"prestador\"]";
	public static String varCPFCNPJInput = "//input[@id=\"prestador\"]";
	public static String varCPFCNPJButton = "//button[@class=\"input-group-addon btn-sm\"]";
	public static String varInscricaoMunicipalLabel = "//form[@name=\"nfTomador\"]/div[2]/div[2]/div/p[@class=\"m-paragraph\"]";
	public static String varInscricaoMunicipalValue = "//form[@name=\"nfTomador\"]/div[2]/div[2]/div/p[@class=\"m-paragraph\"]/strong";
	public static String varNomeEmpresaLabel = "//form[@name=\"nfTomador\"]/div[2]/div[3]/div/p[@class=\"m-paragraph\"]";
	public static String varNomeEmpresaValue = "//form[@name=\"nfTomador\"]/div[2]/div[3]/div/p[@class=\"m-paragraph\"]/strong";
	public static String varInscricaoEstadualLabel = "//form[@name=\"nfTomador\"]/div[2]/div[4]/div/p[@class=\"m-paragraph\"]";
	public static String varInscricaoEstadualValue = "//form[@name=\"nfTomador\"]/div[2]/div[4]/div/p[@class=\"m-paragraph\"]/strong";
	public static String varEnderecoLabel = "//form[@name=\"nfTomador\"]/div[2]/div[5]/div/p[@class=\"m-paragraph\"]";
	public static String varEnderecoValue = "//form[@name=\"nfTomador\"]/div[2]/div[5]/div/p[@class=\"m-paragraph\"]/strong";
	public static String varPrestadorSimplesCheckbox = "//*[@id=\"simplesNacional\"]";
	public static String varContinuarBotao = "//button[@class=\"btn btn-primary  btn-sm\"]";
	//Tela 2
	public static String varPaisLabel = "//label[@class=\"form-control-label\"]";
	public static String varPaisSelect = "//select[@class=\"form-control form-control-sm\"]/";
	public static String varNomeDaEmpresaLabel = "//form[@name=\"nfTomador\"]/div[3]/div[2]/div[1]/label";
	public static String varNomeDaEmpresaInput = "//form[@name=\"nfTomador\"]/div[3]/div[2]/div[1]/input";
	public static String varInfoDaEmpresaLabel = "//form[@name=\"nfTomador\"]/div[3]/div[3]/div/label";
	public static String varInfoDaEmpresaInput = "//form[@name=\"nfTomador\"]/div[3]/div[3]/div/textarea";
	public static String varContinuarBotao2 = "//form[@name=\"nfTomador\"]/div[3]/div[5]/div/a[@class=\"btn btn-primary  btn-sm\"]";
	//Tela 3
	public static String varItemServicoAtividadeLabel = "//label[@for=\"tipoServico\"]";
	public static String varItemServicoAtividadeSelect = "//form[@name=\"nfTomador\"]/div/div[1]/div/select[@id=\"tipoServico\"]/option[@label=\""+ varLabel +"\"]";
	public static String varNumeroAtividadeLabel = "//label[@for=\"numero\"]";
	public static String varNumeroAtividadeInput = "//input[@id=\"numero\"]";
	public static String varValorServicoLabel = "//label[@for=\"valor\"]";
	public static String varValorServicoInput = "//input[@id=\"valor\"]";
	public static String varSerieLabel = "//label[@for=\"serie\"]";
	public static String varSerieInput = "//input[@id=\"serie\"]";
	public static String varDataServicoLabel = "//label[@for=\"data\"]";
	public static String varDataServicoInput = "//input[@id=\"data\"]";
	public static String varTipoLabel = "//label[@for=\"tipo\"]";
	//public static String varTipoSelect = "//select[@id=\"tipo\"]/option";
	
	//Menu
	public static String varMenuModulosOperacao = "//div[@class=\"dropdown-menu dropdown-menu-right border-0 l-nav_dropdown\"]//span[@class=\"ng-binding\" and @innerText=\"Operação\"]";
	public static String varMenuModulosIntegracao = "//div[@class=\"dropdown-menu dropdown-menu-right border-0 l-nav_dropdown\"]//span[@class=\"ng-binding\" and @innerText=\"Integração\"]";
	public static String varMenuModulosConteudo = "//div[@class=\"dropdown-menu dropdown-menu-right border-0 l-nav_dropdown\"]//div[@class=\"p-3\"]/div["+ varPosicaoB +"]/div[" + varPosicaoA + "]//span[@class=\"ng-binding\"]";
	public static String varMenuModulosConfiguracao = "//div[@class=\"dropdown-menu dropdown-menu-right border-0 l-nav_dropdown\"]//span[@class=\"ng-binding\" and @innerText=\"Configuração\"]";
	public static String varMenuModulosMonitoracao = "//div[@class=\"dropdown-menu dropdown-menu-right border-0 l-nav_dropdown\"]//span[@class=\"ng-binding\" and @innerText=\"Monitoração\"]";
	public static String varMenuSidebar = "//ul[@class=\"l-sidebar_menu list-unstyled\"]/li[@class=\"l-sidebar_menu_item\"]/a[@data-original-title=\"" + varLabel + "\"]/span";

	
	//Tratamento de variaveis do proprio repositorio
	public void setPosicao(int value) {
		varPosicaoA = value;
		if (varPosicaoA == 3) {
			varPosicaoA = 1;
			varPosicaoB = 2;
		}
		
		varMenuModulosConteudo = "//div[@class=\"dropdown-menu dropdown-menu-right border-0 l-nav_dropdown\"]//div[@class=\"p-3\"]/div[" + varPosicaoB + "]/div[" + varPosicaoA + "]//span[@class=\"ng-binding\"]";
	}
	
	public void setPosicaoTabela(int valueA, int valueB) {
		varPosicaoA = valueA;
		varPosicaoB = valueB;
		
		varTableColuna = "//table[@id=\"example\"]/thead/tr/th[" + varPosicaoA + "]";
		varTableRow = "//table[@id=\"example\"]/tbody/tr[" + varPosicaoB + "]/td[" + varPosicaoA + "]";
	}
	
	public void setPosicaoLimite(int value) {
		this.varPosicaoA = value;
		varMenuSidebar = "//ul[@class=\"l-sidebar_menu list-unstyled\"]/li[" + varPosicaoA + "]/a/span";
		varMenuModulosConteudo = "//div[@class=\"dropdown-menu dropdown-menu-right border-0 l-nav_dropdown\"]//div[@class=\"p-3\"]/div[" + varPosicaoB + "]/div[" + varPosicaoA + "]//span[@class=\"ng-binding\"]";
		varModuloBotao = "//div[@class=\"ng-scope\"]/div/div[" + varPosicaoA + "]/a/div/p";
		varTableColuna = "//table[@id=\"example\"]/thead/tr/th[" + varPosicaoA + "]";
	}
	
	public void setDriver(WebDriver value) {
		this.driver = value;
	}
	
	public void setLabel(String value) {
		this.varLabel = value;
		varLocalPrestacaoOpcao = "//div[@class=\"ng-scope\"]/form/div[1]/div/div[@class=\"form-group\"]/select[@id=\"dataLocal\"]/option[@label=\""+ varLabel +"\"]";
		varEstadoOpcao = "//div[@class=\"ng-scope\"]/form/div[1]/div/div[@class=\"form-group\"]/select[@id=\"statelUser\"]/option[@label=\"" + varLabel + "\"]";
		varCidadeOpcao = "//div[@class=\"ng-scope\"]/form/div[1]/div/div[@class=\"form-group\"]/select[@id=\"citylUser\"]/option[@label=\"" + varLabel + "\"]";
		varCodigoServicoOpcao = "//div[@class=\"ng-scope\"]/form/div[1]/div/div[@class=\"form-group\"]/select[@id=\"dataCode\"]/option[@label=\""+ varLabel +"\"]";
		varMenuSidebar = "//ul[@class=\"l-sidebar_menu list-unstyled\"]/li[@class=\"l-sidebar_menu_item\"]/a[@data-original-title=\"" + varLabel + "\"]/span";
		varListaObrasCadastradasSelect = "//form[@name=\"dadosServico\"]//select[@id=\"dataConstructionList\"]/option[@label=\"" + varLabel +"\"]";
		varBuscarPorSelect = "//select[@id=\"filterNf\"]/option[@label=\"" + varLabel + "\"]";
		varItemServicoAtividadeSelect = "//form[@name=\"nfTomador\"]/div/div[1]/div/select[@id=\"tipoServico\"]/option[@label=\"" + varLabel + "\"]";
	}
	
	//Limpa as variaveis e seta novamente as variaveis que dependem dos contadores de posição
	public void clearVariaveis() {	
		varPosicaoA = 1;
		varPosicaoB = 1;
		varLabel = "";
		varMenuSidebar = "//ul[@class=\"l-sidebar_menu list-unstyled\"]/li[" + varPosicaoA + "]/a/span";
		varMenuModulosConteudo = "//div[@class=\"dropdown-menu dropdown-menu-right border-0 l-nav_dropdown\"]//div[@class=\"p-3\"]/div[" + varPosicaoB + "]/div[" + varPosicaoA + "]//span[@class=\"ng-binding\"]";
		varModuloBotao = "//div[@class=\"ng-scope\"]/div/div[" + varPosicaoA + "]/a/div/p";
		varLocalPrestacaoOpcao = "//div[@class=\"ng-scope\"]/form/div[1]/div/div[@class=\"form-group\"]/select[@id=\"dataLocal\"]/option[@label=\""+ varLabel +"\"]";
		varEstadoOpcao = "//div[@class=\"ng-scope\"]/form/div[1]/div/div[@class=\"form-group\"]/select[@id=\"statelUser\"]/option[@label=\"" + varLabel + "\"]";
		varCidadeOpcao = "//div[@class=\"ng-scope\"]/form/div[1]/div/div[@class=\"form-group\"]/select[@id=\"citylUser\"]/option[@label=\"" + varLabel + "\"]";
		varCodigoServicoOpcao = "//div[@class=\"ng-scope\"]/form/div[1]/div/div[@class=\"form-group\"]/select[@id=\"dataCode\"]/option[@label=\""+ varLabel +"\"]";
		varMenuSidebar = "//ul[@class=\"l-sidebar_menu list-unstyled\"]/li[@class=\"l-sidebar_menu_item\"]/a[@data-original-title=\"" + varLabel + "\"]/span";
		varListaObrasCadastradasSelect = "//form[@name=\"dadosServico\"]//select[@id=\"dataConstructionList\"]/option[@label=\"" + varLabel +"\"]";
		varBuscarPorSelect = "//select[@id=\"filterNf\"]/option[@label=\"" + varLabel + "\"]";
		varTableColuna = "//table[@id=\"example\"]/thead/tr/th[" + varPosicaoA + "]";
		varTableRow = "//table[@id=\"example\"]/tbody/tr[" + varPosicaoB + "]/td[" + varPosicaoA + "]";
		varItemServicoAtividadeSelect = "//form[@name=\"nfTomador\"]/div/div[1]/div/select[@id=\"tipoServico\"]/option[@label=\"" + varLabel + "\"]";
	}
	
}	
