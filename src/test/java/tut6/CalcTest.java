package tut6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalcTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
	    int result = Calc.add(1, 2);
        Assert.assertEquals(3, result);
		
	}

}
