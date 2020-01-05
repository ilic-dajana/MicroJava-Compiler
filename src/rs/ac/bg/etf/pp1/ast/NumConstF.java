// generated with ast extension for cup
// version 0.8
// 5/0/2020 23:28:52


package rs.ac.bg.etf.pp1.ast;

public class NumConstF extends Factor {

    private Integer num;

    public NumConstF (Integer num) {
        this.num=num;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num=num;
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
        buffer.append("NumConstF(\n");

        buffer.append(" "+tab+num);
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [NumConstF]");
        return buffer.toString();
    }
}
