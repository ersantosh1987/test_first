import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestFactorial {

	Maths m;
	@Before
	public void setUp() throws Exception {
		m=new Maths();
	}

	
	/*
	 * 1. when the number is zero system should return 1  qq
	 * 2. when the number is one system should return 1 dd
	 * 3. when the number is -ve system should throw exception
	 * 4. when the number is +ve system should return expected output 12
	 *  
	 */
	
	@Test
	public void whenTheNumberIsZeroSystemShouldReturnOne()
	{ 
		assertEquals(1,m.getFactorial(0));
	}
	
	@Test
	public void whenTheNumberIsOneSystemShouldReturnOne()
	{
		assertEquals(1,m.getFactorial(1));
	}
	
	@Test(expected=java.lang.IllegalArgumentException.class)
	public void whenTheNumberIsNegativeSystemShouldThrowException()
	{
		m.getFactorial(-4);
	}
	
    @Test
    public void whenTheNumberIsPositiveSystemShouldReturnExpectedOutput()
    {
    	assertEquals(24,m.getFactorial(4));
    }
}
