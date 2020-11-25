/**
 *
 */
package org.example;

import javax.inject.Named;

import com.google.inject.AbstractModule;

/**
 *
 */
@Named
public class MyModule extends AbstractModule {

	/**
	 *
	 */
	public MyModule() {
		System.out.println("MyModule::init"); //$NON-NLS-1$
	}

	@Override
	protected void configure() {
		bindConstant().annotatedWith(Config.class).to("My Value"); //$NON-NLS-1$
	}
}
