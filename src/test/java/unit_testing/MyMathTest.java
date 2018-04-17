package unit_testing;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.Test;

public class MyMathTest {

			
			 // i create my object
			 MyMath my = new MyMath();
			
			// test for normal case 
			@Test
			public void checkDivide() {
				assertEquals("Divide", 2.5, my.divide(5, 2), 0.00001);
			}
			
			// i make a rule annotation in order to handle the thrown exception 
			@Rule
			public ExpectedException thrown = ExpectedException.none();
			
			// i make a test in order to check the normal case  
			@Test
			public void checkDivide2()  {
				thrown.expect(IllegalArgumentException.class);
				my.divide(5,0);
			}
			
	}
