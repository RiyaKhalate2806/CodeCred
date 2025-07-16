public class GreaterNumBetweenThreeNum{
    public static void main(String[] args) {
        int a = 39;
        int b = 48;
        int c = 58;
        if(a>b && a>c){
            System.out.println("The greater number between " + a + " " + b + " " + " and " + c + " is " + a);
        }
        else if(c>a && c>b){
            System.out.println("The greater number between " + a + " " + b + " " + " and " + c + " is " + c);
        }
        else{
            System.out.println("The greater number between " + a + " " + b + " " + " and " + c + " is " + b);
        }
    }
}