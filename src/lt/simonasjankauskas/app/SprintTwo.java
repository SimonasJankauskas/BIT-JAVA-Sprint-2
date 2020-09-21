package lt.simonasjankauskas.app;

import java.io.*;
import java.util.Scanner;

public class SprintTwo {
    public static void main(String[] args)  {
        File file = new File("./data/newFile.csv");

        // ... Input duomenų išsaugojimas naujame faile (Writing)
        try {
            Scanner scan = new Scanner(System.in);
            PrintWriter out = new PrintWriter(file);
            System.out.println("Enter employee full name: ");
            String fullName = scan.nextLine();
            out.println("Employee full name is: " + fullName);
            System.out.println("Enter employee department: ");
            String department = scan.nextLine();
            out.println("Employee department is: " + department);
            System.out.println("Enter employee age: ");
            int age = scan.nextInt();
            out.println("Employee age is: " + age);
            System.out.println("Enter employee salary: ");
            double salary = scan.nextDouble();
            out.println("Employee salary is: " + salary + "EU");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String fileLine = bufferedReader.readLine();
            out.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        // ... Duomenų išvedimas iš failo į consolę (Reading)
        File  relativeFile = new File("./data/newFile.csv");
        try {

            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);


            String fileLine = bufferedReader.readLine();
            System.out.println("----- Duomenys išspausdinti iš failo -----");
            while (fileLine != null) {
                System.out.println(fileLine);
                fileLine = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e){
            System.out.println("File was not found");
        } catch (IOException e){
            System.out.println("IOException error");
        }
        System.out.println("Programos pabaiga!");



    }
}


