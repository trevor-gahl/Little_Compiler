
// Generated from Little.g by ANTLR 4.7.2


#include "LittleListener.h"

#include "LittleParser.h"


using namespace antlrcpp;
using namespace antlr4;

LittleParser::LittleParser(TokenStream *input) : Parser(input) {
  _interpreter = new atn::ParserATNSimulator(this, _atn, _decisionToDFA, _sharedContextCache);
}

LittleParser::~LittleParser() {
  delete _interpreter;
}

std::string LittleParser::getGrammarFileName() const {
  return "Little.g";
}

const std::vector<std::string>& LittleParser::getRuleNames() const {
  return _ruleNames;
}

dfa::Vocabulary& LittleParser::getVocabulary() const {
  return _vocabulary;
}


//----------------- FirstparserContext ------------------------------------------------------------------

LittleParser::FirstparserContext::FirstparserContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}


size_t LittleParser::FirstparserContext::getRuleIndex() const {
  return LittleParser::RuleFirstparser;
}

void LittleParser::FirstparserContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<LittleListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterFirstparser(this);
}

void LittleParser::FirstparserContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<LittleListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitFirstparser(this);
}

LittleParser::FirstparserContext* LittleParser::firstparser() {
  FirstparserContext *_localctx = _tracker.createInstance<FirstparserContext>(_ctx, getState());
  enterRule(_localctx, 0, LittleParser::RuleFirstparser);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);

   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

// Static vars and initialization.
std::vector<dfa::DFA> LittleParser::_decisionToDFA;
atn::PredictionContextCache LittleParser::_sharedContextCache;

// We own the ATN which in turn owns the ATN states.
atn::ATN LittleParser::_atn;
std::vector<uint16_t> LittleParser::_serializedATN;

std::vector<std::string> LittleParser::_ruleNames = {
  "firstparser"
};

std::vector<std::string> LittleParser::_literalNames = {
};

std::vector<std::string> LittleParser::_symbolicNames = {
  "", "KEYWORD", "IDENTIFIER", "INTLITERAL", "FLOATLITERAL", "STRINGLITERAL", 
  "COMMENT", "OPERATOR", "WHITESPACE"
};

dfa::Vocabulary LittleParser::_vocabulary(_literalNames, _symbolicNames);

std::vector<std::string> LittleParser::_tokenNames;

LittleParser::Initializer::Initializer() {
	for (size_t i = 0; i < _symbolicNames.size(); ++i) {
		std::string name = _vocabulary.getLiteralName(i);
		if (name.empty()) {
			name = _vocabulary.getSymbolicName(i);
		}

		if (name.empty()) {
			_tokenNames.push_back("<INVALID>");
		} else {
      _tokenNames.push_back(name);
    }
	}

  _serializedATN = {
    0x3, 0x608b, 0xa72a, 0x8133, 0xb9ed, 0x417c, 0x3be7, 0x7786, 0x5964, 
    0x3, 0xa, 0x7, 0x4, 0x2, 0x9, 0x2, 0x3, 0x2, 0x3, 0x2, 0x3, 0x2, 0x2, 
    0x2, 0x3, 0x2, 0x2, 0x2, 0x2, 0x5, 0x2, 0x4, 0x3, 0x2, 0x2, 0x2, 0x4, 
    0x5, 0x3, 0x2, 0x2, 0x2, 0x5, 0x3, 0x3, 0x2, 0x2, 0x2, 0x2, 
  };

  atn::ATNDeserializer deserializer;
  _atn = deserializer.deserialize(_serializedATN);

  size_t count = _atn.getNumberOfDecisions();
  _decisionToDFA.reserve(count);
  for (size_t i = 0; i < count; i++) { 
    _decisionToDFA.emplace_back(_atn.getDecisionState(i), i);
  }
}

LittleParser::Initializer LittleParser::_init;
