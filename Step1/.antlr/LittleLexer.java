// Generated from c:\Users\Pyrospider\Documents\CSCI 468\Step1\Little.g by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LittleLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		KEYWORD=1, IDENTIFIER=2, INTLITERAL=3, FLOATLITERAL=4, STRINGLITERAL=5, 
		COMMENT=6, OPERATOR=7, WHITESPACE=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"DIGIT0", "DIGIT1", "NL", "KEYWORD", "IDENTIFIER", "INTLITERAL", "FLOATLITERAL", 
		"STRINGLITERAL", "COMMENT", "OPERATOR", "WHITESPACE"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "KEYWORD", "IDENTIFIER", "INTLITERAL", "FLOATLITERAL", "STRINGLITERAL", 
		"COMMENT", "OPERATOR", "WHITESPACE"
	};
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


	public LittleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Little.g"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\n\u00d9\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\3\2\3\3\3\3\3\4\5\4\37\n\4\3\4\3\4\5\4#\n\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5}"+
		"\n\5\3\6\5\6\u0080\n\6\3\6\6\6\u0083\n\6\r\6\16\6\u0084\3\6\6\6\u0088"+
		"\n\6\r\6\16\6\u0089\3\6\6\6\u008d\n\6\r\6\16\6\u008e\7\6\u0091\n\6\f\6"+
		"\16\6\u0094\13\6\3\7\7\7\u0097\n\7\f\7\16\7\u009a\13\7\3\7\6\7\u009d\n"+
		"\7\r\7\16\7\u009e\3\b\3\b\3\b\7\b\u00a4\n\b\f\b\16\b\u00a7\13\b\3\b\3"+
		"\b\6\b\u00ab\n\b\r\b\16\b\u00ac\5\b\u00af\n\b\3\t\3\t\7\t\u00b3\n\t\f"+
		"\t\16\t\u00b6\13\t\3\t\3\t\3\n\3\n\3\n\3\n\7\n\u00be\n\n\f\n\16\n\u00c1"+
		"\13\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13\u00d1\n\13\3\f\6\f\u00d4\n\f\r\f\16\f\u00d5\3\f\3\f\2\2\r\3\2\5"+
		"\2\7\2\t\3\13\4\r\5\17\6\21\7\23\b\25\t\27\n\3\2\n\4\2C\\c|\3\2c|\3\2"+
		"C\\\3\2$$\4\2\f\f\17\17\6\2,-//\61\61??\6\2*+..=>@@\5\2\13\f\17\17\"\""+
		"\2\u00fc\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\3\31\3\2\2\2\5\33\3\2\2\2\7"+
		"\"\3\2\2\2\t|\3\2\2\2\13\177\3\2\2\2\r\u0098\3\2\2\2\17\u00ae\3\2\2\2"+
		"\21\u00b0\3\2\2\2\23\u00b9\3\2\2\2\25\u00d0\3\2\2\2\27\u00d3\3\2\2\2\31"+
		"\32\4\62;\2\32\4\3\2\2\2\33\34\4\63;\2\34\6\3\2\2\2\35\37\7\17\2\2\36"+
		"\35\3\2\2\2\36\37\3\2\2\2\37 \3\2\2\2 #\7\f\2\2!#\7\17\2\2\"\36\3\2\2"+
		"\2\"!\3\2\2\2#\b\3\2\2\2$%\7R\2\2%&\7T\2\2&\'\7Q\2\2\'(\7I\2\2()\7T\2"+
		"\2)*\7C\2\2*}\7O\2\2+,\7D\2\2,-\7G\2\2-.\7I\2\2./\7K\2\2/}\7P\2\2\60\61"+
		"\7G\2\2\61\62\7P\2\2\62}\7F\2\2\63\64\7H\2\2\64\65\7W\2\2\65\66\7P\2\2"+
		"\66\67\7E\2\2\678\7V\2\289\7K\2\29:\7Q\2\2:}\7P\2\2;<\7T\2\2<=\7G\2\2"+
		"=>\7C\2\2>}\7F\2\2?@\7Y\2\2@A\7T\2\2AB\7K\2\2BC\7V\2\2C}\7G\2\2DE\7K\2"+
		"\2E}\7H\2\2FG\7G\2\2GH\7N\2\2HI\7U\2\2I}\7G\2\2JK\7H\2\2K}\7K\2\2LM\7"+
		"H\2\2MN\7Q\2\2N}\7T\2\2OP\7T\2\2PQ\7Q\2\2Q}\7H\2\2RS\7T\2\2ST\7G\2\2T"+
		"U\7V\2\2UV\7W\2\2VW\7T\2\2W}\7P\2\2XY\7K\2\2YZ\7P\2\2Z}\7V\2\2[\\\7X\2"+
		"\2\\]\7Q\2\2]^\7K\2\2^}\7F\2\2_`\7U\2\2`a\7V\2\2ab\7T\2\2bc\7K\2\2cd\7"+
		"P\2\2d}\7I\2\2ef\7H\2\2fg\7N\2\2gh\7Q\2\2hi\7C\2\2i}\7V\2\2jk\7Y\2\2k"+
		"l\7J\2\2lm\7K\2\2mn\7N\2\2n}\7G\2\2op\7G\2\2pq\7P\2\2qr\7F\2\2rs\7K\2"+
		"\2s}\7H\2\2tu\7G\2\2uv\7P\2\2vw\7F\2\2wx\7Y\2\2xy\7J\2\2yz\7K\2\2z{\7"+
		"N\2\2{}\7G\2\2|$\3\2\2\2|+\3\2\2\2|\60\3\2\2\2|\63\3\2\2\2|;\3\2\2\2|"+
		"?\3\2\2\2|D\3\2\2\2|F\3\2\2\2|J\3\2\2\2|L\3\2\2\2|O\3\2\2\2|R\3\2\2\2"+
		"|X\3\2\2\2|[\3\2\2\2|_\3\2\2\2|e\3\2\2\2|j\3\2\2\2|o\3\2\2\2|t\3\2\2\2"+
		"}\n\3\2\2\2~\u0080\t\2\2\2\177~\3\2\2\2\u0080\u0092\3\2\2\2\u0081\u0083"+
		"\t\3\2\2\u0082\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u0091\3\2\2\2\u0086\u0088\t\4\2\2\u0087\u0086\3\2"+
		"\2\2\u0088\u0089\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\u0091\3\2\2\2\u008b\u008d\5\3\2\2\u008c\u008b\3\2\2\2\u008d\u008e\3\2"+
		"\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0091\3\2\2\2\u0090"+
		"\u0082\3\2\2\2\u0090\u0087\3\2\2\2\u0090\u008c\3\2\2\2\u0091\u0094\3\2"+
		"\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\f\3\2\2\2\u0094\u0092"+
		"\3\2\2\2\u0095\u0097\5\5\3\2\u0096\u0095\3\2\2\2\u0097\u009a\3\2\2\2\u0098"+
		"\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2"+
		"\2\2\u009b\u009d\5\3\2\2\u009c\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\16\3\2\2\2\u00a0\u00a1\5\r\7"+
		"\2\u00a1\u00a5\7\60\2\2\u00a2\u00a4\5\3\2\2\u00a3\u00a2\3\2\2\2\u00a4"+
		"\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00af\3\2"+
		"\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00aa\7\60\2\2\u00a9\u00ab\5\3\2\2\u00aa"+
		"\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2"+
		"\2\2\u00ad\u00af\3\2\2\2\u00ae\u00a0\3\2\2\2\u00ae\u00a8\3\2\2\2\u00af"+
		"\20\3\2\2\2\u00b0\u00b4\7$\2\2\u00b1\u00b3\n\5\2\2\u00b2\u00b1\3\2\2\2"+
		"\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b7"+
		"\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8\7$\2\2\u00b8\22\3\2\2\2\u00b9"+
		"\u00ba\7/\2\2\u00ba\u00bb\7/\2\2\u00bb\u00bf\3\2\2\2\u00bc\u00be\n\6\2"+
		"\2\u00bd\u00bc\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0"+
		"\3\2\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c3\5\7\4\2\u00c3"+
		"\u00c4\3\2\2\2\u00c4\u00c5\b\n\2\2\u00c5\24\3\2\2\2\u00c6\u00c7\7<\2\2"+
		"\u00c7\u00d1\7?\2\2\u00c8\u00d1\t\7\2\2\u00c9\u00ca\7#\2\2\u00ca\u00d1"+
		"\7?\2\2\u00cb\u00d1\t\b\2\2\u00cc\u00cd\7>\2\2\u00cd\u00d1\7?\2\2\u00ce"+
		"\u00cf\7@\2\2\u00cf\u00d1\7?\2\2\u00d0\u00c6\3\2\2\2\u00d0\u00c8\3\2\2"+
		"\2\u00d0\u00c9\3\2\2\2\u00d0\u00cb\3\2\2\2\u00d0\u00cc\3\2\2\2\u00d0\u00ce"+
		"\3\2\2\2\u00d1\26\3\2\2\2\u00d2\u00d4\t\t\2\2\u00d3\u00d2\3\2\2\2\u00d4"+
		"\u00d5\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\3\2"+
		"\2\2\u00d7\u00d8\b\f\2\2\u00d8\30\3\2\2\2\25\2\36\"|\177\u0084\u0089\u008e"+
		"\u0090\u0092\u0098\u009e\u00a5\u00ac\u00ae\u00b4\u00bf\u00d0\u00d5\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}