# Program to print the given star patterns for n

import java.util.*;
public class pattern
{
  public static void main(String args[])
  {
    
    int i, j, rows;
    System.out.print("Enter Hollow Square with Diagonals Rows =  ");
    Scanner sc=new Scanner(System.in);
    rows=sc.nextInt();

    System.out.print("Hollow Square Star Pattern With Diagonals\n");
    for(i = 1; i <= rows; i++)
    {
        for(j = 1; j <= rows; j++)
        {
            if(i == 1 || i == rows || i == j || j == 1 || j == rows || j == rows - i + 1)
            {
                System.out.print("* ");
            }
            else
            {
                System.out.print("  ");
            }         
        }
        System.out.println();   
    }
    return 0;
}
