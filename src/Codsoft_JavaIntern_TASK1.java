import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Codsoft_JavaIntern_TASK1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tries=25;

        int randomnumber = 1 + (int)(100
                * Math.random());

        System.out.println(
              randomnumber);

        int userguess;

        for(int i=1;i<=tries;i++) {
            System.out.println(
                    "attempt : "+i+"   Guess the number:");


            userguess = sc.nextInt();

            if (userguess == randomnumber) {
                System.out.println(
                        "\nguess is right , you guessed it in "+i+" attempts");
break;

            }

                else if(userguess<randomnumber)
                {
                    if((randomnumber-userguess)>30){
                    System.out.println(
                            "too low");}
               else     if((randomnumber-userguess)>10){
                        System.out.println(
                                "low");}
                }

            else if(userguess>randomnumber)
            {
                if((userguess-randomnumber)>30){
                    System.out.println(
                            "too high");}
             else   if((userguess-randomnumber)>10){
                    System.out.println(
                            "high");}
            }



        }




    }
}