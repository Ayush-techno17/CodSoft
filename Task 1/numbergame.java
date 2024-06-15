package CodSoft.Task1;

import java.util.Scanner;

public class numbergame {
    Scanner sc = new Scanner(System.in);
    
    // Types of Game
    public int options()
    {
        System.out.println("Enter you choice - \n1 - Unlimited Attempts Game \n2 - Fixed No. of Attempts Game");
        int opt = sc.nextInt();
        return opt;
    }

    //Function Generating a Random Number b/w 1 to 100
    public int random()
    {
        int n = (int) (Math.random()*100)+1;
        return n;
    }

    //Function for Unlimited Attempts Game
    public void guessunlim(int n)
    {
        System.out.println("Guess the number");
        //Taking user's input
        int guess = sc.nextInt();
        int i = 0;
        while(guess!=n)
        {
            i++;

            //Comparing the user input with random number
            if (guess>n)
            System.out.println("Too High\n");
            else
            System.out.println("Too Low\n");

            System.out.println("Guess the number");
            guess = sc.nextInt();
        }
        System.out.println("Correct");

        //Calculating the score of player
        int score = 100 - i*5;
        if(score<0)
        {
            System.out.println("Score : "+0);
            System.out.println("Sorry! You took more than 20 attempts");
        }
        else
        System.out.println("Score : "+score);

        //Giving option to replay
        System.out.println("\nWish to play again?? Enter Yes");
        char ans = sc.next().charAt(0);

        if (ans=='y' || ans=='Y')
        guessunlim(random());
            
    }

    //Function for Limited Attempts Game
    public void guesslim(int n)
    {
        System.out.println("You have only 5 chances");
        int rounds = 5,i=0; boolean f = false;
        while(rounds-->0)
        {
            System.out.println("Guess the number");
            //Taking user's input
            int guess = sc.nextInt();

            i++;

            //Comparing the user input with random number
            if (guess==n)
            {
                System.out.println("Correct");
                f = true;
                break;
            }
            else if (guess>n)
            System.out.println("Too High\n");
            else
            System.out.println("Too Low\n");

            
        }

        //Calculating the score of player
        int score = 120 - i*20;
        if(!f)
        {
            System.out.println("Score : "+0);
            System.out.println("The random no. was : "+n);
        }
        else
        System.out.println("Score : "+score);

        //Giving Option to replay
        System.out.println("\nWish to play again?? Enter yes");
        char ans = sc.next().charAt(0);

        if (ans=='y' || ans=='Y')
        guesslim(random());
        
    }
    public static void main(String[] args) {
        
        numbergame ob = new numbergame();

        System.out.println("Welcome to Guess the Number Game !!\n");
        //Function returning a randomly generated no.
        int n = ob.random();

        //Choosing the type of game to play
        switch(ob.options())
        {
            case 1:
                ob.guessunlim(n);
                break;
            case 2:
                ob.guesslim(n);
                break;
            default :
                System.out.println("Wrong Choice");
        }
        
    }

}
