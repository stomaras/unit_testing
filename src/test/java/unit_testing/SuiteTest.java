package unit_testing;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
* @author tomaras spyros
* @since 19/04/2018
* the RunWith annotation help us to run a Suite 
* which help us to run at the same time 2 classes 
*the MyMathTest.class and the MyMathTest_ReverseNumber_Parameterized.class
*/ 
@RunWith(Suite.class)
// the SuiteClasses annotation nhelp us to run at the same time many classes 
@Suite.@SuiteClasses({MyMathTest.class,MyMathTest_ReverseNumber_Parameterized.class})
public class MyFirstSuitTest {
//this class remain empty .
//Is used only as holder of the above annotations 
}
