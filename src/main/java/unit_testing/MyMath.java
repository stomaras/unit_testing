package unit_testing;

public class MyMath {
	
		// i make a default constructor 
		MyMath(){
			
		}
		
		//i implement the method which return the reverse number 
		public int reverseNumber(int number)
		{
			if(number < 0){
				number = Math.abs(number);
			}
			else if(number > 0){
				number = -(number);
			}else{
				return number;
			}
			return number;	
		}
		
		// i implement  the method which return the division of num and denom 
		public  double divide(int num, int denom){
				if(denom ==0){
					throw new IllegalArgumentException("cannot divide by 0");
				}
				return (double)num/(double)denom;
		}
	 
	 
		
	}
