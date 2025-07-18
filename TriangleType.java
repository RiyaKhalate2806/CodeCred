public class TriangleType {
    public static void main(String[] args) {
        int a = 34;
        int b = 58;
        int c = 34;
        if(a==b && b==c && a==c){
            System.out.println("The Triangle is Equlateral triangle");
        }
        else if((a==b) || (a==c) || (b==c)){
            System.out.println("The Triangle is Isosceles trianle");
        }
        else{
            System.out.println("The Triangle is Scalene triangle");
        }
    }
}
