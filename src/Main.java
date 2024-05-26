//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        // 1
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Zaharov Vasilia", "Director", "vasiliy.zaharov@gmail.com", "+375296052514", 1000, 42);
        persArray[1] = new Person("Vasutkin Igar", "Deputy director", "igar.vasutkin@gmail.com", "+375296032513", 900, 40);
        persArray[2] = new Person("Petrova Anastasia", "Teller", "a.petrova@gmail.com", "+375298524653", 500, 20);
        persArray[3] = new Person("Koladina Maria", "specialist", "m.koladina@gmail.com", "+375296541232", 400, 35);
        persArray[4] = new Person("Markova Ganna", "Cleaning woman", "g.markova@gmail.com", "+375296458596", 300, 54);

        for (Person person : persArray) {
            person.printInfo();
            System.out.println();
        }

        // 2
        Park park = new Park();

        Park.Attraction airRacing = park.new Attraction("Air Racing", "9:00 - 21:00", 5);
        Park.Attraction flyingElephant = park.new Attraction("Flying Elephant", "09:00 - 20:00", 4);
        Park.Attraction waltz = park.new Attraction("Waltz", "10:00 - 21:00", 3);
        Park.Attraction zodiak = park.new Attraction("Zodiak", "10:00 - 20:00", 6);
        Park.Attraction miks = park.new Attraction("Miks", "11:00 - 21:00", 7);


        airRacing.printInfo();
        System.out.println();
        flyingElephant.printInfo();
        System.out.println();
        waltz.printInfo();
        System.out.println();
        zodiak.printInfo();
        System.out.println();
        miks.printInfo();

    }

    static class Person {
        private String fullName;
        private String position;
        private String email;
        private String phone;
        private int salary;
        private int age;


        public Person(String fullName, String position, String email, String phone, int salary, int age) {
            this.fullName = fullName;
            this.position = position;
            this.email = email;
            this.phone = phone;
            this.salary = salary;
            this.age = age;
        }


        public void printInfo() {
            System.out.println("Full Name: " + fullName);
            System.out.println("Position: " + position);
            System.out.println("Email: " + email);
            System.out.println("Phone: " + phone);
            System.out.println("Salary: " + salary);
            System.out.println("Age: " + age);
        }
    }

    static class Park {
        public class Attraction {
            private String name;
            private String workingHours;
            private int cost;

            public Attraction(String name, String workingHours, int cost) {
                this.name = name;
                this.workingHours = workingHours;
                this.cost = cost;
            }

            public void printInfo() {
                System.out.println("Attraction Name: " + name);
                System.out.println("Working Hours: " + workingHours);
                System.out.println("Cost: " + cost);
            }
        }
    }
}
