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
from LittleListener import LittleListener
from LittleParser import LittleParser

###################
## Main function ##
###################

def main(filename):
    # Create a lexer stream by passing filestream to generated lexer
    lexer = LittleLexer(FileStream(filename))
    # Read the first token
    token = lexer.nextToken()
    # If the token isn't the end of file token continue
    while token.type != Token.EOF:
        # create name variable that hold relevant token information
        name = lexer.symbolicNames[token.type]
        # Output token type and token value on separate lines
        print("Token Type: {}".format(name))
        print("Value: {}".format(token.text))
        # Update token to reflect next token in stream
        token = lexer.nextToken()

###############################################
## Python Main to read input and run program ##
###############################################

if __name__ == '__main__':
	filename = sys.argv[1]
	main(filename)
