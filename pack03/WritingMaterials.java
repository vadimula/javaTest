package pack03;
public class WritingMaterials { // -- Класс "Пишущие принадлежности --
    // -- Параметры --
    String name; // название предмета (String)
    String color; // цвет, которым он пишет (String).
    int price; // его цена (int)
    double length; // его длина (double)
    boolean draw; //  ответ на вопрос, умеет ли эта письменная принадлежность писать? (boolean)
    // -- Методы --
    public void display() { // выводит информацию о предмете
        System.out.printf("Название: %s, Цвет: %s, Длина: %s, Цена: %s, Умеет рисовать: %s.\n", name, color, length, price, (draw)? "Да": "Нет");
    }
    public void replace_rod(String _color) { // принимает новый цвет стержня
        this.color = _color;
    }
    public void priceUp(int _up) { //- принимает на вход изменение цены. Увеличивает цену на это число.
        if (_up > 0) this.price += _up;
        else System.out.println("Некорректные данные!!!");
    }
    public void priceDown(int _down) { //- принимает на вход изменение цены. Уменьшает цену на это число.
        if (_down > 0 & _down <= price) this.price -= _down;
        else System.out.println("Некорректные данные!!!");
    }
    public void draw() { //- Если предмет умеет рисовать, то выводит на экран фразу
        if (draw) System.out.printf("%s провёл линию. Её цвет - %s.\n", name, color);
        else System.out.printf("%s не может ничего нарисовать.", name);
    }
    public void draw(int n) {
        if (draw) System.out.printf("%s провёл линий: %s. Её цвет - %s.\n", name, n, color);
        else System.out.printf("%s не может ничего нарисовать.", name);
    }
    public void draw(String colour) {
        if (draw) System.out.printf("%s провёл линий: 1. Её цвет - %s.\n", name, colour);
        else System.out.printf("%s не может ничего нарисовать.", name);
    }
    public void draw(String clr, int n) {
        if (draw) System.out.printf("%s провёл линий: %s. Её цвет - %s.\n", name, n, clr);
        else System.out.printf("%s не может ничего нарисовать.", name);
    }
    // -- Конструкторы --
    public WritingMaterials() {
        this.name = "No Name";
        this.color = "No Color";
        this.price = 0;
        this.length = 0.0;
        this.draw = true;
    }
    public WritingMaterials (String _name, String _color) {
        this.name = _name;
        this.color = _color;
    }
    public WritingMaterials (String _name, int _price) {
        this.name = _name;
        this.color = "No Color";
        this.price = _price;
    }
    public WritingMaterials (int _price, double _lenght, boolean _drow) {
        this.name = "No Name";
        this.color = "No Color";
        this.price = _price;
        this.length = _lenght;
        this.draw = _drow;
    }
    public WritingMaterials (String _name, String _color, int _price, double _lenght, boolean _drow) {
        this.name = _name;
        this.color = _color;
        this.price = _price;
        this.length = _lenght;
        this.draw = _drow;
    }
    // -- Геттеры --
    public String getName(){
        return this.name;
    }
    public String getColor(){
        return this.color;
    }
    public int getPrice(){
        return this.price;
    }
    public double getLength(){
        return this.length;
    }
    public boolean isDraw(){
        return this.draw;
    }
    // -- Сеттеры --
    public void setName(String _name){
        this.name = _name;
    }
    public void setColor(String _color){
        this.color = _color;
    }
    public void setPrice(int _price){
        this.price = _price;
    }
    public void setLength(double _lenght){
        this.length = _lenght;
    }
    public void setDraw(boolean _drow){
        this.draw = _drow;
    }
}