/*
* @authors De Castro, Delos Reyes
*/
grammar Grammar;

// Parser rules
union: (TERMINALS WS* 'U' WS* TERMINALS)*;

// Lexer rules
TERMINALS: [a-z_0-9]+;

WS: [ \t\r\n]+ -> skip; //Whitespace