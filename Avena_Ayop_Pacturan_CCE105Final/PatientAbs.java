package Avena_Ayop_Pacturan_CCE105Final;

// contains methods such as sorting, printing/displaying, etc...
public abstract class PatientAbs {

    String patientName;
    int patientAge;
    String patientMedCon;
    int conSeverity;

    public PatientAbs (String patientName, int patientAge, String patientMedCon, int conSeverity){
        this.patientName = patientName;
        this.patientAge = patientAge;
        this.patientMedCon = patientMedCon;
        this.conSeverity = conSeverity;
    }

    public abstract void addPatient();
    public abstract void deletePatient();
    public abstract void sortAndDisplayAlpha();
    public abstract void sortAndDisplayAge();
    public abstract void sortAndDisplayMedicalCon();
    public abstract void sortAndDisplaySeverity();
    public abstract void quickSortAlgo();

    // not sure if iadd paba ang following functions; rev means reversed
    // public abstract void sortAndDisplaySeverityRev();
    // public abstract void sortAndDisplayAlphaRev();
    // public abstract void sortAndDisplayAgeRev();
    // public abstract void sortAndDisplayMedicalConRev();
}
