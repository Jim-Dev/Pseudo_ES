// Generated from Demo.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DemoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUMBER=1, SIGN_ADD=2;
	public static final int
		RULE_addition = 0;
	public static final String[] ruleNames = {
		"addition"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'+'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NUMBER", "SIGN_ADD"
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

	@Override
	public String getGrammarFileName() { return "Demo.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DemoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class AdditionContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(DemoParser.NUMBER, 0); }
		public AdditionContext addition() {
			return getRuleContext(AdditionContext.class,0);
		}
		public TerminalNode SIGN_ADD() { return getToken(DemoParser.SIGN_ADD, 0); }
		public AdditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterAddition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitAddition(this);
		}
	}

	public final AdditionContext addition() throws RecognitionException {
		return addition(0);
	}

	private AdditionContext addition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditionContext _localctx = new AdditionContext(_ctx, _parentState);
		AdditionContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_addition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3);
			match(NUMBER);
			}
			_ctx.stop = _input.LT(-1);
			setState(10);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AdditionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_addition);
					setState(5);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(6);
					match(SIGN_ADD);
					setState(7);
					match(NUMBER);
					}
					} 
				}
				setState(12);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return addition_sempred((AdditionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean addition_sempred(AdditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\4\20\4\2\t\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\7\2\13\n\2\f\2\16\2\16\13\2\3\2\2\3\2\3\2\2\2\2\17"+
		"\2\4\3\2\2\2\4\5\b\2\1\2\5\6\7\3\2\2\6\f\3\2\2\2\7\b\f\4\2\2\b\t\7\4\2"+
		"\2\t\13\7\3\2\2\n\7\3\2\2\2\13\16\3\2\2\2\f\n\3\2\2\2\f\r\3\2\2\2\r\3"+
		"\3\2\2\2\16\f\3\2\2\2\3\f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}