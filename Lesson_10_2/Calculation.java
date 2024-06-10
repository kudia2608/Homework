interface Calculation {
    double perimeter();
    double area();
    String getFillColor();
    String getBorderColor();


    default void printCharacteristics() {
        System.out.println("Периметр: " + perimeter());
        System.out.println("Площадь: " + area());
        System.out.println("Цвет заливки: " + getFillColor());
        System.out.println("Цвет границы: " + getBorderColor());
    }
}
