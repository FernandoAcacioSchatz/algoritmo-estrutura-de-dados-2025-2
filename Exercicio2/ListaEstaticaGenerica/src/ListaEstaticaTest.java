
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ListaEstativaTest {
	ListaEstatica<Integer> teste = new ListaEstatica<>();

	@BeforeEach
	public void setUp() {
		teste.inserir(5);
		teste.inserir(10);
		teste.inserir(15);
		teste.inserir(20);

	}

	@Test
	void test1() {
		String retornoE = "5,10,15,20";
		String retorno = teste.toString();
		assertEquals(retornoE, retorno);
	}

	@Test
	void test2() {
		int tamanho = teste.getTamanho();
		assertEquals(4, tamanho);
	}

	@Test
	void test3() {
		assertEquals(2, teste.buscar(15));
	}

	@Test
	void test4() {
		assertEquals(-1, teste.buscar(30));
	}

	@Test
	void test5() {
		teste.retirar(10);
		String retornoE = "5,15,20";
		String retorno = teste.toString();
		assertEquals(retornoE, retorno);
	}

	@Test
	void test6() {
		ListaEstatica teste2 = new ListaEstatica();
		for (int i = 1; i <= 15; i++) {
			teste2.inserir(i);
		}
		String retornoE = "1,2,3,4,5,6,7,8,9,10,11,12,13,14,15";
		String retorno = teste2.toString();
		assertEquals(retornoE, retorno);
	}

	@Test
	void test7() {
		int retornoE = 20;
		int retorno = teste.obterElemento(3);
		assertEquals(retornoE, retorno);
	}

	@Test
	void test8() {
		Exception exception = assertThrows(RuntimeException.class, () -> teste.obterElemento(5));
		assertEquals("Índice 5 fora dos limites para comprimento 4", exception.getMessage());
	}

	@Test
	void test9() {
		teste.liberar();
		assertTrue(teste.estaVazia());
	}

	@Test
	void test10() {
		String retornoE = "20,15,10,5";

		teste.inverter();

		String retorno = teste.toString();

		assertEquals(retornoE, retorno);
	}

	@Test
	void test11() {
		teste.inserir(25);

		String retornoE = "25,20,15,10,5";

		teste.inverter();

		String retorno = teste.toString();

		assertEquals(retornoE, retorno);
	}

}