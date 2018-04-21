package unit_testing;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*@author tomaras spyros
 *@since 21/04/2018
 *this class read with right way a file 
 * and returns an integer array with the grades 
 *

public class MyFileUtilities {
		// i make a default constructor
	
		public MyFileUtilities(){}
		
		// i read a txt file and handle the exceptions
		public int[] readFile(String filepath) throws IllegalArgumentException {
			
			List<String> lines = new ArrayList<String>();
			String line;
			
			try {
				BufferedReader br = new BufferedReader(new FileReader(filepath));
				while(( line = br.readLine()) != null) {
					lines.add(line);
				}
				br.close();
			}catch(IOException e) {
				throw new IllegalArgumentException("Grades not found");
			}
			int grades[]= new int[lines.size()];
			for(int i=0; i<lines.size(); i++) {
				grades[i]= Integer.valueOf(lines.get(i));
			}
			// i return an array with the grades 
			return grades;
		}
		
	}



