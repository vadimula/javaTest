package pack03;
public class Test {
    public static void main(String[] args) {
        System.out.println("+++++++++++++++++");
        WritingMaterials wm = new WritingMaterials("ручка", "Красный", 145, 15.6, true);
        wm.display();
        System.out.println("+++++++++++++++++");

        Pen p = new Pen();
        p.setName("Паркер");
        p.display();
        p.setCountColor(2);
        p.setAuto(false);
        System.out.println(p.getCountColor());
        System.out.println(p.isAuto());
        p.writeMyName();
        System.out.println("+++++++++++++++++");

        Ruler r = new Ruler();
        r.setName("Линейка");
        r.setLength(25);
        r.display();
        r.setWood(true);
        System.out.println(r.getLength());
        System.out.println(r.isWood());
        r.measure();
        System.out.println("+++++++++++++++++");

        Divider d = new Divider();
        d.setName("Циркуль");
        d.display();
        d.setDividerType("С карандашом");
        d.setMetal(true);
        System.out.println(d.getDividerType());
        System.out.println(d.isMetal());
        d.draw_circle();
    }
}
