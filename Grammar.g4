/*
* @authors De Castro, Delos Reyes
*/
grammar Grammar;

// Parser rules
output: eps | concat | sym | union;
sym:   OPAREN sym CPAREN SYM? sym*
       |
       sym SYM? sym
       |
       concat+ SYM? concat*;
union: OPAREN union CPAREN
       |
       union (UNION union | union)
       |
       union UNION (sym | eps)
       |
       (sym | eps) UNION (sym | eps)
       ;
concat: OPAREN concat CPAREN
        | accTerms+;
accTerms: TERMINALS;
eps: EPSILON; // Epsilon



/*
eps: EPSILON; // Epsilon
accTerms: TERMINALS;
concat: OPAREN concat CPAREN
        | accTerms+;
union: concat
       | UNION
       | OPAREN union CPAREN union
       | union UNION concat;
output: concat
        | union
        | eps;
*/

// Lexer rules
TERMINALS: [a-z0-9]; //Letters & Numbers
EPSILON: [E]; //Epsilon letter 'E'
OPAREN: [(]; //Open parenthesis symbol '('
CPAREN: [)]; //Close parenthesis symbol ')'
UNION: [U]; //Union letter 'U'
SYM: [*+?]; //None or more symbol '*'
WS: [ \t\r\n]+ -> skip ; //White space