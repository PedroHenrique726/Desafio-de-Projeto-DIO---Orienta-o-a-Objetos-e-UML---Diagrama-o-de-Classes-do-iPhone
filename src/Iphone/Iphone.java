package Iphone;
import Navegador.NavegadorInternet;
import ReprodutorMusical.ReprodutorMusical;
import Telefone.AparelhoTelefonico;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo Pagina");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando Pagina");
		
	}

	@Override
	public void ligar() {
		System.out.println("ligando para contato");
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo ligacao");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando Correio de Voz");
		
	}

	@Override
	public void tocar() {
		System.out.println("tocando musica");
		
	}

	@Override
	public void pausar() {
		System.out.println("Pausando Musica");
		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecioando Musica");
		
	}
	
	

}
