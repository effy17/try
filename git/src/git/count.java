package git;

import static org.junit.Assert.*;

import org.junit.Test;

public class count {

	@Test
	public void test() {
		g test=new g();
		int output=test.count("alala");
				assertEquals(3,output);
	}

}
