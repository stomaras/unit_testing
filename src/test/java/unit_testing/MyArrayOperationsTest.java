package unit_testing;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import static org.mockito.Mockito.*;

import java.io.FileNotFoundException;

public class MyArrayOperationsTest {
	// report of MyArrayOperations class
	MyArrayOperations myarrayoperation;
	
	//testing with mock 
	@Test
	public void test_getfrequencies_Mocking() throws FileNotFoundException {
		
		//i do mock the MyFileUtilities class which is used in MyArrayOperations
		MyFileUtilities utils = mock(MyFileUtilities.class);
		int a[] = {12,13,9,13,17,12,13};
		when(utils.readFile("grades.txt")).thenReturn(a);
		// I place the items I expect
		Assert.assertArrayEquals(new int[]{0,0,0,0,0,0,0,0,0,1,0,0,2,3,0,0,0,1,0,0,0},
				myarrayoperation.getGradeFrequencies("grades.txt"));
	}

	

}
