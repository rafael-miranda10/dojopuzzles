package ExercicioFizzBuzz;

public class FizzBuzz {
	
	
	public static String verificar(Integer numero) {
		
		boolean isDivisivelPorTres = numero % 3 == 0;
		boolean isDivisivelPorCinco = numero % 5 == 0;
		
		if (isDivisivelPorTres && isDivisivelPorCinco) {
			return "FizzBuzz";
		}
		
		if (isDivisivelPorTres) {
			return "Fizz";
		}
		
		if (isDivisivelPorCinco) {
			return "Buzz";
		}
		
		return numero.toString();
	}
}