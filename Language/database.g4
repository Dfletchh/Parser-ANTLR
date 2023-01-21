grammar database;

// Parser Rules //

func
   : funcname LPAREN name (COMMA date)* (COMMA emplid)* RPAREN
   ; // add(john, 9/08/90, 234)

func_pay
   :  CALCULATE_WAGE LPAREN wage COMMA hours RPAREN
   ;

pay: wage TIMES hours
   ;

funcname
   : ADD
   | DELETE
   | UPDATE
   | CALCULATE_WAGE
   ; 

name: STRING STRING?;

emplid: INT;

date: INT FWD_SLASH INT FWD_SLASH INT;

wage: INT | DOUBLE;

hours: INT | DOUBLE;

// Lexer Rules //

ADD
   : 'Add' | 'ADD'
   ;

DELETE
   : 'Delete' | 'DELETE'
   ;

UPDATE
   : 'Update'| 'UPDATE'
   ;

CALCULATE_WAGE
   : 'CALC_WAGE' | 'calc_wage'
   ;

LPAREN: '(';

RPAREN: ')';

COMMA: ',';

POINT: '.';

FWD_SLASH: '/';

PLUS: '+';

TIMES: '*';

STRING: [A-Za-z]+;

INT: [0-9]+;

DOUBLE: [0-9]+ POINT [0-9]+;

WHITESPACE: [ \r\n\t]+ -> skip;

BLOCK_COMMENT: '/*' *? '*/' -> skip;

LINE_COMMENT: '//' ~[\r\n]* -> skip;