package ExercicioMictorio;

import java.util.ArrayList;
import java.util.List;

public class Banheiro {

	public static List<Mictorio> criaBanheiro(int tamanho) {
		
		List<Mictorio> mictorios = new ArrayList<>();
		
		for (int posicao = 0; posicao < tamanho; posicao++) {
			mictorios.add(new Mictorio(true, true));
		}
		return mictorios;
	}

	public static List<Mictorio> aplicarRegras(List<Mictorio> banheiroCriado, List<Integer> mictoriosOcupados) {
		
		for (int posicao = 0; posicao < banheiroCriado.size(); posicao++) {
			
			if (mictoriosOcupados.contains(posicao)) {
				ocupaPosicaoAtual(banheiroCriado, posicao);
				
				boolean isUltimaPosicao = posicao == banheiroCriado.size() - 1;
				
				if (isUltimaPosicao) {
					ocupaPosicaoAnterior(banheiroCriado, posicao);
				}
				
				boolean isPrimeiraPosicao = posicao == 0;
				
				if (isPrimeiraPosicao) {
					ocupaProximaPosicao(banheiroCriado, posicao);
				
				} if (!isUltimaPosicao && !isPrimeiraPosicao) {
					ocupaPosicaoAnterior(banheiroCriado, posicao);
					ocupaProximaPosicao(banheiroCriado, posicao);
				}
			}
		}
		return banheiroCriado;
	}

	private static void ocupaPosicaoAtual(List<Mictorio> banheiroCriado, int posicao) {
		banheiroCriado.get(posicao).setDisponivel(false);
		banheiroCriado.get(posicao).setLivre(false);
	}

	private static void ocupaProximaPosicao(List<Mictorio> banheiroCriado, int posicao) {
		banheiroCriado.get(posicao + 1).setDisponivel(false);
	}

	private static void ocupaPosicaoAnterior(List<Mictorio> banheiroCriado, int posicao) {
		banheiroCriado.get(posicao - 1).setDisponivel(false);
	}
}
