package Avena_Ayop_Pacturan_CCE105Final;

import java.util.*;

// contains main method
public class Main {
    public static final Scanner sc = new Scanner (System.in);

    public static final int ADD_PATIENT = 1;
    public static final int DELETE_PATIENT = 2;
    public static final int SORT_AND_DISPLAY_ALPHABETICAL = 3;
    public static final int SORT_AND_DISPLAY_BY_AGE = 4;
    public static final int SORT_AND_DISPLAY_BY_MEDICAL_CON = 5;
    public static final int SORT_AND_DISPLAY_BY_SEVERITY = 6;
    public static final int EXIT_PROGRAM = 7;
    public static void main(String[] args) {
        /*
         Add function: Add Patient (add fields such as patient's name, age, medical condition, severity)
         Add function: Delete Patient Entry
         Add function: Sort Alphabetically (can also be done in reverse)
         Add function: Sort by Age
         Add function: Sort by Medical Condition (can also be done in reverse)
         Add function: Sort by Severity (1-4, with 4 having highest priority)
         Add function: Display available beds
         Add function: Exit Program
         */
        PatientAbs PatientAbsObj = new Patient(null, 0, null, 0);
        System.out.println("Tentative Title: Patient Management System");
        
        System.out.println("What would you like to do?");
        System.out.println("[1] Add Patient");
        System.out.println("[2] Delete Patient");
        System.out.println("[3] Sort And Display Patient Info in Alphabetical Order");
        System.out.println("[4] Sort and Display Patient Info According to Age");
        System.out.println("[5] Sort and Display Patient Info According to Medical Condition");
        System.out.println("[6] Sort and Display Patient Info According to Severity");
        System.out.println("[7] Exit Program");

        int userChoice = sc.nextInt();

        switch (userChoice){
            case ADD_PATIENT:
                PatientAbsObj.addPatient();
                break;
            case DELETE_PATIENT:
                PatientAbsObj.deletePatient();
                break;
            case SORT_AND_DISPLAY_ALPHABETICAL:
                PatientAbsObj.sortAndDisplayAlpha();
                break;
            case SORT_AND_DISPLAY_BY_AGE:
                PatientAbsObj.sortAndDisplayAge();
                break;
            case SORT_AND_DISPLAY_BY_MEDICAL_CON:
                PatientAbsObj.sortAndDisplayMedicalCon();
                break;
            case EXIT_PROGRAM:
                System.out.println("Program closed successfully.");
                System.exit(0);
            default:
                System.out.println("Invalid input. Please try again.");
        }


        // SCANNER SHOULD ALWAYS BE CLOSED
        sc.close();
    }
}
