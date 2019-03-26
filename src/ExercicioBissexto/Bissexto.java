package ExercicioBissexto;

public class Bissexto {

	public static String isBissexto(Integer ano) {
		
		String ANO_NAO_BISSEXTO = "Ano não é Bissexto";
		String ANO_BISSEXTO = "Ano é Bissexto";

		boolean isAnoDivisivelPor4 = ano % 4 == 0;
		boolean isDivisivelPor400 = ano % 400 == 0;
		boolean isAnoDivisivelPor100 = ano % 100 == 0;
		boolean isDivisivelPor4ENao100 = isAnoDivisivelPor4 && !isAnoDivisivelPor100;
		
		if (isDivisivelPor4ENao100) {
			return ANO_BISSEXTO;
		}
		if (isDivisivelPor400) {
			return ANO_BISSEXTO;
		}

		if (isAnoDivisivelPor4) return ANO_BISSEXTO;
		
		return ANO_NAO_BISSEXTO;
	}
}
