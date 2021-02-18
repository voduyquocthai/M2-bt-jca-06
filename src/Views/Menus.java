package Views;

import Entities.Engineer;
import Entities.Officer;
import Entities.Staff;
import Entities.Worker;

import java.util.Scanner;
import java.util.Stack;

public class Menus {
    static Scanner input = new Scanner(System.in);

    public static Officer getOfficerInfo(){
        System.out.println("-------------------");
        System.out.println("Enter officer's name: ");
        String name = input.nextLine();
        System.out.println("Enter officer's date of birth: ");
        String dob = input.nextLine();
        System.out.println("Enter officer's gender: ");
        String gender = input.nextLine();
        System.out.println("Enter officer's address: ");
        String address = input.nextLine();
        System.out.println("Enter officer's id: ");
        int id = Integer.parseInt(input.nextLine());
        System.out.println("Please choose the type of officer: ");
        System.out.println("1. Worker");
        System.out.println("2. Engineer");
        System.out.println("3. Staff");
        int choice = Integer.parseInt(input.nextLine());
        if(choice == 1){
            System.out.println("Enter the worker's class:");
            String _class = input.nextLine();
            Worker worker = new Worker(name, dob, gender, address, id, _class);
            return worker;
        } else if(choice == 2){
            System.out.println("Enter the engineer's major:");
            String major = input.nextLine();
            Engineer engineer = new Engineer(name, dob, gender, address, id, major);
            return engineer;
        } else if (choice == 3){
            System.out.println("Enter the staff's job:");
            String job = input.nextLine();
            Staff staff = new Staff(name, dob, gender, address, id, job);
            return staff;
        } else {
            Officer officer = new Officer(name, dob, gender, address, id);
            return officer;
        }
    }
}
