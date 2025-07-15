public class RectangleArea {
    int length = 38;
    int width = 29;
    int area = length * width;
    public static void main(String[] args) {
        RectangleArea rectAr = new RectangleArea();
        System.out.println("The Area of Rectangle is : " + rectAr.area);
    }


    //Without using object instantiation;]

    // static int length = 28;
    // static int width = 36;
    // public static void main(String[] args) {
    //     int area = length * width;
    //     System.out.println("The Area of Rectangle is : " + area);
    // }
}
