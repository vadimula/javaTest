package pack03;
public class Divider extends WritingMaterials{
    String dividerType;
    boolean metal;
    public void setName(String s) {
        super.name = s;
    }
    public void setDividerType(String wr) {
        this.dividerType = wr;
    }
    public void setMetal(boolean b) {
        this.metal = b;
    }
    public String getDividerType() {
        return dividerType;
    }
    public String isMetal() {
        if (metal) return "Железный";
        return "Нежелезный";
    }
    public void draw_circle() {
        System.out.println("Нарисован круг");
    }
    public void display() {
        System.out.println("I'm Divider " + this.name);
        super.display();
    }
}
