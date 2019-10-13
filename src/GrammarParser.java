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
		TERMINALS=1, EPSILON=2, OPAREN=3, CPAREN=4, UNION=5, NOM=6, OOM=7, OPT=8, 
		WS=9;
	public static final int
		RULE_output = 0, RULE_union = 1, RULE_concat = 2, RULE_accTerms = 3, RULE_eps = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"output", "union", "concat", "accTerms", "eps"
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
			null, "TERMINALS", "EPSILON", "OPAREN", "CPAREN", "UNION", "NOM", "OOM", 
			"OPT", "WS"
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
		public ConcatContext concat() {
			return getRuleContext(ConcatContext.class,0);
		}
		public UnionContext union() {
			return getRuleContext(UnionContext.class,0);
		}
		public EpsContext eps() {
			return getRuleContext(EpsContext.class,0);
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
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_output);
		try {
			setState(13);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(10);
				concat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(11);
				union();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(12);
				eps();
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
		public List<ConcatContext> concat() {
			return getRuleContexts(ConcatContext.class);
		}
		public ConcatContext concat(int i) {
			return getRuleContext(ConcatContext.class,i);
		}
		public TerminalNode OPAREN() { return getToken(GrammarParser.OPAREN, 0); }
		public TerminalNode CPAREN() { return getToken(GrammarParser.CPAREN, 0); }
		public List<TerminalNode> UNION() { return getTokens(GrammarParser.UNION); }
		public TerminalNode UNION(int i) {
			return getToken(GrammarParser.UNION, i);
		}
		public List<UnionContext> union() {
			return getRuleContexts(UnionContext.class);
		}
		public UnionContext union(int i) {
			return getRuleContext(UnionContext.class,i);
		}
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
	}

	public final UnionContext union() throws RecognitionException {
		UnionContext _localctx = new UnionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_union);
		try {
			setState(44);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(15);
				concat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(16);
				match(OPAREN);
				{
				setState(17);
				concat();
				setState(18);
				match(UNION);
				setState(19);
				concat();
				}
				setState(21);
				match(CPAREN);
				setState(22);
				match(UNION);
				setState(23);
				union();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(25);
				match(OPAREN);
				{
				setState(26);
				concat();
				setState(27);
				match(UNION);
				setState(28);
				union();
				}
				setState(30);
				match(CPAREN);
				setState(31);
				union();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(33);
				match(OPAREN);
				{
				setState(34);
				concat();
				setState(35);
				match(UNION);
				setState(36);
				union();
				}
				setState(38);
				match(CPAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(40);
				concat();
				setState(41);
				match(UNION);
				setState(42);
				union();
				}
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

	public static class ConcatContext extends ParserRuleContext {
		public TerminalNode OPAREN() { return getToken(GrammarParser.OPAREN, 0); }
		public ConcatContext concat() {
			return getRuleContext(ConcatContext.class,0);
		}
		public TerminalNode CPAREN() { return getToken(GrammarParser.CPAREN, 0); }
		public List<AccTermsContext> accTerms() {
			return getRuleContexts(AccTermsContext.class);
		}
		public AccTermsContext accTerms(int i) {
			return getRuleContext(AccTermsContext.class,i);
		}
		public ConcatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterConcat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitConcat(this);
		}
	}

	public final ConcatContext concat() throws RecognitionException {
		ConcatContext _localctx = new ConcatContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_concat);
		int _la;
		try {
			setState(55);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				match(OPAREN);
				setState(47);
				concat();
				setState(48);
				match(CPAREN);
				}
				break;
			case TERMINALS:
				enterOuterAlt(_localctx, 2);
				{
				setState(51); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(50);
					accTerms();
					}
					}
					setState(53); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TERMINALS );
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		public TerminalNode TERMINALS() { return getToken(GrammarParser.TERMINALS, 0); }
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
	}

	public final AccTermsContext accTerms() throws RecognitionException {
		AccTermsContext _localctx = new AccTermsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_accTerms);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(TERMINALS);
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
	}

	public final EpsContext eps() throws RecognitionException {
		EpsContext _localctx = new EpsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_eps);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\13@\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\5\2\20\n\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3/\n\3\3\4\3\4\3\4\3\4\3\4\6\4\66\n\4\r\4"+
		"\16\4\67\5\4:\n\4\3\5\3\5\3\6\3\6\3\6\2\2\7\2\4\6\b\n\2\2\2B\2\17\3\2"+
		"\2\2\4.\3\2\2\2\69\3\2\2\2\b;\3\2\2\2\n=\3\2\2\2\f\20\5\6\4\2\r\20\5\4"+
		"\3\2\16\20\5\n\6\2\17\f\3\2\2\2\17\r\3\2\2\2\17\16\3\2\2\2\20\3\3\2\2"+
		"\2\21/\5\6\4\2\22\23\7\5\2\2\23\24\5\6\4\2\24\25\7\7\2\2\25\26\5\6\4\2"+
		"\26\27\3\2\2\2\27\30\7\6\2\2\30\31\7\7\2\2\31\32\5\4\3\2\32/\3\2\2\2\33"+
		"\34\7\5\2\2\34\35\5\6\4\2\35\36\7\7\2\2\36\37\5\4\3\2\37 \3\2\2\2 !\7"+
		"\6\2\2!\"\5\4\3\2\"/\3\2\2\2#$\7\5\2\2$%\5\6\4\2%&\7\7\2\2&\'\5\4\3\2"+
		"\'(\3\2\2\2()\7\6\2\2)/\3\2\2\2*+\5\6\4\2+,\7\7\2\2,-\5\4\3\2-/\3\2\2"+
		"\2.\21\3\2\2\2.\22\3\2\2\2.\33\3\2\2\2.#\3\2\2\2.*\3\2\2\2/\5\3\2\2\2"+
		"\60\61\7\5\2\2\61\62\5\6\4\2\62\63\7\6\2\2\63:\3\2\2\2\64\66\5\b\5\2\65"+
		"\64\3\2\2\2\66\67\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28:\3\2\2\29\60\3\2"+
		"\2\29\65\3\2\2\2:\7\3\2\2\2;<\7\3\2\2<\t\3\2\2\2=>\7\4\2\2>\13\3\2\2\2"+
		"\6\17.\679";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}