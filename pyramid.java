//Print a pyramid structure
import java.util.Scanner;
class Pyramid 
 {
    void pyramidPrint(int rows)
      {
        int space=rows-1,star=1;
        for(int i=1; i<=rows; i++)
          {
            for(int j=1; j<=space; j++)
              {
                System.out.print(" ");
              }
            for(int k=1; k<=star; k++)
             {
                System.out.print("*");
             }
             System.out.println();
             star+=2;
             space--;
          }
      }
    public static void main(String args[])
      {
        System.out.print("Enter the number of rows= ");
        Scanner scan=new Scanner(System.in);
        int rows=scan.nextInt();
        Pyramid obj=new Pyramid();
        obj.pyramidPrint(rows);
      }
 }