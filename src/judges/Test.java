package judges;

import judgestests.MarksTests;


//src$ javac  -d ../build -cp ../lib/judgestests.jar judges/Test.java
//src$ java  -cp "../build:../lib/judgestests.jar"  judges.Test

public class Test{
	public static void main(String[] args){
		boolean ok = true;
		MarksTests marksTester = new MarksTests();
		ok = ok && marksTester.testGetMarkSetMark();
		ok = ok && marksTester.testAverage();
		ok = ok && marksTester.testGlobalAverage();
		System.out.println(ok ? "All tests OK" : "At least one test KO");
		}
	
	}
