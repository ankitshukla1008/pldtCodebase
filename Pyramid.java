import java.util.Scanner;
class Pyramid {
    public static void main(String[] args) {
        pyramid();  // Call the pyramid function to print a pyramid pattern
        System.out.println(); // Print a new line for separation
      
        halfpyramid();    // Call the halfpyramid function to print a half pyramid pattern
        System.out.println();  // Print a new line for separation
        
        diamond(7);	 // Call the diamond function to print a diamond pattern	
    }

    // Function to print a diamond pattern with given number of rows
    private static void diamond(int rows) {
        int r=rows;
        int st=1, s=r-1;  // Initialize variables for stars and spaces
        
        for(int i=1; i<=r; i++)  // Loop for upper half of the diamond
        {
            for(int j=1; j<=s; j++)   // Loop to print spaces
            {
                System.out.print(" ");
            }
            
            for(int k=1; k<=st; k++)      // Loop to print stars
            {
                System.out.print("*");
            }
            
            st=st+2;  // Update stars and spaces for next row
            System.out.println();
            s--;
        }
        
        st=st-4;  // Update variables for lower half of the diamond
        r=r-1;
        s=1;
        
        for(int i=1; i<=r; i++)   // Loop for lower half of the diamond
        {
            for(int j=1; j<=s; j++)   // Loop to print spaces
            {
                System.out.print(" ");
            }
            
            for(int k=1; k<=st; k++)  // Loop to print stars
            {
                System.out.print("*");
            }   
           
            st=st-2;   // Update stars and spaces for next row
            System.out.println();
            s++;
        }
    }

    private static void halfpyramid() {   // Function to print a half pyramid pattern    
        int r=5;  // Number of rows for the half pyramid
        int st=1, s=r-1;   // Initialize variables for stars and spaces
        for(int i=1; i<=r; i++)  // Loop to print each row
        {
            for(int j=1; j<=s; j++)   // Loop to print spaces
            {
                System.out.print(" ");
            }
         
            for(int k=1; k<=st; k++)      // Loop to print stars
            {
                System.out.print("*");
            }
            
            st=st+1;   // Update stars and spaces for next row
            System.out.println();
            s--;
        }
    }

    // Function to print a pyramid pattern
    private static void pyramid() {
        int r=5;    // Number of rows for the pyramid
        
        int st=1, s=r-1;   // Initialize variables for stars and spaces
        
        for(int i=1; i<=r; i++)  // Loop to print each row
        {
            for(int j=1; j<=s; j++)       // Loop to print spaces
            {
                System.out.print(" ");
            }
           
            for(int k=1; k<=st; k++)    // Loop to print stars
            {
                System.out.print("*");
            }

            st=st+2;      // Update stars and spaces for next row
            System.out.println();
            s--;
        }
    }
    
} 
