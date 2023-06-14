// Generated from EDTFLevel1.g4 by ANTLR 4.9
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EDTFLevel1Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, DIGIT=14, Year=15, YearPartial=16, 
		TwoDigit=17, TwoDigitPartial=18;
	public static final int
		RULE_date = 0, RULE_qualifiedDate = 1, RULE_time = 2, RULE_dateTime = 3, 
		RULE_dateOrInterval = 4, RULE_gregorianDate = 5, RULE_julianDate = 6, 
		RULE_dateSpecification = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"date", "qualifiedDate", "time", "dateTime", "dateOrInterval", "gregorianDate", 
			"julianDate", "dateSpecification"
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

	@Override
	public String getGrammarFileName() { return "EDTFLevel1.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EDTFLevel1Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class DateContext extends ParserRuleContext {
		public TerminalNode Year() { return getToken(EDTFLevel1Parser.Year, 0); }
		public List<TerminalNode> TwoDigit() { return getTokens(EDTFLevel1Parser.TwoDigit); }
		public TerminalNode TwoDigit(int i) {
			return getToken(EDTFLevel1Parser.TwoDigit, i);
		}
		public TerminalNode TwoDigitPartial() { return getToken(EDTFLevel1Parser.TwoDigitPartial, 0); }
		public TerminalNode YearPartial() { return getToken(EDTFLevel1Parser.YearPartial, 0); }
		public DateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EDTFLevel1Listener ) ((EDTFLevel1Listener)listener).enterDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EDTFLevel1Listener ) ((EDTFLevel1Listener)listener).exitDate(this);
		}
	}

	public final DateContext date() throws RecognitionException {
		DateContext _localctx = new DateContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_date);
		try {
			setState(34);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(16);
				match(Year);
				setState(17);
				match(T__0);
				setState(18);
				match(TwoDigit);
				setState(19);
				match(T__0);
				setState(20);
				match(TwoDigit);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(21);
				match(Year);
				setState(22);
				match(T__0);
				setState(23);
				match(TwoDigit);
				setState(24);
				match(T__0);
				setState(25);
				match(TwoDigitPartial);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(26);
				match(Year);
				setState(27);
				match(T__0);
				setState(28);
				match(TwoDigit);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(29);
				match(Year);
				setState(30);
				match(T__0);
				setState(31);
				match(TwoDigitPartial);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(32);
				match(Year);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(33);
				match(YearPartial);
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

	public static class QualifiedDateContext extends ParserRuleContext {
		public DateContext date() {
			return getRuleContext(DateContext.class,0);
		}
		public QualifiedDateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedDate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EDTFLevel1Listener ) ((EDTFLevel1Listener)listener).enterQualifiedDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EDTFLevel1Listener ) ((EDTFLevel1Listener)listener).exitQualifiedDate(this);
		}
	}

	public final QualifiedDateContext qualifiedDate() throws RecognitionException {
		QualifiedDateContext _localctx = new QualifiedDateContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_qualifiedDate);
		try {
			setState(45);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				date();
				setState(37);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				date();
				setState(40);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				date();
				setState(43);
				match(T__3);
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

	public static class TimeContext extends ParserRuleContext {
		public List<TerminalNode> TwoDigit() { return getTokens(EDTFLevel1Parser.TwoDigit); }
		public TerminalNode TwoDigit(int i) {
			return getToken(EDTFLevel1Parser.TwoDigit, i);
		}
		public TimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EDTFLevel1Listener ) ((EDTFLevel1Listener)listener).enterTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EDTFLevel1Listener ) ((EDTFLevel1Listener)listener).exitTime(this);
		}
	}

	public final TimeContext time() throws RecognitionException {
		TimeContext _localctx = new TimeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_time);
		try {
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				match(T__4);
				setState(48);
				match(TwoDigit);
				setState(49);
				match(T__5);
				setState(50);
				match(TwoDigit);
				setState(51);
				match(T__5);
				setState(52);
				match(TwoDigit);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				match(T__4);
				setState(54);
				match(TwoDigit);
				setState(55);
				match(T__5);
				setState(56);
				match(TwoDigit);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(57);
				match(T__4);
				setState(58);
				match(TwoDigit);
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

	public static class DateTimeContext extends ParserRuleContext {
		public QualifiedDateContext qualifiedDate() {
			return getRuleContext(QualifiedDateContext.class,0);
		}
		public DateContext date() {
			return getRuleContext(DateContext.class,0);
		}
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
		}
		public DateTimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateTime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EDTFLevel1Listener ) ((EDTFLevel1Listener)listener).enterDateTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EDTFLevel1Listener ) ((EDTFLevel1Listener)listener).exitDateTime(this);
		}
	}

	public final DateTimeContext dateTime() throws RecognitionException {
		DateTimeContext _localctx = new DateTimeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_dateTime);
		try {
			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				qualifiedDate();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				date();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
				date();
				setState(64);
				time();
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

	public static class DateOrIntervalContext extends ParserRuleContext {
		public List<DateTimeContext> dateTime() {
			return getRuleContexts(DateTimeContext.class);
		}
		public DateTimeContext dateTime(int i) {
			return getRuleContext(DateTimeContext.class,i);
		}
		public DateOrIntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateOrInterval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EDTFLevel1Listener ) ((EDTFLevel1Listener)listener).enterDateOrInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EDTFLevel1Listener ) ((EDTFLevel1Listener)listener).exitDateOrInterval(this);
		}
	}

	public final DateOrIntervalContext dateOrInterval() throws RecognitionException {
		DateOrIntervalContext _localctx = new DateOrIntervalContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_dateOrInterval);
		try {
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				dateTime();
				setState(70);
				match(T__6);
				setState(71);
				dateTime();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(73);
				dateTime();
				setState(74);
				match(T__6);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(76);
				dateTime();
				setState(77);
				match(T__7);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(79);
				dateTime();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(80);
				match(T__6);
				setState(81);
				dateTime();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(82);
				match(T__8);
				setState(83);
				dateTime();
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

	public static class GregorianDateContext extends ParserRuleContext {
		public DateOrIntervalContext dateOrInterval() {
			return getRuleContext(DateOrIntervalContext.class,0);
		}
		public GregorianDateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gregorianDate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EDTFLevel1Listener ) ((EDTFLevel1Listener)listener).enterGregorianDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EDTFLevel1Listener ) ((EDTFLevel1Listener)listener).exitGregorianDate(this);
		}
	}

	public final GregorianDateContext gregorianDate() throws RecognitionException {
		GregorianDateContext _localctx = new GregorianDateContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_gregorianDate);
		try {
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case T__6:
			case T__8:
			case Year:
			case YearPartial:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				dateOrInterval();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				match(T__9);
				setState(88);
				dateOrInterval();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
				match(T__10);
				setState(90);
				dateOrInterval();
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

	public static class JulianDateContext extends ParserRuleContext {
		public DateOrIntervalContext dateOrInterval() {
			return getRuleContext(DateOrIntervalContext.class,0);
		}
		public JulianDateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_julianDate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EDTFLevel1Listener ) ((EDTFLevel1Listener)listener).enterJulianDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EDTFLevel1Listener ) ((EDTFLevel1Listener)listener).exitJulianDate(this);
		}
	}

	public final JulianDateContext julianDate() throws RecognitionException {
		JulianDateContext _localctx = new JulianDateContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_julianDate);
		try {
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				match(T__11);
				setState(94);
				dateOrInterval();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				match(T__12);
				setState(96);
				dateOrInterval();
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

	public static class DateSpecificationContext extends ParserRuleContext {
		public GregorianDateContext gregorianDate() {
			return getRuleContext(GregorianDateContext.class,0);
		}
		public JulianDateContext julianDate() {
			return getRuleContext(JulianDateContext.class,0);
		}
		public DateSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EDTFLevel1Listener ) ((EDTFLevel1Listener)listener).enterDateSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EDTFLevel1Listener ) ((EDTFLevel1Listener)listener).exitDateSpecification(this);
		}
	}

	public final DateSpecificationContext dateSpecification() throws RecognitionException {
		DateSpecificationContext _localctx = new DateSpecificationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_dateSpecification);
		try {
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case T__6:
			case T__8:
			case T__9:
			case T__10:
			case Year:
			case YearPartial:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				gregorianDate();
				}
				break;
			case T__11:
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				julianDate();
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\24j\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2%\n\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\60\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\5\4>\n\4\3\5\3\5\3\5\3\5\3\5\5\5E\n\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6W\n\6\3\7\3\7\3"+
		"\7\3\7\3\7\5\7^\n\7\3\b\3\b\3\b\3\b\5\bd\n\b\3\t\3\t\5\th\n\t\3\t\2\2"+
		"\n\2\4\6\b\n\f\16\20\2\2\2v\2$\3\2\2\2\4/\3\2\2\2\6=\3\2\2\2\bD\3\2\2"+
		"\2\nV\3\2\2\2\f]\3\2\2\2\16c\3\2\2\2\20g\3\2\2\2\22\23\7\21\2\2\23\24"+
		"\7\3\2\2\24\25\7\23\2\2\25\26\7\3\2\2\26%\7\23\2\2\27\30\7\21\2\2\30\31"+
		"\7\3\2\2\31\32\7\23\2\2\32\33\7\3\2\2\33%\7\24\2\2\34\35\7\21\2\2\35\36"+
		"\7\3\2\2\36%\7\23\2\2\37 \7\21\2\2 !\7\3\2\2!%\7\24\2\2\"%\7\21\2\2#%"+
		"\7\22\2\2$\22\3\2\2\2$\27\3\2\2\2$\34\3\2\2\2$\37\3\2\2\2$\"\3\2\2\2$"+
		"#\3\2\2\2%\3\3\2\2\2&\'\5\2\2\2\'(\7\4\2\2(\60\3\2\2\2)*\5\2\2\2*+\7\5"+
		"\2\2+\60\3\2\2\2,-\5\2\2\2-.\7\6\2\2.\60\3\2\2\2/&\3\2\2\2/)\3\2\2\2/"+
		",\3\2\2\2\60\5\3\2\2\2\61\62\7\7\2\2\62\63\7\23\2\2\63\64\7\b\2\2\64\65"+
		"\7\23\2\2\65\66\7\b\2\2\66>\7\23\2\2\678\7\7\2\289\7\23\2\29:\7\b\2\2"+
		":>\7\23\2\2;<\7\7\2\2<>\7\23\2\2=\61\3\2\2\2=\67\3\2\2\2=;\3\2\2\2>\7"+
		"\3\2\2\2?E\5\4\3\2@E\5\2\2\2AB\5\2\2\2BC\5\6\4\2CE\3\2\2\2D?\3\2\2\2D"+
		"@\3\2\2\2DA\3\2\2\2E\t\3\2\2\2FW\3\2\2\2GH\5\b\5\2HI\7\t\2\2IJ\5\b\5\2"+
		"JW\3\2\2\2KL\5\b\5\2LM\7\t\2\2MW\3\2\2\2NO\5\b\5\2OP\7\n\2\2PW\3\2\2\2"+
		"QW\5\b\5\2RS\7\t\2\2SW\5\b\5\2TU\7\13\2\2UW\5\b\5\2VF\3\2\2\2VG\3\2\2"+
		"\2VK\3\2\2\2VN\3\2\2\2VQ\3\2\2\2VR\3\2\2\2VT\3\2\2\2W\13\3\2\2\2X^\5\n"+
		"\6\2YZ\7\f\2\2Z^\5\n\6\2[\\\7\r\2\2\\^\5\n\6\2]X\3\2\2\2]Y\3\2\2\2][\3"+
		"\2\2\2^\r\3\2\2\2_`\7\16\2\2`d\5\n\6\2ab\7\17\2\2bd\5\n\6\2c_\3\2\2\2"+
		"ca\3\2\2\2d\17\3\2\2\2eh\5\f\7\2fh\5\16\b\2ge\3\2\2\2gf\3\2\2\2h\21\3"+
		"\2\2\2\n$/=DV]cg";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}