import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String i = "";
        while (!i.equals("Quit")) {

            System.out.println("Choose One:");
            System.out.println("1. USD 2.Pound 3. Cedis");
            // Create if statement for the options they choose
            int option = reader.nextInt();
            while (option > 3 || option < 1) {
                System.out.println("Enter valid option please");
                System.out.println("1. USD 2.Pound 3. Cedis");
                option = reader.nextInt();
            }
            System.out.println("Enter the amount: ");
            int amount = reader.nextInt();
            while (amount < 0){
                System.out.println("Must be greater than or eqaul to 0");
                System.out.println("Enter the amount: ");
                amount = reader.nextInt();
            }
            currencyConvert(option, amount);

            System.out.println("Press Quit to exit the program");
            i = reader.nextLine();

        }





    }

    // This method is covert Dollars to Ceids
    public  static void currencyConvert( double options, int amount){

        if (options == 1){
            double Tocedis= amount * 7.4934;
            String GhanaTop = String.format("%.2f", Tocedis);
            System.out.println(amount + " Dollars = " + GhanaTop +" Cedis");
        }
        if (options == 1){
            // Converte Dollars to Cedis
            double Tocedis= amount * 7.4934;
            String GhanaTop = String.format("%.2f", Tocedis);
            System.out.println(amount + " Dollars = " + GhanaTop +" Cedis");

            // Convert Dollars to Pounds
            double Topounds = amount * 0.76270102 ;
            String PoundsTop = String.format("%.2f", Topounds);
            System.out.println(amount + " Dollars = " + PoundsTop +" Pounds");

        }else if (options == 2){
            // Convert Pounds to Dollars
            double fromPoundstoDollars = amount *1.31 ;
            String DollarTop2 = String.format("%.2f",fromPoundstoDollars );
            System.out.println(amount + " Pounds = " + DollarTop2 +" Dollars");

            // Convert Pounds to Cedis
            double fromPoundstoCedis = amount *9.83 ;
            String pounds3 = String.format("%.2f",fromPoundstoCedis);
            System.out.println(amount + " Pounds = " + pounds3 +" Cedis");

        }else if (options == 3){
            // Convert Cedis to Pounds
            double fromCedistoPounds = amount *0.10 ;
            String cedis3 = String.format("%.2f",fromCedistoPounds);
            System.out.println(amount + " Cedis = " + cedis3 +" Pounds");

            // Convert Cedis to Dollars
            double Todollars = amount * 0.13;
            String DollarsTop = String.format("%.2f", Todollars);
            System.out.println(amount + " Cedis = " + DollarsTop + " Dollars ");

        }
//        else {
//            System.out.println("You enter the wrong currency");
//        }

    }
}


