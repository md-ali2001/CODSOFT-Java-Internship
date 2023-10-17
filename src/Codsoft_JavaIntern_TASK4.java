import java.util.Arrays;
import java.util.Scanner;

public class Codsoft_JavaIntern_TASK4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double score=0.0;
        int[] chosenanswers = new int[20];

        String[] questions = {"Q1-When Pakistan came into being", "Q2-When PCT won ICC Cricket W" +
                "orldcup","Q3-In Physics,how many laws of motion are there"};
        String[] choices = {"1-1947\t2-1940\t3-1957", "1-1999\t2-1975\t3-1992"
        ,"1-6\t2-7\t3-3\t5"};
        int[] correctanswers={1,3,3};



    for(int i=0;i<choices.length;i++)
    {
        System.out.println(questions[i]);
        System.out.println(choices[i]);
       chosenanswers[i]=sc.nextInt();
       if(chosenanswers[i]==correctanswers[i])
       {
           score++;
       }


    }

    for(int i=0;i< choices.length;i++)
    {
        if(chosenanswers[i]==correctanswers[i])
        {
            System.out.println("QUESTION "+i+1+" ✓");

        }
        else
            System.out.println("QUESTION "+i+1+" x");
    }

    System.out.println("USER SCORE : "+score+"/"+choices.length);
        System.out.println("PERCENTAGE : "+(score/choices.length)*100);






}}
