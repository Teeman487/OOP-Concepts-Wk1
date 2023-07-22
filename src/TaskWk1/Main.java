package TaskWk1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /* Composition implies a parent-child relationship. The child cannot exist independent of the parent
 (i.e a Teachers Object is intended to compose a Person Object). The lifecycles of the involved objects are the same,
if one is garbage collected the other will also be garbage collected*/
        // COMPOSITION 1
        ArrayList<Teachers> mathTeacher = new ArrayList<>();
        Teachers t1 = new Teachers("Mrs","Akinde","Lola","21/05/1999","F",
                "090123473","lola34@gmail.com", mathTeacher,"",30000,10,true);
        Teachers t2 = new Teachers("Mrs","Akinde","Lola","21/05/1999","F",
                "090123473","lola34@gmail.com",mathTeacher, "Maths",35000,9,true);

        mathTeacher.add(t1);
        mathTeacher.add(t2);
        Person per1 = new Person("Mr","Ajani","Babatubde","01/01/1994","Male",
                "0824566222","ajani2@gmail.com",mathTeacher); // Composition
        //System.out.println("Composition 1:========== " + per1);



        // COMPOSITION 2
        ArrayList<Teachers> engTeacher = new ArrayList<>();
        Teachers t3 = new Teachers("Mrs","Apitan","bola","21/05/1999","F",
                "090123473","bola4@gmail.com", engTeacher,"Maths",25000,9,true);
        Teachers t4 = new Teachers("Mrs","Kehinde","Dala","21/05/1996","F",
                "090123473","lola34@gmail.com", engTeacher,"Maths",45000,8,true);

        engTeacher.add(t3);
        engTeacher.add(t4);

        Person per2 = new Person("Mr","Oni","Abolade","01/01/1981","Male",
                "0823516222","abolade2@gmail.com",engTeacher); // Composition


        // Aggregation implies a parent-child relationship. The child can exist independently of the parent
        // The lifecycles of each of the involved objects are independent.

        //Aggregation 1
        ArrayList<Person> p1 = new ArrayList();

        p1.add(per1);
        p1.add(per2);

        /*If p1 is garbage collected the "per1" and "per2" objects might not be come garbage themselves as they could be
        part of another p1 */

        // Task 1
        Principal principal = new Principal("Mr","Wale","Akanbi","21/02/1990",
                "Male","09050174845","wale2@gmail.com",50000,12,true);
        System.out.println("Principal info: ============= " + principal); // Principal info: ============= Principal{salary=50000, level=12, maritalStatus=true, title='Mr', lastName='Wale', firstName='Akanbi', dateOfBirth='21/02/1990', gender='Male', phoneNumber='09050174845', emailAddress='wale2@gmail.com', gradeScore=null}
        principal.finalAssessment(); // Remi Bayowa is considered in representing the School
        principal.annualSalary(); // 600000

        //Task2
        Teachers teacher1 = new Teachers("Mrs","Akinde","Lola","21/05/1999","F",
                "090123473","lola34@gmail.com", mathTeacher,"Maths",35000,9,true);
        System.out.println("Teachers info: ============= " + teacher1);
        teacher1.getSubject();  //   child class gets all variables in the constructor including super
        teacher1.getSalary();
        teacher1.annualSalary();
        teacher1.favoriteSubject();

        //Task3
        Teachers teacher2 = new Teachers("Mrs","Salami","Bosede","01/02/1997","F",
                "091143473","bosede23@gmail.com", engTeacher,"English",32000,8,true);
        System.out.println("Teachers info: ============= " + teacher2);
        teacher2.getSubject();
        teacher2.getSalary(); //   child class gets all variables in the constructor including super
        teacher1.annualSalary();
        teacher1.favoriteSubject();

        //Task4
        // Crossing Parent class to child class - UpCasting Dynamic Dispatch
        Person person = new Teachers("Mrs","Salami","Bosede","01/02/1997","F",
                "091143473","bosede23@gmail.com", mathTeacher,"English",32000,8,true);
        System.out.println("Upcasting Teachers(gets variables in super only) info: ============= " + person);
        person.getEmailAddress();// gets variables in super only


        //Task5
        // Crossing Inteface- child class
        School sc = new Teachers("Mrs","Salami","Bosede","01/02/1997","F",
                "091143473","bosede23@gmail.com", engTeacher,"English",32000,8,true);
        System.out.println("Crossing Interface_Teachers(gets only method created in Interface) info: ============= " + sc);
        sc.annualSalary(); // 384000
        sc.favoriteSubject();//English   // gets only method created in Interface

        //Task6
        //DownCasting Child class -  (Child_class) parent_class_Task4
        Teachers teacher3 = (Teachers)person ;
        System.out.println("Downcasting Teachers_Person info: ============= " + teacher3);
        teacher3.getGender(); // Also gets all variables in the constructor including super
        teacher3.getLevel();

        //Task7
        Students students = new Students("Remi","Bayowa",73,"Maths"); // Association
        System.out.println("Students info: ============= " + students);
        students.favoriteSubject();

        //Association: a form of dependency (a reference to an Object).
        //Both objects have independent lifecycles.

    }
}

