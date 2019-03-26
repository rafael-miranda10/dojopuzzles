package ExercicioPoker;

import static ExercicioPoker.CartaUtils.jogadas;
import static ExercicioPoker.CartaUtils.naipes;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Ferramentas {

	public static List<String> separarNaipe(List<Carta> cartasDaJogada) {
		List<String> naipesDasCartas = cartasDaJogada.stream().map(Carta::getNaipe).collect(Collectors.toList());
		return naipesDasCartas;
	}

	public static List<String> separarNumero(List<Carta> cartasDaJogada) {
		List<String> numerosDasCartas = cartasDaJogada.stream().map(Carta::getNumero).collect(Collectors.toList());
		return numerosDasCartas;
	}

	public static Integer repeticoes(List<String> cartas, String carta) {
		return Collections.frequency(cartas, carta);
	}

	public static Boolean frequencia(List<String> cartas, String carta, int numeroFrequenca) {
		return Collections.frequency(cartas, carta) == numeroFrequenca;
	}

	public static Integer valorJogada(String jogada) {
		return jogadas.indexOf(jogada);
	}
	
	public static int valorNaipe(String maiorNaipeJogador2) {
		return naipes.indexOf(maiorNaipeJogador2);
	}

	public static String nomeJogada(Integer valorJogada) {
		return jogadas.get(valorJogada);
	}

	public static String mostrarVencedor(String jogadaJogador1, String jogadaJogador2) {

		if (valorJogada(jogadaJogador1) > valorJogada(jogadaJogador2)) {
			return "Vencedor: Jogador 1, Jogada: " + jogadaJogador1;
		}

		return "Vencedor: Jogador 2, Jogada: " + jogadaJogador2;
	}

	public static Integer pesoDaCarta(String carta) {
		return CartaUtils.sequenciaCartas.indexOf(carta);
	}

	public static String getMaiorNaipe(List<String> naipesJogador) {
		
		List<String> interseccaoListaJogadorComListaNaipes = interseccaoDaJogadaComNaipes(naipesJogador);
		Integer indexDoMaiorNaipeJogador = pegarIndexDoMaiorNaipe(interseccaoListaJogadorComListaNaipes);
		String maiorNaipeJogador = pegarMaiorNaipe(interseccaoListaJogadorComListaNaipes, indexDoMaiorNaipeJogador);
		
		return maiorNaipeJogador;
	}

	public static String getNumeroMaisRepetido(List<Carta> jogador, int repeticoes) {
		
		String numeroMaisRepetidoJogador = "";
		
		for (Carta carta : jogador) {
			if (frequencia(separarNumero(jogador), carta.getNumero(), repeticoes)) {
				numeroMaisRepetidoJogador = carta.getNumero();
			}
		}
		return numeroMaisRepetidoJogador;
	}

	private static Integer pegarIndexDoMaiorNaipe(List<String> interseccaoPrimeiraLista) {
		return Collections.max(interseccaoPrimeiraLista.stream().map(x -> interseccaoPrimeiraLista.indexOf(x)).collect(Collectors.toList()));
	}
	
	private static String pegarMaiorNaipe(List<String> interseccaoPrimeiraLista, Integer indexDoMaiorNaipeJogador1) {
		return interseccaoPrimeiraLista.get(indexDoMaiorNaipeJogador1);
	}

	private static List<String> interseccaoDaJogadaComNaipes(List<String> naipesJogador1) {
		return naipes.stream().filter(naipesJogador1::contains).collect(Collectors.toList());
	}
}