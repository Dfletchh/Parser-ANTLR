// Generated from /Users/deanfletcher/Documents/calculator/employeeDatabase.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class employeeDatabaseParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ADD=1, DELETE=2, UPDATE=3, NAME=4, EMPLID=5, DATE=6, LPAREN=7, RPAREN=8, 
		COMMA=9, FWD_SLASH=10, COMMENT=11, WHITESPACE=12;
	public static final int
		RULE_function = 0, RULE_funcname = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"function", "funcname"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, "'('", "')'", "','", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ADD", "DELETE", "UPDATE", "NAME", "EMPLID", "DATE", "LPAREN", 
			"RPAREN", "COMMA", "FWD_SLASH", "COMMENT", "WHITESPACE"
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
	public String getGrammarFileName() { return "employeeDatabase.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public employeeDatabaseParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class FunctionContext extends ParserRuleContext {
		public FuncnameContext funcname() {
			return getRuleContext(FuncnameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(employeeDatabaseParser.LPAREN, 0); }
		public TerminalNode NAME() { return getToken(employeeDatabaseParser.NAME, 0); }
		public TerminalNode RPAREN() { return getToken(employeeDatabaseParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(employeeDatabaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(employeeDatabaseParser.COMMA, i);
		}
		public List<TerminalNode> DATE() { return getTokens(employeeDatabaseParser.DATE); }
		public TerminalNode DATE(int i) {
			return getToken(employeeDatabaseParser.DATE, i);
		}
		public List<TerminalNode> EMPLID() { return getTokens(employeeDatabaseParser.EMPLID); }
		public TerminalNode EMPLID(int i) {
			return getToken(employeeDatabaseParser.EMPLID, i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_function);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(4);
			funcname();
			setState(5);
			match(LPAREN);
			setState(6);
			match(NAME);
			setState(11);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(7);
					match(COMMA);
					setState(8);
					match(DATE);
					}
					} 
				}
				setState(13);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(18);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(14);
				match(COMMA);
				setState(15);
				match(EMPLID);
				}
				}
				setState(20);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(21);
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

	public static class FuncnameContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(employeeDatabaseParser.ADD, 0); }
		public TerminalNode DELETE() { return getToken(employeeDatabaseParser.DELETE, 0); }
		public TerminalNode UPDATE() { return getToken(employeeDatabaseParser.UPDATE, 0); }
		public FuncnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcname; }
	}

	public final FuncnameContext funcname() throws RecognitionException {
		FuncnameContext _localctx = new FuncnameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_funcname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << DELETE) | (1L << UPDATE))) != 0)) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\16\34\4\2\t\2\4\3"+
		"\t\3\3\2\3\2\3\2\3\2\3\2\7\2\f\n\2\f\2\16\2\17\13\2\3\2\3\2\7\2\23\n\2"+
		"\f\2\16\2\26\13\2\3\2\3\2\3\3\3\3\3\3\2\2\4\2\4\2\3\3\2\3\5\2\33\2\6\3"+
		"\2\2\2\4\31\3\2\2\2\6\7\5\4\3\2\7\b\7\t\2\2\b\r\7\6\2\2\t\n\7\13\2\2\n"+
		"\f\7\b\2\2\13\t\3\2\2\2\f\17\3\2\2\2\r\13\3\2\2\2\r\16\3\2\2\2\16\24\3"+
		"\2\2\2\17\r\3\2\2\2\20\21\7\13\2\2\21\23\7\7\2\2\22\20\3\2\2\2\23\26\3"+
		"\2\2\2\24\22\3\2\2\2\24\25\3\2\2\2\25\27\3\2\2\2\26\24\3\2\2\2\27\30\7"+
		"\n\2\2\30\3\3\2\2\2\31\32\t\2\2\2\32\5\3\2\2\2\4\r\24";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}