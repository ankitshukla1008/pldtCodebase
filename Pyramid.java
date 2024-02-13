import java.util.Scanner;

class Pyramid {

	public static void main(String[] args) {
    pyramid();
    System.out.println();
    halfpyramid();
    System.out.println();
    diamond(7);		
		
	}

	private static void diamond(int rows) {
		int r=rows;
		int st=1, s=r-1;
		for(int i=1; i<=r; i++)
		{
			for(int j=1; j<=s; j++)
			{
			System.out.print(" ");
			}
			
			for(int k=1; k<=st; k++)
			{
				System.out.print("*");
			}
			st=st+2;
			System.out.println();
			s--;
		}
		
		st=st-4;
		r=r-1;
		s=1;
		for(int i=1; i<=r; i++)
		{
			for(int j=1; j<=s; j++)
			{
			System.out.print(" ");
			}
			for(int k=1; k<=st; k++)
			{
				System.out.print("*");
			}	
			st=st-2;
			System.out.println();
			s++;
		}
	}

	private static void halfpyramid() {
		int r=5;
		int st=1, s=r-1;
		for(int i=1; i<=r; i++)
		{
			for(int j=1; j<=s; j++)
			{
			System.out.print(" ");
			}
			
			for(int k=1; k<=st; k++)
			{
				System.out.print("*");
			}
			st=st+1;
			System.out.println();
			s--;
		}
	}

	private static void pyramid() {
		int r=5;
		int st=1, s=r-1;
		for(int i=1; i<=r; i++)
		{
			for(int j=1; j<=s; j++)
			{
			System.out.print(" ");
			}
			
			for(int k=1; k<=st; k++)
			{
				System.out.print("*");
			}
			st=st+2;
			System.out.println();
			s--;
		}
	}
	
}