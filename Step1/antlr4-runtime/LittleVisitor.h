
// Generated from Little.g by ANTLR 4.7.2

#pragma once


#include "antlr4-runtime.h"
#include "LittleParser.h"



/**
 * This class defines an abstract visitor for a parse tree
 * produced by LittleParser.
 */
class  LittleVisitor : public antlr4::tree::AbstractParseTreeVisitor {
public:

  /**
   * Visit parse trees produced by LittleParser.
   */
    virtual antlrcpp::Any visitFirstparser(LittleParser::FirstparserContext *context) = 0;


};

