package unit_testing;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
/**
* MyArrayOperations contains the gradesFrequencies method, which returns the frequencies of
* a given array, using the readFile method of MyFileUtilities class
* @author  tomaras spyros 
* @since   2018-04-17 
*/

public class MyArrayOperations {
		// i make a default constructor
		MyArrayOperations(){}
		/** this method get a filepath with txt grades 
		*   read the filepath with the help of readFile method which i implement in FileUtilities class and put
		*  the grades in an integer array with name grades 
		*  and count the frequency of grades in the txt
		*  put the frequency in an integer array and return this array 
		*  with name frequencies 
		*/
		public static int[] getGradeFrequencies(String filepath) throws FileNotFoundException{
			MyFileUtilities utils = new MyFileUtilities();
			int[] grades = utils.readFile(filepath);
			int[] frequencies = new int[21];
			// i fill the frequencies grade withb zero 
			for(int i = 0; i <frequencies.length; i++){
				frequencies[i] = 0;
			}
			//  I measure the degree of recurrence
			for(int i = 0; i< grades.length; i++) {
				frequencies[grades[i]] +=1;
			}
			// i return the frequencies array 
			return frequencies;
		}
		 
	}

