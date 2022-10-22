package employees;

import static employees.Degree.*;

public class Doctor extends FederalEmployee {
    public Degree degree;
    private static int salary = 20000;

    public Doctor(String fullName, int experienceYears, Degree degree) {
        super(fullName, salary, experienceYears);
        this.degree = degree;
    }

    @Override
    protected int calculateSalary() {
//        if(degree == Degree.INTERN)
//            salary += employees.Degree.INTERN.ordinal() * 5000;
//        else if(degree == Degree.CANDIDATE)
//            salary += employees.Degree.CANDIDATE.ordinal() * 5000;
//        else if(degree == Degree.DOCTOR)
//            salary += employees.Degree.DOCTOR.ordinal() * 5000;
        switch (degree) {
            case INTERN -> salary += INTERN.ordinal() * 5000;
            case CANDIDATE -> salary += CANDIDATE.ordinal() * 5000;
            case DOCTOR -> salary += DOCTOR.ordinal() * 5000;
        }
        return salary;
    }

    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }

    public static int getStartSalary() {
        return salary;
    }

    public static void setStartSalary(int startSalary) {
        Doctor.salary = startSalary;
    }

    public void dispose() {
        System.out.println("Вызванные доктора уходят в отпуск");
        super.dispose();
    }
//
//    public static enum Degree {
//        INTERN,
//        CANDIDATE,
//        DOCTOR;
//    }
}

