package ExercicioPoker;

import static ExercicioPoker.Desempate.jogadaDesempate;
import static ExercicioPoker.Ferramentas.mostrarVencedor;
import static ExercicioPoker.Ferramentas.separarNaipe;
import static ExercicioPoker.Ferramentas.separarNumero;
import static ExercicioPoker.Jogada.isCartaAlta;
import static ExercicioPoker.Jogada.isDoisPares;
import static ExercicioPoker.Jogada.isFlush;
import static ExercicioPoker.Jogada.isFullHouse;
import static ExercicioPoker.Jogada.isQuadra;
import static ExercicioPoker.Jogada.isRoyalFlush;
import static ExercicioPoker.Jogada.isStraight;
import static ExercicioPoker.Jogada.isTrinca;
import static ExercicioPoker.Jogada.isUmPar;
import static ExercicioPoker.Jogada.maiorCartaDoBaralho;

import java.util.List;

public class Jogo {

	public static String inicializarJogo(List<Carta> cartasDoJogador1, List<Carta> cartasDoJogador2) {

		String resultadoJogador1 = resultado(cartasDoJogador1);
		String resultadoJogador2 = resultado(cartasDoJogador2);
		
		if (resultadoJogador1 == resultadoJogador2) {
			
			return jogadaDesempate(cartasDoJogador1, cartasDoJogador2, resultadoJogador1);
		}
		
		return mostrarVencedor(resultadoJogador1, resultadoJogador2);
	}

	public static String resultado(List<Carta> cartasDaJogada) {
		
		List<String> numerosDasCartas = separarNumero(cartasDaJogada);
		
		List<String> naipesDasCartas = separarNaipe(cartasDaJogada);

		if (isQuadra(numerosDasCartas)) {
			return "Quadra";
		}

		if (isFullHouse(numerosDasCartas)) {
			return "Full House";
		}

		if (isFlush(naipesDasCartas)) {
			
			if (isRoyalFlush(numerosDasCartas)) {
				return "Royal Flush";
			}

			if (isStraight(numerosDasCartas)) {
				return "Straight Flush";
			}

			return "Flush";
		}

		if (isStraight(numerosDasCartas)) {
			return "Straight";
		}

		if (isTrinca(numerosDasCartas)) {
			return "Trinca";
		}

		if (isDoisPares(numerosDasCartas)) {
			return "Dois Pares";
		}

		if (isUmPar(numerosDasCartas)) {
			return "Um Par";
		}

		if (isCartaAlta(numerosDasCartas)) {
			return "Carta Alta: " + maiorCartaDoBaralho(numerosDasCartas);
		} 

		return "Esta jogada não existe, tente novamente";
	}
}