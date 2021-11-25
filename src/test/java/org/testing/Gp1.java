package org.testing;

import org.testng.annotations.Test;

public class Gp1 {
	@Test(groups= {"sanity","regression"})
    private void swim() {
		System.out.println("national level");

	}
@Test(groups="smoke")
private void gunshoot() {
	System.out.println("state level");

}
@Test(groups= {"regression","smoke"})
private void javthrow() {
	System.out.println("zone level");

}
}
