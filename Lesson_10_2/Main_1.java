public class Main {
    public static void main(String[] args) {
        Calculation circle = new Circle(5, "красный", "черный");
        Calculation rectangle = new Rectangle(4, 7, "зеленый", "синий");
        Calculation triangle = new Triangle(3, 4, 5, "желтый", "фиолетовый");

        System.out.println("Круг:");
        circle.printCharacteristics();

        System.out.println("\nПрямоугольник:");
        rectangle.printCharacteristics();

        System.out.println("\nТреугольник:");
        triangle.printCharacteristics();
    }
}
