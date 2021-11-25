package org.testing;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Rerunfail {
	@Test(retryAnalyzer=Failtest.class)
	private void tc1() {
		System.out.println("test1");
		Assert.assertTrue(false);
		System.out.println("test11");
	}

	@Test
	private void tc2() {
		System.out.println("test22");
		Assert.assertTrue(true);
		System.out.println("test21");
	}

	@Test(retryAnalyzer=Failtest.class)
	private void tc3() {
		System.out.println("test3");
		Assert.assertTrue(false);
		System.out.println("test33");

	}
}
