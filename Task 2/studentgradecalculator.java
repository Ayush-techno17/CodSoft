import java.util.Scanner;

public class gradecalculator {

    Scanner sc = new Scanner(System.in);

    public int[] input(int n)
    {
        int arr[] = new int[n];
        for (int i=0;i<n;i++)
        {
            System.out.println("Enter marks for subject "+(i+1));
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public int calculation(int n, int arr[])
    {
        int total=0;
        for (int i=0;i<n;i++)
        {
            total += arr[i];
        }
        return total;
    }

    public char grade(double avg)
    {
        char grade = ' ';
        if (avg>90 && avg<=100)
        grade = 'O';
        else if (avg>80 && avg<=90)
        grade = 'A';
        else if (avg>70 && avg<=80)
        grade = 'B';
        else if (avg>60 && avg<=70)
        grade = 'C';
        else if (avg>50 && avg<=60)
        grade = 'D';
        else if (avg>40 && avg<=50)
        grade = 'E';
        else if (avg>34 && avg<=40)
        grade = 'P';
        else
        grade = 'F';

        return grade;
    }

    public void display(String name,String roll,int marks[],int total,double avg,char grade)
    {
        System.out.println("\n\t\tREPORT CARD\n");
        System.out.println("Name : "+name+"\tRoll No. : "+roll);

        System.out.println("\nMarks of respective subjects -");
        for (int i=0;i<marks.length;i++)
        System.out.println("Subject "+(i+1)+" : "+marks[i]);

        System.out.println("\nTotal Marks : "+total+"\tAverage Percentage : "+avg);
        System.out.println("Grade : "+grade+"\n");
    }

    public static void main(String[] args) {
        
        gradecalculator ob = new gradecalculator();
        
        System.out.println("Enter the name of Student");
        String name = ob.sc.nextLine();
        System.out.println("Enter the roll no. of "+name);
        String roll = ob.sc.nextLine();

        System.out.println("Enter the no. of subjects");
        int n = ob.sc.nextInt();

        int marks[] = ob.input(n);
        int total = ob.calculation(n,marks);
        double avg = (double) total/n;
        char grade = ob.grade(avg);

        ob.display(name,roll,marks,total,avg,grade);
    }
}
