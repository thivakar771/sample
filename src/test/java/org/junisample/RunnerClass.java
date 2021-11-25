package org.junisample;

import org.ex.Baseclass;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

public class RunnerClass  {
@Test
	public void run() {
     Result r = JUnitCore.runClasses(Juni.class,Juni1.class);
      System.out.println("\n"+r.getRunCount());
     System.out.println("\n"+r.getFailureCount());
     System.out.println("\n"+r.getIgnoreCount());
     System.out.println("\n"+r.getRunTime());
     System.out.println("\n"+r.wasSuccessful());
	}
}
