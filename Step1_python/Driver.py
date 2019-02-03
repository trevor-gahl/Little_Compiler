import sys
from antlr4 import *
from LittleLexer import LittleLexer
from LittleListener import LittleListener
from LittleParser import LittleParser

def main(filename):
    lexer = LittleLexer(FileStream(filename))
    token = lexer.nextToken()
    while token.type != Token.EOF:
        name = lexer.symbolicNames[token.type]
        print("Token Type: {}".format(name))
        print("Value: {}".format(token.text))
        token = lexer.nextToken()

if __name__ == '__main__':
	# args[1] contains the address of current testcase
	filename = sys.argv[1]
	# Now, read this file and you will get the testcase input text
	main(filename)
