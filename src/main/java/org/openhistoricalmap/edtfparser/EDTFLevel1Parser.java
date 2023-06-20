// Generated from EDTFLevel1.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class EDTFLevel1Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, DIGIT=11, Julian=12, Gregorian=13, JulianDay=14, Year=15, YearPartial=16, 
		TwoDigit=17, TwoDigitPartial=18;
	public static final int
		RULE_date = 0, RULE_qualifiedDate = 1, RULE_time = 2, RULE_dateTime = 3, 
		RULE_dateOrInterval = 4, RULE_gregorianDate = 5, RULE_julianDate = 6, 
		RULE_julianDay = 7, RULE_dateSpecification = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"date", "qualifiedDate", "time", "dateTime", "dateOrInterval", "gregorianDate", 
			"julianDate", "julianDay", "dateSpecification"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'-'", "'?'", "'~'", "'%'", "'T'", "':'", "'/'", "'/..'", "'../'", 
			"' '", null, null, null, "'jd:'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "DIGIT", 
			"Julian", "Gregorian", "JulianDay", "Year", "YearPartial", "TwoDigit", 
			"TwoDigitPartial"
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

	@SuppressWarnings("CheckReturnValue")
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
		int _la;
		try {
			setState(28);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(18);
				match(Year);
				setState(19);
				match(T__0);
				setState(20);
				match(TwoDigit);
				setState(21);
				match(T__0);
				setState(22);
				_la = _input.LA(1);
				if ( !(_la==TwoDigit || _la==TwoDigitPartial) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(23);
				match(Year);
				setState(24);
				match(T__0);
				setState(25);
				_la = _input.LA(1);
				if ( !(_la==TwoDigit || _la==TwoDigitPartial) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(26);
				match(Year);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(27);
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

	@SuppressWarnings("CheckReturnValue")
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
			setState(39);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				date();
				setState(31);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				date();
				setState(34);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(36);
				date();
				setState(37);
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

	@SuppressWarnings("CheckReturnValue")
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(T__4);
			setState(42);
			match(TwoDigit);
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(43);
				match(T__5);
				setState(44);
				match(TwoDigit);
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(45);
					match(T__5);
					setState(46);
					match(TwoDigit);
					}
				}

				}
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

	@SuppressWarnings("CheckReturnValue")
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
		int _la;
		try {
			setState(56);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				qualifiedDate();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				date();
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(53);
					time();
					}
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

	@SuppressWarnings("CheckReturnValue")
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
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				dateTime();
				setState(60);
				match(T__6);
				setState(61);
				dateTime();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
				dateTime();
				setState(64);
				match(T__6);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(66);
				dateTime();
				setState(67);
				match(T__7);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(69);
				dateTime();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(70);
				match(T__6);
				setState(71);
				dateTime();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(72);
				match(T__8);
				setState(73);
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

	@SuppressWarnings("CheckReturnValue")
	public static class GregorianDateContext extends ParserRuleContext {
		public DateOrIntervalContext dateOrInterval() {
			return getRuleContext(DateOrIntervalContext.class,0);
		}
		public TerminalNode Gregorian() { return getToken(EDTFLevel1Parser.Gregorian, 0); }
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
		int _la;
		try {
			setState(85);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case T__6:
			case T__8:
			case Year:
			case YearPartial:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				dateOrInterval();
				}
				break;
			case Gregorian:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				match(Gregorian);
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(78);
					match(T__9);
					}
					}
					setState(83);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(84);
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

	@SuppressWarnings("CheckReturnValue")
	public static class JulianDateContext extends ParserRuleContext {
		public TerminalNode Julian() { return getToken(EDTFLevel1Parser.Julian, 0); }
		public List<TerminalNode> DIGIT() { return getTokens(EDTFLevel1Parser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(EDTFLevel1Parser.DIGIT, i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(Julian);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(88);
				match(T__9);
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(94);
			match(DIGIT);
			setState(95);
			match(DIGIT);
			setState(96);
			match(DIGIT);
			setState(97);
			match(DIGIT);
			setState(98);
			match(DIGIT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class JulianDayContext extends ParserRuleContext {
		public TerminalNode JulianDay() { return getToken(EDTFLevel1Parser.JulianDay, 0); }
		public List<TerminalNode> DIGIT() { return getTokens(EDTFLevel1Parser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(EDTFLevel1Parser.DIGIT, i);
		}
		public JulianDayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_julianDay; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EDTFLevel1Listener ) ((EDTFLevel1Listener)listener).enterJulianDay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EDTFLevel1Listener ) ((EDTFLevel1Listener)listener).exitJulianDay(this);
		}
	}

	public final JulianDayContext julianDay() throws RecognitionException {
		JulianDayContext _localctx = new JulianDayContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_julianDay);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(JulianDay);
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(101);
				match(T__9);
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(107);
				match(T__0);
				}
			}

			setState(111); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(110);
				match(DIGIT);
				}
				}
				setState(113); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
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

	@SuppressWarnings("CheckReturnValue")
	public static class DateSpecificationContext extends ParserRuleContext {
		public GregorianDateContext gregorianDate() {
			return getRuleContext(GregorianDateContext.class,0);
		}
		public JulianDateContext julianDate() {
			return getRuleContext(JulianDateContext.class,0);
		}
		public JulianDayContext julianDay() {
			return getRuleContext(JulianDayContext.class,0);
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
		enterRule(_localctx, 16, RULE_dateSpecification);
		try {
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case T__6:
			case T__8:
			case Gregorian:
			case Year:
			case YearPartial:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				gregorianDate();
				}
				break;
			case Julian:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				julianDate();
				}
				break;
			case JulianDay:
				enterOuterAlt(_localctx, 3);
				{
				setState(117);
				julianDay();
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
		"\u0004\u0001\u0012y\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000"+
		"\u001d\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001(\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u00020\b\u0002\u0003\u00022\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u00037\b\u0003\u0003\u00039\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004K\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0005\u0005P\b\u0005\n\u0005\f\u0005S\t\u0005\u0001\u0005"+
		"\u0003\u0005V\b\u0005\u0001\u0006\u0001\u0006\u0005\u0006Z\b\u0006\n\u0006"+
		"\f\u0006]\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0005\u0007g\b\u0007\n\u0007"+
		"\f\u0007j\t\u0007\u0001\u0007\u0003\u0007m\b\u0007\u0001\u0007\u0004\u0007"+
		"p\b\u0007\u000b\u0007\f\u0007q\u0001\b\u0001\b\u0001\b\u0003\bw\b\b\u0001"+
		"\b\u0000\u0000\t\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0000\u0001"+
		"\u0001\u0000\u0011\u0012\u0086\u0000\u001c\u0001\u0000\u0000\u0000\u0002"+
		"\'\u0001\u0000\u0000\u0000\u0004)\u0001\u0000\u0000\u0000\u00068\u0001"+
		"\u0000\u0000\u0000\bJ\u0001\u0000\u0000\u0000\nU\u0001\u0000\u0000\u0000"+
		"\fW\u0001\u0000\u0000\u0000\u000ed\u0001\u0000\u0000\u0000\u0010v\u0001"+
		"\u0000\u0000\u0000\u0012\u0013\u0005\u000f\u0000\u0000\u0013\u0014\u0005"+
		"\u0001\u0000\u0000\u0014\u0015\u0005\u0011\u0000\u0000\u0015\u0016\u0005"+
		"\u0001\u0000\u0000\u0016\u001d\u0007\u0000\u0000\u0000\u0017\u0018\u0005"+
		"\u000f\u0000\u0000\u0018\u0019\u0005\u0001\u0000\u0000\u0019\u001d\u0007"+
		"\u0000\u0000\u0000\u001a\u001d\u0005\u000f\u0000\u0000\u001b\u001d\u0005"+
		"\u0010\u0000\u0000\u001c\u0012\u0001\u0000\u0000\u0000\u001c\u0017\u0001"+
		"\u0000\u0000\u0000\u001c\u001a\u0001\u0000\u0000\u0000\u001c\u001b\u0001"+
		"\u0000\u0000\u0000\u001d\u0001\u0001\u0000\u0000\u0000\u001e\u001f\u0003"+
		"\u0000\u0000\u0000\u001f \u0005\u0002\u0000\u0000 (\u0001\u0000\u0000"+
		"\u0000!\"\u0003\u0000\u0000\u0000\"#\u0005\u0003\u0000\u0000#(\u0001\u0000"+
		"\u0000\u0000$%\u0003\u0000\u0000\u0000%&\u0005\u0004\u0000\u0000&(\u0001"+
		"\u0000\u0000\u0000\'\u001e\u0001\u0000\u0000\u0000\'!\u0001\u0000\u0000"+
		"\u0000\'$\u0001\u0000\u0000\u0000(\u0003\u0001\u0000\u0000\u0000)*\u0005"+
		"\u0005\u0000\u0000*1\u0005\u0011\u0000\u0000+,\u0005\u0006\u0000\u0000"+
		",/\u0005\u0011\u0000\u0000-.\u0005\u0006\u0000\u0000.0\u0005\u0011\u0000"+
		"\u0000/-\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u000002\u0001\u0000"+
		"\u0000\u00001+\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u00002\u0005"+
		"\u0001\u0000\u0000\u000039\u0003\u0002\u0001\u000046\u0003\u0000\u0000"+
		"\u000057\u0003\u0004\u0002\u000065\u0001\u0000\u0000\u000067\u0001\u0000"+
		"\u0000\u000079\u0001\u0000\u0000\u000083\u0001\u0000\u0000\u000084\u0001"+
		"\u0000\u0000\u00009\u0007\u0001\u0000\u0000\u0000:K\u0001\u0000\u0000"+
		"\u0000;<\u0003\u0006\u0003\u0000<=\u0005\u0007\u0000\u0000=>\u0003\u0006"+
		"\u0003\u0000>K\u0001\u0000\u0000\u0000?@\u0003\u0006\u0003\u0000@A\u0005"+
		"\u0007\u0000\u0000AK\u0001\u0000\u0000\u0000BC\u0003\u0006\u0003\u0000"+
		"CD\u0005\b\u0000\u0000DK\u0001\u0000\u0000\u0000EK\u0003\u0006\u0003\u0000"+
		"FG\u0005\u0007\u0000\u0000GK\u0003\u0006\u0003\u0000HI\u0005\t\u0000\u0000"+
		"IK\u0003\u0006\u0003\u0000J:\u0001\u0000\u0000\u0000J;\u0001\u0000\u0000"+
		"\u0000J?\u0001\u0000\u0000\u0000JB\u0001\u0000\u0000\u0000JE\u0001\u0000"+
		"\u0000\u0000JF\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000K\t\u0001"+
		"\u0000\u0000\u0000LV\u0003\b\u0004\u0000MQ\u0005\r\u0000\u0000NP\u0005"+
		"\n\u0000\u0000ON\u0001\u0000\u0000\u0000PS\u0001\u0000\u0000\u0000QO\u0001"+
		"\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RT\u0001\u0000\u0000\u0000"+
		"SQ\u0001\u0000\u0000\u0000TV\u0003\b\u0004\u0000UL\u0001\u0000\u0000\u0000"+
		"UM\u0001\u0000\u0000\u0000V\u000b\u0001\u0000\u0000\u0000W[\u0005\f\u0000"+
		"\u0000XZ\u0005\n\u0000\u0000YX\u0001\u0000\u0000\u0000Z]\u0001\u0000\u0000"+
		"\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\^\u0001\u0000"+
		"\u0000\u0000][\u0001\u0000\u0000\u0000^_\u0005\u000b\u0000\u0000_`\u0005"+
		"\u000b\u0000\u0000`a\u0005\u000b\u0000\u0000ab\u0005\u000b\u0000\u0000"+
		"bc\u0005\u000b\u0000\u0000c\r\u0001\u0000\u0000\u0000dh\u0005\u000e\u0000"+
		"\u0000eg\u0005\n\u0000\u0000fe\u0001\u0000\u0000\u0000gj\u0001\u0000\u0000"+
		"\u0000hf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000il\u0001\u0000"+
		"\u0000\u0000jh\u0001\u0000\u0000\u0000km\u0005\u0001\u0000\u0000lk\u0001"+
		"\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mo\u0001\u0000\u0000\u0000"+
		"np\u0005\u000b\u0000\u0000on\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000"+
		"\u0000qo\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000r\u000f\u0001"+
		"\u0000\u0000\u0000sw\u0003\n\u0005\u0000tw\u0003\f\u0006\u0000uw\u0003"+
		"\u000e\u0007\u0000vs\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000"+
		"vu\u0001\u0000\u0000\u0000w\u0011\u0001\u0000\u0000\u0000\u000e\u001c"+
		"\'/168JQU[hlqv";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}