/*
* generated by Xtext
*/
grammar InternalAnatomy;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package me.shiv.dsl.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package me.shiv.dsl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import me.shiv.dsl.services.AnatomyGrammarAccess;

}

@parser::members {
 
 	private AnatomyGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(AnatomyGrammarAccess grammarAccess) {
    	this.grammarAccess = grammarAccess;
    }
    
    @Override
    protected Grammar getGrammar() {
    	return grammarAccess.getGrammar();
    }
    
    @Override
    protected String getValueForTokenName(String tokenName) {
    	return tokenName;
    }

}




// Entry rule entryRuleModel
entryRuleModel 
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getModelAccess().getGroup()); }
(rule__Model__Group__0)
{ after(grammarAccess.getModelAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleShipment
entryRuleShipment 
:
{ before(grammarAccess.getShipmentRule()); }
	 ruleShipment
{ after(grammarAccess.getShipmentRule()); } 
	 EOF 
;

// Rule Shipment
ruleShipment
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getShipmentAccess().getGroup()); }
(rule__Shipment__Group__0)
{ after(grammarAccess.getShipmentAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleWorkPackage
entryRuleWorkPackage 
:
{ before(grammarAccess.getWorkPackageRule()); }
	 ruleWorkPackage
{ after(grammarAccess.getWorkPackageRule()); } 
	 EOF 
;

// Rule WorkPackage
ruleWorkPackage
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getWorkPackageAccess().getGroup()); }
(rule__WorkPackage__Group__0)
{ after(grammarAccess.getWorkPackageAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Model__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Model__Group__0__Impl
	rule__Model__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getStartpaKeyword_0()); }

	'@startpa' 

{ after(grammarAccess.getModelAccess().getStartpaKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Model__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Model__Group__1__Impl
	rule__Model__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getModelAccess().getShipmentsAssignment_1()); }
(rule__Model__ShipmentsAssignment_1)
{ after(grammarAccess.getModelAccess().getShipmentsAssignment_1()); }
)
(
{ before(grammarAccess.getModelAccess().getShipmentsAssignment_1()); }
(rule__Model__ShipmentsAssignment_1)*
{ after(grammarAccess.getModelAccess().getShipmentsAssignment_1()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Model__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Model__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getEndpaKeyword_2()); }

	'@endpa' 

{ after(grammarAccess.getModelAccess().getEndpaKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Shipment__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Shipment__Group__0__Impl
	rule__Shipment__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Shipment__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getShipmentAccess().getShipmentKeyword_0()); }

	'shipment' 

{ after(grammarAccess.getShipmentAccess().getShipmentKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Shipment__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Shipment__Group__1__Impl
	rule__Shipment__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Shipment__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getShipmentAccess().getNameAssignment_1()); }
(rule__Shipment__NameAssignment_1)
{ after(grammarAccess.getShipmentAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Shipment__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Shipment__Group__2__Impl
	rule__Shipment__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Shipment__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getShipmentAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getShipmentAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Shipment__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Shipment__Group__3__Impl
	rule__Shipment__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Shipment__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getShipmentAccess().getWorkPackagesAssignment_3()); }
(rule__Shipment__WorkPackagesAssignment_3)
{ after(grammarAccess.getShipmentAccess().getWorkPackagesAssignment_3()); }
)
(
{ before(grammarAccess.getShipmentAccess().getWorkPackagesAssignment_3()); }
(rule__Shipment__WorkPackagesAssignment_3)*
{ after(grammarAccess.getShipmentAccess().getWorkPackagesAssignment_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Shipment__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Shipment__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Shipment__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getShipmentAccess().getRightCurlyBracketKeyword_4()); }

	'}' 

{ after(grammarAccess.getShipmentAccess().getRightCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__WorkPackage__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__WorkPackage__Group__0__Impl
	rule__WorkPackage__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkPackage__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getWorkPackageAccess().getWpKeyword_0()); }

	'wp' 

{ after(grammarAccess.getWorkPackageAccess().getWpKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__WorkPackage__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__WorkPackage__Group__1__Impl
	rule__WorkPackage__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkPackage__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getWorkPackageAccess().getNameAssignment_1()); }
(rule__WorkPackage__NameAssignment_1)
{ after(grammarAccess.getWorkPackageAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__WorkPackage__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__WorkPackage__Group__2__Impl
	rule__WorkPackage__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkPackage__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getWorkPackageAccess().getCommaKeyword_2()); }

	',' 

{ after(grammarAccess.getWorkPackageAccess().getCommaKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__WorkPackage__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__WorkPackage__Group__3__Impl
	rule__WorkPackage__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkPackage__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getWorkPackageAccess().getDescAssignment_3()); }
(rule__WorkPackage__DescAssignment_3)
{ after(grammarAccess.getWorkPackageAccess().getDescAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__WorkPackage__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__WorkPackage__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkPackage__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getWorkPackageAccess().getGroup_4()); }
(rule__WorkPackage__Group_4__0)?
{ after(grammarAccess.getWorkPackageAccess().getGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__WorkPackage__Group_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__WorkPackage__Group_4__0__Impl
	rule__WorkPackage__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkPackage__Group_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getWorkPackageAccess().getHyphenMinusGreaterThanSignKeyword_4_0()); }

	'->' 

{ after(grammarAccess.getWorkPackageAccess().getHyphenMinusGreaterThanSignKeyword_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__WorkPackage__Group_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__WorkPackage__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__WorkPackage__Group_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getWorkPackageAccess().getDepAssignment_4_1()); }
(rule__WorkPackage__DepAssignment_4_1)
{ after(grammarAccess.getWorkPackageAccess().getDepAssignment_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}







rule__Model__ShipmentsAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getShipmentsShipmentParserRuleCall_1_0()); }
	ruleShipment{ after(grammarAccess.getModelAccess().getShipmentsShipmentParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Shipment__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getShipmentAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getShipmentAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Shipment__WorkPackagesAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getShipmentAccess().getWorkPackagesWorkPackageParserRuleCall_3_0()); }
	ruleWorkPackage{ after(grammarAccess.getShipmentAccess().getWorkPackagesWorkPackageParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__WorkPackage__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getWorkPackageAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getWorkPackageAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__WorkPackage__DescAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getWorkPackageAccess().getDescSTRINGTerminalRuleCall_3_0()); }
	RULE_STRING{ after(grammarAccess.getWorkPackageAccess().getDescSTRINGTerminalRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__WorkPackage__DepAssignment_4_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getWorkPackageAccess().getDepIDTerminalRuleCall_4_1_0()); }
	RULE_ID{ after(grammarAccess.getWorkPackageAccess().getDepIDTerminalRuleCall_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


