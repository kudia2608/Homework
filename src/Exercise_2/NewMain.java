package Exercise_2;

public class NewMain {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Крупская", "+375 29 3524154");
        phoneBook.add("Сидоров", "+375 29 6541232");
        phoneBook.add("Васютин", "+375 29 9632514");
        phoneBook.add("Ковалев", "+375 29 8745265");
        phoneBook.add("Бирилов", "+375 29 9874585");
        phoneBook.add("Крупская", "+375 29 9632514"); // Добавляем еще один номер для Крупская
        phoneBook.add("Сидоров", "+375 29 3524154"); // Добавляем еще один номер для Сидоров

        System.out.println("1. " + phoneBook.getFormattedNumbers("Крупская"));
        System.out.println("2. " + phoneBook.getFormattedNumbers("Сидоров"));
        System.out.println("3. " + phoneBook.getFormattedNumbers("Васютин"));
        System.out.println("4. " + phoneBook.getFormattedNumbers("Ковалев"));
        System.out.println("5. " + phoneBook.getFormattedNumbers("Бирилов"));
        System.out.println("6. " + phoneBook.getFormattedNumbers("Иванов")); // Для теста фамилии, которой нет
    }
}
