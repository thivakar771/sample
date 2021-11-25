package org.testing;

import org.testng.annotations.Test;

public class Task1 {
@Test
private void T11() {
System.out.println("12= "+Thread.currentThread().getId());
}
@Test(priority=-1)
private void T12() {
System.out.println("13="+Thread.currentThread().getId());
}
@Test
private void T13() {
System.out.println("14="+Thread.currentThread().getId());
}
}
