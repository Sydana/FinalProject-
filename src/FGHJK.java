    import javax.swing.plaf.synth.SynthEditorPaneUI;
    import java.util.Scanner;

    public class FGHJK {
        public static void main(String [] text){
            Scanner userInput;
            int days;

            int numberOfTotalIngredients;
                String ingredientName;
                float ingredientPrice;
                int numberOfSaidIngredient;
                float partPrice;

            float listedIngredients = 0;

            int numberOfCups;
            float costOfCups;
            float costOfLemonade;
            int numberOfCupsSold;

            float costOfSales = 0;

            float totalCostOfSales = 0;

            float profit;


            userInput = new Scanner(System.in);




                System.out.println("ENTER HOW MANY INGREDIENTS THERE ARE:");
                numberOfTotalIngredients = userInput.nextInt();

                // COST OF PRODUCTION
                while (numberOfTotalIngredients != 0) {

                    System.out.println("ENTER THE NAME OF YOUR INGREDIENT: ");
                    ingredientName = userInput.nextLine();
                    ingredientName = userInput.nextLine().toUpperCase();

                    System.out.println("ENTER THE PRICE OF THE " + ingredientName + "(S) PER UNIT:");
                    ingredientPrice = userInput.nextFloat();

                    System.out.println("ENTER HOW MUCH OF THAT INGREDIENT YOU HAVE BOUGHT:");
                    numberOfSaidIngredient = userInput.nextInt();

                    listedIngredients = listedIngredients + (ingredientPrice * numberOfSaidIngredient);

                    System.out.println("THE COST OF THE INGREDIENT " + ingredientName + " IS: " + (ingredientPrice * numberOfSaidIngredient) + "\n");

                    System.out.println("THE CURRENT COST OF YOUR INGREDIENTS IS: " + listedIngredients);

                    numberOfTotalIngredients--;

                    System.out.println("\n");
                }//while 1


                System.out.println("ENTER HOW MANY CUPS YOU BOUGHT: ");
                numberOfCups = userInput.nextInt();

                System.out.println("NOW ENTER THE PRICE OF THOSE CUPS PER UNIT:");
                costOfCups = userInput.nextFloat();

                System.out.println("THE COST OF THE CUPS IS: " + (numberOfCups * costOfCups) + "\n");

                listedIngredients = listedIngredients + (numberOfCups * costOfCups);

                System.out.println("THE CURRENT COST OF PRODUCTION IS: " + listedIngredients + "\n");

                System.out.println("ENTER HOW MANY DAYS YOU HAD TO SELL:");

                days = userInput.nextInt();

                while (days != 0) {

                    System.out.println("DAY "+ days);

                    //SALE COSTS
                    System.out.println("ENTER THE PRICE OF ONE CUP OF LEMONADE: ");
                    costOfLemonade = userInput.nextFloat();

                    System.out.println("ENTER HOW MANY CUPS YOU HAVE SOLD: ");
                    numberOfCupsSold = userInput.nextInt();

                    costOfSales = costOfLemonade * numberOfCupsSold;

                    totalCostOfSales = totalCostOfSales + costOfSales;

                    System.out.println("THE TOTAL AMOUNT OF LEMONADE YOU SOLD IS:" + costOfSales);

                    days--;

                    System.out.println("\n");

                }//days

            //PROFIT

            profit = totalCostOfSales - listedIngredients;

            System.out.println("YOUR PROFIT IS " + profit);

        }//main


    }//class
