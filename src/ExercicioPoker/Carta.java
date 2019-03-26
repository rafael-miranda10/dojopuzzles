package ExercicioPoker;

public class Carta {

	private String numero;
	private String naipe;
	
	public Carta(String numero, String naipe) {
		this.numero = numero;
		this.naipe = naipe;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String carta) {
		this.numero = carta;
	}

	public String getNaipe() {
		return naipe;
	}

	public void setNaipe(String naipe) {
		this.naipe = naipe;
	}
	
}