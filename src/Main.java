import java.util.Scanner;

import Iphone.Iphone;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Iphone iphone = new Iphone();

		while (true) {
			System.out.println("O que deseja fazer?");
			System.out.println("Usar [T]elefone, Reproduzir [M]esica. Navegar na [I]nternet ou [D]esligar?");
			String x = sc.nextLine();
			System.out.println(x);
			if (x.toLowerCase() == "d" || x.toLowerCase() == "desligar") {
				System.out.println("Desligando aparelho.");
				break;
			} else {
				switch (x.toLowerCase()) {

				case "internet":
				case "i":
					System.out.println("[E]xibir pagina, Adicionar [N]ova Aba ou [A]tualizar Pagina?");
					String internet = sc.nextLine();
					switch (internet.toLowerCase()) {
					case "e":
					case "exibir pagina":
						iphone.exibirPagina();
						break;
					case "n":
					case "adicionar nova aba":
						iphone.adicionarNovaAba();
						break;
					case "a":
					case "atualizar pagina":
						iphone.atualizarPagina();
						break;
					}

				case "reproduzir musica":
				case "m":
					System.out.println("[T]ocar, [P]ausar ou [S]elecionar Musica?");
					String musica = sc.nextLine();
					switch (musica.toLowerCase()) {
					case "t":
					case "tocar":
						iphone.tocar();
						break;
					case "p":
					case "pausar":
						iphone.pausar();
						break;
					case "s":
					case "selecionar musica":
						iphone.selecionarMusica();
						break;
					}

				case "telefone":
				case "t":
					System.out.println("[L]igar, [A]tender ou Iniciar [C]orreio de Voz");
					String telefone = sc.nextLine();
					switch (telefone.toLowerCase()) {
					case "ligar":
					case "l":
						iphone.ligar();
						break;
					case "a":
					case "atender":
						iphone.atender();
						break;
					case "c":
					case "iniciar correio de voz":
						iphone.iniciarCorreioVoz();
						break;
					}
				}

			}

		}
	}

}
