package mypackage;

public class Honda extends Car {
    
    public Honda() {
        this.setMake("honda");
    }

    public void accelerate() {
        System.out.printf("Accelerating...");
    }

    //@Override
    public void stop(Integer count) {
        System.out.printf("Stopping...in %d seconds\n", count);
    }
}
