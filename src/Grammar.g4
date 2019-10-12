/*
* @authors De Castro, Delos Reyes
*/
grammar Grammar;

// Parser rules

//Union
output: union
        |
        accterminals
        |
        epsilon
        ;

union: (accterminals WS? 'U' WS? accterminals)*; // Union
epsilon: 'E'; // Epsilon
accterminals: TERMINALS; // Accepted terminals

// Lexer rules
TERMINALS: [a-z_0-9]+; //Letters & Numbers
WS: [ \t\r\n]+ -> skip; //Whitespace