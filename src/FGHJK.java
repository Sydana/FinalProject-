import java.util.Scanner;

public class FGHJK {
    public static void main(int [] args, String [] text){
        Scanner userInput;
        int numberOfTotalIngredients;
            int listedIngredients = 1;
            float ingredientPrice;
            int numberOfSaidIngredient;
            float partPrice;


        userInput = new Scanner(System.in);


        System.out.println("ENTER HOW MANY INGREDIENTS THERE IS:");
        numberOfTotalIngredients = userInput.nextInt();

        while (numberOfTotalIngredients != 0){
            System.out.println("ENTER THE PRICE OF INGREDIENT "+ listedIngredients + ":");
            ingredientPrice = userInput.nextFloat();
            System.out.println("NOW ENTER HOW MUCH OF THAT INGREDIENT YOU HAVE BOUGHT:");
            numberOfSaidIngredient = userInput.nextInt();
            (ingredientPrice * numberOfSaidIngredient) = partPrice;

        }//while 1









    }//main


}//class
