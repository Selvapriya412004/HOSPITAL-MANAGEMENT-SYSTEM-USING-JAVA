import java.util.*;

class Doctor {
    String did, dname, specialist, worktime, docQual;
    int droom;
    String[] appointments; // Array to store appointment slots

    // Constructor
    Doctor() {
        appointments = new String[10]; // Adjust the size according to your needs
    }

    void newDoctor() {
        Scanner input = new Scanner(System.in);
        System.out.print("id:-");
        did = input.nextLine();
        System.out.print("name:-");
        dname = input.nextLine();
        System.out.print("specialization:-");
        specialist = input.nextLine();
        System.out.print("work time:-");
        worktime = input.nextLine();
        System.out.print("qualification:-");
        docQual = input.nextLine();
        System.out.print("room no.:-");
        droom = input.nextInt();
    }

    void doctorInfo() {
        System.out.println(did + "\t" + dname + "  \t" + specialist + "     \t" + worktime + "    \t" + docQual
                + "       \t" + droom);
    }

    void scheduleAppointment(String time) {
        for (int i = 0; i < appointments.length; i++) {
            if (appointments[i] == null) {
                appointments[i] = time;
                System.out.println("Appointment scheduled for " + time);
                break;
            }
        }
    }

    void removeDoctor(ArrayList<Doctor> doctors, String did) {
        for (Doctor doctor : doctors) {
            if (doctor.did.equals(did)) {
                doctors.remove(doctor);
                System.out.println("Doctor with ID " + did + " removed successfully.");
                return;
            }
        }
        System.out.println("Doctor with ID " + did + " not found.");
    }
}

class Patient {
    String pid, pname, disease, sex, admitStatus;
    int age;

    void newPatient() {
        Scanner input = new Scanner(System.in);
        System.out.print("id:-");
        pid = input.nextLine();
        System.out.print("name:-");
        pname = input.nextLine();
        System.out.print("disease:-");
        disease = input.nextLine();
        System.out.print("sex:-");
        sex = input.nextLine();
        System.out.print("admit_status:-");
        admitStatus = input.nextLine();
        System.out.print("age:-");
        age = input.nextInt();
    }

    void patientInfo() {
        System.out.println(
                pid + "\t" + pname + " \t" + disease + "     \t" + sex + "      \t" + admitStatus + "\t" + age);
    }

    void removePatient(ArrayList<Patient> patients, String pid) {
        for (Patient patient : patients) {
            if (patient.pid.equals(pid)) {
                patients.remove(patient);
                System.out.println("Patient with ID " + pid + " removed successfully.");
                return;
            }
        }
        System.out.println("Patient with ID " + pid + " not found.");
    }
}

class Medical {
    String medName, medComp, expDate;
    int medCost, count;

    void newMedi() {
        Scanner input = new Scanner(System.in);
        System.out.print("name:-");
        medName = input.nextLine();
        System.out.print("comp:-");
        medComp = input.nextLine();
        System.out.print("exp_date:-");
        expDate = input.nextLine();
        System.out.print("cost:-");
        medCost = input.nextInt();
        System.out.print("no of unit:-");
        count = input.nextInt();
    }

    void findMedi() {
        System.out.println(medName + "  \t" + medComp + "    \t" + expDate + "     \t" + medCost);
    }

    void removeMedical(ArrayList<Medical> medicines, String medName) {
        for (Medical medicine : medicines) {
            if (medicine.medName.equals(medName)) {
                medicines.remove(medicine);
                System.out.println("Medicine " + medName + " removed successfully.");
                return;
            }
        }
        System.out.println("Medicine " + medName + " not found.");
    }
}

class Lab {
    String facility;
    int labCost;

    void newFeci() {
        Scanner input = new Scanner(System.in);
        System.out.print("facility:-");
        facility = input.nextLine();
        System.out.print("cost:-");
        labCost = input.nextInt();
    }

    void feciList() {
        System.out.println(facility + "\t" + labCost);
    }

    void removeLab(ArrayList<Lab> labs, String facility) {
        for (Lab lab : labs) {
            if (lab.facility.equals(facility)) {
                labs.remove(lab);
                System.out.println("Lab facility " + facility + " removed successfully.");
                return;
            }
        }
        System.out.println("Lab facility " + facility + " not found.");
    }
}

class Facility {
    String fecName;

    void addFeci() {
        Scanner input = new Scanner(System.in);
        System.out.print("facility:-");
        fecName = input.nextLine();
    }

    void showFeci() {
        System.out.println(fecName);
    }

    void removeFacility(ArrayList<Facility> facilities, String fecName) {
        for (Facility facility : facilities) {
            if (facility.fecName.equals(fecName)) {
                facilities.remove(facility);
                System.out.println("Facility " + fecName + " removed successfully.");
                return;
            }
        }
        System.out.println("Facility " + fecName + " not found.");
    }
}

class Staff {
    String sid, sname, desg, sex;
    int salary;

    void newStaff() {
        Scanner input = new Scanner(System.in);
        System.out.print("id:-");
        sid = input.nextLine();
        System.out.print("name:-");
        sname = input.nextLine();
        System.out.print("designation:-");
        desg = input.nextLine();
        System.out.print("sex:-");
        sex = input.nextLine();
        System.out.print("salary:-");
        salary = input.nextInt();
    }

    void staffInfo() {
        System.out.println(sid + "\t" + sname + "\t" + sex + "\t" + salary);
    }

    void removeStaff(ArrayList<Staff> staffs, String sid) {
        for (Staff staff : staffs) {
            if (staff.sid.equals(sid)) {
                staffs.remove(staff);
                System.out.println("Staff with ID " + sid + " removed successfully.");
                return;
            }
        }
        System.out.println("Staff with ID " + sid + " not found.");
    }
}

public class HospitalManagement {

    // Method to handle doctor login
    static boolean doctorLogin() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n************ Doctor Login ************");
        System.out.print("Enter Doctor ID: ");
        String doctorID = input.nextLine();
        System.out.print("Enter Password: "); // You can add password functionality here
        // Change the delimiter to a newline to read the entire line
        String password = input.next();
        return !doctorID.isEmpty();

    }

    // Method to handle patient login
    static boolean patientLogin() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n************ Patient Login ************");
        System.out.print("Enter Patient ID: ");
        String patientID = input.nextLine();
        System.out.print("Enter Password: "); // You can add password functionality here
        // Change the delimiter to a newline to read the entire line
        String password = input.next(); // Read the password using next() instead of nextLine()
        return !patientID.isEmpty();
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String months[] = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
        Calendar calendar = Calendar.getInstance();
        int count1 = 4, count2 = 4, count3 = 4, count4 = 4, count5 = 4, count6 = 4;
        System.out.println("\n--------------------------------------------------------------------------------");
        System.out.println("            *** Welcome to Hospital Management ***");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.print("Date: " + months[calendar.get(Calendar.MONTH)] + " " + calendar.get(Calendar.DATE) + " "
                + calendar.get(Calendar.YEAR));
        System.out.println("\t\t\t\t\t\tTime: " + calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE)
                + ":" + calendar.get(Calendar.SECOND));
        ArrayList<Doctor> doctors = new ArrayList<>();
        ArrayList<Patient> patients = new ArrayList<>();
        ArrayList<Lab> labs = new ArrayList<>();
        ArrayList<Facility> facilities = new ArrayList<>();
        ArrayList<Medical> medicines = new ArrayList<>();
        ArrayList<Staff> staffs = new ArrayList<>();

        // Login logic
        boolean loggedIn = false;
        while (!loggedIn) {
            System.out.println("\n************ Login ************");
            System.out.println("1. Doctor Login");
            System.out.println("2. Patient Login");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");int loginChoice = input.nextInt();
            switch (loginChoice) {
                case 1:
                    loggedIn = doctorLogin();
                    if (loggedIn) {
                        System.out.println("\nReturn to Main Menu Press 0");
                        int returnChoice = input.nextInt();
                        if (returnChoice == 0) {
                            // Continue to the main menu
                        } else {
                            System.out.println("Exiting...");
                            return;
                        }
                    }
                    break;
                case 2:
                    loggedIn = patientLogin();
                    if (loggedIn) {
                        System.out.println("\nReturn to Main Menu Press 0");
                        int returnChoice = input.nextInt();
                        if (returnChoice == 0) {
                            // Continue to the main menu
                        } else {
                            System.out.println("Exiting...");
                            return;
                        }
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter again.");
            }
        }

        // Existing data
        // Doctor, Patient, Lab, Facility, Medical, and Staff data as before

        // Existing data
        Doctor d1 = new Doctor();
        d1.did = "21";
        d1.dname = "Dr.Ghanendra";
        d1.specialist = "ENT";
        d1.worktime = "5-11AM";
        d1.docQual = "MBBS,MD";
        d1.droom = 17;
        doctors.add(d1);

        Doctor d2 = new Doctor();
        d2.did = "32";
        d2.dname = "Dr.Vikram";
        d2.specialist = "Physician";
        d2.worktime = "10-3AM";
        d2.docQual = "MBBS,MD";
        d2.droom = 45;
        doctors.add(d2);

        Doctor d3 = new Doctor();
        d3.did = "17";
        d3.dname = "Dr.Rekha";
        d3.specialist = "Surgeon";
        d3.worktime = "8-2AM";
        d3.docQual = "BDM";
        d3.droom = 8;
        doctors.add(d3);

        Doctor d4 = new Doctor();
        d4.did = "33";
        d4.dname = "Dr.Pramod";
        d4.specialist = "Artho";
        d4.worktime = "10-4PM";
        d4.docQual = "MBBS,MS";
        d4.droom = 40;
        doctors.add(d4);

        Patient p1 = new Patient();
        p1.pid = "12";
        p1.pname = "Pankaj";
        p1.disease = "Cancer";
        p1.sex = "Male";
        p1.admitStatus = "y";
        p1.age = 30;
        patients.add(p1);

        Patient p2 = new Patient();
        p2.pid = "13";
        p2.pname = "Sumit";
        p2.disease = "Cold";
        p2.sex = "Male";
        p2.admitStatus = "y";
        p2.age = 23;
        patients.add(p2);

        Patient p3 = new Patient();
        p3.pid = "14";
        p3.pname = "Alok";
        p3.disease = "Maleriya";
        p3.sex = "Male";
        p3.admitStatus = "y";
        p3.age = 45;
        patients.add(p3);

        Patient p4 = new Patient();
        p4.pid = "15";
        p4.pname = "Ravi";
        p4.disease = "Diabetes";
        p4.sex = "Male";
        p4.admitStatus = "y";
        p4.age = 25;
        patients.add(p4);

        Lab l1 = new Lab();
        l1.facility = "X-ray";
        l1.labCost = 800;
        labs.add(l1);

        Lab l2 = new Lab();
        l2.facility = "CT Scan";
        l2.labCost = 1200;
        labs.add(l2);

        Lab l3 = new Lab();
        l3.facility = "MRI Scan";
        l3.labCost = 1500;
        labs.add(l3);

        Lab l4 = new Lab();
        l4.facility = "Blood Bank";
        l4.labCost = 50;
        labs.add(l4);

        Facility f1 = new Facility();
        f1.fecName = "Ambulance";
        facilities.add(f1);

        Facility f2 = new Facility();
        f2.fecName = "Admit Facility";
        facilities.add(f2);

        Facility f3 = new Facility();
        f3.fecName = "Canteen";
        facilities.add(f3);

        Facility f4 = new Facility();
        f4.fecName = "Emergency";
        facilities.add(f4);

        Medical m1 = new Medical();
        m1.medName = "Corex";
        m1.medComp = "Cino pvt";
        m1.medCost = 55;
        m1.expDate = "9-5-16";
        m1.count = 8;
        medicines.add(m1);

        Medical m2 = new Medical();
        m2.medName = "Nytra";
        m2.medComp = "Ace pvt";
        m2.medCost = 250;
        m2.expDate = "4-4-15";
        m2.count = 5;
        medicines.add(m2);

        Medical m3 = new Medical();
        m3.medName = "Brufa";
        m3.medComp = "Reckitt";
        m3.medCost = 150;
        m3.expDate = "12-7-17";
        m3.count = 20;
        medicines.add(m3);

        Medical m4 = new Medical();
        m4.medName = "Pride";
        m4.medComp = "DDF pvt";
        m4.medCost = 1000;
        m4.expDate = "12-4-12";
        m4.count = 30;
        medicines.add(m4);

        Staff st1 = new Staff();
        st1.sid = "22";
        st1.sname = "Prakash";
        st1.sex = "Male";
        st1.desg = "Worker";
        st1.salary = 15000;
        staffs.add(st1);

        Staff st2 = new Staff();
        st2.sid = "23";
        st2.sname = "Komal";
        st2.sex = "Female";
        st2.desg = "Nurse";
        st2.salary = 30000;
        staffs.add(st2);

        Staff st3 = new Staff();
        st3.sid = "24";
        st3.sname = "Raju";
        st3.sex = "Male";
        st3.desg = "Worker";
        st3.salary = 10000;
        staffs.add(st3);

        Staff st4 = new Staff();
        st4.sid = "25";
        st4.sname = "Rani";
        st4.sex = "Female";
        st4.desg = "Nurse";
        st4.salary = 25000;
        staffs.add(st4);

        // Main menu and other logic as before
        int choice, j, c1, status = 1, s1 = 1, s2 = 1, s3 = 1, s4 = 1, s5 = 1, s6 = 1;
        while (status == 1) {
            System.out.println("\n                                    MAIN MENU");
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.println("1.Doctors  2. Patients  3.Medicines  4.Laboratories  5. Facilities  6. Staff ");
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.println("Enter your Choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println(
                            "--------------------------------------------------------------------------------");
                    System.out.println("                      **DOCTOR SECTION**");
                    System.out.println(
                            "--------------------------------------------------------------------------------");
                    s1 = 1;
                    while (s1 == 1) {
                        System.out.println(
                                "1.Add New Entry\n2.Schedule Appointment\n3.Existing Doctors List\n4.Remove Doctor");
                        System.out.println("Enter your Choice: ");c1 = input.nextInt();
                        switch (c1) {
                            case 1: {
                                Doctor newDoctor = new Doctor();
                                newDoctor.newDoctor();
                                doctors.add(newDoctor);
                                break;
                            }
                            case 2: {
                                System.out.println(
                                        "--------------------------------------------------------------------------------");
                                System.out.println("Doctors List:");
                                for (int k = 0; k < doctors.size(); k++) {
                                    System.out.println((k + 1) + ". " + doctors.get(k).dname);
                                }
                                System.out.println(
                                        "--------------------------------------------------------------------------------");
                                System.out.print("Enter the doctor's index to schedule appointment: ");
                                int docIndex = input.nextInt();
                                if (docIndex > 0 && docIndex <= doctors.size()) {
                                    System.out.print("Enter the appointment time (e.g., 10:00 AM): ");
                                    input.nextLine(); // Consume newline
                                    String appointmentTime = input.nextLine();
                                    doctors.get(docIndex - 1).scheduleAppointment(appointmentTime);
                                } else {
                                    System.out.println("Invalid doctor index!");
                                }
                                break;
                            }
                            case 3: {
                                System.out.println(
                                        "--------------------------------------------------------------------------------");
                                System.out.println(
                                        "id \t Name\t Specialization \t Work Time \t Qualification \t Room No.");
                                System.out.println(
                                        "--------------------------------------------------------------------------------");
                                for (Doctor doc : doctors) {
                                    doc.doctorInfo();
                                }
                                break;
                            }
                            case 4: {
                                System.out.println("Enter the ID of the doctor to remove:");
                                input.nextLine(); // Consume newline
                                String removeDocID = input.nextLine();
                                Doctor doctor = new Doctor();
                                doctor.removeDoctor(doctors, removeDocID);
                                break;
                            }
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s1 = input.nextInt();
                    }
                    break;
                }
                case 2: {
                    System.out.println(
                            "--------------------------------------------------------------------------------");
                    System.out.println("                     **PATIENT SECTION**");
                    System.out.println(
                            "--------------------------------------------------------------------------------");
                    s2 = 1;
                    while (s2 == 1) {
                        System.out.println("1.Add New Entry\n2.Existing Patients List\n3.Remove Patient");
                        System.out.println("Enter your Choice: ");c1 = input.nextInt();
                        switch (c1) {
                            case 1: {
                                Patient newPatient = new Patient();
                                newPatient.newPatient();
                                patients.add(newPatient);
                                break;
                            }
                            case 2: {
                                System.out.println(
                                        "--------------------------------------------------------------------------------");
                                System.out.println("id \t Name \t Disease \t Gender \t Admit Status \t Age");
                                System.out.println(
                                        "--------------------------------------------------------------------------------");
                                for (Patient patient : patients) {
                                    patient.patientInfo();
                                }
                                break;
                            }
                            case 3: {
                                System.out.println("Enter the ID of the patient to remove:");
                                input.nextLine(); // Consume newline
                                String removePatID = input.nextLine();
                                Patient patient = new Patient();
                                patient.removePatient(patients, removePatID);
                                break;
                            }
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s2 = input.nextInt();
                    }
                    break;
                }
                case 3: {
                    s3 = 1;
                    System.out.println(
                            "--------------------------------------------------------------------------------");
                    System.out.println("                     **MEDICINE SECTION**");
                    System.out.println(
                            "--------------------------------------------------------------------------------");
                    while (s3 == 1) {
                        System.out.println("1.Add New Entry\n2. Existing Medicines List\n3.Remove Medicine");
                        System.out.println("Enter your Choice: ");c1 = input.nextInt();
                        switch (c1) {
                            case 1: {
                                Medical newMedicine = new Medical();
                                newMedicine.newMedi();
                                medicines.add(newMedicine);
                                break;
                            }
                            case 2: {
                                System.out.println(
                                        "--------------------------------------------------------------------------------");
                                System.out.println("Name \t Company \t Expiry Date \t Cost");
                                System.out.println(
                                        "--------------------------------------------------------------------------------");
                                for (Medical medicine : medicines) {
                                    medicine.findMedi();
                                }
                                break;
                            }
                            case 3: {
                                System.out.println("Enter the name of the medicine to remove:");
                                input.nextLine(); // Consume newline
                                String removeMedName = input.nextLine();
                                Medical medicine = new Medical();
                                medicine.removeMedical(medicines, removeMedName);
                                break;
                            }
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s3 = input.nextInt();
                    }
                    break;
                }
                case 4: {
                    s4 = 1;
                    System.out.println(
                            "--------------------------------------------------------------------------------");
                    System.out.println("                    **LABORATORY SECTION**");
                    System.out.println(
                            "--------------------------------------------------------------------------------");
                    while (s4 == 1) {
                        System.out.println("1.Add New Entry\n2.Existing Labs List\n3.Remove Lab");
                        System.out.println("Enter your Choice: ");c1 = input.nextInt();
                        switch (c1) {
                            case 1: {
                                Lab newLab = new Lab();
                                newLab.newFeci();
                                labs.add(newLab);
                                break;
                            }
                            case 2: {
                                System.out.println(
                                        "--------------------------------------------------------------------------------");
                                System.out.println("Facility \t Cost");
                                System.out.println(
                                        "--------------------------------------------------------------------------------");
                                for (Lab lab : labs) {
                                    lab.feciList();
                                }
                                break;
                            }
                            case 3: {
                                System.out.println("Enter the name of the lab to remove:");
                                input.nextLine(); // Consume newline
                                String removeLabName = input.nextLine();
                                Lab lab = new Lab();
                                lab.removeLab(labs, removeLabName);
                                break;
                            }
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s4 = input.nextInt();
                    }
                    break;
                }
                case 5: {
                    s5 = 1;
                    System.out.println(
                            "--------------------------------------------------------------------------------");
                    System.out.println("                      **FACILITY SECTION**");
                    System.out.println(
                            "--------------------------------------------------------------------------------");
                    while (s5 == 1) {
                        System.out.println("1.Add New Entry\n2.Existing Facilities List\n3.Remove Facility");
                        System.out.println("Enter your Choice: ");c1 = input.nextInt();
                        switch (c1) {
                            case 1: {
                                Facility newFacility = new Facility();
                                newFacility.addFeci();
                                facilities.add(newFacility);
                                break;
                            }
                            case 2: {
                                System.out.println(
                                        "--------------------------------------------------------------------------------");
                                System.out.println("Facility");
                                System.out.println(
                                        "--------------------------------------------------------------------------------");
                                for (Facility facility : facilities) {
                                    facility.showFeci();
                                }
                                break;
                            }
                            case 3: {
                                System.out.println("Enter the name of the facility to remove:");
                                input.nextLine(); // Consume newline
                                String removeFacName = input.nextLine();
                                Facility facility = new Facility();
                                facility.removeFacility(facilities, removeFacName);
                                break;
                            }
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s5 = input.nextInt();
                    }
                    break;
                }
                case 6: {
                    s6 = 1;
                    System.out.println(
                            "--------------------------------------------------------------------------------");
                    System.out.println("                      **STAFF SECTION**");
                    System.out.println(
                            "--------------------------------------------------------------------------------");
                    while (s6 == 1) {
                        System.out.println("1.Add New Entry\n2.Existing Staff List\n3.Remove Staff");
                        System.out.println("Enter your Choice: ");c1 = input.nextInt();
                        switch (c1) {
                            case 1: {
                                Staff newStaff = new Staff();
                                newStaff.newStaff();
                                staffs.add(newStaff);
                                break;
                            }
                            case 2: {
                                System.out.println(
                                        "--------------------------------------------------------------------------------");
                                System.out.println("id \t Name \t Sex \t Salary");
                                System.out.println(
                                        "--------------------------------------------------------------------------------");
                                for (Staff staff : staffs) {
                                    staff.staffInfo();
                                }
                                break;
                            }
                            case 3: {
                                System.out.println("Enter the ID of the staff to remove:");
                                input.nextLine(); // Consume newline
                                String removeStaffID = input.nextLine();
                                Staff staff = new Staff();
                                staff.removeStaff(staffs, removeStaffID);
                                break;
                            }
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s6 = input.nextInt();
                    }
                    break;
                }
                default: {
                    System.out.println(" You Have Enter Wrong Choice!!!");
                }
            }
            System.out.println("\nReturn to MAIN MENU Press 1");
            status = input.nextInt();
        }
    }
}
