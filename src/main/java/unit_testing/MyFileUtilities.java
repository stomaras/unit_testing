package unit_testing;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
/**
*@author tomaras spyros
*@since 19/04/2018
*this class help us to read a txt file and handle the exceptions 
*at the end i return an integer array with the grades if the grades.txt is not empty
*/

public class MyFileUtilities {
		// i make a default constructor
	
		public MyFileUtilities(){}
		
		// i read a txt file and handle the exceptions
		public int[] readFile(String filepath) throws FileNotFoundException {
			BufferedReader br = new BufferedReader(new FileReader(filepath));
			List<String> lines = new ArrayList<String>();
			String line;
			
			try {
				while(( line = br.readLine()) != null) {
					lines.add(line);
				}
				br.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
			int grades[]= new int[lines.size()];
			for(int i=0; i<lines.size(); i++) {
				grades[i]= Integer.valueOf(lines.get(i));
			}
			// i return an array with the grades 
			return grades;
		}
		
	}
