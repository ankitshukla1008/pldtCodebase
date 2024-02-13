import java.util.Scanner;

class Pyramid {

    public static void main(String[] args) {
        // Call the pyramid function to print a pyramid pattern
        pyramid();
        // Print a new line for separation
        System.out.println();
        // Call the halfpyramid function to print a half pyramid pattern
        halfpyramid();
        // Print a new line for separation
        System.out.println();
        // Call the diamond function to print a diamond pattern
        diamond(7);		
    }

    // Function to print a diamond pattern with given number of rows
    private static void diamond(int rows) {
        int r=rows;
        // Initialize variables for stars and spaces
        int st=1, s=r-1;
        // Loop for upper half of the diamond
        for(int i=1; i<=r; i++)
        {
            // Loop to print spaces
            for(int j=1; j<=s; j++)
            {
                System.out.print(" ");
            }
            
            // Loop to print stars
            for(int k=1; k<=st; k++)
            {
                System.out.print("*");
            }
            // Update stars and spaces for next row
            st=st+2;
            System.out.println();
            s--;
        }
        
        // Update variables for lower half of the diamond
        st=st-4;
        r=r-1;
        s=1;
        // Loop for lower half of the diamond
        for(int i=1; i<=r; i++)
        {
            // Loop to print spaces
            for(int j=1; j<=s; j++)
            {
                System.out.print(" ");
            }
            // Loop to print stars
            for(int k=1; k<=st; k++)
            {
                System.out.print("*");
            }   
            // Update stars and spaces for next row
            st=st-2;
            System.out.println();
            s++;
        }
    }

    // Function to print a half pyramid pattern
    private static void halfpyramid() {
        // Number of rows for the half pyramid
        int r=5;
        // Initialize variables for stars and spaces
        int st=1, s=r-1;
        // Loop to print each row
        for(int i=1; i<=r; i++)
        {
            // Loop to print spaces
            for(int j=1; j<=s; j++)
            {
                System.out.print(" ");
            }
            // Loop to print stars
            for(int k=1; k<=st; k++)
            {
                System.out.print("*");
            }
            // Update stars and spaces for next row
            st=st+1;
            System.out.println();
            s--;
        }
    }

    // Function to print a pyramid pattern
    private static void pyramid() {
        // Number of rows for the pyramid
        int r=5;
        // Initialize variables for stars and spaces
        int st=1, s=r-1;
        // Loop to print each row
        for(int i=1; i<=r; i++)
        {
            // Loop to print spaces
            for(int j=1; j<=s; j++)
            {
                System.out.print(" ");
            }
            // Loop to print stars
            for(int k=1; k<=st; k++)
            {
                System.out.print("*");
            }
            // Update stars and spaces for next row
            st=st+2;
            System.out.println();
            s--;
        }
    }
    
} 
