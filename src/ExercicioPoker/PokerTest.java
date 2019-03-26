package ExercicioPoker;

import static ExercicioPoker.Jogo.inicializarJogo;
import static ExercicioPoker.Jogo.resultado;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class PokerTest {

	private static final Carta VALETE_COPAS = new Carta("J", "H");
	private static final Carta OITO_COPAS = new Carta("8", "H");
	private static final Carta NOVE_COPAS = new Carta("9", "H");
	private static final Carta AS_PAUS = new Carta("A", "C");
	private static final Carta REI_PAUS = new Carta("K", "C");
	private static final Carta DAMA_PAUS = new Carta("Q", "C");
	private static final Carta VALETE_PAUS = new Carta("J", "C");
	private static final Carta SEIS_COPAS = new Carta("6", "H");
	private static final Carta DAMA_COPAS = new Carta("Q", "H");
	private static final Carta SETE_COPAS = new Carta("7", "H");
	private static final Carta SETE_OUROS = new Carta("7", "D");
	private static final Carta SEIS_PAUS = new Carta("6", "C");
	private static final Carta CINCO_ESPADAS = new Carta("5", "S");
	private static final Carta QUATRO_COPAS = new Carta("4", "H");
	private static final Carta NOVE_OUROS = new Carta("9", "D");
	private static final Carta NOVE_PAUS = new Carta("9", "C");
	private static final Carta DEZ_ESPADAS = new Carta("T", "S");
	private static final Carta DEZ_COPAS = new Carta("T", "H");
	private static final Carta DEZ_OUROS = new Carta("T", "D");
	private static final Carta DEZ_PAUS = new Carta("T", "C");
	private static final Carta OITO_ESPADAS = new Carta("8", "S");
	private static final Carta CINCO_COPAS = new Carta("5", "H");
	private static final Carta TRES_COPAS = new Carta("3", "H");

	@Test
	public void criterioUmPar() {
		List<Carta> cartas = new ArrayList<>();
		cartas.add(TRES_COPAS);
		cartas.add(CINCO_COPAS);
		cartas.add(OITO_ESPADAS);
		cartas.add(DEZ_PAUS);
		cartas.add(DEZ_OUROS);
		Assert.assertEquals("Um Par", resultado(cartas));
	}

	@Test
	public void criterioDoisPares() {
		List<Carta> cartas = new ArrayList<>();
		cartas.add(TRES_COPAS);
		cartas.add(DEZ_COPAS);
		cartas.add(DEZ_ESPADAS);
		cartas.add(NOVE_PAUS);
		cartas.add(NOVE_OUROS);
		Assert.assertEquals("Dois Pares", resultado(cartas));
	}

	@Test
	public void criterioTrinca() {
		List<Carta> cartas = new ArrayList<>();
		cartas.add(TRES_COPAS);
		cartas.add(DEZ_COPAS);
		cartas.add(DEZ_ESPADAS);
		cartas.add(NOVE_PAUS);
		cartas.add(DEZ_OUROS);
		Assert.assertEquals("Trinca", resultado(cartas));
	}

	@Test
	public void criterioStraight() {
		List<Carta> cartas = new ArrayList<>();
		cartas.add(TRES_COPAS);
		cartas.add(QUATRO_COPAS);
		cartas.add(CINCO_ESPADAS);
		cartas.add(SEIS_PAUS);
		cartas.add(SETE_OUROS);
		Assert.assertEquals("Straight", resultado(cartas));
	}

	@Test
	public void criterioFlush() {
		List<Carta> cartas = new ArrayList<>();
		cartas.add(TRES_COPAS);
		cartas.add(QUATRO_COPAS);
		cartas.add(SETE_COPAS);
		cartas.add(DEZ_COPAS);
		cartas.add(DAMA_COPAS);
		Assert.assertEquals("Flush", resultado(cartas));
	}

	@Test
	public void criterioFullHouse() {
		List<Carta> cartas = new ArrayList<>();
		cartas.add(TRES_COPAS);
		cartas.add(DEZ_COPAS);
		cartas.add(DEZ_ESPADAS);
		cartas.add(TRES_COPAS);
		cartas.add(DEZ_OUROS);
		Assert.assertEquals("Full House", resultado(cartas));
	}

	@Test
	public void criterioQuadra() {
		List<Carta> cartas = new ArrayList<>();
		cartas.add(DEZ_COPAS);
		cartas.add(TRES_COPAS);
		cartas.add(DEZ_ESPADAS);
		cartas.add(DEZ_PAUS);
		cartas.add(DEZ_OUROS);
		Assert.assertEquals("Quadra", resultado(cartas));
	}

	@Test
	public void criterioStraightFlush() {
		List<Carta> cartas = new ArrayList<>();
		cartas.add(TRES_COPAS);
		cartas.add(QUATRO_COPAS);
		cartas.add(CINCO_COPAS);
		cartas.add(SEIS_COPAS);
		cartas.add(SETE_COPAS);
		Assert.assertEquals("Straight Flush", resultado(cartas));
	}

	@Test
	public void criterioRoyalFlush() {
		List<Carta> cartas = new ArrayList<>();
		cartas.add(DEZ_PAUS);
		cartas.add(VALETE_PAUS);
		cartas.add(DAMA_PAUS);
		cartas.add(REI_PAUS);
		cartas.add(AS_PAUS);
		Assert.assertEquals("Royal Flush", resultado(cartas));
	}

	@Test
	public void straightFlushComLetra() {
		List<Carta> cartas = new ArrayList<>();
		cartas.add(OITO_COPAS);
		cartas.add(NOVE_COPAS);
		cartas.add(DEZ_COPAS);
		cartas.add(VALETE_COPAS);
		cartas.add(DAMA_COPAS);
		Assert.assertEquals("Straight Flush", resultado(cartas));
	}

	@Test
	public void jogo() {
		List<Carta> jogador1 = new ArrayList<>();
		jogador1.add(DEZ_PAUS);
		jogador1.add(VALETE_PAUS);
		jogador1.add(DAMA_PAUS);
		jogador1.add(REI_PAUS);
		jogador1.add(AS_PAUS);
		List<Carta> jogador2 = new ArrayList<>();
		jogador2.add(TRES_COPAS);
		jogador2.add(QUATRO_COPAS);
		jogador2.add(SETE_COPAS);
		jogador2.add(DEZ_COPAS);
		jogador2.add(DAMA_COPAS);
		Assert.assertEquals("Vencedor: Jogador 1, Jogada: Royal Flush", inicializarJogo(jogador1, jogador2));
	}

	@Test
	public void jogoComCartaAlta() {
		List<Carta> jogador1 = new ArrayList<>();
		jogador1.add(VALETE_COPAS);
		jogador1.add(DAMA_PAUS);
		jogador1.add(SEIS_COPAS);
		jogador1.add(SETE_COPAS);
		jogador1.add(AS_PAUS);
		List<Carta> jogador2 = new ArrayList<>();
		jogador2.add(TRES_COPAS);
		jogador2.add(QUATRO_COPAS);
		jogador2.add(DEZ_PAUS);
		jogador2.add(OITO_COPAS);
		jogador2.add(SETE_COPAS);
		Assert.assertEquals("Vencedor: Jogador 2, Jogada: Carta Alta: T", inicializarJogo(jogador1, jogador2));
	}
}
