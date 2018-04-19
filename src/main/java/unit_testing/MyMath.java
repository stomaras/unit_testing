package unit_testing;
/**
*@author tomaras spyros
*@since 19/04/2018
* this class help us to return the reverse number 
*Also help us to return the division between two numbers
*/
public class MyMath {
	
		// i make a default constructor 
		MyMath(){
			
		}
		
		/**
		* i implement the method which return the reverse number 
		*  in the example i implement this for all cases 
		*  when the number is positive when the number is negative and when the number is zero 
		*/
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
		
		/**
		* i implement  the method which return the division of num and denom
		*  i check the case when the number denom is zero and throw an IllegalArgumentException 
		*/ 
		public  double divide(int num, int denom){
				if(denom ==0){
					throw new IllegalArgumentException("cannot divide by 0");
				}
				return (double)num/(double)denom;
		}
	 
	 
		
	}
