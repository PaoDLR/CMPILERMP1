/*
* @authors De Castro, Delos Reyes
*/
grammar Grammar;

// Parser rules
output: union //The grammar yehey
        |
        accTerms
        ;

union: (accTerms UNION accTerms); // Union
accTerms: TERMINALS // Accepted terminals
          |
          (TERMINALS(NOM))*
          |
          OPARENTHESIS (TERMINALS+) CPARENTHESIS
          |
          OPARENTHESIS (TERMINALS(NOM))* CPARENTHESIS;
eps: EPSILON; // Epsilon

// Lexer rules
TERMINALS: [a-z_0-9]+; //Letters & Numbers
EPSILON: [E]; //Epsilon letter 'E'
OPARENTHESIS: [(]; //Open parenthesis symbol '('
CPARENTHESIS: [)]; //Close parenthesis symbol ')'
UNION: [U]; //Union letter 'U'
NOM: [*]; //None or more symbol '*'
OOM: [+]; //One or more symbol '+'
OPT: [?]; //Optional symbol '?"