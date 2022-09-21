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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, ID=13, STRING=14, INTEGER=15, WS=16;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_fcCreation = 2, RULE_fcCreationName = 3, 
		RULE_newFileCollection = 4, RULE_rootSpecifier = 5, RULE_selCreation = 6, 
		RULE_selCreationName = 7, RULE_filterSpecifier = 8, RULE_selfilter = 9, 
		RULE_number = 10, RULE_attribute = 11, RULE_filterFcCreation = 12, RULE_fcApplySelector = 13, 
		RULE_expression = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stat", "fcCreation", "fcCreationName", "newFileCollection", 
			"rootSpecifier", "selCreation", "selCreationName", "filterSpecifier", 
			"selfilter", "number", "attribute", "filterFcCreation", "fcApplySelector", 
			"expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'('", "')'", "'FileCollection'", "'Selector'", "','", "'top'", 
			"'fspBiggest'", "'fspOldest'", "'fspSmallest'", "'fspNewest'", "'.apply('"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "ID", "STRING", "INTEGER", "WS"
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
			setState(31); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(30);
				stat();
				}
				}
				setState(33); 
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
		public SelCreationContext selCreation() {
			return getRuleContext(SelCreationContext.class,0);
		}
		public FilterFcCreationContext filterFcCreation() {
			return getRuleContext(FilterFcCreationContext.class,0);
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
			setState(38);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				fcCreation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				selCreation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(37);
				filterFcCreation();
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
			setState(40);
			match(ID);
			setState(41);
			match(T__0);
			setState(42);
			fcCreationName();
			setState(43);
			match(T__1);
			setState(44);
			rootSpecifier();
			setState(45);
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
			setState(47);
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

	public static class NewFileCollectionContext extends ParserRuleContext {
		public FcCreationNameContext fcCreationName() {
			return getRuleContext(FcCreationNameContext.class,0);
		}
		public RootSpecifierContext rootSpecifier() {
			return getRuleContext(RootSpecifierContext.class,0);
		}
		public NewFileCollectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newFileCollection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).enterNewFileCollection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).exitNewFileCollection(this);
		}
	}

	public final NewFileCollectionContext newFileCollection() throws RecognitionException {
		NewFileCollectionContext _localctx = new NewFileCollectionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_newFileCollection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			fcCreationName();
			setState(50);
			match(T__1);
			setState(51);
			rootSpecifier();
			setState(52);
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
		enterRule(_localctx, 10, RULE_rootSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
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

	public static class SelCreationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(fspowParser.ID, 0); }
		public SelCreationNameContext selCreationName() {
			return getRuleContext(SelCreationNameContext.class,0);
		}
		public FilterSpecifierContext filterSpecifier() {
			return getRuleContext(FilterSpecifierContext.class,0);
		}
		public SelCreationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selCreation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).enterSelCreation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).exitSelCreation(this);
		}
	}

	public final SelCreationContext selCreation() throws RecognitionException {
		SelCreationContext _localctx = new SelCreationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_selCreation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(ID);
			setState(57);
			match(T__0);
			setState(58);
			selCreationName();
			setState(59);
			match(T__1);
			setState(60);
			filterSpecifier();
			setState(61);
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

	public static class SelCreationNameContext extends ParserRuleContext {
		public SelCreationNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selCreationName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).enterSelCreationName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).exitSelCreationName(this);
		}
	}

	public final SelCreationNameContext selCreationName() throws RecognitionException {
		SelCreationNameContext _localctx = new SelCreationNameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_selCreationName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(T__4);
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

	public static class FilterSpecifierContext extends ParserRuleContext {
		public SelfilterContext selfilter() {
			return getRuleContext(SelfilterContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public FilterSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filterSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).enterFilterSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).exitFilterSpecifier(this);
		}
	}

	public final FilterSpecifierContext filterSpecifier() throws RecognitionException {
		FilterSpecifierContext _localctx = new FilterSpecifierContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_filterSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			selfilter();
			setState(66);
			match(T__1);
			setState(67);
			number();
			setState(68);
			match(T__5);
			setState(69);
			attribute();
			setState(70);
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

	public static class SelfilterContext extends ParserRuleContext {
		public SelfilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selfilter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).enterSelfilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).exitSelfilter(this);
		}
	}

	public final SelfilterContext selfilter() throws RecognitionException {
		SelfilterContext _localctx = new SelfilterContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_selfilter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(T__6);
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(fspowParser.INTEGER, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(INTEGER);
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

	public static class AttributeContext extends ParserRuleContext {
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).exitAttribute(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class FilterFcCreationContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(fspowParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(fspowParser.ID, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FilterFcCreationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filterFcCreation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).enterFilterFcCreation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).exitFilterFcCreation(this);
		}
	}

	public final FilterFcCreationContext filterFcCreation() throws RecognitionException {
		FilterFcCreationContext _localctx = new FilterFcCreationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_filterFcCreation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(ID);
			setState(79);
			match(T__0);
			setState(80);
			match(ID);
			setState(81);
			match(T__11);
			setState(82);
			expression();
			setState(83);
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

	public static class FcApplySelectorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(fspowParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FcApplySelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fcApplySelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).enterFcApplySelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).exitFcApplySelector(this);
		}
	}

	public final FcApplySelectorContext fcApplySelector() throws RecognitionException {
		FcApplySelectorContext _localctx = new FcApplySelectorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_fcApplySelector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(ID);
			setState(86);
			match(T__11);
			setState(87);
			expression();
			setState(88);
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

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(fspowParser.ID, 0); }
		public FilterSpecifierContext filterSpecifier() {
			return getRuleContext(FilterSpecifierContext.class,0);
		}
		public NewFileCollectionContext newFileCollection() {
			return getRuleContext(NewFileCollectionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fspowListener ) ((fspowListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expression);
		try {
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				match(ID);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				filterSpecifier();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				newFileCollection();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\22b\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\6\2\"\n\2\r\2\16\2#\3"+
		"\3\3\3\3\3\5\3)\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\5\20`\n\20\3\20\2\2\21\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36\2\3\3\2\n\r\2W\2!\3\2\2\2\4(\3\2\2\2"+
		"\6*\3\2\2\2\b\61\3\2\2\2\n\63\3\2\2\2\f8\3\2\2\2\16:\3\2\2\2\20A\3\2\2"+
		"\2\22C\3\2\2\2\24J\3\2\2\2\26L\3\2\2\2\30N\3\2\2\2\32P\3\2\2\2\34W\3\2"+
		"\2\2\36_\3\2\2\2 \"\5\4\3\2! \3\2\2\2\"#\3\2\2\2#!\3\2\2\2#$\3\2\2\2$"+
		"\3\3\2\2\2%)\5\6\4\2&)\5\16\b\2\')\5\32\16\2(%\3\2\2\2(&\3\2\2\2(\'\3"+
		"\2\2\2)\5\3\2\2\2*+\7\17\2\2+,\7\3\2\2,-\5\b\5\2-.\7\4\2\2./\5\f\7\2/"+
		"\60\7\5\2\2\60\7\3\2\2\2\61\62\7\6\2\2\62\t\3\2\2\2\63\64\5\b\5\2\64\65"+
		"\7\4\2\2\65\66\5\f\7\2\66\67\7\5\2\2\67\13\3\2\2\289\7\20\2\29\r\3\2\2"+
		"\2:;\7\17\2\2;<\7\3\2\2<=\5\20\t\2=>\7\4\2\2>?\5\22\n\2?@\7\5\2\2@\17"+
		"\3\2\2\2AB\7\7\2\2B\21\3\2\2\2CD\5\24\13\2DE\7\4\2\2EF\5\26\f\2FG\7\b"+
		"\2\2GH\5\30\r\2HI\7\5\2\2I\23\3\2\2\2JK\7\t\2\2K\25\3\2\2\2LM\7\21\2\2"+
		"M\27\3\2\2\2NO\t\2\2\2O\31\3\2\2\2PQ\7\17\2\2QR\7\3\2\2RS\7\17\2\2ST\7"+
		"\16\2\2TU\5\36\20\2UV\7\5\2\2V\33\3\2\2\2WX\7\17\2\2XY\7\16\2\2YZ\5\36"+
		"\20\2Z[\7\5\2\2[\35\3\2\2\2\\`\7\17\2\2]`\5\22\n\2^`\5\n\6\2_\\\3\2\2"+
		"\2_]\3\2\2\2_^\3\2\2\2`\37\3\2\2\2\5#(_";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}