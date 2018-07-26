package dev.utils;

//import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;



public class StringUtilsTest {

	@Test
	public void test() {
		StringUtils test = new StringUtils();
		int resultat = test.levenshteinDistance("test", "tost");
		Assert.assertEquals(1, resultat);
		
		test = new StringUtils();
		resultat = test.levenshteinDistance("test", "test");
		Assert.assertEquals(0, resultat);
	}
		
}
