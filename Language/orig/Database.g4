grammar employeeDatabase;

function
   : funcname LPAREN NAME (COMMA DATE)* (COMMA EMPLID)* RPAREN // DATE and EMPLID are currently optional
   ;                                                           // Add(John Doe, 9/08/90, 2345678)

funcname
   : ADD
   | DELETE
   | UPDATE
   ;

ADD
   : 'Add' | 'ADD'
   ;

DELETE
   : 'Delete' | 'DELETE'
   ;

UPDATE
   : 'Update'| 'UPDATE'
   ;

NAME
   : STRING +
   ;

EMPLID
   : ( INT | STRING ) + // any combination of num/letters
   ;

DATE
    : INT FWD_SLASH INT FWD_SLASH INT // 9/08/90
    ;

LPAREN: '(';

RPAREN: ')';

COMMA: ',';

FWD_SLASH: '/';

fragment STRING: [a-z][a-zA-Z]+;
fragment INT: [0-9]+;
COMMENT: '//' ~[\r\n]* -> skip;
WHITESPACE: [ \r\n\t]+ -> skip;