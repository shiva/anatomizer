/*
* generated by Xtext
*/
package me.shiv.dsl;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class AnatomyUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return me.shiv.dsl.ui.internal.AnatomyActivator.getInstance().getInjector("me.shiv.dsl.Anatomy");
	}
	
}