package ExercicioBissexto;

import org.junit.Assert;
import org.junit.Test;


public class BissextoTest {

	@Test
	public void divisivelPor400() {
		Assert.assertEquals("Ano é Bissexto", Bissexto.isBissexto(2020));
	}
	
	@Test
	public void divisivelPor4() {
		Assert.assertEquals("Ano é Bissexto", Bissexto.isBissexto(2016));
	}
	
	@Test
	public void divisivelPor4eNao100() {
		Assert.assertEquals("Ano é Bissexto", Bissexto.isBissexto(800));
	}
}
