package sg.edu.nus.iss;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.printf("Welcome to Pokemon Gaole Legend 4 Rush 2\n" +
                "(1) View the list of Pokemon in the selected stack\n" +
                "(2) View unique list of Pokemon in the selected stack\n"
                + "(3) Find next 5 stars Pokemon occurrence\n"
                + "(4) Create new Pokemon stack and save (append) to csv file\n" + "(q) to exit the program\n");

                List<String> pokemons = new ArrayList<>();
                String input = "";

                Console console = System.console();

                while (!input.equals("q")) {
                    input = console.readLine("Enter your selection >");
                    if (input.equals("1")){
                    System.out.println("View unique list of Pokemon in selected stack");
                    }
                 else  { 
                    System.out.printf("Thank you for using the program...\n" + "Hope to see you soon...");

                }
                
    }
}

}
