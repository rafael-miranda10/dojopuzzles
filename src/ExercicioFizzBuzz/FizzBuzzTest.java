package ExercicioFizzBuzz;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void transformaString() {
		Assert.assertEquals("1", FizzBuzz.verificar(1));
	}
	
	@Test
	public void verificaTres() {
		
		Assert.assertEquals("Fizz", FizzBuzz.verificar((3)));
		
	}
	
	@Test
	public void verificaCinco() {
		Assert.assertEquals("Buzz", FizzBuzz.verificar(5));
		
	}
	
	@Test
	public void verificaQuinze() {
		Assert.assertEquals("FizzBuzz", FizzBuzz.verificar(15));
		
	}

	@Test
	public void contador() {
		Integer i;
		for (i=1; i<=15; i++) {
			System.out.println(FizzBuzz.verificar(i));
		}
	}
}