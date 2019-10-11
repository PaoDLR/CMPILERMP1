//A sample grammar named Grammar
grammar Grammar;

a: 'grammar' ID;
ID: ['a-z']+;
WS: [ \t\r\n]+ -> skip;