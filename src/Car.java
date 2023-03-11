public class Car extends Тransport {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку у автомобиля");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель у автомобиля");
    }
}
