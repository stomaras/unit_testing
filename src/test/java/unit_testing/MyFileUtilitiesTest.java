package unit_testing;
import static org.junit.Assert.*;
import org.junit.Test;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.TemporaryFolder;

/**
* @author tomaras spyros
* @since 19/04/2018
* I do testing for the MyFileUtilities class
* with the help from the @Rule annotation 
* i check also the case which the txt file is empty 
*/

public class MyFileUtilitiesTest {
			MyFileUtilities my = new MyFileUtilities();
			
			/**
			*  i create a rule annotation in order to handle the FileNotFoundException 
			*
			*/
			
			@Rule
			public ExpectedException thrown= ExpectedException.none();
			
		
			// i create a Test annotation in order to test if i read normal the file if not throw a FileNotFoundException
			@Test
			public void readFileTest1() throws FileNotFoundException{
				thrown.expect(FileNotFoundException.class);
				my.readFile("fsadfsadfadf");
				
			}		
}
