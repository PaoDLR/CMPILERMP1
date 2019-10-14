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
		TERMINALS=1, EPSILON=2, OPAREN=3, CPAREN=4, UNION=5, SYM=6, WS=7;
	public static final int
		RULE_output = 0, RULE_sym = 1, RULE_union = 2, RULE_concat = 3, RULE_accTerms = 4, 
		RULE_eps = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"output", "sym", "union", "concat", "accTerms", "eps"
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
			null, "TERMINALS", "EPSILON", "OPAREN", "CPAREN", "UNION", "SYM", "WS"
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
		public EpsContext eps() {
			return getRuleContext(EpsContext.class,0);
		}
		public ConcatContext concat() {
			return getRuleContext(ConcatContext.class,0);
		}
		public SymContext sym() {
			return getRuleContext(SymContext.class,0);
		}
		public UnionContext union() {
			return getRuleContext(UnionContext.class,0);
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
			setState(16);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(12);
				eps();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(13);
				concat();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(14);
				sym();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(15);
				union(0);
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

	public static class SymContext extends ParserRuleContext {
		public TerminalNode OPAREN() { return getToken(GrammarParser.OPAREN, 0); }
		public List<SymContext> sym() {
			return getRuleContexts(SymContext.class);
		}
		public SymContext sym(int i) {
			return getRuleContext(SymContext.class,i);
		}
		public TerminalNode CPAREN() { return getToken(GrammarParser.CPAREN, 0); }
		public TerminalNode SYM() { return getToken(GrammarParser.SYM, 0); }
		public List<ConcatContext> concat() {
			return getRuleContexts(ConcatContext.class);
		}
		public ConcatContext concat(int i) {
			return getRuleContext(ConcatContext.class,i);
		}
		public SymContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sym; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterSym(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitSym(this);
		}
	}

	public final SymContext sym() throws RecognitionException {
		SymContext _localctx = new SymContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sym);
		try {
			int _alt;
			setState(43);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(18);
				match(OPAREN);
				setState(19);
				sym();
				setState(20);
				match(CPAREN);
				setState(22);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(21);
					match(SYM);
					}
					break;
				}
				setState(27);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(24);
						sym();
						}
						} 
					}
					setState(29);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				concat();
				setState(32);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(31);
					match(SYM);
					}
					break;
				}
				setState(41);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(37);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(34);
							concat();
							}
							} 
						}
						setState(39);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
					}
					}
					break;
				case 2:
					{
					setState(40);
					sym();
					}
					break;
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

	public static class UnionContext extends ParserRuleContext {
		public TerminalNode OPAREN() { return getToken(GrammarParser.OPAREN, 0); }
		public List<UnionContext> union() {
			return getRuleContexts(UnionContext.class);
		}
		public UnionContext union(int i) {
			return getRuleContext(UnionContext.class,i);
		}
		public TerminalNode CPAREN() { return getToken(GrammarParser.CPAREN, 0); }
		public TerminalNode UNION() { return getToken(GrammarParser.UNION, 0); }
		public List<SymContext> sym() {
			return getRuleContexts(SymContext.class);
		}
		public SymContext sym(int i) {
			return getRuleContext(SymContext.class,i);
		}
		public List<EpsContext> eps() {
			return getRuleContexts(EpsContext.class);
		}
		public EpsContext eps(int i) {
			return getRuleContext(EpsContext.class,i);
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
		return union(0);
	}

	private UnionContext union(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		UnionContext _localctx = new UnionContext(_ctx, _parentState);
		UnionContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_union, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(46);
				match(OPAREN);
				setState(47);
				union(0);
				setState(48);
				match(CPAREN);
				setState(49);
				match(UNION);
				setState(50);
				union(3);
				}
				break;
			case 2:
				{
				setState(54);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TERMINALS:
				case OPAREN:
					{
					setState(52);
					sym();
					}
					break;
				case EPSILON:
					{
					setState(53);
					eps();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(56);
				match(UNION);
				setState(59);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TERMINALS:
				case OPAREN:
					{
					setState(57);
					sym();
					}
					break;
				case EPSILON:
					{
					setState(58);
					eps();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(71);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new UnionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_union);
					setState(63);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(64);
					match(UNION);
					setState(67);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case TERMINALS:
					case OPAREN:
						{
						setState(65);
						sym();
						}
						break;
					case EPSILON:
						{
						setState(66);
						eps();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(73);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
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
		enterRule(_localctx, 6, RULE_concat);
		try {
			int _alt;
			setState(83);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				match(OPAREN);
				setState(75);
				concat();
				setState(76);
				match(CPAREN);
				}
				break;
			case TERMINALS:
				enterOuterAlt(_localctx, 2);
				{
				setState(79); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(78);
						accTerms();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(81); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		enterRule(_localctx, 8, RULE_accTerms);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
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
		enterRule(_localctx, 10, RULE_eps);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return union_sempred((UnionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean union_sempred(UnionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\t\\\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\5\2\23\n\2\3\3\3\3"+
		"\3\3\3\3\5\3\31\n\3\3\3\7\3\34\n\3\f\3\16\3\37\13\3\3\3\3\3\5\3#\n\3\3"+
		"\3\7\3&\n\3\f\3\16\3)\13\3\3\3\5\3,\n\3\5\3.\n\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\5\49\n\4\3\4\3\4\3\4\5\4>\n\4\5\4@\n\4\3\4\3\4\3\4\3\4"+
		"\5\4F\n\4\7\4H\n\4\f\4\16\4K\13\4\3\5\3\5\3\5\3\5\3\5\6\5R\n\5\r\5\16"+
		"\5S\5\5V\n\5\3\6\3\6\3\7\3\7\3\7\2\3\6\b\2\4\6\b\n\f\2\2\2e\2\22\3\2\2"+
		"\2\4-\3\2\2\2\6?\3\2\2\2\bU\3\2\2\2\nW\3\2\2\2\fY\3\2\2\2\16\23\5\f\7"+
		"\2\17\23\5\b\5\2\20\23\5\4\3\2\21\23\5\6\4\2\22\16\3\2\2\2\22\17\3\2\2"+
		"\2\22\20\3\2\2\2\22\21\3\2\2\2\23\3\3\2\2\2\24\25\7\5\2\2\25\26\5\4\3"+
		"\2\26\30\7\6\2\2\27\31\7\b\2\2\30\27\3\2\2\2\30\31\3\2\2\2\31\35\3\2\2"+
		"\2\32\34\5\4\3\2\33\32\3\2\2\2\34\37\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2"+
		"\2\36.\3\2\2\2\37\35\3\2\2\2 \"\5\b\5\2!#\7\b\2\2\"!\3\2\2\2\"#\3\2\2"+
		"\2#+\3\2\2\2$&\5\b\5\2%$\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(,\3\2"+
		"\2\2)\'\3\2\2\2*,\5\4\3\2+\'\3\2\2\2+*\3\2\2\2,.\3\2\2\2-\24\3\2\2\2-"+
		" \3\2\2\2.\5\3\2\2\2/\60\b\4\1\2\60\61\7\5\2\2\61\62\5\6\4\2\62\63\7\6"+
		"\2\2\63\64\7\7\2\2\64\65\5\6\4\5\65@\3\2\2\2\669\5\4\3\2\679\5\f\7\28"+
		"\66\3\2\2\28\67\3\2\2\29:\3\2\2\2:=\7\7\2\2;>\5\4\3\2<>\5\f\7\2=;\3\2"+
		"\2\2=<\3\2\2\2>@\3\2\2\2?/\3\2\2\2?8\3\2\2\2@I\3\2\2\2AB\f\4\2\2BE\7\7"+
		"\2\2CF\5\4\3\2DF\5\f\7\2EC\3\2\2\2ED\3\2\2\2FH\3\2\2\2GA\3\2\2\2HK\3\2"+
		"\2\2IG\3\2\2\2IJ\3\2\2\2J\7\3\2\2\2KI\3\2\2\2LM\7\5\2\2MN\5\b\5\2NO\7"+
		"\6\2\2OV\3\2\2\2PR\5\n\6\2QP\3\2\2\2RS\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TV\3"+
		"\2\2\2UL\3\2\2\2UQ\3\2\2\2V\t\3\2\2\2WX\7\3\2\2X\13\3\2\2\2YZ\7\4\2\2"+
		"Z\r\3\2\2\2\20\22\30\35\"\'+-8=?EISU";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}