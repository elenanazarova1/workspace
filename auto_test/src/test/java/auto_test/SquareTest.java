package auto_test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareTest {
	
	@Test
	public void testSquare() {
		Square s = new Square(5);
		Assert.assertEquals(s.square(), 25.0);
	}

}
