public class Person {
    private String fullName;
    private int age;

    public Person() {
        // Конструктор без параметрів
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.println(fullName + " рухається.");
    }

    public void talk() {
        System.out.println(fullName + " говорить.");
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setFullName("Taras");
        person1.setAge(18);
        person1.move();
        person1.talk();

        Person person2 = new Person("Yura", 19);
        person2.move();
        person2.talk();
    }
}
