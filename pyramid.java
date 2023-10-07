import java.util.Scanner;
class Pyramid
 {
    void pyramidPrint(int rows)
      {
        int spaces=rows-1, stars=1;
        for(int i=1; i<=rows; i++)
           {
            for(int j=1; j<=spaces; j++)
              {
                System.out.print(" ");
              }
            for(int k=1; k<=stars; k++)
              {
                System.out.print("*");
              }
             System.out.println();
             spaces--;
             stars+=2;
           }
      }
 public static void main(String args[])
    {
       System.out.print("Enter number of rows= ");
       Scanner scan=new Scanner(System.in);
       int R=scan.nextInt();
       Pyramid obj=new Pyramid();
       obj.pyramidPrint(R);
    }
 }