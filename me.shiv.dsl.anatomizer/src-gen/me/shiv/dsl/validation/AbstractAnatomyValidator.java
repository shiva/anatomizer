/*
 * generated by Xtext
 */
package me.shiv.dsl.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractAnatomyValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(me.shiv.dsl.anatomy.AnatomyPackage.eINSTANCE);
		return result;
	}
}