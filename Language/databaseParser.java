// Generated from database.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class databaseParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ADD=1, DELETE=2, UPDATE=3, CALCULATE_WAGE=4, LPAREN=5, RPAREN=6, COMMA=7, 
		POINT=8, FWD_SLASH=9, PLUS=10, TIMES=11, STRING=12, INT=13, DOUBLE=14, 
		WHITESPACE=15, BLOCK_COMMENT=16, LINE_COMMENT=17;
	public static final int
		RULE_func = 0, RULE_func_pay = 1, RULE_pay = 2, RULE_funcname = 3, RULE_name = 4, 
		RULE_emplid = 5, RULE_date = 6, RULE_wage = 7, RULE_hours = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"func", "func_pay", "pay", "funcname", "name", "emplid", "date", "wage", 
			"hours"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'('", "')'", "','", "'.'", "'/'", "'+'", 
			"'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ADD", "DELETE", "UPDATE", "CALCULATE_WAGE", "LPAREN", "RPAREN", 
			"COMMA", "POINT", "FWD_SLASH", "PLUS", "TIMES", "STRING", "INT", "DOUBLE", 
			"WHITESPACE", "BLOCK_COMMENT", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "database.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public databaseParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class FuncContext extends ParserRuleContext {
		public FuncnameContext funcname() {
			return getRuleContext(FuncnameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(databaseParser.LPAREN, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(databaseParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(databaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(databaseParser.COMMA, i);
		}
		public List<DateContext> date() {
			return getRuleContexts(DateContext.class);
		}
		public DateContext date(int i) {
			return getRuleContext(DateContext.class,i);
		}
		public List<EmplidContext> emplid() {
			return getRuleContexts(EmplidContext.class);
		}
		public EmplidContext emplid(int i) {
			return getRuleContext(EmplidContext.class,i);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof databaseListener ) ((databaseListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof databaseListener ) ((databaseListener)listener).exitFunc(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_func);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			funcname();
			setState(19);
			match(LPAREN);
			setState(20);
			name();
			setState(25);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(21);
					match(COMMA);
					setState(22);
					date();
					}
					} 
				}
				setState(27);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(28);
				match(COMMA);
				setState(29);
				emplid();
				}
				}
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(35);
			match(RPAREN);
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

	public static class Func_payContext extends ParserRuleContext {
		public TerminalNode CALCULATE_WAGE() { return getToken(databaseParser.CALCULATE_WAGE, 0); }
		public TerminalNode LPAREN() { return getToken(databaseParser.LPAREN, 0); }
		public WageContext wage() {
			return getRuleContext(WageContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(databaseParser.COMMA, 0); }
		public HoursContext hours() {
			return getRuleContext(HoursContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(databaseParser.RPAREN, 0); }
		public Func_payContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_pay; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof databaseListener ) ((databaseListener)listener).enterFunc_pay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof databaseListener ) ((databaseListener)listener).exitFunc_pay(this);
		}
	}

	public final Func_payContext func_pay() throws RecognitionException {
		Func_payContext _localctx = new Func_payContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_func_pay);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(CALCULATE_WAGE);
			setState(38);
			match(LPAREN);
			setState(39);
			wage();
			setState(40);
			match(COMMA);
			setState(41);
			hours();
			setState(42);
			match(RPAREN);
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

	public static class PayContext extends ParserRuleContext {
		public WageContext wage() {
			return getRuleContext(WageContext.class,0);
		}
		public TerminalNode TIMES() { return getToken(databaseParser.TIMES, 0); }
		public HoursContext hours() {
			return getRuleContext(HoursContext.class,0);
		}
		public PayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pay; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof databaseListener ) ((databaseListener)listener).enterPay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof databaseListener ) ((databaseListener)listener).exitPay(this);
		}
	}

	public final PayContext pay() throws RecognitionException {
		PayContext _localctx = new PayContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_pay);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			wage();
			setState(45);
			match(TIMES);
			setState(46);
			hours();
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

	public static class FuncnameContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(databaseParser.ADD, 0); }
		public TerminalNode DELETE() { return getToken(databaseParser.DELETE, 0); }
		public TerminalNode UPDATE() { return getToken(databaseParser.UPDATE, 0); }
		public TerminalNode CALCULATE_WAGE() { return getToken(databaseParser.CALCULATE_WAGE, 0); }
		public FuncnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof databaseListener ) ((databaseListener)listener).enterFuncname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof databaseListener ) ((databaseListener)listener).exitFuncname(this);
		}
	}

	public final FuncnameContext funcname() throws RecognitionException {
		FuncnameContext _localctx = new FuncnameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_funcname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << DELETE) | (1L << UPDATE) | (1L << CALCULATE_WAGE))) != 0)) ) {
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

	public static class NameContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(databaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(databaseParser.STRING, i);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof databaseListener ) ((databaseListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof databaseListener ) ((databaseListener)listener).exitName(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(STRING);
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(51);
				match(STRING);
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

	public static class EmplidContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(databaseParser.INT, 0); }
		public EmplidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emplid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof databaseListener ) ((databaseListener)listener).enterEmplid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof databaseListener ) ((databaseListener)listener).exitEmplid(this);
		}
	}

	public final EmplidContext emplid() throws RecognitionException {
		EmplidContext _localctx = new EmplidContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_emplid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(INT);
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

	public static class DateContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(databaseParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(databaseParser.INT, i);
		}
		public List<TerminalNode> FWD_SLASH() { return getTokens(databaseParser.FWD_SLASH); }
		public TerminalNode FWD_SLASH(int i) {
			return getToken(databaseParser.FWD_SLASH, i);
		}
		public DateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof databaseListener ) ((databaseListener)listener).enterDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof databaseListener ) ((databaseListener)listener).exitDate(this);
		}
	}

	public final DateContext date() throws RecognitionException {
		DateContext _localctx = new DateContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_date);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(INT);
			setState(57);
			match(FWD_SLASH);
			setState(58);
			match(INT);
			setState(59);
			match(FWD_SLASH);
			setState(60);
			match(INT);
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

	public static class WageContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(databaseParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(databaseParser.DOUBLE, 0); }
		public WageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof databaseListener ) ((databaseListener)listener).enterWage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof databaseListener ) ((databaseListener)listener).exitWage(this);
		}
	}

	public final WageContext wage() throws RecognitionException {
		WageContext _localctx = new WageContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_wage);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==DOUBLE) ) {
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

	public static class HoursContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(databaseParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(databaseParser.DOUBLE, 0); }
		public HoursContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hours; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof databaseListener ) ((databaseListener)listener).enterHours(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof databaseListener ) ((databaseListener)listener).exitHours(this);
		}
	}

	public final HoursContext hours() throws RecognitionException {
		HoursContext _localctx = new HoursContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_hours);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==DOUBLE) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23E\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2"+
		"\3\2\3\2\7\2\32\n\2\f\2\16\2\35\13\2\3\2\3\2\7\2!\n\2\f\2\16\2$\13\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\5\6"+
		"\67\n\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\2\2\13\2\4"+
		"\6\b\n\f\16\20\22\2\4\3\2\3\6\3\2\17\20\2>\2\24\3\2\2\2\4\'\3\2\2\2\6"+
		".\3\2\2\2\b\62\3\2\2\2\n\64\3\2\2\2\f8\3\2\2\2\16:\3\2\2\2\20@\3\2\2\2"+
		"\22B\3\2\2\2\24\25\5\b\5\2\25\26\7\7\2\2\26\33\5\n\6\2\27\30\7\t\2\2\30"+
		"\32\5\16\b\2\31\27\3\2\2\2\32\35\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34"+
		"\"\3\2\2\2\35\33\3\2\2\2\36\37\7\t\2\2\37!\5\f\7\2 \36\3\2\2\2!$\3\2\2"+
		"\2\" \3\2\2\2\"#\3\2\2\2#%\3\2\2\2$\"\3\2\2\2%&\7\b\2\2&\3\3\2\2\2\'("+
		"\7\6\2\2()\7\7\2\2)*\5\20\t\2*+\7\t\2\2+,\5\22\n\2,-\7\b\2\2-\5\3\2\2"+
		"\2./\5\20\t\2/\60\7\r\2\2\60\61\5\22\n\2\61\7\3\2\2\2\62\63\t\2\2\2\63"+
		"\t\3\2\2\2\64\66\7\16\2\2\65\67\7\16\2\2\66\65\3\2\2\2\66\67\3\2\2\2\67"+
		"\13\3\2\2\289\7\17\2\29\r\3\2\2\2:;\7\17\2\2;<\7\13\2\2<=\7\17\2\2=>\7"+
		"\13\2\2>?\7\17\2\2?\17\3\2\2\2@A\t\3\2\2A\21\3\2\2\2BC\t\3\2\2C\23\3\2"+
		"\2\2\5\33\"\66";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}