grammar Little;

/**
 * Parsers
 */

littleparser        :;

/**
 * Fragments
 */

fragment DIGIT0     : '0'..'9' ;
fragment DIGIT1     : '1'..'9' ;
fragment NL         : '\r'? '\n' | '\r' ;

/**
 * Lexers
 */

KEYWORD             : 'PROGRAM'|'BEGIN'|'END'|'FUNCTION'|'READ'|'WRITE'|'IF'|'ELSE'|'FI'|'FOR'|'ROF'|'RETURN'|'INT'|'VOID'|'STRING'|'FLOAT'|'WHILE'|'ENDIF'|'ENDWHILE' ;
IDENTIFIER          : ([a-z] | [A-Z]) ([a-z]+ | [A-Z]+ | DIGIT0+)* ;
INTLITERAL          : DIGIT1* DIGIT0+ ;
FLOATLITERAL        : INTLITERAL '.' DIGIT0* | '.' DIGIT0+ ;
STRINGLITERAL       : '"' ~('"')* '"' ;
COMMENT             : '--' ~[\r\n]* NL -> skip ;
OPERATOR            : ':='|'+'|'-'|'*'|'/'|'='|'!='|'<'|'>'|'('|')'|';'|','|'<='|'>=' ;
WHITESPACE          : [ \n\t\r]+ -> skip;
