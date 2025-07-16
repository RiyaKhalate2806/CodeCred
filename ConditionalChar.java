public class ConditionalChar {
    public static void main(String[] args) {
        char ch = 'T';
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')){
            System.out.println("This is a character");
        }
        else{
            System.out.println("This is not a character");
        }
    }
}
