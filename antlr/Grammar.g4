grammar Grammar;
expression :
    LPAREN expression RPAREN #ParenthesizedExpr
    | operatorToken=(SIN | COS | TAN | EXP | LN | ABS | SQRT ) expression RPAREN #SinExpr
    | expression EXPONENT expression #ExponentialExpr
    | expression operatorToken=(MULTIPLY | DIVIDE) expression #MultiplicativeExpr
    | expression operatorToken=(ADD | SUBTRACT) expression #AdditiveExpr
    | NUMBER #NumberExpr
    | (E | PI) #ConstExpr
;

NUMBER : ('-')? INT ('.' INT)?;
E : 'E';
PI : 'PI';
INT : ('0'..'9')+;
EXPONENT : '^';
MULTIPLY : '*';
DIVIDE : '/';
SUBTRACT : '-';
ADD : '+';
LPAREN : '(';
RPAREN : ')';
SIN : 'sin(';
COS : 'cos(';
TAN : 'tan(';
EXP : 'exp(';
LN : 'ln(';
ABS : 'abs(';
SQRT : 'sqrt(';
WS : [ \t\r\n] -> channel(HIDDEN);