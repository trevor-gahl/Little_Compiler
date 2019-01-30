
// Generated from Little.g by ANTLR 4.7.2

#pragma once


#include "antlr4-runtime.h"
#include "LittleParser.h"


/**
 * This interface defines an abstract listener for a parse tree produced by LittleParser.
 */
class  LittleListener : public antlr4::tree::ParseTreeListener {
public:

  virtual void enterFirstparser(LittleParser::FirstparserContext *ctx) = 0;
  virtual void exitFirstparser(LittleParser::FirstparserContext *ctx) = 0;


};

