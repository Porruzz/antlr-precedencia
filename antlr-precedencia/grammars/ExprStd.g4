grammar ExprStd;

prog : expr EOF ;

expr : addExpr ;

addExpr
  : mulExpr (('+'|'-') mulExpr)*  // + y - más bajos; izquierda
  ;

mulExpr
  : atom (('*'|'/') atom)*        // * y / más altos; izquierda
  ;

atom
  : INT
  | '(' expr ')'
  ;

INT : [0-9]+ ;
WS  : [ \t\r\n]+ -> skip ;
