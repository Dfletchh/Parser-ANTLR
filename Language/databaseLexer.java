// Generated from database.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class databaseLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ADD=1, DELETE=2, UPDATE=3, CALCULATE_WAGE=4, LPAREN=5, RPAREN=6, COMMA=7, 
		POINT=8, FWD_SLASH=9, PLUS=10, TIMES=11, STRING=12, INT=13, DOUBLE=14, 
		WHITESPACE=15, BLOCK_COMMENT=16, LINE_COMMENT=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ADD", "DELETE", "UPDATE", "CALCULATE_WAGE", "LPAREN", "RPAREN", "COMMA", 
			"POINT", "FWD_SLASH", "PLUS", "TIMES", "STRING", "INT", "DOUBLE", "WHITESPACE", 
			"BLOCK_COMMENT", "LINE_COMMENT"
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


	public databaseLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "database.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23\u009e\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\3\2\3\2\3\2\3\2\3\2\3\2\5\2,\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\5\3:\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\5\4H\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\5\5\\\n\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\6\rm\n\r\r\r\16\rn\3\16\6\16r\n\16\r\16\16\16s\3\17"+
		"\6\17w\n\17\r\17\16\17x\3\17\3\17\6\17}\n\17\r\17\16\17~\3\20\6\20\u0082"+
		"\n\20\r\20\16\20\u0083\3\20\3\20\3\21\3\21\7\21\u008a\n\21\f\21\16\21"+
		"\u008d\13\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\7\22\u0098\n"+
		"\22\f\22\16\22\u009b\13\22\3\22\3\22\3\u008b\2\23\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23\3\2\6\4"+
		"\2C\\c|\3\2\62;\5\2\13\f\17\17\"\"\4\2\f\f\17\17\2\u00a8\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3+\3\2\2\2"+
		"\59\3\2\2\2\7G\3\2\2\2\t[\3\2\2\2\13]\3\2\2\2\r_\3\2\2\2\17a\3\2\2\2\21"+
		"c\3\2\2\2\23e\3\2\2\2\25g\3\2\2\2\27i\3\2\2\2\31l\3\2\2\2\33q\3\2\2\2"+
		"\35v\3\2\2\2\37\u0081\3\2\2\2!\u008b\3\2\2\2#\u0093\3\2\2\2%&\7C\2\2&"+
		"\'\7f\2\2\',\7f\2\2()\7C\2\2)*\7F\2\2*,\7F\2\2+%\3\2\2\2+(\3\2\2\2,\4"+
		"\3\2\2\2-.\7F\2\2./\7g\2\2/\60\7n\2\2\60\61\7g\2\2\61\62\7v\2\2\62:\7"+
		"g\2\2\63\64\7F\2\2\64\65\7G\2\2\65\66\7N\2\2\66\67\7G\2\2\678\7V\2\28"+
		":\7G\2\29-\3\2\2\29\63\3\2\2\2:\6\3\2\2\2;<\7W\2\2<=\7r\2\2=>\7f\2\2>"+
		"?\7c\2\2?@\7v\2\2@H\7g\2\2AB\7W\2\2BC\7R\2\2CD\7F\2\2DE\7C\2\2EF\7V\2"+
		"\2FH\7G\2\2G;\3\2\2\2GA\3\2\2\2H\b\3\2\2\2IJ\7E\2\2JK\7C\2\2KL\7N\2\2"+
		"LM\7E\2\2MN\7a\2\2NO\7Y\2\2OP\7C\2\2PQ\7I\2\2Q\\\7G\2\2RS\7e\2\2ST\7c"+
		"\2\2TU\7n\2\2UV\7e\2\2VW\7a\2\2WX\7y\2\2XY\7c\2\2YZ\7i\2\2Z\\\7g\2\2["+
		"I\3\2\2\2[R\3\2\2\2\\\n\3\2\2\2]^\7*\2\2^\f\3\2\2\2_`\7+\2\2`\16\3\2\2"+
		"\2ab\7.\2\2b\20\3\2\2\2cd\7\60\2\2d\22\3\2\2\2ef\7\61\2\2f\24\3\2\2\2"+
		"gh\7-\2\2h\26\3\2\2\2ij\7,\2\2j\30\3\2\2\2km\t\2\2\2lk\3\2\2\2mn\3\2\2"+
		"\2nl\3\2\2\2no\3\2\2\2o\32\3\2\2\2pr\t\3\2\2qp\3\2\2\2rs\3\2\2\2sq\3\2"+
		"\2\2st\3\2\2\2t\34\3\2\2\2uw\t\3\2\2vu\3\2\2\2wx\3\2\2\2xv\3\2\2\2xy\3"+
		"\2\2\2yz\3\2\2\2z|\5\21\t\2{}\t\3\2\2|{\3\2\2\2}~\3\2\2\2~|\3\2\2\2~\177"+
		"\3\2\2\2\177\36\3\2\2\2\u0080\u0082\t\4\2\2\u0081\u0080\3\2\2\2\u0082"+
		"\u0083\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\3\2"+
		"\2\2\u0085\u0086\b\20\2\2\u0086 \3\2\2\2\u0087\u0088\7\61\2\2\u0088\u008a"+
		"\7,\2\2\u0089\u0087\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u008c\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f\7,"+
		"\2\2\u008f\u0090\7\61\2\2\u0090\u0091\3\2\2\2\u0091\u0092\b\21\2\2\u0092"+
		"\"\3\2\2\2\u0093\u0094\7\61\2\2\u0094\u0095\7\61\2\2\u0095\u0099\3\2\2"+
		"\2\u0096\u0098\n\5\2\2\u0097\u0096\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097"+
		"\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009c\3\2\2\2\u009b\u0099\3\2\2\2\u009c"+
		"\u009d\b\22\2\2\u009d$\3\2\2\2\16\2+9G[nsx~\u0083\u008b\u0099\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}