import java.util.Scanner;

public class square {
    public static void main(String[] args){
        int userInput;
         int square;
        System.out.println("Enter a Number: ");
        Scanner input = new Scanner(System.in);
        userInput = input.nextInt();
        for (int a = 1; a <= userInput; a++) {

            square = a*a;
            System.out.println(a +"   "+ square);
        }

    }
}
