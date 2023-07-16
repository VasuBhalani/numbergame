import java.util.Scanner;
import java.util.Random;
 class  Ex{
    int c,you;
    public Ex(int r)
    {
       c=r;
    }
    boolean  takeUserInput(int u)
    {
       you=u;
        return you <= 100 && you >= 0;
    }
    boolean check() {
        if(you>c)
        {
            System.out.println("you are greater");
            return false;
        }else if(you<c)
        {

            System.out.println("you are lesser");
            return false;
        }
        else {
            return true;
        }
    }

    public static void main(String[] args) {
      Random r=new Random();
      Scanner  sc=new Scanner(System.in);
      int n=r.nextInt(100);
      Ex obj=new Ex(n);
        System.out.print("Guess the number between 0 to 100 :");
      boolean b=obj.takeUserInput(sc.nextInt());
      while(!b) {
          System.out.print("Guess valid number between 0 to 100:");
          b=obj.takeUserInput(sc.nextInt());
      }
      int score=1;
      while(!obj.check())
      {
          System.out.print("Guess  number : ");
          obj.takeUserInput(sc.nextInt());
          score++;
      }
        System.out.println("your score is "+ score);
       // System.out.println("computer input is :"+n);
        sc.close();
    }
        }
