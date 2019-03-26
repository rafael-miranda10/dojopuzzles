package ExercicioSMS;

import java.util.HashMap;
import java.util.Map;

public class SMSUtils {

	public static String tradutor(String digito) {

		Map<String, String> map = inicializaMapaCaracteres();

		return map.get(digito);
	}

	private static Map<String, String> inicializaMapaCaracteres() {
		Map<String, String> map = new HashMap<>();
		
		map.put("2", "A");
		map.put("22", "B");
		map.put("222", "C");
		
		map.put("3", "D");
		map.put("33", "E");
		map.put("333", "F");
		
		map.put("4", "G");
		map.put("44", "H");
		map.put("444", "I");
		
		map.put("5", "J");
		map.put("55", "K");
		map.put("555", "L");
		
		map.put("6", "M");
		map.put("66", "N");
		map.put("666", "O");
		
		map.put("7", "P");
		map.put("77", "Q");
		map.put("777", "R");
		map.put("7777", "S");
		
		map.put("8", "T");
		map.put("88", "U");
		map.put("888", "V");
		
		map.put("9", "W");
		map.put("99", "X");
		map.put("999", "Y");
		map.put("9999", "Z");
		
		map.put("0", " ");
		
		map.put("_", "");

		return map;
	}
}
