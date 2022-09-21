grammar fspow; 
prog:   stat+ ; 
stat:   fcCreation  | selCreation | filterFcCreation; 

fcCreation : ID '=' fcCreationName '(' rootSpecifier ')';
fcCreationName : 'FileCollection';  
newFileCollection :  fcCreationName '(' rootSpecifier ')';
rootSpecifier : STRING; 

selCreation : ID '=' selCreationName '('filterSpecifier')';
selCreationName : 'Selector';

filterSpecifier : selfilter '(' number',' attribute ')';
selfilter : 'top'; 
number : INTEGER;   
attribute : 'fspBiggest' | 'fspOldest' | 'fspSmallest' | 'fspNewest' ; 

filterFcCreation: ID '=' ID'.apply(' expression ')'; 
fcApplySelector: ID'.apply(' expression ')';


 

expression : ID | filterSpecifier | newFileCollection;
ID:     [a-zA-Z][a-zA-Z0-9]+ ; 
STRING: '"'.*?'"' ; 
INTEGER: [0-9]+;
WS:     [ \t\r\n]+ -> skip ;