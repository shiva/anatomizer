/*
* generated by Xtext
*/
grammar InternalAnatomy;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package me.shiv.dsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package me.shiv.dsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import me.shiv.dsl.services.AnatomyGrammarAccess;

}

@parser::members {

 	private AnatomyGrammarAccess grammarAccess;
 	
    public InternalAnatomyParser(TokenStream input, AnatomyGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Model";	
   	}
   	
   	@Override
   	protected AnatomyGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	 iv_ruleModel=ruleModel 
	 { $current=$iv_ruleModel.current; } 
	 EOF 
;

// Rule Model
ruleModel returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='@startpa' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getModelAccess().getStartpaKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getShipmentsShipmentParserRuleCall_1_0()); 
	    }
		lv_shipments_1_0=ruleShipment		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		add(
       			$current, 
       			"shipments",
        		lv_shipments_1_0, 
        		"Shipment");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_2='@endpa' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getModelAccess().getEndpaKeyword_2());
    }
)
;





// Entry rule entryRuleShipment
entryRuleShipment returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getShipmentRule()); }
	 iv_ruleShipment=ruleShipment 
	 { $current=$iv_ruleShipment.current; } 
	 EOF 
;

// Rule Shipment
ruleShipment returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='shipment' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getShipmentAccess().getShipmentKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getShipmentAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getShipmentRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getShipmentAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getShipmentAccess().getWorkPackagesWorkPackageParserRuleCall_3_0()); 
	    }
		lv_workPackages_3_0=ruleWorkPackage		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getShipmentRule());
	        }
       		add(
       			$current, 
       			"workPackages",
        		lv_workPackages_3_0, 
        		"WorkPackage");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_4='}' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getShipmentAccess().getRightCurlyBracketKeyword_4());
    }
)
;





// Entry rule entryRuleWorkPackage
entryRuleWorkPackage returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getWorkPackageRule()); }
	 iv_ruleWorkPackage=ruleWorkPackage 
	 { $current=$iv_ruleWorkPackage.current; } 
	 EOF 
;

// Rule WorkPackage
ruleWorkPackage returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='wp' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getWorkPackageAccess().getWpKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getWorkPackageAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getWorkPackageRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2=',' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getWorkPackageAccess().getCommaKeyword_2());
    }
(
(
		lv_desc_3_0=RULE_STRING
		{
			newLeafNode(lv_desc_3_0, grammarAccess.getWorkPackageAccess().getDescSTRINGTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getWorkPackageRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"desc",
        		lv_desc_3_0, 
        		"STRING");
	    }

)
)(	otherlv_4='->' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getWorkPackageAccess().getHyphenMinusGreaterThanSignKeyword_4_0());
    }
(
(
		lv_dep_5_0=RULE_ID
		{
			newLeafNode(lv_dep_5_0, grammarAccess.getWorkPackageAccess().getDepIDTerminalRuleCall_4_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getWorkPackageRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"dep",
        		lv_dep_5_0, 
        		"ID");
	    }

)
))?)
;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


