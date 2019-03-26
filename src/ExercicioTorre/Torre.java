package ExercicioTorre;

public class Torre {

	public static Integer quantidadeDiscos(Integer discos) {
		return discos;
	}

	static Integer contador = 0;
	
	public static String executaTorre(Integer discos, String origem, String auxiliar, String destino) {

		if (discos > 0) {

			executaTorre(discos - 1, origem, destino, auxiliar);
			System.out.printf("mover disco da posicao " + origem + " para a posicao " + destino + "\n");
			contador++;
			executaTorre(discos - 1, auxiliar, origem, destino);

			return "São necessárias " + contador.toString() + " jogada(s)";

			}

		return "Não é possivel executar a torre com 0 discos";

	}

	public static void limpaContador() {
		contador = 0;
	}
}
