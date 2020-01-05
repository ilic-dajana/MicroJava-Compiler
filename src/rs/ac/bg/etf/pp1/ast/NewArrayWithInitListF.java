// generated with ast extension for cup
// version 0.8
// 5/0/2020 23:28:52


package rs.ac.bg.etf.pp1.ast;

public class NewArrayWithInitListF extends Factor {

    private Type Type;
    private Expr Expr;
    private ArrayInitList ArrayInitList;

    public NewArrayWithInitListF (Type Type, Expr Expr, ArrayInitList ArrayInitList) {
        this.Type=Type;
        if(Type!=null) Type.setParent(this);
        this.Expr=Expr;
        if(Expr!=null) Expr.setParent(this);
        this.ArrayInitList=ArrayInitList;
        if(ArrayInitList!=null) ArrayInitList.setParent(this);
    }

    public Type getType() {
        return Type;
    }

    public void setType(Type Type) {
        this.Type=Type;
    }

    public Expr getExpr() {
        return Expr;
    }

    public void setExpr(Expr Expr) {
        this.Expr=Expr;
    }

    public ArrayInitList getArrayInitList() {
        return ArrayInitList;
    }

    public void setArrayInitList(ArrayInitList ArrayInitList) {
        this.ArrayInitList=ArrayInitList;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Type!=null) Type.accept(visitor);
        if(Expr!=null) Expr.accept(visitor);
        if(ArrayInitList!=null) ArrayInitList.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Type!=null) Type.traverseTopDown(visitor);
        if(Expr!=null) Expr.traverseTopDown(visitor);
        if(ArrayInitList!=null) ArrayInitList.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Type!=null) Type.traverseBottomUp(visitor);
        if(Expr!=null) Expr.traverseBottomUp(visitor);
        if(ArrayInitList!=null) ArrayInitList.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("NewArrayWithInitListF(\n");

        if(Type!=null)
            buffer.append(Type.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(Expr!=null)
            buffer.append(Expr.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ArrayInitList!=null)
            buffer.append(ArrayInitList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [NewArrayWithInitListF]");
        return buffer.toString();
    }
}