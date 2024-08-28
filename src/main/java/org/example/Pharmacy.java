package org.example;

import java.util.HashMap;
import java.util.Map;

public class Pharmacy {

    private Map<String, Medication> pharmacy;

    public Pharmacy() {
        this.pharmacy = new HashMap<>();
    }

    //create a method int getCount
    int getCount(){
    return pharmacy.size();
}

    //step 4 create a method void save(medication medication)
    public void save(Medication medication){
        pharmacy.put(medication.getName(), medication);
    }

    //step 5
    /*public Medication find(String medicationName){
        if (pharmacy.containsKey(medicationName)){
            return Medication;
        }
        return null;
    }*/

    //step 6
    public void delete(String medicationName){
        pharmacy.remove(medicationName);
    }

    public void printAll(){
        System.out.println("In pharmacy: " + pharmacy.values());
    }


}


