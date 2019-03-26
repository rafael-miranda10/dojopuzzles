package ExercicioMictorio;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BanheiroTest {

	List<Mictorio> banheiroCriado;

	@Before
	public void init() {
		banheiroCriado = Banheiro.criaBanheiro(5);
	}

	@Test
	public void verificarQuantidadeMictorios() {
		Assert.assertEquals(5, banheiroCriado.size());
	}

	@Test
	public void verificaSeMictorio4EstaOcupado() {
		List<Integer> mictoriosOcupados = new ArrayList<>();

		mictoriosOcupados.add(3);

		List<Mictorio> banheiro = Banheiro.aplicarRegras(banheiroCriado, mictoriosOcupados);

		Assert.assertFalse(banheiro.get(3).isDisponivel());
		Assert.assertFalse(banheiro.get(3).isLivre());
	}

	@Test
	public void verificaSeMictorio4eAdjacentesEstaoIndisponiveis() {
		List<Integer> mictoriosOcupados = new ArrayList<>();

		mictoriosOcupados.add(3);

		List<Mictorio> banheiro = Banheiro.aplicarRegras(banheiroCriado, mictoriosOcupados);

		for (int posicao = 2; posicao <= 4; posicao++) {
			Assert.assertFalse(banheiro.get(posicao).isDisponivel());
		}
	}

	@Test
	public void verificaSeMictorios1e5EstaoDisponiveis() {
		List<Integer> mictoriosOcupados = new ArrayList<>();

		mictoriosOcupados.add(2);

		List<Mictorio> banheiro = Banheiro.aplicarRegras(banheiroCriado, mictoriosOcupados);

		Assert.assertTrue(banheiro.get(0).isDisponivel());
		Assert.assertTrue(banheiro.get(3).isLivre());
		Assert.assertTrue(banheiro.get(4).isDisponivel());
	}

	@Test
	public void validacaoDeVariosMictoriosOcupados() {
		List<Integer> mictoriosOcupados = new ArrayList<>();

		mictoriosOcupados.add(0);
		mictoriosOcupados.add(1);

		List<Mictorio> banheiro = Banheiro.aplicarRegras(banheiroCriado, mictoriosOcupados);

		Assert.assertTrue(banheiro.get(3).isDisponivel());
		Assert.assertTrue(banheiro.get(2).isLivre());
		Assert.assertTrue(banheiro.get(4).isDisponivel());
	}

	@Test
	public void todosMictoriosLivresEDisponiveis() {
		List<Integer> mictoriosOcupados = new ArrayList<>();

		List<Mictorio> banheiro = Banheiro.aplicarRegras(banheiroCriado, mictoriosOcupados);

		for (int posicao = 0; posicao < banheiroCriado.size(); posicao++) {
			Assert.assertTrue(banheiro.get(posicao).isDisponivel());
			Assert.assertTrue(banheiro.get(posicao).isLivre());
		}
	}

	@Test
	public void nenhumMictorioLivreEDisponivel() {
		List<Integer> mictoriosOcupados = new ArrayList<>();

		for (int posicao = 0; posicao < banheiroCriado.size(); posicao++) {
			mictoriosOcupados.add(posicao);
		}

		List<Mictorio> banheiro = Banheiro.aplicarRegras(banheiroCriado, mictoriosOcupados);

		for (int posicao = 0; posicao < banheiroCriado.size(); posicao++) {
			Assert.assertFalse(banheiro.get(posicao).isDisponivel());
			Assert.assertFalse(banheiro.get(posicao).isLivre());
		}

	}
}
