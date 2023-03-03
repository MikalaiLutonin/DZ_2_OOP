// ======== Доработайте класс Car. 
//          В классе должна храниться следующая информация:
//          Свойство - которое говорит заведен авто или нет
//          Метод - запуска автомобиля
//          Метод - остановки автомобиля
//          Метод дороги - при вызове, в качестве аргумента передаем место назначения
//          И если авто заведён - выводим, что мы на такой-то авто едем место назначения
//          Если не заведён - сообщить, что авто не заведено. И мы не можем ехать


class Car {

    // /** Создаем поля класса */  Могут иметь каждый свой модификатор доступа: public, protected, или private
    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
// =======================
    private int year;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
// ==========================
    private double price;
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
// ==========================
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
// ===========================
    private int power;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
// ===========================
    private boolean isEngine;

    public boolean isEngine() {
        return isEngine;
    }

    public void setEngine(boolean isEngine) {
        this.isEngine = isEngine;
    }
// ===========================







    /** Создаем конструктор */
    public Car(String model_x, int year_x, double price_x, String color_x, int power_x) {
        this.model = model_x; // с помощью this мы обращаемся к полям класса
        this.year = year_x;
        this.price = price_x;
        this.color = color_x;
        this.power = power_x;
        this.isEngine = false;
    }

    /** метод распечатки информации о машине */
    protected void getInfo() {
        System.out.println(getModel() + " " + getYear() + " " + getPrice() + " " + getColor() + " " + getPower());
    }

    // ** метод запуска автомобиля */
    public void start() {
        this.isEngine = true;
        System.out.println("Автомобиль " + this.model + " заведен");
    }

    // ** метод глушения автомобиля */
    public void stop() {
        this.isEngine = false;
        System.out.println("Автомобиль " + this.model + " заглушен");
    }

    // **Метод дороги - при вызове, в качестве аргумента передаем место назначения
    // */
    public void road(String place) {
        if (this.isEngine)
            System.out.println("Автомобиль " + this.model + " едет " + place);
        else
            System.out.println("Автомобиль " + this.model + " никуда не едет");
    }

}
