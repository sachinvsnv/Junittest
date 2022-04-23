package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		jUnitFunctions jUnit=new jUnitFunctions();
		String result=jUnit.AddStrings("abc","def");
		assertEquals("abcdef",result);
	}

}
