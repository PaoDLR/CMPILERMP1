// Generated from D:/School/CMPILER/PE1/Code/CMPILERMP1\Grammar.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TERMINALS=1, EPSILON=2, OPARENTHESIS=3, CPARENTHESIS=4, UNION=5, NOM=6, 
		OOM=7, OPT=8;
	public static final int
		RULE_output = 0, RULE_union = 1, RULE_accTerms = 2, RULE_eps = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"output", "union", "accTerms", "eps"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TERMINALS", "EPSILON", "OPARENTHESIS", "CPARENTHESIS", "UNION", 
			"NOM", "OOM", "OPT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class OutputContext extends ParserRuleContext {
		public UnionContext union() {
			return getRuleContext(UnionContext.class,0);
		}
		public AccTermsContext accTerms() {
			return getRuleContext(AccTermsContext.class,0);
		}
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitOutput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitOutput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_output);
		try {
			setState(10);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(8);
				union();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(9);
				accTerms();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnionContext extends ParserRuleContext {
		public List<AccTermsContext> accTerms() {
			return getRuleContexts(AccTermsContext.class);
		}
		public AccTermsContext accTerms(int i) {
			return getRuleContext(AccTermsContext.class,i);
		}
		public TerminalNode UNION() { return getToken(GrammarParser.UNION, 0); }
		public UnionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterUnion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitUnion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitUnion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnionContext union() throws RecognitionException {
		UnionContext _localctx = new UnionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_union);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(12);
			accTerms();
			setState(13);
			match(UNION);
			setState(14);
			accTerms();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AccTermsContext extends ParserRuleContext {
		public List<TerminalNode> TERMINALS() { return getTokens(GrammarParser.TERMINALS); }
		public TerminalNode TERMINALS(int i) {
			return getToken(GrammarParser.TERMINALS, i);
		}
		public List<TerminalNode> NOM() { return getTokens(GrammarParser.NOM); }
		public TerminalNode NOM(int i) {
			return getToken(GrammarParser.NOM, i);
		}
		public TerminalNode OPARENTHESIS() { return getToken(GrammarParser.OPARENTHESIS, 0); }
		public TerminalNode CPARENTHESIS() { return getToken(GrammarParser.CPARENTHESIS, 0); }
		public AccTermsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accTerms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAccTerms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAccTerms(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitAccTerms(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccTermsContext accTerms() throws RecognitionException {
		AccTermsContext _localctx = new AccTermsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_accTerms);
		int _la;
		try {
			setState(40);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(16);
				match(TERMINALS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(21);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TERMINALS) {
					{
					{
					setState(17);
					match(TERMINALS);
					{
					setState(18);
					match(NOM);
					}
					}
					}
					setState(23);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(24);
				match(OPARENTHESIS);
				{
				setState(26); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(25);
					match(TERMINALS);
					}
					}
					setState(28); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TERMINALS );
				}
				setState(30);
				match(CPARENTHESIS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(31);
				match(OPARENTHESIS);
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TERMINALS) {
					{
					{
					setState(32);
					match(TERMINALS);
					{
					setState(33);
					match(NOM);
					}
					}
					}
					setState(38);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(39);
				match(CPARENTHESIS);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EpsContext extends ParserRuleContext {
		public TerminalNode EPSILON() { return getToken(GrammarParser.EPSILON, 0); }
		public EpsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eps; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterEps(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitEps(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitEps(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EpsContext eps() throws RecognitionException {
		EpsContext _localctx = new EpsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_eps);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(EPSILON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\n/\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\5\2\r\n\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\7\4\26"+
		"\n\4\f\4\16\4\31\13\4\3\4\3\4\6\4\35\n\4\r\4\16\4\36\3\4\3\4\3\4\3\4\7"+
		"\4%\n\4\f\4\16\4(\13\4\3\4\5\4+\n\4\3\5\3\5\3\5\2\2\6\2\4\6\b\2\2\2\61"+
		"\2\f\3\2\2\2\4\16\3\2\2\2\6*\3\2\2\2\b,\3\2\2\2\n\r\5\4\3\2\13\r\5\6\4"+
		"\2\f\n\3\2\2\2\f\13\3\2\2\2\r\3\3\2\2\2\16\17\5\6\4\2\17\20\7\7\2\2\20"+
		"\21\5\6\4\2\21\5\3\2\2\2\22+\7\3\2\2\23\24\7\3\2\2\24\26\7\b\2\2\25\23"+
		"\3\2\2\2\26\31\3\2\2\2\27\25\3\2\2\2\27\30\3\2\2\2\30+\3\2\2\2\31\27\3"+
		"\2\2\2\32\34\7\5\2\2\33\35\7\3\2\2\34\33\3\2\2\2\35\36\3\2\2\2\36\34\3"+
		"\2\2\2\36\37\3\2\2\2\37 \3\2\2\2 +\7\6\2\2!&\7\5\2\2\"#\7\3\2\2#%\7\b"+
		"\2\2$\"\3\2\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\')\3\2\2\2(&\3\2\2\2)+"+
		"\7\6\2\2*\22\3\2\2\2*\27\3\2\2\2*\32\3\2\2\2*!\3\2\2\2+\7\3\2\2\2,-\7"+
		"\4\2\2-\t\3\2\2\2\7\f\27\36&*";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}