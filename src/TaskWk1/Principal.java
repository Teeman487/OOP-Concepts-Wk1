package TaskWk1;

public class Principal implements School {


    private long salary;
    private int level;
    private boolean maritalStatus;

    public Principal(String title, String lastName, String firstName, String dateOfBirth, String gender,
                     String phoneNumber, String emailAddress,long salary, int level, boolean maritalStatus) {
        this.salary = salary;
        this.level = level;
        this.maritalStatus = maritalStatus;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public boolean isMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(boolean maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    /*   static ---> applicable for variables and methods static variables static methods
-----------------------
1)
2) static methods can also access non static stuff but through object
3) Non static methods can access both static & non static stuff          */
    void admittedStudents(int admissionGrade) {
        if (Students.gradeScore()>= admissionGrade) // static on method in Students class inorder to use it in class Principal
            System.out.println("Student is admitted into school");
        else System.out.println("Student is rejected");
    }

    public static double gradeScore() { // Method Override  4
        return Teachers.gradeScore()+0; //
    }

    // Principal Constructor
    // Exception in thread "main" thrown when a stack overflow occurs because an application recurses too deeply.
    /*Principal principal = new Principal("Mr","Wale","Akanbi","21/02/1990",
            "Male","09050174845","wale2@gmail.com",50000,12,true);
*/
    Students students = new Students("Remi","Bayowa",73,"Maths");
    void finalAssessment()
    {
        if(Teachers.gradeScore()>=70) {
            System.out.println(students.lastName+" "+students.firstName+ " is considered in representing the School");
        }
        else {
            System.out.println();
        }
    }

    // Interface Implementation
    @Override
    public void favoriteSubject() {}

    @Override
    public void annualSalary() {
        long annualSalary = getSalary() * 12;
        System.out.println(annualSalary); ;
    }

    //To String

    @Override
    public String toString() {
        return "Principal{" +
                "salary=" + salary +
                ", level=" + level +
                ", maritalStatus=" + maritalStatus +
                ", students=" + students +
                '}';
    }
}

