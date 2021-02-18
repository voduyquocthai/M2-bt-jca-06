package Views;

import Behaviors.OfficerManagement;
import Entities.Officer;

import java.util.Scanner;

public class Program {
    static Scanner input = new Scanner(System.in);
    static OfficerManagement om = new OfficerManagement();
    public static void main(String[] args) {
        do{
            System.out.println("-----Officer Management-----");
            System.out.println("1. Add Officer");
            System.out.println("2. Delete Officer By Id");
            System.out.println("3. Show All Officers");
            System.out.println("4. Show Officer By Name");
            System.out.println("5. Show Officer By Id");
            int choice = Integer.parseInt(input.nextLine());
            switch (choice){
                case 1:
                    Officer officer = Menus.getOfficerInfo();
                    om.addOfficer(officer);
                    break;
                case 2:
                    System.out.println("Enter the officer's id that you want to remove:");
                    int id = Integer.parseInt(input.nextLine());
                    om.deleteOfficerById(id);
                    break;
                case 3:
                    om.showAllOfficersInfo();
                    break;
                case 4:
                    System.out.println("Enter the officer's name that you want to show:");
                    String name = input.nextLine();
                    Officer officer1 = om.searchOfficer(name);
                    System.out.println(officer1.toString());
                    break;
                case 5:
                    System.out.println("Enter the officer's id that you want to show:");
                    int id1 = Integer.parseInt(input.nextLine());
                    Officer officer2 = om.searchOfficer(id1);
                    System.out.println(officer2.toString());
                    break;
                default:
                    continue;
            }
        } while (true);
    }
}
