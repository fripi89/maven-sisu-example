/**
 *
 */
package org.example;

import javax.inject.Named;

import com.google.inject.AbstractModule;

import org.eclipse.sisu.EagerSingleton;

/**
 *
 */
@Named
@EagerSingleton
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
