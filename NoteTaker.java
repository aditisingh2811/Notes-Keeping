import java.io.*;

import java.util.*;

public class NoteTaker {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String fileName, note;

        

        System.out.print("Enter a file name: ");

        fileName = sc.nextLine();

        System.out.print("Enter a note: ");

        note = sc.nextLine();

        

        try {

            

            FileWriter fileWriter = new FileWriter(fileName);

            fileWriter.write(note);

            fileWriter.close();

            

            

            FileReader fileReader = new FileReader(fileName);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;

            System.out.println("Note saved. Here's what you wrote:");

            while ((line = bufferedReader.readLine()) != null) {

                System.out.println(line);

            }

            bufferedReader.close();

        } catch (IOException e) {

            System.out.println("Error: " + e.getMessage());

        }

    }

}

