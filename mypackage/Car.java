package mypackage;

// Class
public class Car implements Controllable {
    // Properties / members
    private String color;
    protected String make;
    private Integer engineCapacity;
	private Boolean started = false;  
    private long startedSince;
    //private long drivingDuration;

    // Default constructor
    public Car() {
        System.out.println("Instantiating Car object");
        this.color = "red";
    }
    public Car(Integer capacity) {
        this.engineCapacity = capacity;
    }
    
    // THIRD CAR
    public Car(String color, String make) {
        this.color = color;
        this.make = make;
    }

    public Car(Boolean started) {
        this.started = started;
    }

    // Methods that manipulate properties (getters & setters)
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public Integer getEngineCapacity() {
        return engineCapacity;
    }
    public void setEngineCapacity(Integer engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public Boolean isStarted() {
        return started;
    }
    public void setStarted(Boolean start) {
        this.started = start;
    }

    public long getDrivingDuration() {
        if (this.isStarted()) {
            // convert to ms
           return (System.currentTimeMillis() - this.startedSince) / 1000;
        } return (long)-1;
    }
    
    // Behaviour - methods
    public void start() {
        if (this.started) {
            System.out.println("Your car is running");
        } else {
            System.out.println("Vroom...");
            this.started = true;
            // Since 0000 Jan 1 1970
            this.startedSince = System.currentTimeMillis();
        }
    }

    public void stop() {
        if (!this.started) {
            System.out.println("Your car is not running");
        } else {
            System.out.println("gg.com...");
            this.started = false;
        }
    }
}
