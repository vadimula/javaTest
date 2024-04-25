package pack02;
public class Animals {
    // data fields
    static String name = "No Name";
    static String type = "Unknown Type";
    static String description = "Здесь находится описание класса AnimalS";
    static int counter = 0;
    int age, id;
    Double weigth;
    boolean isFly, isWalk, isSwim;
    // class methods
    static public void showDescription() {
        System.out.println(description);
    }
    public void display() {
        System.out.printf("Тип: %s, Имя: %s, Возраст: %s, Вес: %s, " +
                "Умеет летать: %s, Умеет ходить: %s, Умеет плавать: " +
                "%s.\n", type, name, age, weigth, isFly, (isWalk)? "Да": "Нет", (isSwim)? "Да": "Нет");
    }
    public void rename(String newName) { name = newName; }
    public void holiday() { System.out.println("It was a blue day... :("); }
    public void holiday(int day) {
        if (day < 0) System.out.println("Invalid data");
        this.weigth += weigth * 0.1 * day;
    }
    public void holiday(double m) {
        if (m < 0) System.out.println("Invalid data");
        this.weigth += m;
    }
    public void holiday(double m, int n) {
        if (m < 0 | n < 0) System.out.println("Invalid data");
        this.weigth += m * n;
    }
    // class construtors
    public Animals() { this.id = counter++; }
    public Animals(String _type, String _name) {
        type = _type;
        name = _name;
        this.id = ++counter;
    }
    public Animals(String _type, int _age) {
        type = _type;
        this.age = _age;
        this.id = ++counter;
    }
    public Animals(String _type, String _name, int age, double weigth, boolean isFly, boolean isWalk, boolean isSwim) {
        type = _type;
        name = _name;
        this.age = age;
        this.weigth = weigth;
        this.isSwim = isSwim;
        this.isWalk = isWalk;
        this.isFly = isFly;
        this.id = counter++;
    }
    // setters & getters
    public void setName(String _name){ name = _name; }
    public void setType(String _type){ type = _type; }
    public void setAge(int age){ this.age = age; }
    public void setWeight(double weight){ this.weigth = weight; }
    public void setFly(boolean isFly){ this.isFly = isFly; }
    public void setWalk(boolean isWalk){ this.isWalk = isWalk; }
    public void setSwim(boolean isSwim){ this.isSwim = isSwim; }
    public int getAge() { return age; }
    public double getWeigth(){ return weigth; }
    public String getName() { return name; }
    public String getType() { return type; }
    public boolean isFly() { return isFly; }
    public boolean isWalk() { return isWalk; }
    public boolean isSwim() { return isSwim; }
}