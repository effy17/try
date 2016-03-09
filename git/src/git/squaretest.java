package git;

import static org.junit.Assert.*;

import org.junit.Test;

public class squaretest {

	@Test
	public void test() {
		g test=new g();
		int output=test.square(5);
		assertEquals(25,output);
		
		
	}

}
