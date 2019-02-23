package com.company;

public class Main {

    public static void main(String[] args) {
      /*  int mile = 5;
        double kg = mile * 1.609344d;
        System.out.println("Kg is  = " + kg);
        kg--;
        System.out.println(kg);

      */
      int highscore = calculate(true, 800, 5, 200);

        System.out.println(highscore);

      highscore = calculate(true,1000,8,500);

        System.out.println(highscore);

       int display = highscore(1000);
       position("montu", display);
       display = highscore(450);
       position("Jay", display);



    }

    public static int calculate(boolean gameover, int score, int levelcompleted, int bonus)
    {
        if(gameover)
        {

            int finalscore = score + (levelcompleted * bonus);
            return finalscore;

        }
        return -1;
    }

    public static void position(String name, int postion)
    {
        System.out.println(name + " manage to get a " + postion +  " postion ");
    }

    public static int highscore(int score)
    {
       /* if(score >= 1000)
        {
            return 1;
        }

        else if(score >= 500)
        {

            return 2;
        }

        else if (score >= 100)
        {

            return 3;

        }

        else
        {

            return 4;
        }
*/

       int position = 4;
       if (score>=1000)
       {
           position = 1;
       }
       else if (score >= 500)
       {
           position = 2;

       }
       else if (score >= 100)
       {
           position = 3;
       }
       return position;
    }
}
