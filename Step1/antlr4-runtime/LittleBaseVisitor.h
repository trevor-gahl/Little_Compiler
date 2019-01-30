
// Generated from Little.g by ANTLR 4.7.2

#pragma once


#include "antlr4-runtime.h"
#include "LittleVisitor.h"


/**
 * This class provides an empty implementation of LittleVisitor, which can be
 * extended to create a visitor which only needs to handle a subset of the available methods.
 */
class  LittleBaseVisitor : public LittleVisitor {
public:

  virtual antlrcpp::Any visitFirstparser(LittleParser::FirstparserContext *ctx) override {
    return visitChildren(ctx);
  }


};

