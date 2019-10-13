/*
* @authors De Castro, Delos Reyes
*/
grammar Grammar;

// Parser rules
output: concat | union | eps | oom | nom | opt;
union: concat | OPAREN (concat UNION concat) CPAREN UNION union
              | OPAREN (concat UNION union) CPAREN union // <-- not sure if this is needed pa. keep it for now.
              | OPAREN (concat UNION union) CPAREN | (concat UNION union);
concat: OPAREN concat CPAREN | accTerms+;
accTerms: TERMINALS;
eps: EPSILON; // Epsilon

oom: concat OOM | OPAREN (union) CPAREN OOM | union OOM | OPAREN (concat) CPAREN OOM | OPAREN (concat OOM) CPAREN;
nom: concat NOM | OPAREN (union) CPAREN NOM | union NOM | OPAREN (concat) CPAREN NOM | OPAREN (concat NOM) CPAREN;
opt: concat OPT | OPAREN (union) CPAREN OPT | union OPT | OPAREN (concat) CPAREN OPT | OPAREN (concat OPT) CPAREN;

// Lexer rules
TERMINALS: [a-z0-9]; //Letters & Numbers
EPSILON: [E]; //Epsilon letter 'E'
OPAREN: [(]; //Open parenthesis symbol '('
CPAREN: [)]; //Close parenthesis symbol ')'
UNION: [U]; //Union letter 'U'
NOM: [*]; //None or more symbol '*'
OOM: [+]; //One or more symbol '+'
OPT: [?]; //Optional symbol '?"
WS: [ \t\r\n]+ -> skip ; //White space