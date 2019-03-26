package ExercicioSMS;

import static ExercicioSMS.SMSUtils.tradutor;

public class SMS {

	public static String decodificadorSms(String digito) {
		verificaLimiteDeCaracteres(digito);

		String acumuladorCaracteres = "";
		String acumuladorDigitos = "";

		int quantidadeDeDigitos = digito.length();

		for (int posicaoDosDigitos = 0; posicaoDosDigitos < quantidadeDeDigitos; posicaoDosDigitos++) {

			String posicaoAtual = digito.substring(posicaoDosDigitos, posicaoDosDigitos + 1);
			int ultimaPosicao = quantidadeDeDigitos - 1;

			if (posicaoDosDigitos == 0) {
				acumuladorDigitos = posicaoAtual;
			}

			if (posicaoDosDigitos < ultimaPosicao) {
				String proximaPosicao = digito.substring(posicaoDosDigitos + 1, posicaoDosDigitos + 2);

				if (posicaoAtual.equals(proximaPosicao)) {
					acumuladorDigitos += posicaoAtual;
				} else {
					acumuladorCaracteres += tradutor(acumuladorDigitos);
					acumuladorDigitos = proximaPosicao;
				}
			} else {
				acumuladorCaracteres += tradutor(acumuladorDigitos);
			}
		}
		return acumuladorCaracteres;
	}

	public static String verificaLimiteDeCaracteres(String digito) {
		if (digito.length() > 255) {
			return "Limite de caracteres ultrapassado";
		}
		return digito;
	}
}