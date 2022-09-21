# Generated from Hello.g4 by ANTLR 4.9.2
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .HelloParser import HelloParser
else:
    from HelloParser import HelloParser

# This class defines a complete listener for a parse tree produced by HelloParser.
class HelloListenerUser(ParseTreeListener):

    # Enter a parse tree produced by HelloParser#start.
    def enterStart(self, ctx:HelloParser.StartContext):
        print("How are you today?")

    # Exit a parse tree produced by HelloParser#start.
    def exitStart(self, ctx:HelloParser.StartContext):
        print("Greeings ", ctx.ID().getText(), ",", end="", sep="" )



del HelloParser