package unlam.code.golf;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class SecuenciaTest {

	@Test
	void test1() {
		Secuencia sec = new Secuencia();
		int[] s = {1, 4, 10, -2, 0};
		Assert.assertTrue(sec.secuenciaCiclica(s));
	}
	
	@Test
	void test2() {
		Secuencia sec = new Secuencia();
		int[] s = {-2, 0, -1};
		Assert.assertFalse(sec.secuenciaCiclica(s));
	}
	
	@Test
	void test3() {
		Secuencia sec = new Secuencia();
		int[] s = {1};
		Assert.assertTrue(sec.secuenciaCiclica(s));
	}
	
	@Test
	void test4() {
		Secuencia sec = new Secuencia();
		int[] s = {1, 2, 3, 4, 5};
		Assert.assertTrue(sec.secuenciaCiclica(s));
	}
	
	@Test
	void test5() {
		Secuencia sec = new Secuencia();
		int[] s = {5, 4, 3, 2, 1};
		Assert.assertFalse(sec.secuenciaCiclica(s));
	}
	
	@Test
	void test6() {
		Secuencia sec = new Secuencia();
		int[] s = {-1};
		Assert.assertTrue(sec.secuenciaCiclica(s));
	}
	
	@Test
	void test7() {
		Secuencia sec = new Secuencia();
		int[] s = {0,0,0};
		Assert.assertTrue(sec.secuenciaCiclica(s));
	}

}
