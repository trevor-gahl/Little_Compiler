# Generated from Little.g by ANTLR 4.7.2
# encoding: utf-8
from antlr4 import *
from io import StringIO
from typing.io import TextIO
import sys


def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\n")
        buf.write("\7\4\2\t\2\3\2\3\2\3\2\2\2\3\2\2\2\2\5\2\4\3\2\2\2\4\5")
        buf.write("\3\2\2\2\5\3\3\2\2\2\2")
        return buf.getvalue()


class LittleParser ( Parser ):

    grammarFileName = "Little.g"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [  ]

    symbolicNames = [ "<INVALID>", "KEYWORD", "IDENTIFIER", "INTLITERAL", 
                      "FLOATLITERAL", "STRINGLITERAL", "COMMENT", "OPERATOR", 
                      "WHITESPACE" ]

    RULE_firstparser = 0

    ruleNames =  [ "firstparser" ]

    EOF = Token.EOF
    KEYWORD=1
    IDENTIFIER=2
    INTLITERAL=3
    FLOATLITERAL=4
    STRINGLITERAL=5
    COMMENT=6
    OPERATOR=7
    WHITESPACE=8

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.7.2")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class FirstparserContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return LittleParser.RULE_firstparser

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFirstparser" ):
                listener.enterFirstparser(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFirstparser" ):
                listener.exitFirstparser(self)




    def firstparser(self):

        localctx = LittleParser.FirstparserContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_firstparser)
        try:
            self.enterOuterAlt(localctx, 1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





