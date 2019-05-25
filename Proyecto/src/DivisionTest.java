import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DivisionTest {

	@Test
	public void test() {
		Division D = new Division(10,2);
		assertTrue(D.dividir() == 5 );
	}

}
