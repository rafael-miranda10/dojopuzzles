package ExercicioPoker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CartaUtils {

	public static final String AZ = "A";
	public static final String REIS = "K";
	public static final String DAMA = "Q";
	public static final String VALETE = "J";
	public static final String DEZ = "T";
	public static final String NOVE = "9";
	public static final String OITO = "8";
	public static final String SETE = "7";
	public static final String SEIS = "6";
	public static final String CINCO = "5";
	public static final String QUATRO = "4";
	public static final String TRES = "3";
	public static final String DOIS = "2";
	
	public static final String PAUS = "D";
	public static final String COPAS = "C";
	public static final String ESPADILHA = "H";
	public static final String OUROS = "S";
	
	public static List<String> jogadas = Arrays.asList("Carta Alta", "Um Par", "Dois Pares", "Trinca", "Straight",
			"Flush", "Full House", "Quadra", "Straight Flush", "Royal Flush");
	
	public static List<String> naipes = Arrays.asList(OUROS, ESPADILHA, COPAS, PAUS);

	public static List<String> sequenciaCartas = Arrays.asList(DOIS, TRES, QUATRO, CINCO, SEIS, SETE, OITO, NOVE, DEZ, VALETE, DAMA, REIS, AZ);
	
	public static List<String> numerosRoyalFlush() {

		List<String> cartasRoyalFlush = new ArrayList<>();
		cartasRoyalFlush.add(AZ);
		cartasRoyalFlush.add(REIS);
		cartasRoyalFlush.add(DAMA);
		cartasRoyalFlush.add(VALETE);
		cartasRoyalFlush.add(DEZ);

		return cartasRoyalFlush;
	}
}

