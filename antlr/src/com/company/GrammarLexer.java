// Generated from F:/Mega/Master-1/antlr\Grammar.g4 by ANTLR 4.8
package com.company;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUMBER=1, E=2, PI=3, INT=4, EXPONENT=5, MULTIPLY=6, DIVIDE=7, SUBTRACT=8, 
		ADD=9, LPAREN=10, RPAREN=11, SIN=12, COS=13, TAN=14, EXP=15, LN=16, ABS=17, 
		SQRT=18, WS=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NUMBER", "E", "PI", "INT", "EXPONENT", "MULTIPLY", "DIVIDE", "SUBTRACT", 
			"ADD", "LPAREN", "RPAREN", "SIN", "COS", "TAN", "EXP", "LN", "ABS", "SQRT", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'E'", "'PI'", null, "'^'", "'*'", "'/'", "'-'", "'+'", "'('", 
			"')'", "'sin('", "'cos('", "'tan('", "'exp('", "'ln('", "'abs('", "'sqrt('"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NUMBER", "E", "PI", "INT", "EXPONENT", "MULTIPLY", "DIVIDE", "SUBTRACT", 
			"ADD", "LPAREN", "RPAREN", "SIN", "COS", "TAN", "EXP", "LN", "ABS", "SQRT", 
			"WS"
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


	public GrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25p\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\5\2+\n\2\3\2\3\2\3\2\5\2\60\n\2\3\3\3\3\3\4\3"+
		"\4\3\4\3\5\6\58\n\5\r\5\16\59\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n"+
		"\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\2"+
		"\2\25\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25\3\2\3\5\2\13\f\17\17\"\"\2r\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\3*\3\2\2\2\5\61\3\2\2\2\7\63\3\2\2\2\t\67\3\2\2\2\13;\3\2\2"+
		"\2\r=\3\2\2\2\17?\3\2\2\2\21A\3\2\2\2\23C\3\2\2\2\25E\3\2\2\2\27G\3\2"+
		"\2\2\31I\3\2\2\2\33N\3\2\2\2\35S\3\2\2\2\37X\3\2\2\2!]\3\2\2\2#a\3\2\2"+
		"\2%f\3\2\2\2\'l\3\2\2\2)+\7/\2\2*)\3\2\2\2*+\3\2\2\2+,\3\2\2\2,/\5\t\5"+
		"\2-.\7\60\2\2.\60\5\t\5\2/-\3\2\2\2/\60\3\2\2\2\60\4\3\2\2\2\61\62\7G"+
		"\2\2\62\6\3\2\2\2\63\64\7R\2\2\64\65\7K\2\2\65\b\3\2\2\2\668\4\62;\2\67"+
		"\66\3\2\2\289\3\2\2\29\67\3\2\2\29:\3\2\2\2:\n\3\2\2\2;<\7`\2\2<\f\3\2"+
		"\2\2=>\7,\2\2>\16\3\2\2\2?@\7\61\2\2@\20\3\2\2\2AB\7/\2\2B\22\3\2\2\2"+
		"CD\7-\2\2D\24\3\2\2\2EF\7*\2\2F\26\3\2\2\2GH\7+\2\2H\30\3\2\2\2IJ\7u\2"+
		"\2JK\7k\2\2KL\7p\2\2LM\7*\2\2M\32\3\2\2\2NO\7e\2\2OP\7q\2\2PQ\7u\2\2Q"+
		"R\7*\2\2R\34\3\2\2\2ST\7v\2\2TU\7c\2\2UV\7p\2\2VW\7*\2\2W\36\3\2\2\2X"+
		"Y\7g\2\2YZ\7z\2\2Z[\7r\2\2[\\\7*\2\2\\ \3\2\2\2]^\7n\2\2^_\7p\2\2_`\7"+
		"*\2\2`\"\3\2\2\2ab\7c\2\2bc\7d\2\2cd\7u\2\2de\7*\2\2e$\3\2\2\2fg\7u\2"+
		"\2gh\7s\2\2hi\7t\2\2ij\7v\2\2jk\7*\2\2k&\3\2\2\2lm\t\2\2\2mn\3\2\2\2n"+
		"o\b\24\2\2o(\3\2\2\2\6\2*/9\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}