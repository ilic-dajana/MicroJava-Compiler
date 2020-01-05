// generated with ast extension for cup
// version 0.8
// 5/0/2020 23:28:52


package rs.ac.bg.etf.pp1.ast;

public class EmptyForEnd extends ForEnd {

    public EmptyForEnd () {
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("EmptyForEnd(\n");

        buffer.append(tab);
        buffer.append(") [EmptyForEnd]");
        return buffer.toString();
    }
}