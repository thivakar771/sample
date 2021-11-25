package org.testing;

import org.testng.annotations.Test;

public class Task3 {
	@Test
	private void T11() {
	System.out.println("18="+Thread.currentThread().getId());
	}
	@Test(priority=-22)
	private void T12() {
	System.out.println("19="+Thread.currentThread().getId());
	}
	@Test
	private void T13() {
	System.out.println("20="+Thread.currentThread().getId());
	}
}
