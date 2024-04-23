package pack03;
public class Pen extends WritingMaterials{
    int countColor;
    boolean auto;
    public void setCountColor(int i) {
        this.countColor = i;
    }
    public void setAuto(boolean b) {
        this.auto = b;
    }
    public int getCountColor() {
        return this.countColor;
    }
    public boolean isAuto() {
        return this.auto;
    }
    public void writeMyName() {
        System.out.println("My name");
    }
    @Override
    public void display() {
        System.out.println("I'm Pen " + this.name);
        super.display();
    }
}
