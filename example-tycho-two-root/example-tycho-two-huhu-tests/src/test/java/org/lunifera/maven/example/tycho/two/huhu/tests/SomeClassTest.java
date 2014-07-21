package org.lunifera.maven.example.tycho.two.huhu.tests;

import org.junit.Assert;
import org.junit.Test;
import org.lunifera.maven.example.tycho.two.huhu.SomeClass;

public class SomeClassTest {

	@Test
	public void test() {
		Assert.assertEquals(1, SomeClass.returnOne());
	}

}
