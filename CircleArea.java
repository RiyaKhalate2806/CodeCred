public class CircleArea {
    int radius = 14;

    int diameter = 2 * radius;
    double getArea = (Math.PI * radius * radius);
    int area = (int)Math.PI * radius * radius;  // Used type casting to double to int

    public static void main(String[] args) {
        CircleArea cirArea = new CircleArea();
        System.out.println("The Diameter of Circle is : " + cirArea.diameter);
        System.out.println("The Area of circle(point value) is : " + cirArea.getArea);
        System.out.println("The Area of Circle is : " + cirArea.area);
    }
}
