public class Car extends Тransport{
    public Car (String modelName, int wheelsCount) {
        super(modelName, wheelsCount );
    }
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
