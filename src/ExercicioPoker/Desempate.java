package ExercicioPoker;

import static ExercicioPoker.Ferramentas.valorNaipe;
import static ExercicioPoker.Ferramentas.getMaiorNaipe;
import static ExercicioPoker.Ferramentas.getNumeroMaisRepetido;
import static ExercicioPoker.Ferramentas.pesoDaCarta;
import static ExercicioPoker.Ferramentas.separarNaipe;

import java.util.List;

public class Desempate {

	public static String jogadaDesempate(List<Carta> cartasDoJogador1, List<Carta> cartasDoJogador2, String resultado) {
		
		switch (resultado) {
		case "Quadra": return desempatePorNumero(cartasDoJogador1, cartasDoJogador2, resultado, Jogada.QUATRO_REPETICOES);
		case "Trinca": return desempatePorNumero(cartasDoJogador1, cartasDoJogador2, resultado, Jogada.TRES_REPETICOES);
		case "Dois Pares": return desempatePorNumero(cartasDoJogador1, cartasDoJogador2, resultado, Jogada.DUAS_REPETICOES);
		case "Um Par": return desempatePorNumero(cartasDoJogador1, cartasDoJogador2, resultado,Jogada.DUAS_REPETICOES);	
		default : return "Erro ao procurar critério de desempate";
		}
	}

	private static String desempatePorNumero(List<Carta> cartasDoJogador1, List<Carta> cartasDoJogador2,
			String resultado, int repeticoes) {

		String numeroMaisRepetidoJogador1 = getNumeroMaisRepetido(cartasDoJogador1, repeticoes);
		String numeroMaisRepetidoJogador2 = getNumeroMaisRepetido(cartasDoJogador2, repeticoes);

		Integer pesoDaCartaJogador1 = pesoDaCarta(numeroMaisRepetidoJogador1);
		Integer pesoDaCartaJogador2 = pesoDaCarta(numeroMaisRepetidoJogador2);
		
		if (pesoDaCartaJogador1 == pesoDaCartaJogador2) {
			return desempatePorNaipe(separarNaipe(cartasDoJogador1), separarNaipe(cartasDoJogador2));
		}

		if (pesoDaCartaJogador1 > pesoDaCartaJogador2) {
			return "Vencedor: Jogador 1, Jogada: " + resultado + ", Maior Carta: " + numeroMaisRepetidoJogador1;
		}
		return "Vencedor: Jogador 2, Jogada: " + resultado + ", Maior Carta: " + numeroMaisRepetidoJogador2;
	}

	public static String desempatePorNaipe(List<String> naipesJogador1, List<String> naipesJogador2) {
		
		String maiorNaipeJogador1 = getMaiorNaipe(naipesJogador1);
		Integer valorNaipeJogador1 = valorNaipe(maiorNaipeJogador1);
		
		String maiorNaipeJogador2 = getMaiorNaipe(naipesJogador2);
		Integer valorNaipeJogador2 = valorNaipe(maiorNaipeJogador2);
		
		if (valorNaipeJogador1 > valorNaipeJogador2) {
			return "Vencedor: Jogador 1, Desempate por naipe: " + maiorNaipeJogador1;
		}
			return "Vencedor: Jogador 2, Desempate por naipe: " + maiorNaipeJogador2;
	}
}
