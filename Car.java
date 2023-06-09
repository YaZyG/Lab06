public abstract class Car {
    private String model;
    private String color;
    private int maxSpeed;

    public Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
    public abstract void brake();
    public void gas() {
        System.out.println("Газуємо!");
    }
    public String getModel() {
        return model;
    }
    public String getColor() {
        return color;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }
}


