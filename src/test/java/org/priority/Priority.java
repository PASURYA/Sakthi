package org.priority;

import org.testng.annotations.Test;

public class Priority {
	
	

	@Test(enabled = true)
	public void ihhgschool() {
		System.out.println("High School");
	}

	@Test(dependsOnMethods = "highschool")
	public void highsecondary() {
		System.out.println("secondaryHigh");
	}

	@Test(dependsOnMethods = "highsecondary")
	public void engineering() {
		System.out.println("Engineering");
	}

	public void master() {
		System.out.println("MasterDegree");
	}

}
