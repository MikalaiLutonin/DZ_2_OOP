// ======== Доработайте класс Car. 
//          В классе должна храниться следующая информация:
//          Свойство - которое говорит заведен авто или нет
//          Метод - запуска автомобиля
//          Метод - остановки автомобиля
//          Метод дороги - при вызове, в качестве аргумента передаем место назначения
//          И если авто заведён - выводим, что мы на такой-то авто едем место назначения
//          Если не заведён - сообщить, что авто не заведено. И мы не можем ехать


public class Program {
    public static void main(String[] args) {
        Car car_1 = new Car("Citroen", 1995, 10000, "White", 2000);   // создаем экземпляр класса
        Car car_2 = new Car("Nissan", 2020, 30000, "Red", 4000);   // создаем экземпляр класса
        car_1.getInfo();
        car_2.getInfo();
        car_1.start();
        car_2.start();
        car_1.road("на работу");
        car_2.road("за фруктами");
        car_1.stop();
        car_2.stop();
        car_2.start();
        car_2.road("домой");
        car_2.stop();
    }
}
