package pack02;
public class Bird extends Animals {
    static String area;
    static String type = "\"Птиц\"";
    static boolean winterFly;
    public Bird() { super(); }
    public static void chirick_chirick() {
        System.out.println("Chick-Chirik!");
    }
    @Override
    public void display() {
        System.out.printf("I am Bird %s %s! id: %s\n", type, name, id);
        super.display();
    }
    public void setArea(String _area) {
        area = _area;
    }
    public void setWinterFly(boolean fly){
        winterFly = fly;
    }
    public String getArea() {
        return area;
    }
    public boolean isWinterFly() {
        return winterFly;
    }
}
