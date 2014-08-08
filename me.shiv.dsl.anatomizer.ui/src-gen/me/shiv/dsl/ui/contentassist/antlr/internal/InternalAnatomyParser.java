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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAnatomyParser extends AbstractInternalContentAssistParser {
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
    public String getGrammarFileName() { return "../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g"; }


     
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




    // $ANTLR start "entryRuleModel"
    // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:61:1: ( ruleModel EOF )
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:69:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:73:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:74:1: ( ( rule__Model__Group__0 ) )
            {
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:74:1: ( ( rule__Model__Group__0 ) )
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:75:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:76:1: ( rule__Model__Group__0 )
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:76:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel94);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleShipment"
    // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:88:1: entryRuleShipment : ruleShipment EOF ;
    public final void entryRuleShipment() throws RecognitionException {
        try {
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:89:1: ( ruleShipment EOF )
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:90:1: ruleShipment EOF
            {
             before(grammarAccess.getShipmentRule()); 
            pushFollow(FOLLOW_ruleShipment_in_entryRuleShipment121);
            ruleShipment();

            state._fsp--;

             after(grammarAccess.getShipmentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleShipment128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleShipment"


    // $ANTLR start "ruleShipment"
    // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:97:1: ruleShipment : ( ( rule__Shipment__Group__0 ) ) ;
    public final void ruleShipment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:101:2: ( ( ( rule__Shipment__Group__0 ) ) )
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:102:1: ( ( rule__Shipment__Group__0 ) )
            {
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:102:1: ( ( rule__Shipment__Group__0 ) )
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:103:1: ( rule__Shipment__Group__0 )
            {
             before(grammarAccess.getShipmentAccess().getGroup()); 
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:104:1: ( rule__Shipment__Group__0 )
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:104:2: rule__Shipment__Group__0
            {
            pushFollow(FOLLOW_rule__Shipment__Group__0_in_ruleShipment154);
            rule__Shipment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getShipmentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleShipment"


    // $ANTLR start "entryRuleWorkPackage"
    // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:116:1: entryRuleWorkPackage : ruleWorkPackage EOF ;
    public final void entryRuleWorkPackage() throws RecognitionException {
        try {
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:117:1: ( ruleWorkPackage EOF )
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:118:1: ruleWorkPackage EOF
            {
             before(grammarAccess.getWorkPackageRule()); 
            pushFollow(FOLLOW_ruleWorkPackage_in_entryRuleWorkPackage181);
            ruleWorkPackage();

            state._fsp--;

             after(grammarAccess.getWorkPackageRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorkPackage188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWorkPackage"


    // $ANTLR start "ruleWorkPackage"
    // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:125:1: ruleWorkPackage : ( ( rule__WorkPackage__Group__0 ) ) ;
    public final void ruleWorkPackage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:129:2: ( ( ( rule__WorkPackage__Group__0 ) ) )
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:130:1: ( ( rule__WorkPackage__Group__0 ) )
            {
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:130:1: ( ( rule__WorkPackage__Group__0 ) )
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:131:1: ( rule__WorkPackage__Group__0 )
            {
             before(grammarAccess.getWorkPackageAccess().getGroup()); 
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:132:1: ( rule__WorkPackage__Group__0 )
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:132:2: rule__WorkPackage__Group__0
            {
            pushFollow(FOLLOW_rule__WorkPackage__Group__0_in_ruleWorkPackage214);
            rule__WorkPackage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWorkPackageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWorkPackage"


    // $ANTLR start "rule__Model__Group__0"
    // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:146:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:150:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:151:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0248);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0251);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:158:1: rule__Model__Group__0__Impl : ( '@startpa' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:162:1: ( ( '@startpa' ) )
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:163:1: ( '@startpa' )
            {
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:163:1: ( '@startpa' )
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:164:1: '@startpa'
            {
             before(grammarAccess.getModelAccess().getStartpaKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Model__Group__0__Impl279); 
             after(grammarAccess.getModelAccess().getStartpaKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:177:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:181:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:182:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1310);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1313);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:189:1: rule__Model__Group__1__Impl : ( ( ( rule__Model__ShipmentsAssignment_1 ) ) ( ( rule__Model__ShipmentsAssignment_1 )* ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:193:1: ( ( ( ( rule__Model__ShipmentsAssignment_1 ) ) ( ( rule__Model__ShipmentsAssignment_1 )* ) ) )
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:194:1: ( ( ( rule__Model__ShipmentsAssignment_1 ) ) ( ( rule__Model__ShipmentsAssignment_1 )* ) )
            {
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:194:1: ( ( ( rule__Model__ShipmentsAssignment_1 ) ) ( ( rule__Model__ShipmentsAssignment_1 )* ) )
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:195:1: ( ( rule__Model__ShipmentsAssignment_1 ) ) ( ( rule__Model__ShipmentsAssignment_1 )* )
            {
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:195:1: ( ( rule__Model__ShipmentsAssignment_1 ) )
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:196:1: ( rule__Model__ShipmentsAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getShipmentsAssignment_1()); 
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:197:1: ( rule__Model__ShipmentsAssignment_1 )
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:197:2: rule__Model__ShipmentsAssignment_1
            {
            pushFollow(FOLLOW_rule__Model__ShipmentsAssignment_1_in_rule__Model__Group__1__Impl342);
            rule__Model__ShipmentsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getShipmentsAssignment_1()); 

            }

            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:200:1: ( ( rule__Model__ShipmentsAssignment_1 )* )
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:201:1: ( rule__Model__ShipmentsAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getShipmentsAssignment_1()); 
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:202:1: ( rule__Model__ShipmentsAssignment_1 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:202:2: rule__Model__ShipmentsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Model__ShipmentsAssignment_1_in_rule__Model__Group__1__Impl354);
            	    rule__Model__ShipmentsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getShipmentsAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:213:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:217:1: ( rule__Model__Group__2__Impl )
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:218:2: rule__Model__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__2387);
            rule__Model__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:224:1: rule__Model__Group__2__Impl : ( '@endpa' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:228:1: ( ( '@endpa' ) )
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:229:1: ( '@endpa' )
            {
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:229:1: ( '@endpa' )
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:230:1: '@endpa'
            {
             before(grammarAccess.getModelAccess().getEndpaKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Model__Group__2__Impl415); 
             after(grammarAccess.getModelAccess().getEndpaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Shipment__Group__0"
    // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:249:1: rule__Shipment__Group__0 : rule__Shipment__Group__0__Impl rule__Shipment__Group__1 ;
    public final void rule__Shipment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:253:1: ( rule__Shipment__Group__0__Impl rule__Shipment__Group__1 )
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:254:2: rule__Shipment__Group__0__Impl rule__Shipment__Group__1
            {
            pushFollow(FOLLOW_rule__Shipment__Group__0__Impl_in_rule__Shipment__Group__0452);
            rule__Shipment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Shipment__Group__1_in_rule__Shipment__Group__0455);
            rule__Shipment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shipment__Group__0"


    // $ANTLR start "rule__Shipment__Group__0__Impl"
    // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:261:1: rule__Shipment__Group__0__Impl : ( 'shipment' ) ;
    public final void rule__Shipment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:265:1: ( ( 'shipment' ) )
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:266:1: ( 'shipment' )
            {
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:266:1: ( 'shipment' )
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:267:1: 'shipment'
            {
             before(grammarAccess.getShipmentAccess().getShipmentKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__Shipment__Group__0__Impl483); 
             after(grammarAccess.getShipmentAccess().getShipmentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shipment__Group__0__Impl"


    // $ANTLR start "rule__Shipment__Group__1"
    // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:280:1: rule__Shipment__Group__1 : rule__Shipment__Group__1__Impl rule__Shipment__Group__2 ;
    public final void rule__Shipment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:284:1: ( rule__Shipment__Group__1__Impl rule__Shipment__Group__2 )
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:285:2: rule__Shipment__Group__1__Impl rule__Shipment__Group__2
            {
            pushFollow(FOLLOW_rule__Shipment__Group__1__Impl_in_rule__Shipment__Group__1514);
            rule__Shipment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Shipment__Group__2_in_rule__Shipment__Group__1517);
            rule__Shipment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shipment__Group__1"


    // $ANTLR start "rule__Shipment__Group__1__Impl"
    // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:292:1: rule__Shipment__Group__1__Impl : ( ( rule__Shipment__NameAssignment_1 ) ) ;
    public final void rule__Shipment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:296:1: ( ( ( rule__Shipment__NameAssignment_1 ) ) )
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:297:1: ( ( rule__Shipment__NameAssignment_1 ) )
            {
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:297:1: ( ( rule__Shipment__NameAssignment_1 ) )
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:298:1: ( rule__Shipment__NameAssignment_1 )
            {
             before(grammarAccess.getShipmentAccess().getNameAssignment_1()); 
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:299:1: ( rule__Shipment__NameAssignment_1 )
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:299:2: rule__Shipment__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Shipment__NameAssignment_1_in_rule__Shipment__Group__1__Impl544);
            rule__Shipment__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getShipmentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shipment__Group__1__Impl"


    // $ANTLR start "rule__Shipment__Group__2"
    // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:309:1: rule__Shipment__Group__2 : rule__Shipment__Group__2__Impl rule__Shipment__Group__3 ;
    public final void rule__Shipment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:313:1: ( rule__Shipment__Group__2__Impl rule__Shipment__Group__3 )
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:314:2: rule__Shipment__Group__2__Impl rule__Shipment__Group__3
            {
            pushFollow(FOLLOW_rule__Shipment__Group__2__Impl_in_rule__Shipment__Group__2574);
            rule__Shipment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Shipment__Group__3_in_rule__Shipment__Group__2577);
            rule__Shipment__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shipment__Group__2"


    // $ANTLR start "rule__Shipment__Group__2__Impl"
    // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:321:1: rule__Shipment__Group__2__Impl : ( '{' ) ;
    public final void rule__Shipment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:325:1: ( ( '{' ) )
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:326:1: ( '{' )
            {
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:326:1: ( '{' )
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:327:1: '{'
            {
             before(grammarAccess.getShipmentAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__Shipment__Group__2__Impl605); 
             after(grammarAccess.getShipmentAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shipment__Group__2__Impl"


    // $ANTLR start "rule__Shipment__Group__3"
    // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:340:1: rule__Shipment__Group__3 : rule__Shipment__Group__3__Impl rule__Shipment__Group__4 ;
    public final void rule__Shipment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:344:1: ( rule__Shipment__Group__3__Impl rule__Shipment__Group__4 )
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:345:2: rule__Shipment__Group__3__Impl rule__Shipment__Group__4
            {
            pushFollow(FOLLOW_rule__Shipment__Group__3__Impl_in_rule__Shipment__Group__3636);
            rule__Shipment__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Shipment__Group__4_in_rule__Shipment__Group__3639);
            rule__Shipment__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shipment__Group__3"


    // $ANTLR start "rule__Shipment__Group__3__Impl"
    // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:352:1: rule__Shipment__Group__3__Impl : ( ( ( rule__Shipment__WorkPackagesAssignment_3 ) ) ( ( rule__Shipment__WorkPackagesAssignment_3 )* ) ) ;
    public final void rule__Shipment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:356:1: ( ( ( ( rule__Shipment__WorkPackagesAssignment_3 ) ) ( ( rule__Shipment__WorkPackagesAssignment_3 )* ) ) )
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:357:1: ( ( ( rule__Shipment__WorkPackagesAssignment_3 ) ) ( ( rule__Shipment__WorkPackagesAssignment_3 )* ) )
            {
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:357:1: ( ( ( rule__Shipment__WorkPackagesAssignment_3 ) ) ( ( rule__Shipment__WorkPackagesAssignment_3 )* ) )
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:358:1: ( ( rule__Shipment__WorkPackagesAssignment_3 ) ) ( ( rule__Shipment__WorkPackagesAssignment_3 )* )
            {
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:358:1: ( ( rule__Shipment__WorkPackagesAssignment_3 ) )
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:359:1: ( rule__Shipment__WorkPackagesAssignment_3 )
            {
             before(grammarAccess.getShipmentAccess().getWorkPackagesAssignment_3()); 
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:360:1: ( rule__Shipment__WorkPackagesAssignment_3 )
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:360:2: rule__Shipment__WorkPackagesAssignment_3
            {
            pushFollow(FOLLOW_rule__Shipment__WorkPackagesAssignment_3_in_rule__Shipment__Group__3__Impl668);
            rule__Shipment__WorkPackagesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getShipmentAccess().getWorkPackagesAssignment_3()); 

            }

            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:363:1: ( ( rule__Shipment__WorkPackagesAssignment_3 )* )
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:364:1: ( rule__Shipment__WorkPackagesAssignment_3 )*
            {
             before(grammarAccess.getShipmentAccess().getWorkPackagesAssignment_3()); 
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:365:1: ( rule__Shipment__WorkPackagesAssignment_3 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:365:2: rule__Shipment__WorkPackagesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Shipment__WorkPackagesAssignment_3_in_rule__Shipment__Group__3__Impl680);
            	    rule__Shipment__WorkPackagesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getShipmentAccess().getWorkPackagesAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shipment__Group__3__Impl"


    // $ANTLR start "rule__Shipment__Group__4"
    // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:376:1: rule__Shipment__Group__4 : rule__Shipment__Group__4__Impl ;
    public final void rule__Shipment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:380:1: ( rule__Shipment__Group__4__Impl )
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:381:2: rule__Shipment__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Shipment__Group__4__Impl_in_rule__Shipment__Group__4713);
            rule__Shipment__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shipment__Group__4"


    // $ANTLR start "rule__Shipment__Group__4__Impl"
    // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:387:1: rule__Shipment__Group__4__Impl : ( '}' ) ;
    public final void rule__Shipment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:391:1: ( ( '}' ) )
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:392:1: ( '}' )
            {
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:392:1: ( '}' )
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:393:1: '}'
            {
             before(grammarAccess.getShipmentAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_15_in_rule__Shipment__Group__4__Impl741); 
             after(grammarAccess.getShipmentAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shipment__Group__4__Impl"


    // $ANTLR start "rule__WorkPackage__Group__0"
    // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:416:1: rule__WorkPackage__Group__0 : rule__WorkPackage__Group__0__Impl rule__WorkPackage__Group__1 ;
    public final void rule__WorkPackage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:420:1: ( rule__WorkPackage__Group__0__Impl rule__WorkPackage__Group__1 )
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:421:2: rule__WorkPackage__Group__0__Impl rule__WorkPackage__Group__1
            {
            pushFollow(FOLLOW_rule__WorkPackage__Group__0__Impl_in_rule__WorkPackage__Group__0782);
            rule__WorkPackage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WorkPackage__Group__1_in_rule__WorkPackage__Group__0785);
            rule__WorkPackage__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkPackage__Group__0"


    // $ANTLR start "rule__WorkPackage__Group__0__Impl"
    // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:428:1: rule__WorkPackage__Group__0__Impl : ( 'wp' ) ;
    public final void rule__WorkPackage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:432:1: ( ( 'wp' ) )
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:433:1: ( 'wp' )
            {
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:433:1: ( 'wp' )
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:434:1: 'wp'
            {
             before(grammarAccess.getWorkPackageAccess().getWpKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__WorkPackage__Group__0__Impl813); 
             after(grammarAccess.getWorkPackageAccess().getWpKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkPackage__Group__0__Impl"


    // $ANTLR start "rule__WorkPackage__Group__1"
    // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:447:1: rule__WorkPackage__Group__1 : rule__WorkPackage__Group__1__Impl rule__WorkPackage__Group__2 ;
    public final void rule__WorkPackage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:451:1: ( rule__WorkPackage__Group__1__Impl rule__WorkPackage__Group__2 )
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:452:2: rule__WorkPackage__Group__1__Impl rule__WorkPackage__Group__2
            {
            pushFollow(FOLLOW_rule__WorkPackage__Group__1__Impl_in_rule__WorkPackage__Group__1844);
            rule__WorkPackage__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WorkPackage__Group__2_in_rule__WorkPackage__Group__1847);
            rule__WorkPackage__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkPackage__Group__1"


    // $ANTLR start "rule__WorkPackage__Group__1__Impl"
    // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:459:1: rule__WorkPackage__Group__1__Impl : ( ( rule__WorkPackage__NameAssignment_1 ) ) ;
    public final void rule__WorkPackage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:463:1: ( ( ( rule__WorkPackage__NameAssignment_1 ) ) )
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:464:1: ( ( rule__WorkPackage__NameAssignment_1 ) )
            {
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:464:1: ( ( rule__WorkPackage__NameAssignment_1 ) )
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:465:1: ( rule__WorkPackage__NameAssignment_1 )
            {
             before(grammarAccess.getWorkPackageAccess().getNameAssignment_1()); 
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:466:1: ( rule__WorkPackage__NameAssignment_1 )
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:466:2: rule__WorkPackage__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__WorkPackage__NameAssignment_1_in_rule__WorkPackage__Group__1__Impl874);
            rule__WorkPackage__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWorkPackageAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkPackage__Group__1__Impl"


    // $ANTLR start "rule__WorkPackage__Group__2"
    // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:476:1: rule__WorkPackage__Group__2 : rule__WorkPackage__Group__2__Impl rule__WorkPackage__Group__3 ;
    public final void rule__WorkPackage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:480:1: ( rule__WorkPackage__Group__2__Impl rule__WorkPackage__Group__3 )
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:481:2: rule__WorkPackage__Group__2__Impl rule__WorkPackage__Group__3
            {
            pushFollow(FOLLOW_rule__WorkPackage__Group__2__Impl_in_rule__WorkPackage__Group__2904);
            rule__WorkPackage__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WorkPackage__Group__3_in_rule__WorkPackage__Group__2907);
            rule__WorkPackage__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkPackage__Group__2"


    // $ANTLR start "rule__WorkPackage__Group__2__Impl"
    // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:488:1: rule__WorkPackage__Group__2__Impl : ( ',' ) ;
    public final void rule__WorkPackage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:492:1: ( ( ',' ) )
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:493:1: ( ',' )
            {
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:493:1: ( ',' )
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:494:1: ','
            {
             before(grammarAccess.getWorkPackageAccess().getCommaKeyword_2()); 
            match(input,17,FOLLOW_17_in_rule__WorkPackage__Group__2__Impl935); 
             after(grammarAccess.getWorkPackageAccess().getCommaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkPackage__Group__2__Impl"


    // $ANTLR start "rule__WorkPackage__Group__3"
    // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:507:1: rule__WorkPackage__Group__3 : rule__WorkPackage__Group__3__Impl rule__WorkPackage__Group__4 ;
    public final void rule__WorkPackage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:511:1: ( rule__WorkPackage__Group__3__Impl rule__WorkPackage__Group__4 )
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:512:2: rule__WorkPackage__Group__3__Impl rule__WorkPackage__Group__4
            {
            pushFollow(FOLLOW_rule__WorkPackage__Group__3__Impl_in_rule__WorkPackage__Group__3966);
            rule__WorkPackage__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WorkPackage__Group__4_in_rule__WorkPackage__Group__3969);
            rule__WorkPackage__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkPackage__Group__3"


    // $ANTLR start "rule__WorkPackage__Group__3__Impl"
    // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:519:1: rule__WorkPackage__Group__3__Impl : ( ( rule__WorkPackage__DescAssignment_3 ) ) ;
    public final void rule__WorkPackage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:523:1: ( ( ( rule__WorkPackage__DescAssignment_3 ) ) )
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:524:1: ( ( rule__WorkPackage__DescAssignment_3 ) )
            {
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:524:1: ( ( rule__WorkPackage__DescAssignment_3 ) )
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:525:1: ( rule__WorkPackage__DescAssignment_3 )
            {
             before(grammarAccess.getWorkPackageAccess().getDescAssignment_3()); 
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:526:1: ( rule__WorkPackage__DescAssignment_3 )
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:526:2: rule__WorkPackage__DescAssignment_3
            {
            pushFollow(FOLLOW_rule__WorkPackage__DescAssignment_3_in_rule__WorkPackage__Group__3__Impl996);
            rule__WorkPackage__DescAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getWorkPackageAccess().getDescAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkPackage__Group__3__Impl"


    // $ANTLR start "rule__WorkPackage__Group__4"
    // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:536:1: rule__WorkPackage__Group__4 : rule__WorkPackage__Group__4__Impl ;
    public final void rule__WorkPackage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:540:1: ( rule__WorkPackage__Group__4__Impl )
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:541:2: rule__WorkPackage__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__WorkPackage__Group__4__Impl_in_rule__WorkPackage__Group__41026);
            rule__WorkPackage__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkPackage__Group__4"


    // $ANTLR start "rule__WorkPackage__Group__4__Impl"
    // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:547:1: rule__WorkPackage__Group__4__Impl : ( ( rule__WorkPackage__Group_4__0 )? ) ;
    public final void rule__WorkPackage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:551:1: ( ( ( rule__WorkPackage__Group_4__0 )? ) )
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:552:1: ( ( rule__WorkPackage__Group_4__0 )? )
            {
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:552:1: ( ( rule__WorkPackage__Group_4__0 )? )
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:553:1: ( rule__WorkPackage__Group_4__0 )?
            {
             before(grammarAccess.getWorkPackageAccess().getGroup_4()); 
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:554:1: ( rule__WorkPackage__Group_4__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:554:2: rule__WorkPackage__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__WorkPackage__Group_4__0_in_rule__WorkPackage__Group__4__Impl1053);
                    rule__WorkPackage__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWorkPackageAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkPackage__Group__4__Impl"


    // $ANTLR start "rule__WorkPackage__Group_4__0"
    // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:574:1: rule__WorkPackage__Group_4__0 : rule__WorkPackage__Group_4__0__Impl rule__WorkPackage__Group_4__1 ;
    public final void rule__WorkPackage__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:578:1: ( rule__WorkPackage__Group_4__0__Impl rule__WorkPackage__Group_4__1 )
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:579:2: rule__WorkPackage__Group_4__0__Impl rule__WorkPackage__Group_4__1
            {
            pushFollow(FOLLOW_rule__WorkPackage__Group_4__0__Impl_in_rule__WorkPackage__Group_4__01094);
            rule__WorkPackage__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WorkPackage__Group_4__1_in_rule__WorkPackage__Group_4__01097);
            rule__WorkPackage__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkPackage__Group_4__0"


    // $ANTLR start "rule__WorkPackage__Group_4__0__Impl"
    // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:586:1: rule__WorkPackage__Group_4__0__Impl : ( '->' ) ;
    public final void rule__WorkPackage__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:590:1: ( ( '->' ) )
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:591:1: ( '->' )
            {
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:591:1: ( '->' )
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:592:1: '->'
            {
             before(grammarAccess.getWorkPackageAccess().getHyphenMinusGreaterThanSignKeyword_4_0()); 
            match(input,18,FOLLOW_18_in_rule__WorkPackage__Group_4__0__Impl1125); 
             after(grammarAccess.getWorkPackageAccess().getHyphenMinusGreaterThanSignKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkPackage__Group_4__0__Impl"


    // $ANTLR start "rule__WorkPackage__Group_4__1"
    // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:605:1: rule__WorkPackage__Group_4__1 : rule__WorkPackage__Group_4__1__Impl ;
    public final void rule__WorkPackage__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:609:1: ( rule__WorkPackage__Group_4__1__Impl )
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:610:2: rule__WorkPackage__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__WorkPackage__Group_4__1__Impl_in_rule__WorkPackage__Group_4__11156);
            rule__WorkPackage__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkPackage__Group_4__1"


    // $ANTLR start "rule__WorkPackage__Group_4__1__Impl"
    // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:616:1: rule__WorkPackage__Group_4__1__Impl : ( ( rule__WorkPackage__DepAssignment_4_1 ) ) ;
    public final void rule__WorkPackage__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:620:1: ( ( ( rule__WorkPackage__DepAssignment_4_1 ) ) )
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:621:1: ( ( rule__WorkPackage__DepAssignment_4_1 ) )
            {
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:621:1: ( ( rule__WorkPackage__DepAssignment_4_1 ) )
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:622:1: ( rule__WorkPackage__DepAssignment_4_1 )
            {
             before(grammarAccess.getWorkPackageAccess().getDepAssignment_4_1()); 
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:623:1: ( rule__WorkPackage__DepAssignment_4_1 )
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:623:2: rule__WorkPackage__DepAssignment_4_1
            {
            pushFollow(FOLLOW_rule__WorkPackage__DepAssignment_4_1_in_rule__WorkPackage__Group_4__1__Impl1183);
            rule__WorkPackage__DepAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getWorkPackageAccess().getDepAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkPackage__Group_4__1__Impl"


    // $ANTLR start "rule__Model__ShipmentsAssignment_1"
    // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:638:1: rule__Model__ShipmentsAssignment_1 : ( ruleShipment ) ;
    public final void rule__Model__ShipmentsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:642:1: ( ( ruleShipment ) )
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:643:1: ( ruleShipment )
            {
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:643:1: ( ruleShipment )
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:644:1: ruleShipment
            {
             before(grammarAccess.getModelAccess().getShipmentsShipmentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleShipment_in_rule__Model__ShipmentsAssignment_11222);
            ruleShipment();

            state._fsp--;

             after(grammarAccess.getModelAccess().getShipmentsShipmentParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ShipmentsAssignment_1"


    // $ANTLR start "rule__Shipment__NameAssignment_1"
    // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:653:1: rule__Shipment__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Shipment__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:657:1: ( ( RULE_ID ) )
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:658:1: ( RULE_ID )
            {
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:658:1: ( RULE_ID )
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:659:1: RULE_ID
            {
             before(grammarAccess.getShipmentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Shipment__NameAssignment_11253); 
             after(grammarAccess.getShipmentAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shipment__NameAssignment_1"


    // $ANTLR start "rule__Shipment__WorkPackagesAssignment_3"
    // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:668:1: rule__Shipment__WorkPackagesAssignment_3 : ( ruleWorkPackage ) ;
    public final void rule__Shipment__WorkPackagesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:672:1: ( ( ruleWorkPackage ) )
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:673:1: ( ruleWorkPackage )
            {
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:673:1: ( ruleWorkPackage )
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:674:1: ruleWorkPackage
            {
             before(grammarAccess.getShipmentAccess().getWorkPackagesWorkPackageParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleWorkPackage_in_rule__Shipment__WorkPackagesAssignment_31284);
            ruleWorkPackage();

            state._fsp--;

             after(grammarAccess.getShipmentAccess().getWorkPackagesWorkPackageParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shipment__WorkPackagesAssignment_3"


    // $ANTLR start "rule__WorkPackage__NameAssignment_1"
    // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:683:1: rule__WorkPackage__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__WorkPackage__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:687:1: ( ( RULE_ID ) )
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:688:1: ( RULE_ID )
            {
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:688:1: ( RULE_ID )
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:689:1: RULE_ID
            {
             before(grammarAccess.getWorkPackageAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__WorkPackage__NameAssignment_11315); 
             after(grammarAccess.getWorkPackageAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkPackage__NameAssignment_1"


    // $ANTLR start "rule__WorkPackage__DescAssignment_3"
    // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:698:1: rule__WorkPackage__DescAssignment_3 : ( RULE_STRING ) ;
    public final void rule__WorkPackage__DescAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:702:1: ( ( RULE_STRING ) )
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:703:1: ( RULE_STRING )
            {
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:703:1: ( RULE_STRING )
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:704:1: RULE_STRING
            {
             before(grammarAccess.getWorkPackageAccess().getDescSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__WorkPackage__DescAssignment_31346); 
             after(grammarAccess.getWorkPackageAccess().getDescSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkPackage__DescAssignment_3"


    // $ANTLR start "rule__WorkPackage__DepAssignment_4_1"
    // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:713:1: rule__WorkPackage__DepAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__WorkPackage__DepAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:717:1: ( ( RULE_ID ) )
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:718:1: ( RULE_ID )
            {
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:718:1: ( RULE_ID )
            // ../me.shiv.dsl.anatomizer.ui/src-gen/me/shiv/dsl/ui/contentassist/antlr/internal/InternalAnatomy.g:719:1: RULE_ID
            {
             before(grammarAccess.getWorkPackageAccess().getDepIDTerminalRuleCall_4_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__WorkPackage__DepAssignment_4_11377); 
             after(grammarAccess.getWorkPackageAccess().getDepIDTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkPackage__DepAssignment_4_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShipment_in_entryRuleShipment121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShipment128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Shipment__Group__0_in_ruleShipment154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkPackage_in_entryRuleWorkPackage181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkPackage188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkPackage__Group__0_in_ruleWorkPackage214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0248 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Model__Group__0__Impl279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1310 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ShipmentsAssignment_1_in_rule__Model__Group__1__Impl342 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__Model__ShipmentsAssignment_1_in_rule__Model__Group__1__Impl354 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__2387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Model__Group__2__Impl415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Shipment__Group__0__Impl_in_rule__Shipment__Group__0452 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Shipment__Group__1_in_rule__Shipment__Group__0455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Shipment__Group__0__Impl483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Shipment__Group__1__Impl_in_rule__Shipment__Group__1514 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Shipment__Group__2_in_rule__Shipment__Group__1517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Shipment__NameAssignment_1_in_rule__Shipment__Group__1__Impl544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Shipment__Group__2__Impl_in_rule__Shipment__Group__2574 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Shipment__Group__3_in_rule__Shipment__Group__2577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Shipment__Group__2__Impl605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Shipment__Group__3__Impl_in_rule__Shipment__Group__3636 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Shipment__Group__4_in_rule__Shipment__Group__3639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Shipment__WorkPackagesAssignment_3_in_rule__Shipment__Group__3__Impl668 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__Shipment__WorkPackagesAssignment_3_in_rule__Shipment__Group__3__Impl680 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__Shipment__Group__4__Impl_in_rule__Shipment__Group__4713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Shipment__Group__4__Impl741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkPackage__Group__0__Impl_in_rule__WorkPackage__Group__0782 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__WorkPackage__Group__1_in_rule__WorkPackage__Group__0785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__WorkPackage__Group__0__Impl813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkPackage__Group__1__Impl_in_rule__WorkPackage__Group__1844 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__WorkPackage__Group__2_in_rule__WorkPackage__Group__1847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkPackage__NameAssignment_1_in_rule__WorkPackage__Group__1__Impl874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkPackage__Group__2__Impl_in_rule__WorkPackage__Group__2904 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__WorkPackage__Group__3_in_rule__WorkPackage__Group__2907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__WorkPackage__Group__2__Impl935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkPackage__Group__3__Impl_in_rule__WorkPackage__Group__3966 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__WorkPackage__Group__4_in_rule__WorkPackage__Group__3969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkPackage__DescAssignment_3_in_rule__WorkPackage__Group__3__Impl996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkPackage__Group__4__Impl_in_rule__WorkPackage__Group__41026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkPackage__Group_4__0_in_rule__WorkPackage__Group__4__Impl1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkPackage__Group_4__0__Impl_in_rule__WorkPackage__Group_4__01094 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__WorkPackage__Group_4__1_in_rule__WorkPackage__Group_4__01097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__WorkPackage__Group_4__0__Impl1125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkPackage__Group_4__1__Impl_in_rule__WorkPackage__Group_4__11156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WorkPackage__DepAssignment_4_1_in_rule__WorkPackage__Group_4__1__Impl1183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShipment_in_rule__Model__ShipmentsAssignment_11222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Shipment__NameAssignment_11253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkPackage_in_rule__Shipment__WorkPackagesAssignment_31284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__WorkPackage__NameAssignment_11315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__WorkPackage__DescAssignment_31346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__WorkPackage__DepAssignment_4_11377 = new BitSet(new long[]{0x0000000000000002L});

}