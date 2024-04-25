package pack02;
public class Insect extends Animals {
    static int wingCount;
    static String type = "\"Насекомое\"";
    static boolean likeJesus;
    public Insect() {
        super();
    }
    public static void ggggg() {
        System.out.println("Bzzzz...");
    }
    public void setWingCount(int i) {
        wingCount = i;
    }
    public void setLikeJesus(boolean b) {
        likeJesus = b;
    }
    public int getWingCount() {
        return wingCount;
    }
    public boolean isLikeJesus() {
        return likeJesus;
    }
    @Override
    public void display() {
        System.out.printf("I am Insect %s %s! id: %s\n", type, name, id);
        super.display();
    }
}
