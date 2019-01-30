
// Generated from Little.g by ANTLR 4.7.2

#pragma once


#include "antlr4-runtime.h"
#include "LittleListener.h"


/**
 * This class provides an empty implementation of LittleListener,
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
class  LittleBaseListener : public LittleListener {
public:

  virtual void enterFirstparser(LittleParser::FirstparserContext * /*ctx*/) override { }
  virtual void exitFirstparser(LittleParser::FirstparserContext * /*ctx*/) override { }


  virtual void enterEveryRule(antlr4::ParserRuleContext * /*ctx*/) override { }
  virtual void exitEveryRule(antlr4::ParserRuleContext * /*ctx*/) override { }
  virtual void visitTerminal(antlr4::tree::TerminalNode * /*node*/) override { }
  virtual void visitErrorNode(antlr4::tree::ErrorNode * /*node*/) override { }

};

