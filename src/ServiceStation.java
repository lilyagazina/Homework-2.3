

public class ServiceStation {

    private void checkTransport(Тransport transport) {
        if (transport != null) {
            System.out.println("Обслуживаем " + transport.getModelName());
            for (int i = 0; i < transport.getWheelsCount(); i++) {
                transport.updateTyre();
            }
        }
    }

    public void check(Car car) {
        checkTransport(car);
        car.checkEngine();
    }

    public void check(Truck truck) {
        checkTransport(truck);
        truck.checkTrailer();
        truck.checkEngine();
    }

    public void check(Bicycle bicycle) {
        checkTransport(bicycle);
    }

}
