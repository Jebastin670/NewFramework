package sample_annotations;

import org.testng.annotations.Test;

public class SampleTest {
@Test(groups = {"demo1"})
void add() {
	System.out.println("DEMO1!!");
	
}
@Test(groups = {"demo2"})
void sub()
{
	System.out.println("DEMO2!!");
}

}
