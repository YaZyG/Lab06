public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
        // Конструктор без параметрів
    }

    public void receiveCall(String callerName) {
        System.out.println("Дзвонить " + callerName);
    }

    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }

    public void sendMessage(String... phoneNumbers) {
        System.out.println("Номери для надсилання повідомлення:");
        for (String number : phoneNumbers) {
            System.out.println(number);
        }
        System.out.println("Повідомлення надіслано.");
    }


    public static void main(String[] args) {
        Phone phone1 = new Phone("0933408258", "Samsung", 0.4);
        Phone phone2 = new Phone("0506752929", "iPhone", 0.3);
        Phone phone3 = new Phone();

        System.out.println("Phone 1:");
        System.out.println("Number: " + phone1.getNumber());
        System.out.println("Model: " + phone1.getModel());
        System.out.println("Weight: " + phone1.getWeight());

        System.out.println("\nPhone 2:");
        System.out.println("Number: " + phone2.getNumber());
        System.out.println("Model: " + phone2.getModel());
        System.out.println("Weight: " + phone2.getWeight());

        System.out.println("\nPhone 3:");
        System.out.println("Number: " + phone3.getNumber());
        System.out.println("Model: " + phone3.getModel());
        System.out.println("Weight: " + phone3.getWeight());

        phone1.receiveCall("Taras");
        phone2.receiveCall("Yura");

        phone1.sendMessage("111111111", "222222222");
        phone2.sendMessage("333333333", "444444444");
        phone3.sendMessage("555555555");
    }
}
