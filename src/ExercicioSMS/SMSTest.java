package ExercicioSMS;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SMSTest {

		@Test
		public void maximoCaracteres() {
			String caracteres = "";
			for(int contador= 0; contador < 256; contador++) {
				caracteres += "1";
			}
			
			assertEquals(256, caracteres.length());
			
			assertEquals("Limite de caracteres ultrapassado", SMS.verificaLimiteDeCaracteres(caracteres));
		}
	
		@Test
		public void transfornarDigitoUnico() {
			assertEquals("A", SMS.decodificadorSms("2"));
		}

		@Test
		public void transformarDigitoComposto() {
			assertEquals("S", SMS.decodificadorSms("7777"));
		}

		@Test
		public void palavraComposta() {
			assertEquals("MAPA", SMS.decodificadorSms("6272"));
		}
	
		@Test
		public void numerosRepetidos() {
			assertEquals("SAPO", SMS.decodificadorSms("777727666"));
		}
				
		@Test
		public void separarDigitosIguais() {
			assertEquals("BALA", SMS.decodificadorSms("22_25552"));
		}
	
		@Test
		public void dojoPuzzles() {
			assertEquals("SEMPRE ACESSO O DOJOPUZZLES", SMS.decodificadorSms("77773367_7773302_222337777_777766606660366656667889999_9999555337777"));
		}
}
