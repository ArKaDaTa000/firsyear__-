import java.util.*;
public class Activity_4


{
    public static void main(String[]args)
    {
    Scanner sc1 = new Scanner(System.in);
    String choices;

    System.out.println("THIS IS YOUR ACTIVITY 4");

    System.out.println("WOULD YOU LIKE TO PROCEED? PLEASE TYPE YES/NO");

    while(true)
    {
    choices = sc1.nextLine().toUpperCase(); 

    switch(choices)
     {
     case "YES": 

     System.out.println("WELL THEN, THIS QUESTION IS WORTH 85 PTS:");
     System.out.println("1. WHO FOUNDED THE JAVA PROGRAMMING LANGUAGE?");

     Scanner sc2 = new Scanner(System.in);

     String name1 = sc2.nextLine().toUpperCase();

     if(name1.equals("JAMES GOSLING"))
         {
    System.out.println("GOOD JOB!, THE NEXT QUESTION IS WORTH 95 PTS:");

    System.out.println("2. WHO WAS THE LEAD ARCHITECT, WHO HELPED DEVELOP C# PROGRAMMING LANGUAGE?");

    Scanner sc3 = new Scanner(System.in);

    String name2 = sc3.nextLine().toUpperCase(); 

            if(name2.equals("ANDERS HEJLSBERG"))
            {
            System.out.println("BRAVO! THE NEXT QUESTION IS WORTH 100PTS:");

            System.out.println("3. WHO CREATED THE PYTHON PROGRAMMING LANGUAGE?");

            Scanner sc4 = new Scanner(System.in);

            String name3 = sc4.nextLine().toUpperCase();

                if(name3.equals("GUIDO VAN ROSSUM"))
                {
                System.out.println("CONGRATULATIONS. YOU ARE GIVEN 100PTS.");
                System.exit(0);
                }
                else
                {
                System.out.println("SORRY. YOU ONLY ACCOMULATED 95 PTS.");
                System.exit(0);
                }
            }
            else
            {
            System.out.println("SORRY. YOU ONLY ACCOMULATED 85 PTS.");
            System.exit(0);
            }
        }
        else
        {
        System.out.println("SORRY. YOU ONLY ACCOMULATED 75 PTS.");
        System.exit(0);
        }
    return;
    case "NO":
    System.exit(0); 
    default:
    System.out.println("PLEASE FOLLOW THE INSTRUCTION, PLEASE TYPE YES/NO");
    break;
     }
    }
}
}
