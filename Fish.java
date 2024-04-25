package pack02;
public class Fish extends Animals {
    static String squama;
    static String type = "\"Рыба\"";
    static boolean upStreamSwim;
    public Fish() {
        super();
    }
    public static void bul_bul() { System.out.println("Bool-Bool!"); }
    public void setSquama(String text) { squama = text; }
    public void setUpStreamSwim(boolean b) { upStreamSwim = b;}
    public String getSquama() { return squama; }
    public boolean isUpStreamSwim() { return upStreamSwim; }
    @Override
    public void display() {
        System.out.printf("I am Fish %s %s! id: %s\n", type, name, id);
        super.display();
    }
}
