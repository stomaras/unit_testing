package unit_testing;

import org.junit.Assert;

import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import java.util.Arrays;
import java.util.Collection;
import org.junit.runner.RunWith;
/**
* @author tomaras spyros
* @since  19/04/2018
* the runwith annotation help us to run the parameterized class with the MyMath_ReverseNumber_Parameterized class
*  i add the @parameters annotation which help us to run the test 
*  for specific cases
*/
 
@RunWith(Parameterized.class)
public class MyMathTest_ReverseNumber_Parameterized {
	private int expectedResult;
	private int val;
	MyMath cal;
	
	/**i add the before annotation which run before every method 
	*  is called 
	*/
	
	@Before
	public void setup(){
		cal = new MyMath();
	}
	
	// the constructor and the initialization 
	public MyMathTest_ReverseNumber_Parameterized(int expectedResult, int val){
		this.val = val;
		this.expectedResult = expectedResult;
		
	}
	
	/** i add the parameters annotation 
	*  in order to check some specific 
	*  prices for all special cases 
	*/
	@Parameters
	public static Collection<Object[]> testData(){
		Object[][] data = new Object[][]{{1,-1},{0,0},{-2,2}};
		return Arrays.asList(data);
	}
	/**
	* with this test method i test if the expected result
	*is equal with the actual result 
	*/
	@Test
	public void testAdd(){
		// i put in assertEquals the expectedresult and actual result 
		Assert.assertEquals(expectedResult, cal.reverseNumber(val));
	}
}


	


