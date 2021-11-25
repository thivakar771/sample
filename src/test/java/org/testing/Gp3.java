package org.testing;

import org.testng.annotations.Test;

public class Gp3 {
@Test(groups= {"sanity","smoke"})
    private void run() {
		System.out.println("national level2");

	}
@Test(groups="smoke")
private void jump() {
	System.out.println("state level2");

}
@Test(groups="regression")
private void sprint() {
	System.out.println("zone level2");

}
}
