public abstract class GuestRecord {
    private String name;
    private String address;
    private double pricePerNight;
    private int stayDuration;
    public GuestRecord(String name, String address, double pricePerNight, int stayDuration) {
        this.name = name;
        this.address = address;
        this.pricePerNight = pricePerNight;
        this.stayDuration = stayDuration;
    }
    public void enterData(String name, String address, double pricePerNight, int stayDuration) {
        this.name = name;
        this.address = address;
        this.pricePerNight = pricePerNight;
        this.stayDuration = stayDuration;
    }
    public void displayData() {
        System.out.println("Ім'я: " + name);
        System.out.println("Адреса: " + address);
        System.out.println("Ціна проживання на добу: " + pricePerNight);
        System.out.println("Термін проживання: " + stayDuration + " днів");
    }
    public double calculateTotalCost() {
        return pricePerNight * stayDuration;
    }

    public void printGuestDetails() {
    }
}
