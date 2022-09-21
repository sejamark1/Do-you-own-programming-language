# Generated from fspow.g4 by ANTLR 4.9.2
import settings
from Selector import Selector
from pathlib import Path 
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .fspowParser import fspowParser
else:
    from fspowParser import fspowParser

# This class defines a complete generic visitor for a parse tree produced by fspowParser.






class fspowVisitor(ParseTreeVisitor):
    selector = None
    path = None

    # Visit a parse tree produced by fspowParser#prog.
    def visitProg(self, ctx:fspowParser.ProgContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by fspowParser#stat.
    def visitStat(self, ctx:fspowParser.StatContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by fspowParser#fcCreation.
    #NOTE: When the code is exeucted from input.txt, these are called for each time the parse tree is executed or activated and this get shown. 
    def visitFcCreation(self, ctx:fspowParser.FcCreationContext):
        # print(ctx.getText()) = abc=FileCollection("./") 
        # ctx.getChild(0).getText() = abc 
        # ctx.getChild(1).getText() = = 
        # ctx.getChild(2).getText() = FileCollection 
        # ctx.getChild(3).getText() = ( 
        fcID = ctx.getChild(0).getText() 
        root = ctx.getChild(4).getText() 
        path = Path(root[1:len(root)-1]) # extract string w/o quotes 
        self.path = path
        files = [ e for e in path.rglob("*") if e.is_file() ] # list comprehension 
        settings.ListOfFCs[fcID] = files 
        #return self.visitChildren(ctx) 

    # Visit a parse tree produced by fspowParser#fcCreationName.
    def visitFcCreationName(self, ctx:fspowParser.FcCreationNameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by fspowParser#newFileCollection.
    def visitNewFileCollection(self, ctx:fspowParser.NewFileCollectionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by fspowParser#rootSpecifier.
    def visitRootSpecifier(self, ctx:fspowParser.RootSpecifierContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by fspowParser#selCreation.
    def visitSelCreation(self, ctx:fspowParser.SelCreationContext):
        selID = ctx.getChild(0).getText() #var
        filter = ctx.getChild(4).getText() #value
        #See if you have to add. 
        newFilter = filter.replace("top(","").replace(")","").split(",")
        s = Selector(self.path,int(newFilter[0]), newFilter[1])
        settings.ListOfSels[selID] = filter 
        return self.visitChildren(ctx) 


    # Visit a parse tree produced by fspowParser#selCreationName.
    def visitSelCreationName(self, ctx:fspowParser.SelCreationNameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by fspowParser#filterSpecifier.
    def visitFilterSpecifier(self, ctx:fspowParser.FilterSpecifierContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by fspowParser#selfilter.
    def visitSelfilter(self, ctx:fspowParser.SelfilterContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by fspowParser#number.
    def visitNumber(self, ctx:fspowParser.NumberContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by fspowParser#attribute.
    def visitAttribute(self, ctx:fspowParser.AttributeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by fspowParser#filterFcCreation.
    def visitFilterFcCreation(self, ctx:fspowParser.FilterFcCreationContext):
        selID = ctx.getChild(0).getText() #var
        filter = ""
        for i in range(2,6): 
            filter += ctx.getChild(i).getText() #value

        settings.ListOfApply[selID] = filter 
        #settings.ListOfApply.append(filter) 
        return self.visitChildren(ctx) 


    # Visit a parse tree produced by fspowParser#fcApplySelector.
    def visitFcApplySelector(self, ctx:fspowParser.FcApplySelectorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by fspowParser#expression.
    def visitExpression(self, ctx:fspowParser.ExpressionContext):
        return self.visitChildren(ctx)



del fspowParser