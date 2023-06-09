public class Main {
    public static void main(String[] args) {
        // Запуск класу Person
        System.out.println("Task1");
        Person person1 = new Person();
        person1.setFullName("Taras");
        person1.setAge(17);
        person1.move();
        person1.talk();
        Person person2 = new Person("Yura", 19);
        person2.move();
        person2.talk();

        System.out.println();
        System.out.println("____________________________________-");
        System.out.println("____________________________________-");
        System.out.println("Task2");

        // Запуск класу Phone
        Phone phone1 = new Phone("0933408258", "Samsung", 0.4);
        Phone phone2 = new Phone("0506752929", "iPhone", 0.3);
        Phone phone3 = new Phone("0672725453", "Motorola", 0.7);
        System.out.println("____________________________________-");
        System.out.println("Phone 1:");
        System.out.println("Number: " + phone1.getNumber());
        System.out.println("Model: " + phone1.getModel());
        System.out.println("Weight: " + phone1.getWeight());
        System.out.println("____________________________________-");
        System.out.println("\nPhone 2:");
        System.out.println("Number: " + phone2.getNumber());
        System.out.println("Model: " + phone2.getModel());
        System.out.println("Weight: " + phone2.getWeight());
        System.out.println("____________________________________-");
        System.out.println("\nPhone 3:");
        System.out.println("Number: " + phone3.getNumber());
        System.out.println("Model: " + phone3.getModel());
        System.out.println("Weight: " + phone3.getWeight());
        System.out.println("____________________________________-");
        phone1.receiveCall("Taras");
        phone2.receiveCall("Yura");
        System.out.println("____________________________________-");
        phone1.sendMessage("0933408258", "0506752929");
        phone2.sendMessage("0506752929", "0672725453");
        phone3.sendMessage("0672725453", "0933408258");
        System.out.println("Task3");
        Cylinder cylinder = new Cylinder();
        cylinder.setVolume(100.0);
        cylinder.setRadius(7.0);
        cylinder.setHeight(15.0);
        System.out.println("Cylinder Volume: " + cylinder.getVolume());
        System.out.println("Cylinder Radius: " + cylinder.getRadius());
        System.out.println("Cylinder Height: " + cylinder.getHeight());
        System.out.println("____________________________________-");
        // Запуск класу Ball
        Ball ball = new Ball();
        ball.setVolume(50.0);
        ball.setRadius(5.0);
        System.out.println("Ball Volume: " + ball.getVolume());
        System.out.println("Ball Radius: " + ball.getRadius());
        System.out.println("____________________________________-");
        // Запуск класу Pyramid
        Pyramid pyramid = new Pyramid();
        pyramid.setVolume(200.0);
        pyramid.setS(50.0);
        pyramid.setH(10.0);
        System.out.println("Pyramid Volume: " + pyramid.getVolume());
        System.out.println("Pyramid S: " + pyramid.getS());
        System.out.println("Pyramid H: " + pyramid.getH());
        System.out.println("____________________________________-");
        System.out.println("____________________________________-");
        System.out.println("Task4");
        Sedan sedan = new Sedan("Honda Civic", "Червоний", 200);
        sedan.gas();
        sedan.brake();
        System.out.println("Модель: " + sedan.getModel());
        System.out.println("Колір: " + sedan.getColor());
        System.out.println("Максимальна швидкість: " + sedan.getMaxSpeed());
        System.out.println();
        Truck truck = new Truck("Volvo FH", "Сірий", 120);
        truck.gas();
        truck.brake();
        System.out.println("Модель: " + truck.getModel());
        System.out.println("Колір: " + truck.getColor());
        System.out.println("Максимальна швидкість: " + truck.getMaxSpeed());
        System.out.println("____________________________________-");
        System.out.println("____________________________________-");
        System.out.println("Task5");
        ExtendedGuestRecord guest1 = new ExtendedGuestRecord("Цимбалюк", "123ф", 120.0, 2, "555-5678", false);
        guest1.displayData();
        double totalCost1 = guest1.calculateTotalCost();
        System.out.println("Загальна вартість проживання: " + totalCost1);
        System.out.println("____________________________________-");
        ExtendedGuestRecord guest2 = new ExtendedGuestRecord("Іващенко", "123б", 100.0, 5, "555-9012", true);
        guest2.displayData();
        double totalCost2 = guest2.calculateTotalCost();
        System.out.println("Загальна вартість проживання: " + totalCost2);
        System.out.println("____________________________________-");
        System.out.println("____________________________________-");
        System.out.println("Task6");
        guest1.printGuestDetails();
        System.out.println("Загальна вартість проживання: $" + totalCost1);
        guest2.printGuestDetails();
        System.out.println("Загальна вартість проживання: $" + totalCost2);
    }
}

