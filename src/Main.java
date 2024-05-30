public class Main {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Zaharov Vasilia", "Director", "vasiliy.zaharov@gmail.com", "+375296052514", 1000, 42);
        persArray[1] = new Person("Vasutkin Igar", "Deputy director", "igar.vasutkin@gmail.com", "+375296032513", 900, 40);
        persArray[2] = new Person("Petrova Anastasia", "Teller", "a.petrova@gmail.com", "+375298524653", 500, 20);
        persArray[3] = new Person("Koladina Maria", "Specialist", "m.koladina@gmail.com", "+375296541232", 400, 35);
        persArray[4] = new Person("Markova Ganna", "Cleaning woman", "g.markova@gmail.com", "+375296458596", 300, 54);

        for (Person person : persArray) {
            person.printInfo();
            System.out.println();
        }

        Park park = new Park(5);

        park.addAttraction("Air Racing", "9:00 - 21:00", 5);
        park.addAttraction("Flying Elephant", "09:00 - 20:00", 4);
        park.addAttraction("Waltz", "10:00 - 21:00", 3);
        park.addAttraction("Zodiak", "10:00 - 20:00", 6);
        park.addAttraction("Miks", "11:00 - 21:00", 7);


        // добавление 6 аттракциона
        park.addAttraction("Roller Coaster", "11:00 - 22:00", 8);

        System.out.println("Attractions in the park:");
        park.listAttractions();
    }
}
