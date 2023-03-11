public class Truck extends Тransport {
    public Truck(String modelName, int wheelsCount) {

        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку у грузовой машины");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель у грузовой машины");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп у грузовой машины");
    }

}
