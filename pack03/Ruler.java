package pack03;
public class Ruler extends WritingMaterials{
    //int length;
    boolean wood;
    public void setLength(int l) {
        this.length = l;
    }
    public void setWood(boolean b) {
        this.wood = b;
    }
    public String isWood() {
        if (wood) return "Из дерева";
        return "Из недерева";
    }
    public void measure() {
        System.out.println("Сейчас померяем длину");
    }
    public void display() {
        System.out.println("I'm Ruler " + this.name);
        super.display();
    }
}
