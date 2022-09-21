# Generated from fspow.g4 by ANTLR 4.9.2
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO


def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\22")
        buf.write("b\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b")
        buf.write("\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t")
        buf.write("\16\4\17\t\17\4\20\t\20\3\2\6\2\"\n\2\r\2\16\2#\3\3\3")
        buf.write("\3\3\3\5\3)\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3")
        buf.write("\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b")
        buf.write("\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f")
        buf.write("\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17")
        buf.write("\3\17\3\17\3\17\3\20\3\20\3\20\5\20`\n\20\3\20\2\2\21")
        buf.write("\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\3\3\2\n\r\2")
        buf.write("W\2!\3\2\2\2\4(\3\2\2\2\6*\3\2\2\2\b\61\3\2\2\2\n\63\3")
        buf.write("\2\2\2\f8\3\2\2\2\16:\3\2\2\2\20A\3\2\2\2\22C\3\2\2\2")
        buf.write("\24J\3\2\2\2\26L\3\2\2\2\30N\3\2\2\2\32P\3\2\2\2\34W\3")
        buf.write("\2\2\2\36_\3\2\2\2 \"\5\4\3\2! \3\2\2\2\"#\3\2\2\2#!\3")
        buf.write("\2\2\2#$\3\2\2\2$\3\3\2\2\2%)\5\6\4\2&)\5\16\b\2\')\5")
        buf.write("\32\16\2(%\3\2\2\2(&\3\2\2\2(\'\3\2\2\2)\5\3\2\2\2*+\7")
        buf.write("\17\2\2+,\7\3\2\2,-\5\b\5\2-.\7\4\2\2./\5\f\7\2/\60\7")
        buf.write("\5\2\2\60\7\3\2\2\2\61\62\7\6\2\2\62\t\3\2\2\2\63\64\5")
        buf.write("\b\5\2\64\65\7\4\2\2\65\66\5\f\7\2\66\67\7\5\2\2\67\13")
        buf.write("\3\2\2\289\7\20\2\29\r\3\2\2\2:;\7\17\2\2;<\7\3\2\2<=")
        buf.write("\5\20\t\2=>\7\4\2\2>?\5\22\n\2?@\7\5\2\2@\17\3\2\2\2A")
        buf.write("B\7\7\2\2B\21\3\2\2\2CD\5\24\13\2DE\7\4\2\2EF\5\26\f\2")
        buf.write("FG\7\b\2\2GH\5\30\r\2HI\7\5\2\2I\23\3\2\2\2JK\7\t\2\2")
        buf.write("K\25\3\2\2\2LM\7\21\2\2M\27\3\2\2\2NO\t\2\2\2O\31\3\2")
        buf.write("\2\2PQ\7\17\2\2QR\7\3\2\2RS\7\17\2\2ST\7\16\2\2TU\5\36")
        buf.write("\20\2UV\7\5\2\2V\33\3\2\2\2WX\7\17\2\2XY\7\16\2\2YZ\5")
        buf.write("\36\20\2Z[\7\5\2\2[\35\3\2\2\2\\`\7\17\2\2]`\5\22\n\2")
        buf.write("^`\5\n\6\2_\\\3\2\2\2_]\3\2\2\2_^\3\2\2\2`\37\3\2\2\2")
        buf.write("\5#(_")
        return buf.getvalue()


class fspowParser ( Parser ):

    grammarFileName = "fspow.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'='", "'('", "')'", "'FileCollection'", 
                     "'Selector'", "','", "'top'", "'fspBiggest'", "'fspOldest'", 
                     "'fspSmallest'", "'fspNewest'", "'.apply('" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "ID", "STRING", "INTEGER", "WS" ]

    RULE_prog = 0
    RULE_stat = 1
    RULE_fcCreation = 2
    RULE_fcCreationName = 3
    RULE_newFileCollection = 4
    RULE_rootSpecifier = 5
    RULE_selCreation = 6
    RULE_selCreationName = 7
    RULE_filterSpecifier = 8
    RULE_selfilter = 9
    RULE_number = 10
    RULE_attribute = 11
    RULE_filterFcCreation = 12
    RULE_fcApplySelector = 13
    RULE_expression = 14

    ruleNames =  [ "prog", "stat", "fcCreation", "fcCreationName", "newFileCollection", 
                   "rootSpecifier", "selCreation", "selCreationName", "filterSpecifier", 
                   "selfilter", "number", "attribute", "filterFcCreation", 
                   "fcApplySelector", "expression" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    T__3=4
    T__4=5
    T__5=6
    T__6=7
    T__7=8
    T__8=9
    T__9=10
    T__10=11
    T__11=12
    ID=13
    STRING=14
    INTEGER=15
    WS=16

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.9.2")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class ProgContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def stat(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(fspowParser.StatContext)
            else:
                return self.getTypedRuleContext(fspowParser.StatContext,i)


        def getRuleIndex(self):
            return fspowParser.RULE_prog

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterProg" ):
                listener.enterProg(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitProg" ):
                listener.exitProg(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitProg" ):
                return visitor.visitProg(self)
            else:
                return visitor.visitChildren(self)




    def prog(self):

        localctx = fspowParser.ProgContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_prog)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 31 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 30
                self.stat()
                self.state = 33 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==fspowParser.ID):
                    break

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class StatContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def fcCreation(self):
            return self.getTypedRuleContext(fspowParser.FcCreationContext,0)


        def selCreation(self):
            return self.getTypedRuleContext(fspowParser.SelCreationContext,0)


        def filterFcCreation(self):
            return self.getTypedRuleContext(fspowParser.FilterFcCreationContext,0)


        def getRuleIndex(self):
            return fspowParser.RULE_stat

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterStat" ):
                listener.enterStat(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitStat" ):
                listener.exitStat(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitStat" ):
                return visitor.visitStat(self)
            else:
                return visitor.visitChildren(self)




    def stat(self):

        localctx = fspowParser.StatContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_stat)
        try:
            self.state = 38
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,1,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 35
                self.fcCreation()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 36
                self.selCreation()
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 37
                self.filterFcCreation()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class FcCreationContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(fspowParser.ID, 0)

        def fcCreationName(self):
            return self.getTypedRuleContext(fspowParser.FcCreationNameContext,0)


        def rootSpecifier(self):
            return self.getTypedRuleContext(fspowParser.RootSpecifierContext,0)


        def getRuleIndex(self):
            return fspowParser.RULE_fcCreation

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFcCreation" ):
                listener.enterFcCreation(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFcCreation" ):
                listener.exitFcCreation(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFcCreation" ):
                return visitor.visitFcCreation(self)
            else:
                return visitor.visitChildren(self)




    def fcCreation(self):

        localctx = fspowParser.FcCreationContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_fcCreation)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 40
            self.match(fspowParser.ID)
            self.state = 41
            self.match(fspowParser.T__0)
            self.state = 42
            self.fcCreationName()
            self.state = 43
            self.match(fspowParser.T__1)
            self.state = 44
            self.rootSpecifier()
            self.state = 45
            self.match(fspowParser.T__2)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class FcCreationNameContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return fspowParser.RULE_fcCreationName

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFcCreationName" ):
                listener.enterFcCreationName(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFcCreationName" ):
                listener.exitFcCreationName(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFcCreationName" ):
                return visitor.visitFcCreationName(self)
            else:
                return visitor.visitChildren(self)




    def fcCreationName(self):

        localctx = fspowParser.FcCreationNameContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_fcCreationName)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 47
            self.match(fspowParser.T__3)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class NewFileCollectionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def fcCreationName(self):
            return self.getTypedRuleContext(fspowParser.FcCreationNameContext,0)


        def rootSpecifier(self):
            return self.getTypedRuleContext(fspowParser.RootSpecifierContext,0)


        def getRuleIndex(self):
            return fspowParser.RULE_newFileCollection

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterNewFileCollection" ):
                listener.enterNewFileCollection(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitNewFileCollection" ):
                listener.exitNewFileCollection(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitNewFileCollection" ):
                return visitor.visitNewFileCollection(self)
            else:
                return visitor.visitChildren(self)




    def newFileCollection(self):

        localctx = fspowParser.NewFileCollectionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_newFileCollection)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 49
            self.fcCreationName()
            self.state = 50
            self.match(fspowParser.T__1)
            self.state = 51
            self.rootSpecifier()
            self.state = 52
            self.match(fspowParser.T__2)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class RootSpecifierContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def STRING(self):
            return self.getToken(fspowParser.STRING, 0)

        def getRuleIndex(self):
            return fspowParser.RULE_rootSpecifier

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterRootSpecifier" ):
                listener.enterRootSpecifier(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitRootSpecifier" ):
                listener.exitRootSpecifier(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitRootSpecifier" ):
                return visitor.visitRootSpecifier(self)
            else:
                return visitor.visitChildren(self)




    def rootSpecifier(self):

        localctx = fspowParser.RootSpecifierContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_rootSpecifier)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 54
            self.match(fspowParser.STRING)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class SelCreationContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(fspowParser.ID, 0)

        def selCreationName(self):
            return self.getTypedRuleContext(fspowParser.SelCreationNameContext,0)


        def filterSpecifier(self):
            return self.getTypedRuleContext(fspowParser.FilterSpecifierContext,0)


        def getRuleIndex(self):
            return fspowParser.RULE_selCreation

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSelCreation" ):
                listener.enterSelCreation(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSelCreation" ):
                listener.exitSelCreation(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitSelCreation" ):
                return visitor.visitSelCreation(self)
            else:
                return visitor.visitChildren(self)




    def selCreation(self):

        localctx = fspowParser.SelCreationContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_selCreation)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 56
            self.match(fspowParser.ID)
            self.state = 57
            self.match(fspowParser.T__0)
            self.state = 58
            self.selCreationName()
            self.state = 59
            self.match(fspowParser.T__1)
            self.state = 60
            self.filterSpecifier()
            self.state = 61
            self.match(fspowParser.T__2)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class SelCreationNameContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return fspowParser.RULE_selCreationName

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSelCreationName" ):
                listener.enterSelCreationName(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSelCreationName" ):
                listener.exitSelCreationName(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitSelCreationName" ):
                return visitor.visitSelCreationName(self)
            else:
                return visitor.visitChildren(self)




    def selCreationName(self):

        localctx = fspowParser.SelCreationNameContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_selCreationName)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 63
            self.match(fspowParser.T__4)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class FilterSpecifierContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def selfilter(self):
            return self.getTypedRuleContext(fspowParser.SelfilterContext,0)


        def number(self):
            return self.getTypedRuleContext(fspowParser.NumberContext,0)


        def attribute(self):
            return self.getTypedRuleContext(fspowParser.AttributeContext,0)


        def getRuleIndex(self):
            return fspowParser.RULE_filterSpecifier

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFilterSpecifier" ):
                listener.enterFilterSpecifier(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFilterSpecifier" ):
                listener.exitFilterSpecifier(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFilterSpecifier" ):
                return visitor.visitFilterSpecifier(self)
            else:
                return visitor.visitChildren(self)




    def filterSpecifier(self):

        localctx = fspowParser.FilterSpecifierContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_filterSpecifier)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 65
            self.selfilter()
            self.state = 66
            self.match(fspowParser.T__1)
            self.state = 67
            self.number()
            self.state = 68
            self.match(fspowParser.T__5)
            self.state = 69
            self.attribute()
            self.state = 70
            self.match(fspowParser.T__2)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class SelfilterContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return fspowParser.RULE_selfilter

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSelfilter" ):
                listener.enterSelfilter(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSelfilter" ):
                listener.exitSelfilter(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitSelfilter" ):
                return visitor.visitSelfilter(self)
            else:
                return visitor.visitChildren(self)




    def selfilter(self):

        localctx = fspowParser.SelfilterContext(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_selfilter)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 72
            self.match(fspowParser.T__6)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class NumberContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def INTEGER(self):
            return self.getToken(fspowParser.INTEGER, 0)

        def getRuleIndex(self):
            return fspowParser.RULE_number

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterNumber" ):
                listener.enterNumber(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitNumber" ):
                listener.exitNumber(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitNumber" ):
                return visitor.visitNumber(self)
            else:
                return visitor.visitChildren(self)




    def number(self):

        localctx = fspowParser.NumberContext(self, self._ctx, self.state)
        self.enterRule(localctx, 20, self.RULE_number)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 74
            self.match(fspowParser.INTEGER)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class AttributeContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return fspowParser.RULE_attribute

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAttribute" ):
                listener.enterAttribute(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAttribute" ):
                listener.exitAttribute(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitAttribute" ):
                return visitor.visitAttribute(self)
            else:
                return visitor.visitChildren(self)




    def attribute(self):

        localctx = fspowParser.AttributeContext(self, self._ctx, self.state)
        self.enterRule(localctx, 22, self.RULE_attribute)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 76
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << fspowParser.T__7) | (1 << fspowParser.T__8) | (1 << fspowParser.T__9) | (1 << fspowParser.T__10))) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class FilterFcCreationContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self, i:int=None):
            if i is None:
                return self.getTokens(fspowParser.ID)
            else:
                return self.getToken(fspowParser.ID, i)

        def expression(self):
            return self.getTypedRuleContext(fspowParser.ExpressionContext,0)


        def getRuleIndex(self):
            return fspowParser.RULE_filterFcCreation

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFilterFcCreation" ):
                listener.enterFilterFcCreation(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFilterFcCreation" ):
                listener.exitFilterFcCreation(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFilterFcCreation" ):
                return visitor.visitFilterFcCreation(self)
            else:
                return visitor.visitChildren(self)




    def filterFcCreation(self):

        localctx = fspowParser.FilterFcCreationContext(self, self._ctx, self.state)
        self.enterRule(localctx, 24, self.RULE_filterFcCreation)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 78
            self.match(fspowParser.ID)
            self.state = 79
            self.match(fspowParser.T__0)
            self.state = 80
            self.match(fspowParser.ID)
            self.state = 81
            self.match(fspowParser.T__11)
            self.state = 82
            self.expression()
            self.state = 83
            self.match(fspowParser.T__2)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class FcApplySelectorContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(fspowParser.ID, 0)

        def expression(self):
            return self.getTypedRuleContext(fspowParser.ExpressionContext,0)


        def getRuleIndex(self):
            return fspowParser.RULE_fcApplySelector

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFcApplySelector" ):
                listener.enterFcApplySelector(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFcApplySelector" ):
                listener.exitFcApplySelector(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFcApplySelector" ):
                return visitor.visitFcApplySelector(self)
            else:
                return visitor.visitChildren(self)




    def fcApplySelector(self):

        localctx = fspowParser.FcApplySelectorContext(self, self._ctx, self.state)
        self.enterRule(localctx, 26, self.RULE_fcApplySelector)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 85
            self.match(fspowParser.ID)
            self.state = 86
            self.match(fspowParser.T__11)
            self.state = 87
            self.expression()
            self.state = 88
            self.match(fspowParser.T__2)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExpressionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(fspowParser.ID, 0)

        def filterSpecifier(self):
            return self.getTypedRuleContext(fspowParser.FilterSpecifierContext,0)


        def newFileCollection(self):
            return self.getTypedRuleContext(fspowParser.NewFileCollectionContext,0)


        def getRuleIndex(self):
            return fspowParser.RULE_expression

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpression" ):
                listener.enterExpression(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpression" ):
                listener.exitExpression(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExpression" ):
                return visitor.visitExpression(self)
            else:
                return visitor.visitChildren(self)




    def expression(self):

        localctx = fspowParser.ExpressionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 28, self.RULE_expression)
        try:
            self.state = 93
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [fspowParser.ID]:
                self.enterOuterAlt(localctx, 1)
                self.state = 90
                self.match(fspowParser.ID)
                pass
            elif token in [fspowParser.T__6]:
                self.enterOuterAlt(localctx, 2)
                self.state = 91
                self.filterSpecifier()
                pass
            elif token in [fspowParser.T__3]:
                self.enterOuterAlt(localctx, 3)
                self.state = 92
                self.newFileCollection()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





