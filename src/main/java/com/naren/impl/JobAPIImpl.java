/**
 * 
 */
package com.naren.impl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author nstanwar
 *
 */
public class JobAPIImpl {

	/**
	 * 
	 */
	public JobAPIImpl() {
	}

	/**
	 * This method will called from QuartzJobBean
	 * @param args
	 */
	public static void main(String[] args) {
		new ClassPathXmlApplicationContext("springcontext.xml");
	}

}
