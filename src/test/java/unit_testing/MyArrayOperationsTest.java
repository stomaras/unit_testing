package unit_testing;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import static org.mockito.Mockito.*;

import java.io.FileNotFoundException;
/**
*  @author tomaras spyros
*  @since 19/04/2018
*  at this class i use mock 
*  in order to be sure that that it was done in FileUtilities 
*  the results will be this 
*/
public class MyArrayOperationsTest {
	// report of MyArrayOperations class
	MyArrayOperations myarrayoperation;
	
	//testing with mock 
	@Test
	public void test_getfrequencies_Mocking() throws FileNotFoundException {
		
		//i do mock the MyFileUtilities class which is used in MyArrayOperations
		MyFileUtilities utils = mock(MyFileUtilities.class);
		int a[] = {12,11,10,15,17,20};
		when(utils.readFile("grades.txt")).thenReturn(a);
		// I place the items I expect
		Assert.assertArrayEquals(new int[]{0,0,0,0,0,0,0,0,0,0,1,1,1,0,0,1,0,1,0,0,1},
				myarrayoperation.getGradeFrequencies("grades.txt"));
	}

	

}
