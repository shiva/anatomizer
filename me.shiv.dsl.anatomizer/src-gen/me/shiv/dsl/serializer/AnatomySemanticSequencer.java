package me.shiv.dsl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import me.shiv.dsl.anatomy.AnatomyPackage;
import me.shiv.dsl.anatomy.Model;
import me.shiv.dsl.anatomy.Shipment;
import me.shiv.dsl.anatomy.WorkPackage;
import me.shiv.dsl.services.AnatomyGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;

@SuppressWarnings("all")
public class AnatomySemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private AnatomyGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == AnatomyPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case AnatomyPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case AnatomyPackage.SHIPMENT:
				if(context == grammarAccess.getShipmentRule()) {
					sequence_Shipment(context, (Shipment) semanticObject); 
					return; 
				}
				else break;
			case AnatomyPackage.WORK_PACKAGE:
				if(context == grammarAccess.getWorkPackageRule()) {
					sequence_WorkPackage(context, (WorkPackage) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     shipments+=Shipment+
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID workPackages+=WorkPackage+)
	 */
	protected void sequence_Shipment(EObject context, Shipment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID desc=STRING dep=ID?)
	 */
	protected void sequence_WorkPackage(EObject context, WorkPackage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
