// Generated from fspow.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class fspowLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, ID=13, STRING=14, INTEGER=15, WS=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "ID", "STRING", "INTEGER", "WS"
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


	public fspowLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "fspow.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22\u0095\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3"+
		"\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\6\16}\n\16\r\16\16\16~\3\17\3\17\7\17\u0083\n\17\f\17"+
		"\16\17\u0086\13\17\3\17\3\17\3\20\6\20\u008b\n\20\r\20\16\20\u008c\3\21"+
		"\6\21\u0090\n\21\r\21\16\21\u0091\3\21\3\21\3\u0084\2\22\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22\3\2"+
		"\6\4\2C\\c|\5\2\62;C\\c|\3\2\62;\5\2\13\f\17\17\"\"\2\u0098\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\3#\3\2\2\2\5%\3\2"+
		"\2\2\7\'\3\2\2\2\t)\3\2\2\2\138\3\2\2\2\rA\3\2\2\2\17C\3\2\2\2\21G\3\2"+
		"\2\2\23R\3\2\2\2\25\\\3\2\2\2\27h\3\2\2\2\31r\3\2\2\2\33z\3\2\2\2\35\u0080"+
		"\3\2\2\2\37\u008a\3\2\2\2!\u008f\3\2\2\2#$\7?\2\2$\4\3\2\2\2%&\7*\2\2"+
		"&\6\3\2\2\2\'(\7+\2\2(\b\3\2\2\2)*\7H\2\2*+\7k\2\2+,\7n\2\2,-\7g\2\2-"+
		".\7E\2\2./\7q\2\2/\60\7n\2\2\60\61\7n\2\2\61\62\7g\2\2\62\63\7e\2\2\63"+
		"\64\7v\2\2\64\65\7k\2\2\65\66\7q\2\2\66\67\7p\2\2\67\n\3\2\2\289\7U\2"+
		"\29:\7g\2\2:;\7n\2\2;<\7g\2\2<=\7e\2\2=>\7v\2\2>?\7q\2\2?@\7t\2\2@\f\3"+
		"\2\2\2AB\7.\2\2B\16\3\2\2\2CD\7v\2\2DE\7q\2\2EF\7r\2\2F\20\3\2\2\2GH\7"+
		"h\2\2HI\7u\2\2IJ\7r\2\2JK\7D\2\2KL\7k\2\2LM\7i\2\2MN\7i\2\2NO\7g\2\2O"+
		"P\7u\2\2PQ\7v\2\2Q\22\3\2\2\2RS\7h\2\2ST\7u\2\2TU\7r\2\2UV\7Q\2\2VW\7"+
		"n\2\2WX\7f\2\2XY\7g\2\2YZ\7u\2\2Z[\7v\2\2[\24\3\2\2\2\\]\7h\2\2]^\7u\2"+
		"\2^_\7r\2\2_`\7U\2\2`a\7o\2\2ab\7c\2\2bc\7n\2\2cd\7n\2\2de\7g\2\2ef\7"+
		"u\2\2fg\7v\2\2g\26\3\2\2\2hi\7h\2\2ij\7u\2\2jk\7r\2\2kl\7P\2\2lm\7g\2"+
		"\2mn\7y\2\2no\7g\2\2op\7u\2\2pq\7v\2\2q\30\3\2\2\2rs\7\60\2\2st\7c\2\2"+
		"tu\7r\2\2uv\7r\2\2vw\7n\2\2wx\7{\2\2xy\7*\2\2y\32\3\2\2\2z|\t\2\2\2{}"+
		"\t\3\2\2|{\3\2\2\2}~\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\34\3\2\2\2\u0080"+
		"\u0084\7$\2\2\u0081\u0083\13\2\2\2\u0082\u0081\3\2\2\2\u0083\u0086\3\2"+
		"\2\2\u0084\u0085\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0087\3\2\2\2\u0086"+
		"\u0084\3\2\2\2\u0087\u0088\7$\2\2\u0088\36\3\2\2\2\u0089\u008b\t\4\2\2"+
		"\u008a\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d"+
		"\3\2\2\2\u008d \3\2\2\2\u008e\u0090\t\5\2\2\u008f\u008e\3\2\2\2\u0090"+
		"\u0091\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\3\2"+
		"\2\2\u0093\u0094\b\21\2\2\u0094\"\3\2\2\2\7\2~\u0084\u008c\u0091\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}