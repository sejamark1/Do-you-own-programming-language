import sys 
from antlr4 import * 
from fspowLexer import fspowLexer 
from fspowParser import fspowParser 
from fspowVisitor import fspowVisitor 

from antlr4.tree.Trees import Trees 
import settings

settings.init(); 

def main(argv): 
    if len(argv) == 1: 
        inpstream = StdinStream() 
    else: 
        inpname = argv[1] 
        inpstream = FileStream(inpname) 
 
    lexer = fspowLexer(inpstream) # <<< 
    tokstream = CommonTokenStream(lexer) 
    parser = fspowParser(tokstream) # <<< 
    
    tree = parser.prog()  # <<< 
    #print(Trees.toStringTree(tree, None, parser)) 

    visitor = fspowVisitor()
    visitor.visit(tree)
    
    # print("ListOfFCS")
    # print(settings.ListOfFCs)
    # print("ListOfSels")
    # print(settings.ListOfSels)
    # print("List of apply on selector")
    # print(settings.ListOfApply)

if __name__ == '__main__': 
    main(sys.argv) 
