import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Codsoft_JavaIntern_TASK1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int randomnumber = 1 + (int)(100
                * Math.random());

        int userguess;

        System.out.println(
                "Guess the number:");


        userguess = sc.nextInt();

        if(userguess==randomnumber)
        {
            System.out.println(
                    "guess is right");

        }

        else
            System.out.println(
                    "wrong guess");







    }
}