public class ExtendedGuestRecord extends GuestRecord {
    private String phoneNumber;
    private boolean isVIP;
    public ExtendedGuestRecord(String name, String address, double dailyRate, int duration, String phoneNumber, boolean isVIP) {
        super(name, address, dailyRate, duration);
        this.phoneNumber = phoneNumber;
        this.isVIP = isVIP;
    }
    @Override
    public void printGuestDetails() {
        super.printGuestDetails();
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("VIP: " + isVIP);
    }
}
