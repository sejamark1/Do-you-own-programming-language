import sys
from antlr4 import *
from HelloLexer import HelloLexer 
from HelloParser import HelloParser 
from HelloListener import HelloListener 
from HelloListenerUser import HelloListenerUser

from antlr4.tree.Trees import Trees
# start : wombat+; 
# wombat: hello | goodbye; 
# hello : 'hello' ID; 
# goodbye : 'goodbye' ID;
def main(argv): 
    #StdinStream dn FileStream are standard ANTLR classes read by the lexer. 
    if len(argv)==1: 
        inpstream = StdinStream()
    else: 
        inpname = argv[1]
        inpstream = FileStream(inpname); 
        #create parser
        #NOTE: Grammer tells parser how the token should be grouped. 
        """ My understanding 
        grammar Hello; Grammer called Hello 
        start : 'hello' ID; hello with any ID. 
        ID : [a-z]+; ID should be of string 
        WS : [ \t\r\n]+ -> skip; ignore these 
        """
    lexer = HelloLexer(inpstream)                        # Input something / Scanner 
    tokstream = CommonTokenStream(lexer)                        # I'm putting input data to turn it into a token (broken/split words)
    parser = HelloParser(tokstream)                          #passing token into a parser
    tree = parser.start()                            # storing it in a tree strcture. 

    #listener = HelloListener()
    listener = HelloListenerUser() #Using Hello..User() because HelloListner will be overwritten when running antlr onit. 
    walker = ParseTreeWalker()
    walker.walk(listener, tree)

    print(Trees.toStringTree(tree, None, parser))





if __name__ == "__main__": 
    main(sys.argv)

