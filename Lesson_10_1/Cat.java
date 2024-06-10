public class Cat extends Animal {
    private static int totalCats = 0;
    private static final int MAX_RUN_DISTANCE = 200;
    private boolean satiety;

    public Cat(String name) {
        super(name);
        this.satiety = false;
        totalCats++;
    }

    @Override
    public void run(int distance) {
        if (distance <= MAX_RUN_DISTANCE) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }

    public void eat(Dish dish) {
        if (dish.getFood() >= 10) {
            dish.decreaseFood(10);
            this.satiety = true;
            System.out.println(name + " покушал.");
        } else {
            System.out.println(name + " не хватило еды.");
        }
    }

    public boolean isSatiety() {
        return satiety;
    }

    public static int getTotalCats() {
        return totalCats;
    }
}
