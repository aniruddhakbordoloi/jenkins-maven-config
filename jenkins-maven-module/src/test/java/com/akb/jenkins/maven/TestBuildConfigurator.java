/**
 * 
 */
package com.akb.jenkins.maven;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Aniruddha
 *
 */
public class TestBuildConfigurator {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testMyApp(){
		final BuildConfigurator buildConfigurator = new BuildConfigurator();
		Assert.assertEquals("Yo Man!! This is printing!!", buildConfigurator.buildMyApp());
		System.out.println("I am inside my Test App");
	}
}
