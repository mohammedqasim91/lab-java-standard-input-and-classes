import RegularEmployee.RegularEmployee;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Employee10 {

    public static void main(String[] args) throws IOException {
        RegularEmployee[] employees = new RegularEmployee[10];
        employees[0] = new RegularEmployee("John Doe", "john@example.com", 30, 50000);
        employees[1] = new RegularEmployee("Jane Smith", "jane@example.com", 35, 60000);
        employees[2] = new RegularEmployee("Michael Johnson", "michael@example.com", 28, 55000);
        employees[3] = new RegularEmployee("Emily Davis", "emily@example.com", 25, 48000);
        employees[4] = new RegularEmployee("Daniel Wilson", "daniel@example.com", 32, 62000);
        employees[5] = new RegularEmployee("Sarah Brown", "sarah@example.com", 27, 51000);
        employees[6] = new RegularEmployee("Matthew Taylor", "matthew@example.com", 31, 57000);
        employees[7] = new RegularEmployee("Olivia Martinez", "olivia@example.com", 29, 54000);
        employees[8] = new RegularEmployee("William Anderson", "william@example.com", 34, 59000);
        employees[9] = new RegularEmployee("Sophia Garcia", "sophia@example.com", 26, 50000);

        FileWriter fileWriter = new FileWriter("employees.txt");
        PrintWriter printWriter = new PrintWriter(fileWriter);
        for (RegularEmployee employee : employees) {
            printWriter.println("Name: " + employee.getName());
            printWriter.println("Email: " + employee.getEmail());
            printWriter.println("Age: " + employee.getAge());
            printWriter.println("Salary: " + employee.getSalary());
            printWriter.println();
        }
        printWriter.close();
        System.out.println("Employee details have been written to employees.txt");
    }
}
