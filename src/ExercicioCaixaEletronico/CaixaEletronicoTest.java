package ExercicioCaixaEletronico;

import org.junit.Assert;
import org.junit.Test;

public class CaixaEletronicoTest {

	@Test
	public void distribuirNotas80Reais(){
		Assert.assertEquals("Entregar 1 nota de R$50, 1 nota de R$20, 1 nota de R$10", CaixaEletronico.distribuirNotas(80.00));
	}
	
	@Test
	public void distribuirNotas110Reais(){
		Assert.assertEquals("Entregar 1 nota de R$100, 1 nota de R$10", CaixaEletronico.distribuirNotas(110.00));
	}
	
	@Test
	public void distribuirNotas10Reais(){
		Assert.assertEquals("Entregar 1 nota de R$10", CaixaEletronico.distribuirNotas(10.00));
	}
}