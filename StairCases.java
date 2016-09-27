/**
 * This class will print out two different sets of 'x's, one ascending, and one descending
 * Each set will print the number of rows taken from the user
 * @author Jeremy Newman
 * @version 0.1
 */
import java.util.Scanner;

public class StairCases
{
  /**
   * Main method demonstrates the other two methods by calling each of them.
   * @param args Standard array of commandline String arguments. Not used in this program.
   */

  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("How many lines do you want the staircase to be?");
    int size = Integer.parseInt(keyboard.nextLine());

    printAscending(size);
    printDescending(size);
  }

  /**
   * This method prints x's in an ascending triangle
   * @param size User input representing the number of rows of the triangle printed
   */
  public static void printAscending(int size)
  {
  	for (int r = 0; r < size; r++)
  	{
  		for (int s = 0; s <= r; s++)
  		{
  			System.out.print('x');
  		}
  		System.out.println();
  	}
  }
  	
  
  

  /**
   * This method prints x's in an ascending triangle
   * @param size User input representing the number of rows of the triangle printed
   */
  public static void printDescending(int size)
  {
  	for (int r = 0; r < size; r++)
  	{
  		for (int s = size; s > r; s--)
  		{
  		System.out.print('x');
  		}
  		System.out.println();
  	}
  }
}