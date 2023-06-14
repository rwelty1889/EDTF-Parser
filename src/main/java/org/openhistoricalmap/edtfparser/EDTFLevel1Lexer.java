// Generated from EDTFLevel1.g4 by ANTLR 4.9
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EDTFLevel1Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, DIGIT=14, Year=15, YearPartial=16, 
		TwoDigit=17, TwoDigitPartial=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "DIGIT", "Year", "YearPartial", "TwoDigit", 
			"TwoDigitPartial"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'-'", "'?'", "'~'", "'%'", "'T'", "':'", "'/'", "'/..'", "'../'", 
			"'gr:'", "'gregorian:'", "'jl:'", "'julian:'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "DIGIT", "Year", "YearPartial", "TwoDigit", "TwoDigitPartial"
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


	public EDTFLevel1Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "EDTFLevel1.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24\u00a6\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\6\20l\n\20\r\20\16\20m\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\6\20x\n\20\r\20\16\20y\5\20|\n\20\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\5\21\u009f\n\21\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\2\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\3\2\2\2\u00af\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3\'\3\2\2\2\5)\3"+
		"\2\2\2\7+\3\2\2\2\t-\3\2\2\2\13/\3\2\2\2\r\61\3\2\2\2\17\63\3\2\2\2\21"+
		"\65\3\2\2\2\239\3\2\2\2\25=\3\2\2\2\27A\3\2\2\2\31L\3\2\2\2\33P\3\2\2"+
		"\2\35X\3\2\2\2\37{\3\2\2\2!\u009e\3\2\2\2#\u00a0\3\2\2\2%\u00a3\3\2\2"+
		"\2\'(\7/\2\2(\4\3\2\2\2)*\7A\2\2*\6\3\2\2\2+,\7\u0080\2\2,\b\3\2\2\2-"+
		".\7\'\2\2.\n\3\2\2\2/\60\7V\2\2\60\f\3\2\2\2\61\62\7<\2\2\62\16\3\2\2"+
		"\2\63\64\7\61\2\2\64\20\3\2\2\2\65\66\7\61\2\2\66\67\7\60\2\2\678\7\60"+
		"\2\28\22\3\2\2\29:\7\60\2\2:;\7\60\2\2;<\7\61\2\2<\24\3\2\2\2=>\7i\2\2"+
		">?\7t\2\2?@\7<\2\2@\26\3\2\2\2AB\7i\2\2BC\7t\2\2CD\7g\2\2DE\7i\2\2EF\7"+
		"q\2\2FG\7t\2\2GH\7k\2\2HI\7c\2\2IJ\7p\2\2JK\7<\2\2K\30\3\2\2\2LM\7l\2"+
		"\2MN\7n\2\2NO\7<\2\2O\32\3\2\2\2PQ\7l\2\2QR\7w\2\2RS\7n\2\2ST\7k\2\2T"+
		"U\7c\2\2UV\7p\2\2VW\7<\2\2W\34\3\2\2\2XY\4\62;\2Y\36\3\2\2\2Z[\5\35\17"+
		"\2[\\\5\35\17\2\\]\5\35\17\2]^\5\35\17\2^|\3\2\2\2_`\7/\2\2`a\5\35\17"+
		"\2ab\5\35\17\2bc\5\35\17\2cd\5\35\17\2d|\3\2\2\2ef\7[\2\2fg\5\35\17\2"+
		"gh\5\35\17\2hi\5\35\17\2ik\5\35\17\2jl\5\35\17\2kj\3\2\2\2lm\3\2\2\2m"+
		"k\3\2\2\2mn\3\2\2\2n|\3\2\2\2op\7[\2\2pq\7/\2\2qr\3\2\2\2rs\5\35\17\2"+
		"st\5\35\17\2tu\5\35\17\2uw\5\35\17\2vx\5\35\17\2wv\3\2\2\2xy\3\2\2\2y"+
		"w\3\2\2\2yz\3\2\2\2z|\3\2\2\2{Z\3\2\2\2{_\3\2\2\2{e\3\2\2\2{o\3\2\2\2"+
		"| \3\2\2\2}~\5\35\17\2~\177\5\35\17\2\177\u0080\5\35\17\2\u0080\u0081"+
		"\7Z\2\2\u0081\u009f\3\2\2\2\u0082\u0083\7/\2\2\u0083\u0084\5\35\17\2\u0084"+
		"\u0085\5\35\17\2\u0085\u0086\5\35\17\2\u0086\u0087\7Z\2\2\u0087\u009f"+
		"\3\2\2\2\u0088\u0089\5\35\17\2\u0089\u008a\5\35\17\2\u008a\u008b\7Z\2"+
		"\2\u008b\u008c\7Z\2\2\u008c\u009f\3\2\2\2\u008d\u008e\7/\2\2\u008e\u008f"+
		"\5\35\17\2\u008f\u0090\5\35\17\2\u0090\u0091\7Z\2\2\u0091\u0092\7Z\2\2"+
		"\u0092\u009f\3\2\2\2\u0093\u0094\5\35\17\2\u0094\u0095\7Z\2\2\u0095\u0096"+
		"\7Z\2\2\u0096\u0097\7Z\2\2\u0097\u009f\3\2\2\2\u0098\u0099\7/\2\2\u0099"+
		"\u009a\5\35\17\2\u009a\u009b\7Z\2\2\u009b\u009c\7Z\2\2\u009c\u009d\7Z"+
		"\2\2\u009d\u009f\3\2\2\2\u009e}\3\2\2\2\u009e\u0082\3\2\2\2\u009e\u0088"+
		"\3\2\2\2\u009e\u008d\3\2\2\2\u009e\u0093\3\2\2\2\u009e\u0098\3\2\2\2\u009f"+
		"\"\3\2\2\2\u00a0\u00a1\5\35\17\2\u00a1\u00a2\5\35\17\2\u00a2$\3\2\2\2"+
		"\u00a3\u00a4\5\35\17\2\u00a4\u00a5\7Z\2\2\u00a5&\3\2\2\2\7\2my{\u009e"+
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