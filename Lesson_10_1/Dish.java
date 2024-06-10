public class Dish {
    private int food;

    public Dish(int food) {
        this.food = Math.max(0, food);
    }

    public int getFood() {
        return food;
    }

    public void decreaseFood(int amount) {
        if (food >= amount) {
            food -= amount;
        } else {
            System.out.println("В миске недостаточно еды.");
        }
    }

    public void addFood(int amount) {
        food += amount;
    }
}
