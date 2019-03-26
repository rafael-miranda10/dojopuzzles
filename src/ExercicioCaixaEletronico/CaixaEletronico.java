package ExercicioCaixaEletronico;

import java.util.HashMap;
import java.util.Map;

public class CaixaEletronico {

	public static String distribuirNotas(double valor) {

		Map<Integer, Integer> quantidadeDeNotas = map();

		while (valor > 0) {

			if (valor >= 100) {
				valor -= 100;
				quantidadeDeNotas.put(100, quantidadeDeNotas.get(100) + 1);
				continue;
			}

			if (valor >= 50) {
				valor -= 50;
				quantidadeDeNotas.put(50, quantidadeDeNotas.get(50) + 1);
				continue;
			}

			if (valor >= 20) {
				valor -= 20;
				quantidadeDeNotas.put(20, quantidadeDeNotas.get(20) + 1);
				continue;
			}

			if (valor >= 10) {
				valor -= 10;
				quantidadeDeNotas.put(10, quantidadeDeNotas.get(10) + 1);
				continue;
			}
		}

		String msg = "Entregar ";

		for (Map.Entry<Integer, Integer> entry : quantidadeDeNotas.entrySet()) {

			Integer quantidade = entry.getValue();
			Integer nota = entry.getKey();

			if (quantidade > 0) {
				msg += quantidade.toString() + " nota de R$" + nota.toString() + ", ";
			}
		}

		String mensagemFormatada = msg.substring(0, msg.length() - 2);
		
		return mensagemFormatada;
	}

	private static Map<Integer, Integer> map() {

		Map<Integer, Integer> quantidadeDeNotas = new HashMap<>();
		quantidadeDeNotas.put(100, 0);
		quantidadeDeNotas.put(50, 0);
		quantidadeDeNotas.put(20, 0);
		quantidadeDeNotas.put(10, 0);

		return quantidadeDeNotas;
	}
}
