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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAnatomyParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@startpa'", "'@endpa'", "'shipment'", "'{'", "'}'", "'wp'", "','", "'->'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=5;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalAnatomyParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAnatomyParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAnatomyParser.tokenNames; }
    public String getGrammarFileName() { return "../me.shiv.dsl.anatomizer/src-gen/me/shiv/dsl/parser/antlr/internal/InternalAnatomy.g"; }



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



    // $ANTLR start "entryRuleModel"
    // ../me.shiv.dsl.anatomizer/src-gen/me/shiv/dsl/parser/antlr/internal/InternalAnatomy.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../me.shiv.dsl.anatomizer/src-gen/me/shiv/dsl/parser/antlr/internal/InternalAnatomy.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../me.shiv.dsl.anatomizer/src-gen/me/shiv/dsl/parser/antlr/internal/InternalAnatomy.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../me.shiv.dsl.anatomizer/src-gen/me/shiv/dsl/parser/antlr/internal/InternalAnatomy.g:76:1: ruleModel returns [EObject current=null] : (otherlv_0= '@startpa' ( (lv_shipments_1_0= ruleShipment ) )+ otherlv_2= '@endpa' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_shipments_1_0 = null;


         enterRule(); 
            
        try {
            // ../me.shiv.dsl.anatomizer/src-gen/me/shiv/dsl/parser/antlr/internal/InternalAnatomy.g:79:28: ( (otherlv_0= '@startpa' ( (lv_shipments_1_0= ruleShipment ) )+ otherlv_2= '@endpa' ) )
            // ../me.shiv.dsl.anatomizer/src-gen/me/shiv/dsl/parser/antlr/internal/InternalAnatomy.g:80:1: (otherlv_0= '@startpa' ( (lv_shipments_1_0= ruleShipment ) )+ otherlv_2= '@endpa' )
            {
            // ../me.shiv.dsl.anatomizer/src-gen/me/shiv/dsl/parser/antlr/internal/InternalAnatomy.g:80:1: (otherlv_0= '@startpa' ( (lv_shipments_1_0= ruleShipment ) )+ otherlv_2= '@endpa' )
            // ../me.shiv.dsl.anatomizer/src-gen/me/shiv/dsl/parser/antlr/internal/InternalAnatomy.g:80:3: otherlv_0= '@startpa' ( (lv_shipments_1_0= ruleShipment ) )+ otherlv_2= '@endpa'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleModel122); 

                	newLeafNode(otherlv_0, grammarAccess.getModelAccess().getStartpaKeyword_0());
                
            // ../me.shiv.dsl.anatomizer/src-gen/me/shiv/dsl/parser/antlr/internal/InternalAnatomy.g:84:1: ( (lv_shipments_1_0= ruleShipment ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../me.shiv.dsl.anatomizer/src-gen/me/shiv/dsl/parser/antlr/internal/InternalAnatomy.g:85:1: (lv_shipments_1_0= ruleShipment )
            	    {
            	    // ../me.shiv.dsl.anatomizer/src-gen/me/shiv/dsl/parser/antlr/internal/InternalAnatomy.g:85:1: (lv_shipments_1_0= ruleShipment )
            	    // ../me.shiv.dsl.anatomizer/src-gen/me/shiv/dsl/parser/antlr/internal/InternalAnatomy.g:86:3: lv_shipments_1_0= ruleShipment
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getShipmentsShipmentParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleShipment_in_ruleModel143);
            	    lv_shipments_1_0=ruleShipment();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"shipments",
            	            		lv_shipments_1_0, 
            	            		"Shipment");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleModel156); 

                	newLeafNode(otherlv_2, grammarAccess.getModelAccess().getEndpaKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleShipment"
    // ../me.shiv.dsl.anatomizer/src-gen/me/shiv/dsl/parser/antlr/internal/InternalAnatomy.g:114:1: entryRuleShipment returns [EObject current=null] : iv_ruleShipment= ruleShipment EOF ;
    public final EObject entryRuleShipment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShipment = null;


        try {
            // ../me.shiv.dsl.anatomizer/src-gen/me/shiv/dsl/parser/antlr/internal/InternalAnatomy.g:115:2: (iv_ruleShipment= ruleShipment EOF )
            // ../me.shiv.dsl.anatomizer/src-gen/me/shiv/dsl/parser/antlr/internal/InternalAnatomy.g:116:2: iv_ruleShipment= ruleShipment EOF
            {
             newCompositeNode(grammarAccess.getShipmentRule()); 
            pushFollow(FOLLOW_ruleShipment_in_entryRuleShipment192);
            iv_ruleShipment=ruleShipment();

            state._fsp--;

             current =iv_ruleShipment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleShipment202); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShipment"


    // $ANTLR start "ruleShipment"
    // ../me.shiv.dsl.anatomizer/src-gen/me/shiv/dsl/parser/antlr/internal/InternalAnatomy.g:123:1: ruleShipment returns [EObject current=null] : (otherlv_0= 'shipment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_workPackages_3_0= ruleWorkPackage ) )+ otherlv_4= '}' ) ;
    public final EObject ruleShipment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_workPackages_3_0 = null;


         enterRule(); 
            
        try {
            // ../me.shiv.dsl.anatomizer/src-gen/me/shiv/dsl/parser/antlr/internal/InternalAnatomy.g:126:28: ( (otherlv_0= 'shipment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_workPackages_3_0= ruleWorkPackage ) )+ otherlv_4= '}' ) )
            // ../me.shiv.dsl.anatomizer/src-gen/me/shiv/dsl/parser/antlr/internal/InternalAnatomy.g:127:1: (otherlv_0= 'shipment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_workPackages_3_0= ruleWorkPackage ) )+ otherlv_4= '}' )
            {
            // ../me.shiv.dsl.anatomizer/src-gen/me/shiv/dsl/parser/antlr/internal/InternalAnatomy.g:127:1: (otherlv_0= 'shipment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_workPackages_3_0= ruleWorkPackage ) )+ otherlv_4= '}' )
            // ../me.shiv.dsl.anatomizer/src-gen/me/shiv/dsl/parser/antlr/internal/InternalAnatomy.g:127:3: otherlv_0= 'shipment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_workPackages_3_0= ruleWorkPackage ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleShipment239); 

                	newLeafNode(otherlv_0, grammarAccess.getShipmentAccess().getShipmentKeyword_0());
                
            // ../me.shiv.dsl.anatomizer/src-gen/me/shiv/dsl/parser/antlr/internal/InternalAnatomy.g:131:1: ( (lv_name_1_0= RULE_ID ) )
            // ../me.shiv.dsl.anatomizer/src-gen/me/shiv/dsl/parser/antlr/internal/InternalAnatomy.g:132:1: (lv_name_1_0= RULE_ID )
            {
            // ../me.shiv.dsl.anatomizer/src-gen/me/shiv/dsl/parser/antlr/internal/InternalAnatomy.g:132:1: (lv_name_1_0= RULE_ID )
            // ../me.shiv.dsl.anatomizer/src-gen/me/shiv/dsl/parser/antlr/internal/InternalAnatomy.g:133:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleShipment256); 

            			newLeafNode(lv_name_1_0, grammarAccess.getShipmentAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getShipmentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleShipment273); 

                	newLeafNode(otherlv_2, grammarAccess.getShipmentAccess().getLeftCurlyBracketKeyword_2());
                
            // ../me.shiv.dsl.anatomizer/src-gen/me/shiv/dsl/parser/antlr/internal/InternalAnatomy.g:153:1: ( (lv_workPackages_3_0= ruleWorkPackage ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../me.shiv.dsl.anatomizer/src-gen/me/shiv/dsl/parser/antlr/internal/InternalAnatomy.g:154:1: (lv_workPackages_3_0= ruleWorkPackage )
            	    {
            	    // ../me.shiv.dsl.anatomizer/src-gen/me/shiv/dsl/parser/antlr/internal/InternalAnatomy.g:154:1: (lv_workPackages_3_0= ruleWorkPackage )
            	    // ../me.shiv.dsl.anatomizer/src-gen/me/shiv/dsl/parser/antlr/internal/InternalAnatomy.g:155:3: lv_workPackages_3_0= ruleWorkPackage
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getShipmentAccess().getWorkPackagesWorkPackageParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleWorkPackage_in_ruleShipment294);
            	    lv_workPackages_3_0=ruleWorkPackage();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getShipmentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"workPackages",
            	            		lv_workPackages_3_0, 
            	            		"WorkPackage");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleShipment307); 

                	newLeafNode(otherlv_4, grammarAccess.getShipmentAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleShipment"


    // $ANTLR start "entryRuleWorkPackage"
    // ../me.shiv.dsl.anatomizer/src-gen/me/shiv/dsl/parser/antlr/internal/InternalAnatomy.g:183:1: entryRuleWorkPackage returns [EObject current=null] : iv_ruleWorkPackage= ruleWorkPackage EOF ;
    public final EObject entryRuleWorkPackage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkPackage = null;


        try {
            // ../me.shiv.dsl.anatomizer/src-gen/me/shiv/dsl/parser/antlr/internal/InternalAnatomy.g:184:2: (iv_ruleWorkPackage= ruleWorkPackage EOF )
            // ../me.shiv.dsl.anatomizer/src-gen/me/shiv/dsl/parser/antlr/internal/InternalAnatomy.g:185:2: iv_ruleWorkPackage= ruleWorkPackage EOF
            {
             newCompositeNode(grammarAccess.getWorkPackageRule()); 
            pushFollow(FOLLOW_ruleWorkPackage_in_entryRuleWorkPackage343);
            iv_ruleWorkPackage=ruleWorkPackage();

            state._fsp--;

             current =iv_ruleWorkPackage; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorkPackage353); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWorkPackage"


    // $ANTLR start "ruleWorkPackage"
    // ../me.shiv.dsl.anatomizer/src-gen/me/shiv/dsl/parser/antlr/internal/InternalAnatomy.g:192:1: ruleWorkPackage returns [EObject current=null] : (otherlv_0= 'wp' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_desc_3_0= RULE_STRING ) ) (otherlv_4= '->' ( (lv_dep_5_0= RULE_ID ) ) )? ) ;
    public final EObject ruleWorkPackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_desc_3_0=null;
        Token otherlv_4=null;
        Token lv_dep_5_0=null;

         enterRule(); 
            
        try {
            // ../me.shiv.dsl.anatomizer/src-gen/me/shiv/dsl/parser/antlr/internal/InternalAnatomy.g:195:28: ( (otherlv_0= 'wp' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_desc_3_0= RULE_STRING ) ) (otherlv_4= '->' ( (lv_dep_5_0= RULE_ID ) ) )? ) )
            // ../me.shiv.dsl.anatomizer/src-gen/me/shiv/dsl/parser/antlr/internal/InternalAnatomy.g:196:1: (otherlv_0= 'wp' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_desc_3_0= RULE_STRING ) ) (otherlv_4= '->' ( (lv_dep_5_0= RULE_ID ) ) )? )
            {
            // ../me.shiv.dsl.anatomizer/src-gen/me/shiv/dsl/parser/antlr/internal/InternalAnatomy.g:196:1: (otherlv_0= 'wp' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_desc_3_0= RULE_STRING ) ) (otherlv_4= '->' ( (lv_dep_5_0= RULE_ID ) ) )? )
            // ../me.shiv.dsl.anatomizer/src-gen/me/shiv/dsl/parser/antlr/internal/InternalAnatomy.g:196:3: otherlv_0= 'wp' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_desc_3_0= RULE_STRING ) ) (otherlv_4= '->' ( (lv_dep_5_0= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleWorkPackage390); 

                	newLeafNode(otherlv_0, grammarAccess.getWorkPackageAccess().getWpKeyword_0());
                
            // ../me.shiv.dsl.anatomizer/src-gen/me/shiv/dsl/parser/antlr/internal/InternalAnatomy.g:200:1: ( (lv_name_1_0= RULE_ID ) )
            // ../me.shiv.dsl.anatomizer/src-gen/me/shiv/dsl/parser/antlr/internal/InternalAnatomy.g:201:1: (lv_name_1_0= RULE_ID )
            {
            // ../me.shiv.dsl.anatomizer/src-gen/me/shiv/dsl/parser/antlr/internal/InternalAnatomy.g:201:1: (lv_name_1_0= RULE_ID )
            // ../me.shiv.dsl.anatomizer/src-gen/me/shiv/dsl/parser/antlr/internal/InternalAnatomy.g:202:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkPackage407); 

            			newLeafNode(lv_name_1_0, grammarAccess.getWorkPackageAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWorkPackageRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleWorkPackage424); 

                	newLeafNode(otherlv_2, grammarAccess.getWorkPackageAccess().getCommaKeyword_2());
                
            // ../me.shiv.dsl.anatomizer/src-gen/me/shiv/dsl/parser/antlr/internal/InternalAnatomy.g:222:1: ( (lv_desc_3_0= RULE_STRING ) )
            // ../me.shiv.dsl.anatomizer/src-gen/me/shiv/dsl/parser/antlr/internal/InternalAnatomy.g:223:1: (lv_desc_3_0= RULE_STRING )
            {
            // ../me.shiv.dsl.anatomizer/src-gen/me/shiv/dsl/parser/antlr/internal/InternalAnatomy.g:223:1: (lv_desc_3_0= RULE_STRING )
            // ../me.shiv.dsl.anatomizer/src-gen/me/shiv/dsl/parser/antlr/internal/InternalAnatomy.g:224:3: lv_desc_3_0= RULE_STRING
            {
            lv_desc_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWorkPackage441); 

            			newLeafNode(lv_desc_3_0, grammarAccess.getWorkPackageAccess().getDescSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWorkPackageRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"desc",
                    		lv_desc_3_0, 
                    		"STRING");
            	    

            }


            }

            // ../me.shiv.dsl.anatomizer/src-gen/me/shiv/dsl/parser/antlr/internal/InternalAnatomy.g:240:2: (otherlv_4= '->' ( (lv_dep_5_0= RULE_ID ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../me.shiv.dsl.anatomizer/src-gen/me/shiv/dsl/parser/antlr/internal/InternalAnatomy.g:240:4: otherlv_4= '->' ( (lv_dep_5_0= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleWorkPackage459); 

                        	newLeafNode(otherlv_4, grammarAccess.getWorkPackageAccess().getHyphenMinusGreaterThanSignKeyword_4_0());
                        
                    // ../me.shiv.dsl.anatomizer/src-gen/me/shiv/dsl/parser/antlr/internal/InternalAnatomy.g:244:1: ( (lv_dep_5_0= RULE_ID ) )
                    // ../me.shiv.dsl.anatomizer/src-gen/me/shiv/dsl/parser/antlr/internal/InternalAnatomy.g:245:1: (lv_dep_5_0= RULE_ID )
                    {
                    // ../me.shiv.dsl.anatomizer/src-gen/me/shiv/dsl/parser/antlr/internal/InternalAnatomy.g:245:1: (lv_dep_5_0= RULE_ID )
                    // ../me.shiv.dsl.anatomizer/src-gen/me/shiv/dsl/parser/antlr/internal/InternalAnatomy.g:246:3: lv_dep_5_0= RULE_ID
                    {
                    lv_dep_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkPackage476); 

                    			newLeafNode(lv_dep_5_0, grammarAccess.getWorkPackageAccess().getDepIDTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWorkPackageRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"dep",
                            		lv_dep_5_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWorkPackage"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleModel122 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleShipment_in_ruleModel143 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_12_in_ruleModel156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShipment_in_entryRuleShipment192 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShipment202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleShipment239 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleShipment256 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleShipment273 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleWorkPackage_in_ruleShipment294 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleShipment307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkPackage_in_entryRuleWorkPackage343 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkPackage353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleWorkPackage390 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkPackage407 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleWorkPackage424 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWorkPackage441 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleWorkPackage459 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkPackage476 = new BitSet(new long[]{0x0000000000000002L});

}