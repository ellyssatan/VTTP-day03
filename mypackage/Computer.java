package mypackage;

public class Computer implements Controllable {
    
    @Override
    public void start() {
        System.out.println("Starting computer");
    }

    @Override
    public void stop() {
        System.out.println("Stopping computer");
    }

}
