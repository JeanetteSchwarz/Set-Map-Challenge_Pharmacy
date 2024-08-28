package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Medication aspirin = new Medication("Aspirin", "3,20", true);
        Medication ibuprofen = new Medication("Ibuprofen", "3,50", true);
        Medication paracetamol = new Medication("Paracetamol", "2,90", true);
        Medication naproxen = new Medication("Naproxen", "4,10", false);

        Pharmacy bridgePharmacy = new Pharmacy();

        bridgePharmacy.save(aspirin);
        bridgePharmacy.save(ibuprofen);
        bridgePharmacy.save(paracetamol);
        bridgePharmacy.save(naproxen);

        //getCount
        System.out.println("Medications in stock: " + bridgePharmacy.getCount());

        //print
        bridgePharmacy.printAll();
    }
}