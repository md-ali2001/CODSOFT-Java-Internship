import java.util.Scanner;

public class Codsoft_JavaIntern_TASK2 {

    int subjects;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int subjects;
        System.out.println("Enter number of subjects");
        subjects = sc.nextInt();
        int totalmarks=subjects*100;
        int marksobtained=0;
        int subjectmarks;
        String grade;

        for(int i=1;i<=subjects;i++)
        {
            System.out.println("Enter marks of subject : "+i);
            subjectmarks = sc.nextInt();
            marksobtained=marksobtained+subjectmarks;



        }

        double percentage= (double) (marksobtained * 100) /totalmarks;
        if(percentage>=80)
         grade="A+";
        else if(percentage>=70)
            grade="A";
        else if(percentage>=60)
            grade="B";
        else if(percentage>=50)
            grade="D";
        else
            grade="FAIL";




        System.out.println("\n***RESULT DETAILS***\n");
        System.out.println("TOTAL SUBJECTS : "+subjects);
        System.out.println("TOTAL MARKS : "+totalmarks);
        System.out.println("OBTAINED MARKS : "+marksobtained);
        System.out.println("PERCENTAGE : "+percentage);
        System.out.println("GRADE : "+grade);




    }
}
