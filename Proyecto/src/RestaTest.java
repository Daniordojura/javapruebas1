import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RestaTest {

	@Test
	public void test() {
		Resta R = new Resta(4,2);
		assertTrue(R.restar() == 2 );
	}

}
