package unit_testing;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class MyArrayOperations {
		// i make a default constructor
		MyArrayOperations(){}
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

