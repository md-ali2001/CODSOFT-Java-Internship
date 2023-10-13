import java.util.Arrays;
import java.util.Scanner;

public class Codsoft_JavaIntern_TASK4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] chosenanswers = new int[20];

        String[] questions = {"Q1-When Pakistan came into being", "Q2-When PCT won ICC Cricket W" +
                "orldcup"};
        String[] choices = {"1-1947\t2-1940\t3-1957", "1-1999\t2-1975\t3-1992"};



    for(int i=0;i<2;i++)
    {
        System.out.println(questions[i]);
        System.out.println(choices[i]);
       chosenanswers[i]=sc.nextInt();

    }



}}
