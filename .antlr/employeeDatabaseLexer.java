// Generated from /Users/deanfletcher/Documents/calculator/employeeDatabase.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class employeeDatabaseLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ADD=1, DELETE=2, UPDATE=3, NAME=4, EMPLID=5, DATE=6, LPAREN=7, RPAREN=8, 
		COMMA=9, FWD_SLASH=10, COMMENT=11, WHITESPACE=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ADD", "DELETE", "UPDATE", "NAME", "EMPLID", "DATE", "LPAREN", "RPAREN", 
			"COMMA", "FWD_SLASH", "STRING", "INT", "COMMENT", "WHITESPACE"
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


	public employeeDatabaseLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "employeeDatabase.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16y\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\3\2\5\2&\n"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\64\n\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4B\n\4\3\5\6\5E\n\5\r\5\16"+
		"\5F\3\6\3\6\6\6K\n\6\r\6\16\6L\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t"+
		"\3\n\3\n\3\13\3\13\3\f\3\f\6\f_\n\f\r\f\16\f`\3\r\6\rd\n\r\r\r\16\re\3"+
		"\16\3\16\3\16\3\16\7\16l\n\16\f\16\16\16o\13\16\3\16\3\16\3\17\6\17t\n"+
		"\17\r\17\16\17u\3\17\3\17\2\2\20\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\2\31\2\33\r\35\16\3\2\7\3\2c|\4\2C\\c|\3\2\62;\4\2\f\f\17"+
		"\17\5\2\13\f\17\17\"\"\2\u0080\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\3%\3\2\2\2\5\63\3\2\2\2\7A\3"+
		"\2\2\2\tD\3\2\2\2\13J\3\2\2\2\rN\3\2\2\2\17T\3\2\2\2\21V\3\2\2\2\23X\3"+
		"\2\2\2\25Z\3\2\2\2\27\\\3\2\2\2\31c\3\2\2\2\33g\3\2\2\2\35s\3\2\2\2\37"+
		" \7C\2\2 !\7f\2\2!&\7f\2\2\"#\7C\2\2#$\7F\2\2$&\7F\2\2%\37\3\2\2\2%\""+
		"\3\2\2\2&\4\3\2\2\2\'(\7F\2\2()\7g\2\2)*\7n\2\2*+\7g\2\2+,\7v\2\2,\64"+
		"\7g\2\2-.\7F\2\2./\7G\2\2/\60\7N\2\2\60\61\7G\2\2\61\62\7V\2\2\62\64\7"+
		"G\2\2\63\'\3\2\2\2\63-\3\2\2\2\64\6\3\2\2\2\65\66\7W\2\2\66\67\7r\2\2"+
		"\678\7f\2\289\7c\2\29:\7v\2\2:B\7g\2\2;<\7W\2\2<=\7R\2\2=>\7F\2\2>?\7"+
		"C\2\2?@\7V\2\2@B\7G\2\2A\65\3\2\2\2A;\3\2\2\2B\b\3\2\2\2CE\5\27\f\2DC"+
		"\3\2\2\2EF\3\2\2\2FD\3\2\2\2FG\3\2\2\2G\n\3\2\2\2HK\5\31\r\2IK\5\27\f"+
		"\2JH\3\2\2\2JI\3\2\2\2KL\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M\f\3\2\2\2NO\5\31"+
		"\r\2OP\5\25\13\2PQ\5\31\r\2QR\5\25\13\2RS\5\31\r\2S\16\3\2\2\2TU\7*\2"+
		"\2U\20\3\2\2\2VW\7+\2\2W\22\3\2\2\2XY\7.\2\2Y\24\3\2\2\2Z[\7\61\2\2[\26"+
		"\3\2\2\2\\^\t\2\2\2]_\t\3\2\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2"+
		"a\30\3\2\2\2bd\t\4\2\2cb\3\2\2\2de\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\32\3\2"+
		"\2\2gh\7\61\2\2hi\7\61\2\2im\3\2\2\2jl\n\5\2\2kj\3\2\2\2lo\3\2\2\2mk\3"+
		"\2\2\2mn\3\2\2\2np\3\2\2\2om\3\2\2\2pq\b\16\2\2q\34\3\2\2\2rt\t\6\2\2"+
		"sr\3\2\2\2tu\3\2\2\2us\3\2\2\2uv\3\2\2\2vw\3\2\2\2wx\b\17\2\2x\36\3\2"+
		"\2\2\r\2%\63AFJL`emu\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}