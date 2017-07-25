package gissOnline;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import pageObjects.StartBrowser;
import pageObjects.VerificaStatusCheckbox;
import pageObjects.VerificarConteudoTabela;
import pageObjects.VerificarQtdElementosTabela;
import utility.Repositorio;
import utility.TratarValores;
import pageObjects.ClicarBotaoxPath;
import pageObjects.ClickIconeMenu;
import pageObjects.ColunasTabela;
import pageObjects.FecharNavegador;
import pageObjects.InserirValorID;
import pageObjects.EsperaExistir;
import pageObjects.InserirValorxPath;
import pageObjects.ProcuraElementosID;
import pageObjects.ProcuraElementosxPath;
import pageObjects.SelectDropdown;
import pageObjects.PrintScreenObj;
import pageObjects.ComparaValores;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import java.text.SimpleDateFormat;
import java.sql.Date;

import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@Listeners(gissOnlineReportTest.class)
public class Main {
	
	public WebDriver driver;
	
	
	@BeforeMethod
	public void startUP ()throws Exception
	{
		
		Repositorio varRepositorio = new Repositorio();
		StartBrowser varStart = new StartBrowser();
		ProcuraElementosID varProcuraElementosID = new ProcuraElementosID();
		InserirValorID varInserirValorID = new InserirValorID();
		EsperaExistir varEsperaExistir = new EsperaExistir();
		ClicarBotaoxPath varClicarBotaoxPath = new ClicarBotaoxPath();
		
		
		varStart.startUP(
				varRepositorio.varDriverNav, 
				varRepositorio.varCaminhoDriver, 
				varRepositorio.varCaminhoExeNav, 
				varRepositorio.varURLDomain);

		varProcuraElementosID.procuraElementosID(varRepositorio.varEmailLogin, "");
		varProcuraElementosID.procuraElementosID(varRepositorio.varSenhaLogin, "");
		varInserirValorID.inserirValorID(varRepositorio.varEmailLogin, "TEST");
		varInserirValorID.inserirValorID(varRepositorio.varSenhaLogin, "TEST2");
		varClicarBotaoxPath.clicarBotaoxPath(varRepositorio.varBotaoSeguinte);
		varEsperaExistir.esperaExistir(
				varRepositorio.varMsgBoasVindas, 
				"Bem vindo a Giss Online, veja abaixo algumas prioridades, notifica��es e pend�ncias");
	}
	
	@Test
	public void test1_menuAcess() {
		Repositorio varRepositorio = new Repositorio();
		ClicarBotaoxPath varClicarBotaoxPath = new ClicarBotaoxPath();
		ClickIconeMenu varClickIconeMenu = new ClickIconeMenu();
		
		varClicarBotaoxPath.clicarBotaoxPath(
				varRepositorio.varMenuModulos);
		varClickIconeMenu.clickIconeMenu(
				varRepositorio.varMenuModulosConteudo, "Gest�o");
		varClicarBotaoxPath.clicarBotaoxPath(
				varRepositorio.varMenuModulos);
		varClickIconeMenu.clickIconeMenu(
				varRepositorio.varMenuModulosConteudo, "Configura��o");
		varClicarBotaoxPath.clicarBotaoxPath(
				varRepositorio.varMenuModulos);
		varClickIconeMenu.clickIconeMenu(
				varRepositorio.varMenuModulosConteudo, "Monitora��o");
		varClicarBotaoxPath.clicarBotaoxPath(
				varRepositorio.varMenuModulos);
		varClickIconeMenu.clickIconeMenu(
				varRepositorio.varMenuModulosConteudo, "Integra��o");
		varClicarBotaoxPath.clicarBotaoxPath(
				varRepositorio.varMenuModulos);
		varClickIconeMenu.clickIconeMenu(
				varRepositorio.varMenuModulosConteudo, "Opera��o");
		
	}
	
	@Test
	public void test2_validaConteudoMenu() throws Exception {
		Repositorio varRepositorio = new Repositorio();
		EsperaExistir varEsperaExistir = new EsperaExistir();
		ClicarBotaoxPath varClicarBotaoxPath = new ClicarBotaoxPath();
		ClickIconeMenu varClickIconeMenu = new ClickIconeMenu();
		ProcuraElementosxPath varProcuraElementosxPath = new ProcuraElementosxPath();
		PrintScreenObj varPrintScreenObj = new PrintScreenObj();
		
		varRepositorio.setLabel("Prestador");
		varProcuraElementosxPath.procuraElementosxPath(varRepositorio.varMenuSidebar, "Prestador");
		varEsperaExistir.esperaExistir(varRepositorio.varTituloModulo, "Prestador");
		varRepositorio.setLabel("Tomador");
		varProcuraElementosxPath.procuraElementosxPath(varRepositorio.varMenuSidebar, "Tomador");
		varEsperaExistir.esperaExistir(varRepositorio.varTituloModulo, "Tomador");
		varRepositorio.setLabel("RPS");
        varProcuraElementosxPath.procuraElementosxPath(varRepositorio.varMenuSidebar, "RPS");
		varEsperaExistir.esperaExistir(varRepositorio.varTituloModulo, "Recibo Provis�rio");
		varRepositorio.setLabel("Abatimento");
		varProcuraElementosxPath.procuraElementosxPath(varRepositorio.varMenuSidebar, "Abatimento");
		varEsperaExistir.esperaExistir(varRepositorio.varTituloModulo, "Abatimento");
		varRepositorio.setLabel("Conta Corrente");
		varProcuraElementosxPath.procuraElementosxPath(varRepositorio.varMenuSidebar, "Conta Corrente");
		varEsperaExistir.esperaExistir(varRepositorio.varTituloModulo, "Conta Corrente");
		varRepositorio.setLabel("Constitui��o de Cr�dito");
		varProcuraElementosxPath.procuraElementosxPath(varRepositorio.varMenuSidebar, "Constitui��o de Cr�dito");
		varEsperaExistir.esperaExistir(varRepositorio.varTituloModulo, "Constitui��o de Cr�dito");
		varRepositorio.setLabel("Procurador");
		varProcuraElementosxPath.procuraElementosxPath(varRepositorio.varMenuSidebar, "Procurador");
		varEsperaExistir.esperaExistir(varRepositorio.varTituloModulo, "Procurador");
		varRepositorio.setLabel("Clientes e Fornecedores");
		varProcuraElementosxPath.procuraElementosxPath(varRepositorio.varMenuSidebar, "Clientes e Fornecedores");
		varEsperaExistir.esperaExistir(varRepositorio.varTituloModulo, "Lista dos seus clientes e fornecedores cadastrados");
		varRepositorio.setLabel("Constru��o Civil / Obra");
		varProcuraElementosxPath.procuraElementosxPath(varRepositorio.varMenuSidebar, "Constru��o Civil");
		varEsperaExistir.esperaExistir(varRepositorio.varTituloModulo, "Constru��o Civil");
		varRepositorio.setLabel("Den�ncia");
		varProcuraElementosxPath.procuraElementosxPath(varRepositorio.varMenuSidebar, "Den�ncia");
		varEsperaExistir.esperaExistir(varRepositorio.varTituloModulo, "Sua Lista de Denuncias");
		
		varClicarBotaoxPath.clicarBotaoxPath(varRepositorio.varMenuModulos);
		varClickIconeMenu.clickIconeMenu(varRepositorio.varMenuModulosConteudo, "Gest�o");
		varRepositorio.setLabel("Gest�o");
		varProcuraElementosxPath.procuraElementosxPath(varRepositorio.varMenuSidebar, "Gest�o");
		
		varClicarBotaoxPath.clicarBotaoxPath(varRepositorio.varMenuModulos);
		varClickIconeMenu.clickIconeMenu(varRepositorio.varMenuModulosConteudo, "Configura��o");
		varRepositorio.setLabel("Regra de Tributa��o");
		varProcuraElementosxPath.procuraElementosxPath(varRepositorio.varMenuSidebar, "Regra de Tributa��o");
		varEsperaExistir.esperaExistir(varRepositorio.varTituloModulo, "Regra Tributa��o");
		varRepositorio.setLabel("Cliente");
		varProcuraElementosxPath.procuraElementosxPath(varRepositorio.varMenuSidebar, "Cliente");
		varEsperaExistir.esperaExistir(varRepositorio.varTituloModulo, "Cliente");
		varRepositorio.setLabel("Servi�o / Atividade");
		varProcuraElementosxPath.procuraElementosxPath(varRepositorio.varMenuSidebar, "Servi�o / Atividade");
		varEsperaExistir.esperaExistir(varRepositorio.varTituloModulo, "Servi�o / Atividade");	
		varRepositorio.setLabel("Declara��o / Fiscal");
		varProcuraElementosxPath.procuraElementosxPath(varRepositorio.varMenuSidebar, "Declara��o");
		varEsperaExistir.esperaExistir(varRepositorio.varTituloModulo, "Declara��o");
		varRepositorio.setLabel("Conta Corrente");
		varProcuraElementosxPath.procuraElementosxPath(varRepositorio.varMenuSidebar, "Conta Corrente");
		varEsperaExistir.esperaExistir(varRepositorio.varTituloModulo, "Conta Corrente");
		
		
		varClicarBotaoxPath.clicarBotaoxPath(varRepositorio.varMenuModulos);
		varClickIconeMenu.clickIconeMenu(varRepositorio.varMenuModulosConteudo, "Monitora��o");
		varRepositorio.setLabel("Monitora��o");
		varProcuraElementosxPath.procuraElementosxPath(varRepositorio.varMenuSidebar, "Monitora��o");
		
		varClicarBotaoxPath.clicarBotaoxPath(varRepositorio.varMenuModulos);
		varClickIconeMenu.clickIconeMenu(varRepositorio.varMenuModulosConteudo, "Integra��o");
		varRepositorio.setLabel("Empresa");
		varProcuraElementosxPath.procuraElementosxPath(varRepositorio.varMenuSidebar, "Empresa");
		varEsperaExistir.esperaExistir(varRepositorio.varTituloModulo, "Empresa");
		varRepositorio.setLabel("Servi�o / Atividade");
		varProcuraElementosxPath.procuraElementosxPath(varRepositorio.varMenuSidebar, "Servi�o / Atividade");
		varEsperaExistir.esperaExistir(varRepositorio.varTituloModulo, "Servi�o / Atividade");
	}
	
	@Test
	public void test3_validaConteudoPrestadorEmitirNota() {
		Repositorio varRepositorio = new Repositorio();
		EsperaExistir varEsperaExistir = new EsperaExistir();
		ClicarBotaoxPath varClicarBotaoxPath = new ClicarBotaoxPath();
		ProcuraElementosxPath varProcuraElementosxPath = new ProcuraElementosxPath();
		InserirValorxPath varInserirValorxPath = new InserirValorxPath();
		SelectDropdown varSelectDropdown = new SelectDropdown();
		ComparaValores varComparaValores = new ComparaValores();
		
		Date data = new Date(System.currentTimeMillis());
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		
		//Tela 1
		varRepositorio.setLabel("Prestador");
		varProcuraElementosxPath.procuraElementosxPath(varRepositorio.varMenuSidebar, "Prestador");
		varEsperaExistir.esperaExistir(varRepositorio.varTituloModulo, "Prestador");
		varProcuraElementosxPath.procuraElementosxPath(varRepositorio.varModuloBotao, "Emitir NFS-e");
		varEsperaExistir.esperaExistir(varRepositorio.varDadosTomador, "Busque abaixo os dados do tomador ou clique aqui para cadastra-lo manualmente");
		varEsperaExistir.esperaExistir(varRepositorio.varDadosTomadorLabel, "Pesquisar dados por");
		varInserirValorxPath.inserirValorxPath(varRepositorio.varDadosTomadorInput, "43.819.978/0001-92");
		varClicarBotaoxPath.clicarBotaoxPath(varRepositorio.varDadosTomadorBotaoPesquisar);
		varClicarBotaoxPath.clicarBotaoxPath(varRepositorio.varBotaoProximo);
		
		//Tela 2
		varEsperaExistir.esperaExistir(varRepositorio.varTituloModulo, "Para emitir nota fiscal");
		varEsperaExistir.esperaExistir(varRepositorio.varCompetenciaLabel, "Compet�ncia");
		varInserirValorxPath.inserirValorxPath(varRepositorio.varCompetenciaInput, formatador.format(data));
		varEsperaExistir.esperaExistir(varRepositorio.varLocalPrestacaoLabel, "Local de Presta��o");
 		varRepositorio.setLabel("Tributa��o no Munic�pio");
 		varSelectDropdown.selectDropdown(varRepositorio.varLocalPrestacaoOpcao);
 		varRepositorio.setLabel("S�o Paulo");
 		varEsperaExistir.esperaExistir(varRepositorio.varEstadoLabel, "Estado");
 		varSelectDropdown.selectDropdown(varRepositorio.varEstadoOpcao);
 		varRepositorio.setLabel("S�o Paulo");
 		varEsperaExistir.esperaExistir(varRepositorio.varCidadeLabel, "Cidade");
 		varSelectDropdown.selectDropdown(varRepositorio.varCidadeOpcao);
 		varRepositorio.setLabel("7.02/439919901");
 		varEsperaExistir.esperaExistir(varRepositorio.varCodigoServicoLabel, "C�digo do servi�o/Atividade");
 		varSelectDropdown.selectDropdown(varRepositorio.varCodigoServicoOpcao);
 		varEsperaExistir.esperaExistir(varRepositorio.varAliquotaLabel, "Aliquota(%)");
 		varInserirValorxPath.inserirValorxPath(varRepositorio.varAliquotaInput, "0,5%");
 		varEsperaExistir.esperaExistir(varRepositorio.varDescricaoLabel, "Descri��o");
 		varInserirValorxPath.inserirValorxPath(varRepositorio.varDescricaoInput, "Tomador de servi�o");
 		varClicarBotaoxPath.clicarBotaoxPath(varRepositorio.varConstrucaoCivilButton);
 		varEsperaExistir.esperaExistir(varRepositorio.varListaObrasCadastradas, "Lista de Obras Cadastradas");
 		varRepositorio.setLabel("Obra Principal");
 		varSelectDropdown.selectDropdown(varRepositorio.varListaObrasCadastradasSelect);
 		varEsperaExistir.esperaExistir(varRepositorio.varCodigoART, "C�digo A.R.T"); 
 		varEsperaExistir.esperaExistir(varRepositorio.varCodigoARTInput, "");
 		varEsperaExistir.esperaExistir(varRepositorio.varCodigoObra, "C�digo Obra"); 
 		varEsperaExistir.esperaExistir(varRepositorio.varCodigoObraInput, "");
 		varEsperaExistir.esperaExistir(varRepositorio.varServicosPrestados, "Servi�os Prestados"); 
 		varEsperaExistir.esperaExistir(varRepositorio.varServicosPrestadosInput, "");
 		varEsperaExistir.esperaExistir(varRepositorio.varDeducoes, "Dedu��es"); 
 		varEsperaExistir.esperaExistir(varRepositorio.varDeducoesInput, "");
 		varEsperaExistir.esperaExistir(varRepositorio.varDescIncondicionados, "Desc. Incondicionados"); 
 		varEsperaExistir.esperaExistir(varRepositorio.varDescIncondicionadosInput, "");
 		
 		varClicarBotaoxPath.clicarBotaoxPath(varRepositorio.varBotaoProximo);
 		
 		//Tela 3
 		varEsperaExistir.esperaExistir(varRepositorio.varTotalizadorLabel, "Totalizador");
 		varEsperaExistir.esperaExistir(varRepositorio.varBaseDeCalculo, "Base de Calculo:");
 		varComparaValores.comparaValores(varRepositorio.varBaseDeCalculoValor, "5,55");
 		varEsperaExistir.esperaExistir(varRepositorio.varValorLiquidoNota, "Valor L�quido da Nota:");
 		varComparaValores.comparaValores(varRepositorio.varBaseDeCalculoValor, "5,55");
 		varEsperaExistir.esperaExistir(varRepositorio.varValorDoISS, "Valor do ISS:");
 		varComparaValores.comparaValores(varRepositorio.varValorDoISSValor, "5,55");
 		varEsperaExistir.esperaExistir(varRepositorio.varIdentificacaoLabel, "Identifica��o do Tomador de Servi�o.");
 		varEsperaExistir.esperaExistir(varRepositorio.varTomadorLabel, "Tomador :");
 		varEsperaExistir.esperaExistir(varRepositorio.varTomadorValor, "Tomador : Pessoa F�sica");
 		varEsperaExistir.esperaExistir(varRepositorio.varCNPJLabel, "CNPJ :");
 		varEsperaExistir.esperaExistir(varRepositorio.varCNPJValor, "CNPJ :");
 		varEsperaExistir.esperaExistir(varRepositorio.varIMLabel, "IM :");
 		varEsperaExistir.esperaExistir(varRepositorio.varIMValor, "IM :");
 		varEsperaExistir.esperaExistir(varRepositorio.varRazaoSocialLabel, "Raz�o social :");
 		varEsperaExistir.esperaExistir(varRepositorio.varRazaoSocialValor, "Raz�o social :");
 		varEsperaExistir.esperaExistir(varRepositorio.varDadosServicos, "Dados do Servi�o.");
 		varEsperaExistir.esperaExistir(varRepositorio.varDadosServicosCompetenciaLabel, "Compet�ncia :");
 		varEsperaExistir.esperaExistir(varRepositorio.varDadosServicosCompetenciaValor, "Compet�ncia : 29/03/2017");
 		varEsperaExistir.esperaExistir(varRepositorio.varLocalPrestacaoServicoLabel, "Local de Preta��o de Servi�o (Cidade/Estado) :");
 		varEsperaExistir.esperaExistir(varRepositorio.varLocalPrestacaoServicoValor, "Local de Preta��o de Servi�o (Cidade/Estado) : SAO PAULO / SP");
 		varEsperaExistir.esperaExistir(varRepositorio.varNaturezaOperacaoLabel, "Natureza de Opera��o :");
 		varEsperaExistir.esperaExistir(varRepositorio.varNaturezaOperacaoValor, "Natureza de Opera��o : Tributa��o no munic�pio");
 		varEsperaExistir.esperaExistir(varRepositorio.varServicoAtividadeLabel, "Servi�o/Atividade : ");
 		varEsperaExistir.esperaExistir(varRepositorio.varServicoAtividadeValor, "Servi�o/Atividade : 7.02/439919901");
 		varEsperaExistir.esperaExistir(varRepositorio.varDadosServicosAliquotaLabel, "Aliquota(%) :");
 		varComparaValores.comparaValores(varRepositorio.varDadosServicosAliquotaValor, "4,26");
 		varEsperaExistir.esperaExistir(varRepositorio.varValorServicosPrestadosLabel, "Valor Servi�os Prestados");
 		varComparaValores.comparaValores(varRepositorio.varValorServicosPrestadosValor, "5,55");
 		varEsperaExistir.esperaExistir(varRepositorio.varValorDeducoesLabel, "Valor Dedu��es :");
 		varComparaValores.comparaValores(varRepositorio.varValorDeducoesValor, "0,00");
 		varEsperaExistir.esperaExistir(varRepositorio.varISSRetidoLabel, "ISS Retido :");
 		varEsperaExistir.esperaExistir(varRepositorio.varISSRetidoValor, "ISS Retido : n�o");
 		varEsperaExistir.esperaExistir(varRepositorio.varVIISSRetidoLabel, "Vl ISS Retido : R$ 0,00");
 		varComparaValores.comparaValores(varRepositorio.varVIISSRetidoValor, "0,00");
 		varClicarBotaoxPath.clicarBotaoxPath(varRepositorio.varBotaoEmitirNota);
 		
	}
	

	@Test
	public void test4_validaConteudoPrestadorConsultarNotaIntervalodeNotas() {
		Repositorio varRepositorio = new Repositorio();
		EsperaExistir varEsperaExistir = new EsperaExistir();
		ClicarBotaoxPath varClicarBotaoxPath = new ClicarBotaoxPath();
		ClickIconeMenu varClickIconeMenu = new ClickIconeMenu();
		ProcuraElementosxPath varProcuraElementosxPath = new ProcuraElementosxPath();
		PrintScreenObj varPrintScreenObj = new PrintScreenObj();
		SelectDropdown varSelectDropdown = new SelectDropdown();
		InserirValorxPath varInserirValorxPath = new InserirValorxPath();
		ColunasTabela varColunasTabela = new ColunasTabela();
		VerificarQtdElementosTabela varVerificarQtdElementosTabela = new VerificarQtdElementosTabela();
		VerificarConteudoTabela varVerificarConteudoTabela = new VerificarConteudoTabela();
		
		varRepositorio.setLabel("Prestador");
		varProcuraElementosxPath.procuraElementosxPath(varRepositorio.varMenuSidebar, "Prestador");
		varEsperaExistir.esperaExistir(varRepositorio.varTituloModulo, "Prestador");
		varProcuraElementosxPath.procuraElementosxPath(varRepositorio.varModuloBotao, "Consultar NFS-e");
		varEsperaExistir.esperaExistir(varRepositorio.varTituloModulo, "Para consultar uma nota fiscal");
		varEsperaExistir.esperaExistir(varRepositorio.varBuscarPorLabel, "Buscar por");
		varRepositorio.setLabel("Intervalo de Notas");
		varSelectDropdown.selectDropdown(varRepositorio.varBuscarPorSelect);
		varEsperaExistir.esperaExistir(varRepositorio.varInicioIntervaloLabel, "Inicio do Intervalo");
		varInserirValorxPath.inserirValorxPath(varRepositorio.varInicioIntervaloInput, "01");
		varEsperaExistir.esperaExistir(varRepositorio.varFimIntervaloLabel, "Fim do Intervalo");
		varInserirValorxPath.inserirValorxPath(varRepositorio.varFimIntervaloInput, "30");
		
		varClicarBotaoxPath.clicarBotaoxPath(varRepositorio.varBuscarButton);
		
		varEsperaExistir.esperaExistir(varRepositorio.varPesquisarLabel, "Pesquisar");
		varInserirValorxPath.inserirValorxPath(varRepositorio.varPesquisarInput, "8990");
		varEsperaExistir.esperaExistir(varRepositorio.varExibirLabel, "Exibir");
		varInserirValorxPath.inserirValorxPath(varRepositorio.varExibirInput, "5");
		varColunasTabela.colunasTabela(varRepositorio.varTableColuna, "N�mero NFS-e");
		varColunasTabela.colunasTabela(varRepositorio.varTableColuna, "Data");
		varColunasTabela.colunasTabela(varRepositorio.varTableColuna, "Base C�lculo");
		varColunasTabela.colunasTabela(varRepositorio.varTableColuna, "Imposto");
		varColunasTabela.colunasTabela(varRepositorio.varTableColuna, "Cr�dito");
		varColunasTabela.colunasTabela(varRepositorio.varTableColuna, "Valor Total da NFS-e");
		varColunasTabela.colunasTabela(varRepositorio.varTableColuna, "Data Cancelamento");
		varColunasTabela.colunasTabela(varRepositorio.varTableColuna, "Motivo do Cancelamento");
		varColunasTabela.colunasTabela(varRepositorio.varTableColuna, "A��es");
		varVerificarQtdElementosTabela.verificarQtdElementosTabela(varRepositorio.varTableNumberElements, "1");
		varVerificarConteudoTabela.verificarConteudoTabela(
				varRepositorio.varTableColuna, 
				varRepositorio.varTableRow, 
				"N�mero NFS-e", 
				"8990",
				"8990");
		varVerificarConteudoTabela.verificarConteudoTabela(
				varRepositorio.varTableColuna, 
				varRepositorio.varTableRow, 
				"Data", 
				"8990",
				"10/04/2017");
		varVerificarConteudoTabela.verificarConteudoTabela(
				varRepositorio.varTableColuna, 
				varRepositorio.varTableRow, 
				"Data", 
				"8990",
				"100,00");
		varVerificarConteudoTabela.verificarConteudoTabela(
				varRepositorio.varTableColuna, 
				varRepositorio.varTableRow, 
				"Data", 
				"8990",
				"5,00");
		varVerificarConteudoTabela.verificarConteudoTabela(
				varRepositorio.varTableColuna, 
				varRepositorio.varTableRow, 
				"Data", 
				"8990",
				"0,00");
		varVerificarConteudoTabela.verificarConteudoTabela(
				varRepositorio.varTableColuna, 
				varRepositorio.varTableRow, 
				"Data", 
				"8990",
				"105,00");
		varVerificarConteudoTabela.verificarConteudoTabela(
				varRepositorio.varTableColuna, 
				varRepositorio.varTableRow, 
				"Data", 
				"8990",
				"Valor Indevido	");
		
		
	}
	
	@Test
	public void test5_validaConteudoPrestadorConsultarNotaPeriodo() {
		Repositorio varRepositorio = new Repositorio();
		EsperaExistir varEsperaExistir = new EsperaExistir();
		ClicarBotaoxPath varClicarBotaoxPath = new ClicarBotaoxPath();
		ClickIconeMenu varClickIconeMenu = new ClickIconeMenu();
		ProcuraElementosxPath varProcuraElementosxPath = new ProcuraElementosxPath();
		PrintScreenObj varPrintScreenObj = new PrintScreenObj();
		SelectDropdown varSelectDropdown = new SelectDropdown();
		InserirValorxPath varInserirValorxPath = new InserirValorxPath();
		ColunasTabela varColunasTabela = new ColunasTabela();
		VerificarQtdElementosTabela varVerificarQtdElementosTabela = new VerificarQtdElementosTabela();
		VerificarConteudoTabela varVerificarConteudoTabela = new VerificarConteudoTabela();
		
		varRepositorio.setLabel("Prestador");
		varProcuraElementosxPath.procuraElementosxPath(varRepositorio.varMenuSidebar, "Prestador");
		varEsperaExistir.esperaExistir(varRepositorio.varTituloModulo, "Prestador");
		varProcuraElementosxPath.procuraElementosxPath(varRepositorio.varModuloBotao, "Consultar NFS-e");
		varEsperaExistir.esperaExistir(varRepositorio.varTituloModulo, "Para consultar uma nota fiscal");
		varEsperaExistir.esperaExistir(varRepositorio.varBuscarPorLabel, "Buscar por");
		varRepositorio.setLabel("Per�odo");
		varSelectDropdown.selectDropdown(varRepositorio.varBuscarPorSelect);
		varEsperaExistir.esperaExistir(varRepositorio.varInicioPeriodoLabel, "Inicio do per�odo");
		varEsperaExistir.esperaExistir(varRepositorio.varFimPeriodoLabel, "Fim do per�odo");
	
		varClicarBotaoxPath.clicarBotaoxPath(varRepositorio.varBuscarButton);
		
		varEsperaExistir.esperaExistir(varRepositorio.varPesquisarLabel, "Pesquisar");
		varInserirValorxPath.inserirValorxPath(varRepositorio.varPesquisarInput, "8990");
		varEsperaExistir.esperaExistir(varRepositorio.varExibirLabel, "Exibir");
		varInserirValorxPath.inserirValorxPath(varRepositorio.varExibirInput, "5");
		varColunasTabela.colunasTabela(varRepositorio.varTableColuna, "N�mero NFS-e");
		varColunasTabela.colunasTabela(varRepositorio.varTableColuna, "Data");
		varColunasTabela.colunasTabela(varRepositorio.varTableColuna, "Base C�lculo");
		varColunasTabela.colunasTabela(varRepositorio.varTableColuna, "Imposto");
		varColunasTabela.colunasTabela(varRepositorio.varTableColuna, "Cr�dito");
		varColunasTabela.colunasTabela(varRepositorio.varTableColuna, "Valor Total da NFS-e");
		varColunasTabela.colunasTabela(varRepositorio.varTableColuna, "Data Cancelamento");
		varColunasTabela.colunasTabela(varRepositorio.varTableColuna, "Motivo do Cancelamento");
		varColunasTabela.colunasTabela(varRepositorio.varTableColuna, "A��es");
		varVerificarQtdElementosTabela.verificarQtdElementosTabela(varRepositorio.varTableNumberElements, "1");
		varVerificarConteudoTabela.verificarConteudoTabela(
				varRepositorio.varTableColuna, 
				varRepositorio.varTableRow, 
				"N�mero NFS-e", 
				"8990",
				"8990");
		varVerificarConteudoTabela.verificarConteudoTabela(
				varRepositorio.varTableColuna, 
				varRepositorio.varTableRow, 
				"Data", 
				"8990",
				"10/04/2017");
		varVerificarConteudoTabela.verificarConteudoTabela(
				varRepositorio.varTableColuna, 
				varRepositorio.varTableRow, 
				"Data", 
				"8990",
				"100,00");
		varVerificarConteudoTabela.verificarConteudoTabela(
				varRepositorio.varTableColuna, 
				varRepositorio.varTableRow, 
				"Data", 
				"8990",
				"5,00");
		varVerificarConteudoTabela.verificarConteudoTabela(
				varRepositorio.varTableColuna, 
				varRepositorio.varTableRow, 
				"Data", 
				"8990",
				"0,00");
		varVerificarConteudoTabela.verificarConteudoTabela(
				varRepositorio.varTableColuna, 
				varRepositorio.varTableRow, 
				"Data", 
				"8990",
				"105,00");
		varVerificarConteudoTabela.verificarConteudoTabela(
				varRepositorio.varTableColuna, 
				varRepositorio.varTableRow, 
				"Data", 
				"8990",
				"Valor Indevido	");
	}
	
	/*@Test
	public void test6_validaConteudoPrestadorPeriodoouIntervalo() {
		Repositorio varRepositorio = new Repositorio();
		EsperaExistir varEsperaExistir = new EsperaExistir();
		ClicarBotaoxPath varClicarBotaoxPath = new ClicarBotaoxPath();
		ClickIconeMenu varClickIconeMenu = new ClickIconeMenu();
		ProcuraElementosxPath varProcuraElementosxPath = new ProcuraElementosxPath();
		PrintScreenObj varPrintScreenObj = new PrintScreenObj();
		SelectDropdown varSelectDropdown = new SelectDropdown();
		InserirValorxPath varInserirValorxPath = new InserirValorxPath();
		ColunasTabela varColunasTabela = new ColunasTabela();
		VerificarQtdElementosTabela varVerificarQtdElementosTabela = new VerificarQtdElementosTabela();
		VerificarConteudoTabela varVerificarConteudoTabela = new VerificarConteudoTabela();
		
		varRepositorio.setLabel("Prestador");
		varProcuraElementosxPath.procuraElementosxPath(varRepositorio.varMenuSidebar, "Prestador");
		varEsperaExistir.esperaExistir(varRepositorio.varTituloModulo, "Prestador");
		varProcuraElementosxPath.procuraElementosxPath(varRepositorio.varModuloBotao, "Consultar NFS-e");
		varEsperaExistir.esperaExistir(varRepositorio.varTituloModulo, "Para consultar uma nota fiscal");
		varEsperaExistir.esperaExistir(varRepositorio.varBuscarPorLabel, "Buscar por");
		varRepositorio.setLabel("Per�odo ou Intervalo");
		varSelectDropdown.selectDropdown(varRepositorio.varBuscarPorButton, varRepositorio.varBuscarPorSelect);
		varEsperaExistir.esperaExistir(varRepositorio.varInicioPeriodoLabel, "N� da NFS-e/Doc. do Tomador");
		//varInserirValorxPath.inserirValorxPath(varRepositorio.varInicioPeriodoInput, "01/01/2017");
		varEsperaExistir.esperaExistir(varRepositorio.varFimPeriodoLabel, "Fim do per�odo");
		//varInserirValorxPath.inserirValorxPath(varRepositorio.varFimPeriodoInput, "05/05/2017");
		
		varClicarBotaoxPath.clicarBotaoxPath(varRepositorio.varBuscarButton);
		
		varEsperaExistir.esperaExistir(varRepositorio.varPesquisarLabel, "Pesquisar");
		varInserirValorxPath.inserirValorxPath(varRepositorio.varPesquisarInput, "8990");
		varEsperaExistir.esperaExistir(varRepositorio.varExibirLabel, "Exibir");
		varInserirValorxPath.inserirValorxPath(varRepositorio.varExibirInput, "5");
		varColunasTabela.colunasTabela(varRepositorio.varTableColuna, "N�mero NFS-e");
		varColunasTabela.colunasTabela(varRepositorio.varTableColuna, "Data");
		varColunasTabela.colunasTabela(varRepositorio.varTableColuna, "Base C�lculo");
		varColunasTabela.colunasTabela(varRepositorio.varTableColuna, "Imposto");
		varColunasTabela.colunasTabela(varRepositorio.varTableColuna, "Cr�dito");
		varColunasTabela.colunasTabela(varRepositorio.varTableColuna, "Valor Total da NFS-e");
		varColunasTabela.colunasTabela(varRepositorio.varTableColuna, "Data Cancelamento");
		varColunasTabela.colunasTabela(varRepositorio.varTableColuna, "Motivo do Cancelamento");
		varColunasTabela.colunasTabela(varRepositorio.varTableColuna, "A��es");
		varVerificarQtdElementosTabela.verificarQtdElementosTabela(varRepositorio.varTableNumberElements, "1");
		varVerificarConteudoTabela.verificarConteudoTabela(
				varRepositorio.varTableColuna, 
				varRepositorio.varTableRow, 
				"N�mero NFS-e", 
				"8990",
				"8990");
		varVerificarConteudoTabela.verificarConteudoTabela(
				varRepositorio.varTableColuna, 
				varRepositorio.varTableRow, 
				"Data", 
				"8990",
				"10/04/2017");
		varVerificarConteudoTabela.verificarConteudoTabela(
				varRepositorio.varTableColuna, 
				varRepositorio.varTableRow, 
				"Data", 
				"8990",
				"100,00");
		varVerificarConteudoTabela.verificarConteudoTabela(
				varRepositorio.varTableColuna, 
				varRepositorio.varTableRow, 
				"Data", 
				"8990",
				"5,00");
		varVerificarConteudoTabela.verificarConteudoTabela(
				varRepositorio.varTableColuna, 
				varRepositorio.varTableRow, 
				"Data", 
				"8990",
				"0,00");
		varVerificarConteudoTabela.verificarConteudoTabela(
				varRepositorio.varTableColuna, 
				varRepositorio.varTableRow, 
				"Data", 
				"8990",
				"105,00");
		varVerificarConteudoTabela.verificarConteudoTabela(
				varRepositorio.varTableColuna, 
				varRepositorio.varTableRow, 
				"Data", 
				"8990",
				"Valor Indevido	");
	}*/
	
	@Test
	public void test7_validaConteudoTomadorEmissaoNota() {
		Repositorio varRepositorio = new Repositorio();
		EsperaExistir varEsperaExistir = new EsperaExistir();
		ClicarBotaoxPath varClicarBotaoxPath = new ClicarBotaoxPath();
		ClickIconeMenu varClickIconeMenu = new ClickIconeMenu();
		ProcuraElementosxPath varProcuraElementosxPath = new ProcuraElementosxPath();
		PrintScreenObj varPrintScreenObj = new PrintScreenObj();
		SelectDropdown varSelectDropdown = new SelectDropdown();
		InserirValorxPath varInserirValorxPath = new InserirValorxPath();
		ColunasTabela varColunasTabela = new ColunasTabela();
		VerificarQtdElementosTabela varVerificarQtdElementosTabela = new VerificarQtdElementosTabela();
		VerificarConteudoTabela varVerificarConteudoTabela = new VerificarConteudoTabela();
		VerificaStatusCheckbox varVerificaStatusCheckbox = new VerificaStatusCheckbox();
		
		varRepositorio.setLabel("Tomador");
		varProcuraElementosxPath.procuraElementosxPath(varRepositorio.varMenuSidebar, "Tomador");
		varEsperaExistir.esperaExistir(varRepositorio.varTituloModulo, "Tomador");
		varProcuraElementosxPath.procuraElementosxPath(varRepositorio.varModuloBotao, "Emiss�o de nova NFTS-e");
		varEsperaExistir.esperaExistir(varRepositorio.varTituloModulo, "Para emitir nota fiscal");
		//Tela 1
		varEsperaExistir.esperaExistir(varRepositorio.varTituloModuloLabel, "Dados prestador");
		varEsperaExistir.esperaExistir(varRepositorio.varCPFCNPJLabel, "CPF/CNPJ");
		varInserirValorxPath.inserirValorxPath(varRepositorio.varCPFCNPJInput, "429.331.758-94");
		varClicarBotaoxPath.clicarBotaoxPath(varRepositorio.varCPFCNPJButton);
		//Tela 2
		varEsperaExistir.esperaExistir(varRepositorio.varInscricaoMunicipalLabel, "Inscri��o Municipal: 1234567");
		varEsperaExistir.esperaExistir(varRepositorio.varInscricaoMunicipalValue, "1234567");
		varEsperaExistir.esperaExistir(varRepositorio.varNomeEmpresaLabel, "Nome: Empresa XPTO LTDA");
		varEsperaExistir.esperaExistir(varRepositorio.varNomeEmpresaValue, "Empresa XPTO LTDA");
		varEsperaExistir.esperaExistir(varRepositorio.varInscricaoEstadualLabel, "Inscri��o Estadual: 43434");
		varEsperaExistir.esperaExistir(varRepositorio.varInscricaoEstadualValue, "43434");
		varEsperaExistir.esperaExistir(varRepositorio.varEnderecoLabel, "Endere�o: Rua Bogaert, 107 - Vila Vermelha - Sacom� - SP - CEP: 09090-090");
		varEsperaExistir.esperaExistir(varRepositorio.varEnderecoValue, "Rua Bogaert, 107 - Vila Vermelha - Sacom� - SP - CEP: 09090-090");
		//varClicarBotaoxPath.clicarBotaoxPath(varRepositorio.varPrestadorSimplesCheckbox);
		//varVerificaStatusCheckbox.verificaStatusCheckbox(varRepositorio.varPrestadorSimplesCheckbox);
		varClicarBotaoxPath.clicarBotaoxPath(varRepositorio.varContinuarBotao);
		//Tela 3
		varEsperaExistir.esperaExistir(varRepositorio.varTituloModuloLabel, "Dados prestador");
		varEsperaExistir.esperaExistir(varRepositorio.varNomeDaEmpresaLabel, "Nome da empresa");
		varInserirValorxPath.inserirValorxPath(varRepositorio.varNomeDaEmpresaInput, "EMPRESA TESTE");
		varEsperaExistir.esperaExistir(varRepositorio.varInfoDaEmpresaLabel, "Informa��es da empresa prestadora");
		varInserirValorxPath.inserirValorxPath(varRepositorio.varInfoDaEmpresaInput, "Teste descri��o");
		varClicarBotaoxPath.clicarBotaoxPath(varRepositorio.varContinuarBotao2);
		varEsperaExistir.esperaExistir(varRepositorio.varTituloModuloLabel, "Dados servi�o");
		varEsperaExistir.esperaExistir(varRepositorio.varItemServicoAtividadeLabel, "Item Servi�o/Atividade");
		varRepositorio.setLabel("14.01/952910600");
		varSelectDropdown.selectDropdown(varRepositorio.varItemServicoAtividadeSelect);
		varEsperaExistir.esperaExistir(varRepositorio.varNumeroAtividadeLabel, "N�mero");
		varInserirValorxPath.inserirValorxPath(varRepositorio.varNumeroAtividadeInput, "0149");
		varEsperaExistir.esperaExistir(varRepositorio.varValorServicoLabel, "Valor do servi�o");
		varInserirValorxPath.inserirValorxPath(varRepositorio.varValorServicoInput, "3000");
		varEsperaExistir.esperaExistir(varRepositorio.varSerieLabel, "S�rie");
		varInserirValorxPath.inserirValorxPath(varRepositorio.varSerieInput, "A");
		varEsperaExistir.esperaExistir(varRepositorio.varDataServicoLabel, "Data do servi�o");
		varInserirValorxPath.inserirValorxPath(varRepositorio.varDataServicoInput, "25/07/2017");
		varEsperaExistir.esperaExistir(varRepositorio.varTipoLabel, "Tipo");
		varInserirValorxPath.inserirValorxPath(varRepositorio.varDataServicoInput, "25/07/2017");
		
		
	}
	
	
	@AfterMethod
	public void sairNavegador() {
		FecharNavegador varFecharNavegador = new FecharNavegador();
		varFecharNavegador.fecharNavegador();
	}
	
}
