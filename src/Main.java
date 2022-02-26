public class Main {

    public static void main(String[] args) {
        String name= " Petya";
	Car car = new Car();
    car.transfer( name, " SPB", " MSC"); // метода transfer, который выводит нам наш запрос в классе Car нет, но он есть в наследнике Transport

    Ship ship = new Ship();
    spbToMoscow(name,ship);// вызываем код из public static void  spbToMoscow ( name,ship)  пишем ship, потомучто ячейка transport есть и в Car и в ship

    Plane plane=new Plane();
    spbToMoscow(name,plane);



    }
    public static void  spbToMoscow (String name, Transport transport) {
        transport.transfer(name, " SPB", " MSC");
    }
}
