package Behaviors;

import Entities.Officer;

import java.util.ArrayList;

public class OfficerManagement {

    ArrayList<Officer> officers = new ArrayList<>();

    public void addOfficer(Officer o){
        officers.add(o);
    }

    public void deleteOfficerById(int id){
        officers.removeIf(o -> o.getId() == id);
    }

    public Officer searchOfficer(String name){
        Officer officer = null;
        for (Officer o: officers) {
            if(o.getName().equals(name)){
                officer = o;
            }
        }
        return officer;
    }

    public Officer searchOfficer(int id){
        Officer officer = null;
        for (Officer o: officers) {
            if(o.getId() == id){
                officer = o;
            }
        }
        return officer;
    }

    public void showAllOfficersInfo(){
        for (Officer o: officers) {
            System.out.println(o.toString());
        }
    }
}
