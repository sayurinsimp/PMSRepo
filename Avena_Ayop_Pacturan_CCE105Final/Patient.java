package Avena_Ayop_Pacturan_CCE105Final;

import java.util.*;
// contains all functions located in absclass.java
public class Patient extends PatientAbs {

    public static final Scanner sc = new Scanner(System.in);

    public Patient (String patientName, int patientAge, String patientMedCon, int conSeverity){
        super(patientName, patientAge, patientMedCon, conSeverity);
    }
    public void addPatient(){
        System.out.print("Enter Patient's Name: ");
        String patientName = sc.nextLine();
        System.out.print("Enter Patient's Age: ");
        int patientAge = sc.nextInt();
        System.out.print("Enter Patient's Medical Condition: ");
        String patientMedCon = sc.nextLine();
        System.out.print("Enter Condition Severity (1 for lowest, 4 for highest)");
        int conSeverity = sc.nextInt();

        Patient newPatient = new Patient (patientName, patientAge, patientMedCon, conSeverity);

        // function to add newPatient to PriorityQueue; 12-21-23, 12:22 AM
    }
    public void deletePatient(){
        
    }
    public void sortAndDisplayAlpha(){
        
    }
    
    public void sortAndDisplayAge(){
        
    }
    
    public void sortAndDisplayMedicalCon(){
        
    }
    
    public void sortAndDisplaySeverity(){

    }
    public void quickSortAlgo(){

    }
}
