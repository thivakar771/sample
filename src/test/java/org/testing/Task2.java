package org.testing;

import org.testng.annotations.Test;

public class Task2 {
	@Test(priority=1)
	private void T11() {
	System.out.println("15="+Thread.currentThread().getId());
	}
	@Test(enabled=false)
	private void T12() {
	System.out.println("16="+Thread.currentThread().getId());
	}
	@Test(invocationCount=7)
	private void T13() {
	System.out.println("17="+Thread.currentThread().getId());
	}
}
