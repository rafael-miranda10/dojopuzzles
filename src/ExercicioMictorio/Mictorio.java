package ExercicioMictorio;

public class Mictorio {

	private boolean isLivre;
	private boolean isDisponivel;
	
	public Mictorio(boolean isLivre, boolean isDisponivel) {
		this.isLivre = isLivre;
		this.isDisponivel = isDisponivel;
	}

	public boolean isLivre() {
		return isLivre;
	}

	public void setLivre(boolean isLivre) {
		this.isLivre = isLivre;
	}

	public boolean isDisponivel() {
		return isDisponivel;
	}

	public void setDisponivel(boolean isDisponivel) {
		this.isDisponivel = isDisponivel;
	}

}