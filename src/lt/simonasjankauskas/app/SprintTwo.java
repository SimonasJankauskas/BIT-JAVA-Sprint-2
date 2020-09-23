package lt.simonasjankauskas.app;

import java.io.*;
import java.util.Scanner;

public class SprintTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter employee full name: ");
        String fullName = scan.nextLine();
        System.out.println("Enter employee department: ");
        String department = scan.nextLine();
        System.out.println("Enter employee age: ");
        int age = scan.nextInt();
        System.out.println("Enter employee salary: ");
        double salary = scan.nextDouble();
        scan.close();

        Employee inputData = new Employee();
        inputData.setFullName(fullName);
        inputData.setDepartment(department);
        inputData.setAge(age);
        inputData.setSalary(salary);

        File newFile = new File("./data/newFile.csv");

        try {
            FileWriter wr = new FileWriter(newFile, true);
            BufferedWriter bufferedWriter = new BufferedWriter(wr);
            bufferedWriter.write("Employee full name: " + inputData.getFullName()
                    + "\nEmployee department: " + inputData.getDepartment()
                    + "\nEmployee age: " + inputData.getAge()
                    + "\nEmployee salary: " + inputData.getSalary() + "EUR");
            bufferedWriter.write("\n");
            bufferedWriter.write("----------------------");
            bufferedWriter.write("\n");
            bufferedWriter.close();

            FileReader fileReader = new FileReader(newFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String fileLine = bufferedReader.readLine();
            while (fileLine != null) {
                System.out.println(fileLine);
                fileLine = bufferedReader.readLine();

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Employee {
    private String fullName;
    private String department;
    private int age;
    private double salary;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}


