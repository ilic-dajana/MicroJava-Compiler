// generated with ast extension for cup
// version 0.8
// 5/0/2020 23:28:52


package rs.ac.bg.etf.pp1.ast;

public interface Visitor { 

    public void visit(ForInit ForInit);
    public void visit(ReturnType ReturnType);
    public void visit(Mulop Mulop);
    public void visit(MethodDecl MethodDecl);
    public void visit(VarIdent VarIdent);
    public void visit(Constant Constant);
    public void visit(AddopExpr AddopExpr);
    public void visit(Relop Relop);
    public void visit(ArrayInitList ArrayInitList);
    public void visit(FormalParameter FormalParameter);
    public void visit(Addop Addop);
    public void visit(ForCondition ForCondition);
    public void visit(Factor Factor);
    public void visit(CondTerm CondTerm);
    public void visit(ConstList ConstList);
    public void visit(DeclList DeclList);
    public void visit(Term Term);
    public void visit(Condition Condition);
    public void visit(Statements Statements);
    public void visit(VarNames VarNames);
    public void visit(FormParams FormParams);
    public void visit(IfCondition IfCondition);
    public void visit(OneFormParam OneFormParam);
    public void visit(ActualParams ActualParams);
    public void visit(ForEnd ForEnd);
    public void visit(DesignatorPart DesignatorPart);
    public void visit(VarDeclList VarDeclList);
    public void visit(Expr Expr);
    public void visit(FunctionCallParameter FunctionCallParameter);
    public void visit(ProgIdent ProgIdent);
    public void visit(Designators Designators);
    public void visit(DesignatorStatement DesignatorStatement);
    public void visit(Statement Statement);
    public void visit(VarDecl VarDecl);
    public void visit(CondFact CondFact);
    public void visit(Declaration Declaration);
    public void visit(MethodDeclList MethodDeclList);
    public void visit(RelopLESS RelopLESS);
    public void visit(RelopLESSEQ RelopLESSEQ);
    public void visit(RelopGRTEQ RelopGRTEQ);
    public void visit(RelopGRT RelopGRT);
    public void visit(RelopNEQ RelopNEQ);
    public void visit(RelopEQ RelopEQ);
    public void visit(Mod Mod);
    public void visit(Div Div);
    public void visit(Mul Mul);
    public void visit(Minus Minus);
    public void visit(Plus Plus);
    public void visit(Dummy Dummy);
    public void visit(OneArrayInit OneArrayInit);
    public void visit(MultipleArrayInit MultipleArrayInit);
    public void visit(ComplexExpressionF ComplexExpressionF);
    public void visit(FunctionCallF FunctionCallF);
    public void visit(NewArrayWithInitListF NewArrayWithInitListF);
    public void visit(NewArrayF NewArrayF);
    public void visit(NewF NewF);
    public void visit(BoolConstF BoolConstF);
    public void visit(CharConstF CharConstF);
    public void visit(NumConstF NumConstF);
    public void visit(DesignatorF DesignatorF);
    public void visit(OneMulFactor OneMulFactor);
    public void visit(AddTerm AddTerm);
    public void visit(OneAddExpression OneAddExpression);
    public void visit(AddExpression AddExpression);
    public void visit(NegativeExpression NegativeExpression);
    public void visit(Expression Expression);
    public void visit(RelOpConditionFact RelOpConditionFact);
    public void visit(ExpressionConditionFact ExpressionConditionFact);
    public void visit(OneConditionTerm OneConditionTerm);
    public void visit(MultipleConditionTerms MultipleConditionTerms);
    public void visit(OneCondition OneCondition);
    public void visit(MultipleCondition MultipleCondition);
    public void visit(EmptyForEnd EmptyForEnd);
    public void visit(NonEmptyForEnd NonEmptyForEnd);
    public void visit(EmptyForCondition EmptyForCondition);
    public void visit(NonEmptyForCondition NonEmptyForCondition);
    public void visit(EmptyForInit EmptyForInit);
    public void visit(NonEmptyForInit NonEmptyForInit);
    public void visit(ForIdent ForIdent);
    public void visit(Else Else);
    public void visit(IFCondition IFCondition);
    public void visit(OneActualParameter OneActualParameter);
    public void visit(MultipleActualParameters MultipleActualParameters);
    public void visit(EmptyParameters EmptyParameters);
    public void visit(ActualParameters ActualParameters);
    public void visit(FunctionCall FunctionCall);
    public void visit(AssignStatement AssignStatement);
    public void visit(DesignatorArray DesignatorArray);
    public void visit(EmptyDesignator EmptyDesignator);
    public void visit(MultipleDesignators MultipleDesignators);
    public void visit(DesignatorIdent DesignatorIdent);
    public void visit(Designator Designator);
    public void visit(FunctionCallDesignator FunctionCallDesignator);
    public void visit(DecrementDesignator DecrementDesignator);
    public void visit(IncrementDesignator IncrementDesignator);
    public void visit(AssignDesignator AssignDesignator);
    public void visit(FORStatement FORStatement);
    public void visit(IFELSEStatement IFELSEStatement);
    public void visit(IFStatement IFStatement);
    public void visit(PrintMultipleStatement PrintMultipleStatement);
    public void visit(PrintOneStatement PrintOneStatement);
    public void visit(ReadStatement ReadStatement);
    public void visit(StatementBlock StatementBlock);
    public void visit(EmptyReturnStatement EmptyReturnStatement);
    public void visit(ExpressionReturnStatement ExpressionReturnStatement);
    public void visit(ContinueStatement ContinueStatement);
    public void visit(BreakStatement BreakStatement);
    public void visit(DesignatorStatements DesignatorStatements);
    public void visit(EmptyStatements EmptyStatements);
    public void visit(MultipleStatements MultipleStatements);
    public void visit(BoolParameter BoolParameter);
    public void visit(CharParameter CharParameter);
    public void visit(NumberParameter NumberParameter);
    public void visit(ArrayParameter ArrayParameter);
    public void visit(UsualParameter UsualParameter);
    public void visit(OneFormalParameter OneFormalParameter);
    public void visit(MultipleFormalParameters MultipleFormalParameters);
    public void visit(EmptyFormalParameters EmptyFormalParameters);
    public void visit(FormalParameters FormalParameters);
    public void visit(MethodIdent MethodIdent);
    public void visit(VoidType VoidType);
    public void visit(NonVoidType NonVoidType);
    public void visit(EmptyMethodDeclaration EmptyMethodDeclaration);
    public void visit(MultipleMethodDeclarations MultipleMethodDeclarations);
    public void visit(MethodDeclaration MethodDeclaration);
    public void visit(ArrayVariableIdent ArrayVariableIdent);
    public void visit(VariableIdent VariableIdent);
    public void visit(OneVariableName OneVariableName);
    public void visit(MultipleVariableNames MultipleVariableNames);
    public void visit(EmptyVariableDeclarations EmptyVariableDeclarations);
    public void visit(MultipleVariableDeclarations MultipleVariableDeclarations);
    public void visit(VariableDeclaration VariableDeclaration);
    public void visit(ConstChar ConstChar);
    public void visit(ConstBool ConstBool);
    public void visit(ConstNumber ConstNumber);
    public void visit(OneConstList OneConstList);
    public void visit(MultipleConstList MultipleConstList);
    public void visit(Type Type);
    public void visit(ConstDecl ConstDecl);
    public void visit(VarDeclaration VarDeclaration);
    public void visit(ConstDeclaration ConstDeclaration);
    public void visit(EmptyDeclarationList EmptyDeclarationList);
    public void visit(DeclarationList DeclarationList);
    public void visit(ProgramIdent ProgramIdent);
    public void visit(Program Program);

}