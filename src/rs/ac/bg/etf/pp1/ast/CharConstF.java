// generated with ast extension for cup
// version 0.8
// 5/0/2020 23:28:52


package rs.ac.bg.etf.pp1.ast;

public class CharConstF extends Factor {

    private Character c;

    public CharConstF (Character c) {
        this.c=c;
    }

    public Character getC() {
        return c;
    }

    public void setC(Character c) {
        this.c=c;
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
        buffer.append("CharConstF(\n");

        buffer.append(" "+tab+c);
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [CharConstF]");
        return buffer.toString();
    }
}