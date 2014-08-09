/*
 * generated by Xtext
 */
package me.shiv.dsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import org.stringtemplate.v4.ST;

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class AnatomyGenerator implements IGenerator {
	
	ST hello
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
//		fsa.generateFile('greetings.txt', 'People to greet: ' + 
//			resource.allContents
//				.filter(typeof(Greeting))
//				.map[name]
//				.join(', '))
	
		hello = new ST("Hello, <name>");
        hello.add("name", "World");
        fsa.generateFile('greetings.txt', hello.render());
	}
}
