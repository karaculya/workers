package employees;

public class FederalEmployee {

    private static int ratioSalary = 1000;
    private static int ratioPension = 2000;
    private static double taxation = 0.87; //taxation!= 0.13, потому что при расчёте зп получается сумма налога, а не сама зп
    private static int pensionAge = 20;

    private String fullName;
    protected int initialSalary;
    private int experienceYears;

    public FederalEmployee(String fullName, int initialSalary, int experienceYears) {
        this.fullName = fullName;
        this.initialSalary = initialSalary;
        this.experienceYears = experienceYears;
    }

    protected int calculateSalary() {
        return (int) ((initialSalary + experienceYears * ratioSalary) * taxation);
    }

    public void incrementExperience() {
        experienceYears++;
    }

    private int calculatePension() {
        return (int) (experienceYears * ratioPension * taxation);
    }

    public void takeSalary() {
        System.out.println(fullName + " получил зарплату размером "
                + calculateSalary() + " рублей");
    }

    public void takePension() {
        if (experienceYears < pensionAge)
            System.out.println(fullName + " не достиг пенсионного возраста");
        else
            System.out.println(fullName + " получил пенсию размером "
                    + calculatePension() + " рублей");
    }

    public String getFullName() {
        return fullName;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public static int getRatioSalary() {
        return ratioSalary;
    }

    public static int getRatioPension() {
        return ratioPension;
    }

    public static double getTaxation() {
        return taxation;
    }

    public static int getPensionAge() {
        return pensionAge;
    }

    public static void setRatioSalary(int ratioSalary) {
        FederalEmployee.ratioSalary = ratioSalary;
    }

    public static void setRatioPension(int ratioPension) {
        FederalEmployee.ratioPension = ratioPension;
    }

    public static void setTaxation(double taxation) {
        FederalEmployee.taxation = taxation;
    }

    public static void setPensionAge(int pensionAge) {
        FederalEmployee.pensionAge = pensionAge;
    }

    public void dispose() {
        System.out.println("Вызванные гос работники уходят в отпуск");
    }
}
