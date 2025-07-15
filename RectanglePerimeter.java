public class RectanglePerimeter {
    int length = 35;
    int width = 42;
    //int perimeter;
    int perimeter = 2*(length + width);
    public static void main(String[] args) {
        RectanglePerimeter rect = new RectanglePerimeter();
        System.out.println("The Perimeter of Rectangle is : " + rect.perimeter);
    }
}
