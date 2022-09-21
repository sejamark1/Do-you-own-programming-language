// Generated from fspow.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class fspowParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, ID=5, STRING=6, WS=7;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_fcCreation = 2, RULE_fcCreationName = 3, 
		RULE_rootSpecifier = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stat", "fcCreation", "fcCreationName", "rootSpecifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'('", "')'", "'FileCollection'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "ID", "STRING", "WS"
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
	public String getGrammarFileName() { return "fspow.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public fspowParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(10);
				stat();
				}
				}
				setState(13); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
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

	public static class StatContext extends ParserRuleContext {
		public FcCreationContext fcCreation() {
			return getRuleContext(FcCreationContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).exitStat(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			fcCreation();
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

	public static class FcCreationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(fspowParser.ID, 0); }
		public FcCreationNameContext fcCreationName() {
			return getRuleContext(FcCreationNameContext.class,0);
		}
		public RootSpecifierContext rootSpecifier() {
			return getRuleContext(RootSpecifierContext.class,0);
		}
		public FcCreationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fcCreation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).enterFcCreation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).exitFcCreation(this);
		}
	}

	public final FcCreationContext fcCreation() throws RecognitionException {
		FcCreationContext _localctx = new FcCreationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_fcCreation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			match(ID);
			setState(18);
			match(T__0);
			setState(19);
			fcCreationName();
			setState(20);
			match(T__1);
			setState(21);
			rootSpecifier();
			setState(22);
			match(T__2);
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

	public static class FcCreationNameContext extends ParserRuleContext {
		public FcCreationNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fcCreationName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).enterFcCreationName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).exitFcCreationName(this);
		}
	}

	public final FcCreationNameContext fcCreationName() throws RecognitionException {
		FcCreationNameContext _localctx = new FcCreationNameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fcCreationName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(T__3);
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

	public static class RootSpecifierContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(fspowParser.STRING, 0); }
		public RootSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rootSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).enterRootSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).exitRootSpecifier(this);
		}
	}

	public final RootSpecifierContext rootSpecifier() throws RecognitionException {
		RootSpecifierContext _localctx = new RootSpecifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_rootSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(STRING);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\t\37\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\6\2\16\n\2\r\2\16\2\17\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\2\2\7\2\4\6\b\n\2\2\2\32\2"+
		"\r\3\2\2\2\4\21\3\2\2\2\6\23\3\2\2\2\b\32\3\2\2\2\n\34\3\2\2\2\f\16\5"+
		"\4\3\2\r\f\3\2\2\2\16\17\3\2\2\2\17\r\3\2\2\2\17\20\3\2\2\2\20\3\3\2\2"+
		"\2\21\22\5\6\4\2\22\5\3\2\2\2\23\24\7\7\2\2\24\25\7\3\2\2\25\26\5\b\5"+
		"\2\26\27\7\4\2\2\27\30\5\n\6\2\30\31\7\5\2\2\31\7\3\2\2\2\32\33\7\6\2"+
		"\2\33\t\3\2\2\2\34\35\7\b\2\2\35\13\3\2\2\2\3\17";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}