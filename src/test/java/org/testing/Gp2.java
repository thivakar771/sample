package org.testing;

import org.testng.annotations.Test;

public class Gp2 {
	
		@Test(groups= {"sanity","smoke"})
		    private void cricket() {
				System.out.println("national level1");

			}
		@Test(groups="smoke")
		private void footbal() {
			System.out.println("state level3");

		}
		@Test(groups="regression")
		private void golf() {
			System.out.println("zone level1");

		}
}
