
package unit_testingg;

import static org.junit.Assert.*;

import org.junit.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
/**
* @author tomaras spyros
* @since 19/04/2018
* I do testing for the MyFileUtilities class
* with the help from the @Rule annotation 
* i check also the case which the txt file is empty 
*/
public class MyFileUtilitiesTest {
	
			MyFileUtilities my = new MyFileUtilities();
			
			// i create a rule annotation in order to handle the Exception 
			// first it is empty
			@Rule
			public ExpectedException thrown= ExpectedException.none();
			
			@Rule 
			public ExpectedException exist = ExpectedException.none();
			
		
			// i create a Test annotation in order to test if i read normal the file if not throw a FileNotFoundException
			@Test
			public void readFileTest1() {
				thrown.expect(IllegalArgumentException.class);
				thrown.expectMessage("Grades not found");
				my.readFile("fsadfsadfadf");
				
			}
			// i test the normal case 
			@Test
			public void readFileTest2(){
				my.readFile("src\\test\\resources\\grades.txt");
				assertArrayEquals(new int[]{12,11,10,15,17,20},new int[]{12,11,10,15,17,20});
			}
			// i test the case which grades.txt is empty 
			@Test
			public void readFileTest3(){
				thrown.expect(IllegalArgumentException.class);
				my.readFile("");
			}

		}
