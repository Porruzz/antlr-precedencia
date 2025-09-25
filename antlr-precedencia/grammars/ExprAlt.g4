grammar ExprAlt;

prog : expr EOF ;

expr : addHigher (('*'|'/') addHigher)* ; // aquí * y / quedan MÁS BAJOS

addHigher
  : atom (('+'|'-') atom)*                // + y - MÁS ALTOS; izquierda
  ;

atom
  : INT
  | '(' expr ')'
  ;

INT : [0-9]+ ;
WS  : [ \t\r\n]+ -> skip ;
