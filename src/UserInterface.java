import java.util.ArrayList;
import java.util.Scanner;
public class UserInterface
{
    private Scanner input;

    public UserInterface() {input = new Scanner(System.in);}

    public String inputMode()
    {
        String mode = "";
        while (true)
        {
            System.out.println("Enter the desired Mode:");
            System.out.println("1. Ingrediants list");
            System.out.println("2. Random");
            System.out.println("Enter Q to Quit");
            System.out.println();
            mode = input.nextLine();
            if (mode.toUpperCase().equals("Q") || mode.equals("1") || mode.equals("2"))
            {
                //exit state
                break;
            }
            else
            {
                displayErrorMessage( "Invalid Response! Please Enter Valid Response");

            }
        }

       return mode;
    }
    public String inputBakedGood()
    {
        System.out.println("Enter ingrediant:");
        //* TODO enter list of canned baked goods here
        String ingredient = "";
        while (true)
        {
            System.out.println("Enter the desired Mode:");
            System.out.println("1. Chocolate");
            System.out.println("2. vanilla");
            System.out.println("3. almond");
            System.out.println("Enter Q to Quit");
            System.out.println();
            ingredient = input.nextLine();
            if (ingredient.toUpperCase().equals("Q") || ingredient.equals("1") || ingredient.equals("2"))
            {
                //exit state
                break;
            }
            else
            {
                displayErrorMessage( "Invalid Response! Please Enter Valid Response");

            }
        }
        System.out.println();
        String bakedGood = input.nextLine();
        return bakedGood;
    }

    public String inputRandom()
    {
        //TODO enter random method here
        ArrayList recipe = new ArrayList();
        recipe.add("Cookies");
        recipe.add("Bread");
        recipe.add("Cake");
        recipe.add("Cupcake");
        recipe.add("Pie");
        System.out.println(recipe.get((int) ( Math.random () * recipe.size () )));
        String recipeType = input.nextLine();
        return recipeType;
    }


    public void displayErrorMessage()
    {
        String error = "units must be a number between 1 - 4";
        displayErrorMessage(error);
    }
    public void displayErrorMessage(String msg)
    {
        System.out.println("***************ERROR************");
        System.out.println(msg);
    }
}