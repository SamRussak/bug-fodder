import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class Sieve_Test {

	@Rule
	public final ExpectedException exception = ExpectedException.none();
	
	@Test
	public void GoodArgumentTest() {	
		String[] arg = {"10"};		
		Sieve.main(arg);		
		assertTrue(Sieve._max == 10);
	}
	
	@Test
	public void ZeroSizeTest() {	
		String[] arg = {};		
		Sieve.main(arg);		
		assertTrue(Sieve._max == 100);	
	}
	
	@Test
	public void EmptyTestMethod() {	
		String[] arg = {};
		exception.expect(IllegalArgumentException.class);
		Sieve.calculateMax(arg);		
		
	}
	

}
