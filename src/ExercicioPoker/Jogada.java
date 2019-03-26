package ExercicioPoker;

import static ExercicioPoker.CartaUtils.sequenciaCartas;
import static ExercicioPoker.Ferramentas.frequencia;
import static ExercicioPoker.Ferramentas.repeticoes;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Jogada {

		public static final int QUATRO_REPETICOES = 4;
		public static final int TRES_REPETICOES = 3;
		public static final int DUAS_REPETICOES = 2;

		public static Boolean isRoyalFlush(List<String> numerosDasCartas) {
			return numerosDasCartas.containsAll(CartaUtils.numerosRoyalFlush());
		}
		
		public static Boolean isQuadra(List<String> numerosDasCartas) {
			String primeiraCarta = numerosDasCartas.get(0);
			String segundaCarta = numerosDasCartas.get(1);

			boolean isQuadra = frequencia(numerosDasCartas, primeiraCarta, QUATRO_REPETICOES)
					|| frequencia(numerosDasCartas, segundaCarta, QUATRO_REPETICOES);

			return isQuadra;
		}

		public static Boolean isFullHouse(List<String> numerosDasCartas) {
			return isTrinca(numerosDasCartas) && isUmPar(numerosDasCartas);
		}

		public static Boolean isFlush(List<String> naipeDasCartas) {
			String naipe = naipeDasCartas.get(0);
			return repeticoes(naipeDasCartas, naipe) == naipeDasCartas.size();
		}

		public static Boolean isStraight(List<String> numerosDasCartas) {
			for (int posicao = 0; posicao < sequenciaCartas.size() - 4; posicao++) {

				List<String> trechoSequencia = sequenciaCartas.subList(posicao,
						calculaPosicaoFinal(posicao, sequenciaCartas.size()));
				if (numerosDasCartas.containsAll(trechoSequencia)) {
					return true;
				}
			}
			return false;
		}

		private static int calculaPosicaoFinal(int posicao, int tamanhoLista) {
			if (posicao > tamanhoLista) {
				return tamanhoLista;
			}

			return posicao + 4;
		}

		public static Boolean isTrinca(List<String> numerosDasCartas) {
			String primeiraCarta = numerosDasCartas.get(0);
			String segundaCarta = numerosDasCartas.get(1);
			String terceiraCarta = numerosDasCartas.get(2);

			boolean isTrinca = frequencia(numerosDasCartas, primeiraCarta, TRES_REPETICOES)
					|| frequencia(numerosDasCartas, segundaCarta, TRES_REPETICOES)
					|| frequencia(numerosDasCartas, terceiraCarta, TRES_REPETICOES);

			return isTrinca;
		}

		public static Boolean isDoisPares(List<String> numerosDasCartas) {

			int contadorDeIguais = 0;

			for (int carta = 0; carta < numerosDasCartas.size(); carta++) {

				String cartas = numerosDasCartas.get(carta);

				if (frequencia(numerosDasCartas, cartas, DUAS_REPETICOES)) {
					contadorDeIguais++;
				}
			}

			boolean contemDoisPares = contadorDeIguais == 4;

			return contemDoisPares;
		}

		public static Boolean isUmPar(List<String> numerosDasCartas) {

			String primeiraCarta = numerosDasCartas.get(0);
			String segundaCarta = numerosDasCartas.get(1);
			String terceiraCarta = numerosDasCartas.get(2);
			String quartaCarta = numerosDasCartas.get(3);

			boolean isPar = frequencia(numerosDasCartas, primeiraCarta, DUAS_REPETICOES)
					|| frequencia(numerosDasCartas, segundaCarta, DUAS_REPETICOES)
					|| frequencia(numerosDasCartas, terceiraCarta, DUAS_REPETICOES)
					|| frequencia(numerosDasCartas, quartaCarta, DUAS_REPETICOES);

			return isPar;
		}
		
		public static Boolean isCartaAlta(List<String> numerosDasCartas) {
			return sequenciaCartas.containsAll(numerosDasCartas);
		}

		public static String maiorCartaDoBaralho(List<String> numerosDasCartas) {
			return Collections
					.max(numerosDasCartas.stream().filter(sequenciaCartas::contains).collect(Collectors.toList()));
		}

}
