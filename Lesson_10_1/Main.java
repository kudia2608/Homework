public class Main {
    public static void main(String[] args) {
        Cat[] cats = {new Cat("Djek"), new Cat("London"), new Cat("Djesi")};
        Dish dish = new Dish(30);

        for (Cat cat : cats) {
            cat.eat(dish);
        }

        for (Cat cat : cats) {
            System.out.println(cat.name + " сытость: " + cat.isSatiety());
        }

        Dog dog = new Dog("Baks");

        dog.run(150);
        dog.run(501);
        dog.swim(5);
        dog.swim(15);

        cats[0].run(150);
        cats[0].run(201);
        cats[0].swim(5);

        System.out.println("Всего животных: " + Animal.getTotalAnimals());
        System.out.println("Всего собак: " + Dog.getTotalDogs());
        System.out.println("Всего котов: " + Cat.getTotalCats());
    }
}
