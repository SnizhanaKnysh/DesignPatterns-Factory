package app;

public class Client {

    public void run(){
        CarFactory carFactory = new CarFactory();
        PlaneFactory planeFactory = new PlaneFactory();
        carFactory.createTransport().move();
        planeFactory.createTransport().move();
    }

}
