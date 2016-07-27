import static org.junit.Assert.*;

import org.junit.Test;

public class SieveTest {

	@Test
	public void illegalExceptionTestFail() {
		Sieve x = new Sieve();
		String[] input = {"a"};
		x.calculateMax(input);
	}
	
	@Test
	public void illegalExceptionTestPass() {
		Sieve x = new Sieve();
		String[] input = {"4"};
		int output = x.calculateMax(input);
		assertEquals(output, 4);
	}
	
	@Test
	public void illegalExceptionTestNoInput() {
		Sieve x = new Sieve();
		String[] input = {""};
		int output = x.calculateMax(input);	
	}
	
	@Test
	public void illegalExceptionTestValidInput() {
		Sieve x = new Sieve();
		String[] input = {"55"};
		int output = x.calculateMax(input);
		assertEquals(output, 55);	
	}

}
