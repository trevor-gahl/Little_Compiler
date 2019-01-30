grammar Little;

/**
 * Parsers
 */

firstparser         :;     

/**
 * Fragments
 */

fragment DIGIT0     : '0'..'9' ;
fragment DIGIT1     : '1'..'9' ;
fragment NL         : '\r'? '\n' 
                    | '\r' ;


/**
 * Lexers
 */

KEYWORD             : 'PROGRAM'
                    | 'BEGIN'
                    | 'END'
                    | 'FUNCTION'
                    | 'READ'
                    | 'WRITE'
                    | 'IF'
                    | 'ELSE'
                    | 'FI'
                    | 'FOR'
                    | 'ROF'
                    | 'RETURN'
                    | 'INT'
                    | 'VOID'
                    | 'STRING'
                    | 'FLOAT'
                    | 'WHILE'
                    | 'ENDIF'
                    | 'ENDWHILE'
                    ;
IDENTIFIER          : ([a-z] | [A-Z]) ([a-z]+ | [A-Z]+ | DIGIT0+)* ;
INTLITERAL          : DIGIT1* DIGIT0+ ;
FLOATLITERAL        : INTLITERAL '.' DIGIT0* 
                    | '.' DIGIT0+ 
                    ;
STRINGLITERAL       : '"' ~('"')* '"' ;
COMMENT             : '--' ~[\r\n]* NL -> skip
                    //| '--' ~('\r')* NL
                    // | '--' ~('\r\n')* NL             Can't match on more than one character in a lexer set, so window's new line doesn't work.
                    ;
OPERATOR            : ':='
                    | '+'
                    | '-'
                    | '*'
                    | '/'
                    | '='
                    | '!='
                    | '<'
                    | '>'
                    | '('
                    | ')'
                    | ';'
                    | ','
                    | '<='
                    | '>='
                    ;
WHITESPACE          : [ \n\t\r]+ -> skip;