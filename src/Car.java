public class Car extends  Transport {

    public Car () {
        super(100);// для того, что бы код скампилировался, нужно создать в классе потомке коструктор

    }

    @Override
    public void transfer(String name, String from, String to) {
        System.out.println(name + " поплыл из " + from + " в " + to);
    }
}
