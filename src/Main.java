import employees.Degree;
import employees.Doctor;
import employees.FederalEmployee;
import employees.Teacher;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
//        FederalEmployee fp = new FederalEmployee("Иванов Петр Ильич",
//                20000, 3);
//        Doctor doc = new Doctor("Михайлов Иван Якович",
//                2, Degree.INTERN);
//        System.out.println(doc.calculateSalary());
        String[] a = {"алгебра", "геометрия", "физра", "русский язык", "обж", "икт"};
        Teacher teacher = new Teacher("Петрова Наталья Ивановна",
                15000, 7);
        teacher.takeSalary();
        teacher.checkItems();
        teacher.addItem("литература");
        teacher.addItem("литература");
//        for (int i = 0; i < a.length; i++) {
//            teacher.addItem(a[i]);
//        }
        for (String x:a)
            teacher.addItem(x);
        teacher.takeSalary();
        teacher.spendItem("обж");

        Doctor doctor = new Doctor("ивмив рвмиви раииа",
                5, Degree.INTERN);
        doctor.takeSalary();
        Doctor.setStartSalary(23000);
        Doctor doctor2 = new Doctor("ивмив fvbdvh dfvhbv",
                5, Degree.INTERN);
        doctor.takeSalary();
        FederalEmployee.setPensionAge(4);
        doctor.takePension();


    }
}
