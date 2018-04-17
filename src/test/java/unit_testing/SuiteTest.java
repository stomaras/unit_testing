package unit_testing;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

// the RunWith annotation help us to run Suite class together with SuiteTest
@RunWith(Suite.class)
// the SuiteClasses annotation nhelp us to run at the same time many classes 
@Suite.@SuiteClasses({MyMathTest.class,MyMathTest_ReverseNumber_Parameterized.class})
public class SuitTest {

}
