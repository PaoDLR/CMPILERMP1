/*
* @authors De Castro, Delos Reyes
*/
grammar Grammar;

// Parser rules

//Union
union: (userinput WS? 'U' WS? userinput)*
       |
       epsilon;

epsilon: 'E'; // Epsilon
userinput: TERMINALS; //inputs

// Lexer rules
TERMINALS: [a-z_0-9]+; //Letters & Numbers
WS: [ \t\r\n]+ -> skip; //Whitespace