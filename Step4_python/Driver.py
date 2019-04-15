##################################################################
## File: Driver.py                                              ##
## Date: 2/3/19                                                 ##
## Authors: Trevor Gahl, Skylar Tamke                           ##
## Purpose: To pass an input file to the generated antlr files. ##
##          Then take the output and print the token types and  ##
##          values.                                             ##
##################################################################

#############
## Imports ##
#############

import sys
from antlr4 import *
from LittleLexer import LittleLexer
from LittleListener import LittleListener #autogenned code, may need to change
from LittleParser import LittleParser

from SymbolTableBuilder import SymbolTableBuilder
from AST import AST

###################
## Main function ##
###################

def main(filename):
    # Create a lexer stream by passing filestream to generated lexer
    lexer = LittleLexer(FileStream(filename))
    # Create token stream from lexer
    stream = CommonTokenStream(lexer)
    # Initialize parser using token stream
    parser = LittleParser(stream)
    # Prevent parser error output (Tired of watching it fail)
    # parser.removeErrorListeners()
    # Run parse tree using token stream initialized above - Step2+
    # Storing for use later - Step3
    tree = parser.program()
    # If program is valid print accepted, otherwise print not accepted
    walker = ParseTreeWalker()

    #Step 4 - Code
    symbol_table_builder = SymbolTableBuilder()
    walker.walk(symbol_table_builder, tree)
    # symbol_table_builder.print_symbol_table()

    a = AST(symbol_table_builder.symbol_table)
    walker.walk(a, tree)
    a.print_ast()



    #Step 3
    # symbol_table_builder = SymbolTableBuilder()
    # walker = ParseTreeWalker()
    # walker.walk(symbol_table_builder, tree)
    # symbol_table_builder.print_symbol_table()



    #Step 2
    # if parser._syntaxErrors == 0:
    #     print("Accepted")
    # else:
    #    print("Not accepted")




###############################################
## Python Main to read input and run program ##
###############################################

if __name__ == '__main__':
	filename = sys.argv[1]
	main(filename)
