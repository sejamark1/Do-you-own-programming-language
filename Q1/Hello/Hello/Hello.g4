grammar Hello; 


start : 'hello' ID; 
ID : [a-z, A-Z]+; 
WS : [ \t\r\n]+ -> skip; 
