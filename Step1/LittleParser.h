
// Generated from Little.g by ANTLR 4.7.2

#pragma once


#include "antlr4-runtime.h"




class  LittleParser : public antlr4::Parser {
public:
  enum {
    KEYWORD = 1, IDENTIFIER = 2, INTLITERAL = 3, FLOATLITERAL = 4, STRINGLITERAL = 5, 
    COMMENT = 6, OPERATOR = 7, WHITESPACE = 8
  };

  enum {
    RuleFirstparser = 0
  };

  LittleParser(antlr4::TokenStream *input);
  ~LittleParser();

  virtual std::string getGrammarFileName() const override;
  virtual const antlr4::atn::ATN& getATN() const override { return _atn; };
  virtual const std::vector<std::string>& getTokenNames() const override { return _tokenNames; }; // deprecated: use vocabulary instead.
  virtual const std::vector<std::string>& getRuleNames() const override;
  virtual antlr4::dfa::Vocabulary& getVocabulary() const override;


  class FirstparserContext; 

  class  FirstparserContext : public antlr4::ParserRuleContext {
  public:
    FirstparserContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  FirstparserContext* firstparser();


private:
  static std::vector<antlr4::dfa::DFA> _decisionToDFA;
  static antlr4::atn::PredictionContextCache _sharedContextCache;
  static std::vector<std::string> _ruleNames;
  static std::vector<std::string> _tokenNames;

  static std::vector<std::string> _literalNames;
  static std::vector<std::string> _symbolicNames;
  static antlr4::dfa::Vocabulary _vocabulary;
  static antlr4::atn::ATN _atn;
  static std::vector<uint16_t> _serializedATN;


  struct Initializer {
    Initializer();
  };
  static Initializer _init;
};

