import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MultiplicacionTest {

	@Test
	public void test() {
		Multiplicar M = new Multiplicar(4,2);
		assertTrue(M.multiplicar() == 8 );
	}

}
