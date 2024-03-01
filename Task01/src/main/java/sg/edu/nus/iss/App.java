package sg.edu.nus.iss;

import java.io.Console;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class App {
    public static void main(String[] args) {
        System.out.printf("Welcome to Pokemon Gaole Legend 4 Rush 2\n" +
                "(1) View unique list of Pokemon in the selected stack\n" +
                "(2) Find next 5 stars Pokemon occurrence\n"
                + "(3) Create new Pokemon stack and save (append) to csv file\n"
                + "(4) Print distinct Pokemon and cards count\n" + "(q) to exit the program\n");

        List<String> pokemons = new ArrayList<>();
        String input = "";

        Console console = System.console();

        while (!input.equals("q")) {
            input = console.readLine("Enter your selection >");

            if (input.equals("1")) {
                String selectedStack = "";
                selectedStack = console.readLine("Display the list of unique Pokemon in stack (1-8) >");

            } 


            else if (input.equals("3")) {
                String pokemonfile = "";
                pokemonfile = console.readLine("Create a new Pokemon stack and save to a new file >");
                String filename = console.readLine("Name of file >");
                String savedfile = console.readLine("Location of file >");
                String inputFile = filename + ".csv";
                String fileLocation = savedfile + File.separator + inputFile;

                File pokemonstack = new File(fileLocation);
                OutputStream os = null;
                try {
                    if (!pokemonstack.exists()) {
                        try {
                            Path p = Paths.get(pokemonstack.getPath());
                            Files.createDirectory(p);
                        } catch (FileAlreadyExistsException e) {
                            System.err.println("File already exists: " + e.getMessage());
                        }
                        pokemonstack.createNewFile();
                    }
                    os = new FileOutputStream(fileLocation);
                } catch (IOException e) {
                    e.printStackTrace();
                } 
                }
                }

            {
                System.out.printf("Thank you for using the program...\n" + "Hope to see you soon...");

            }

        }
    }


