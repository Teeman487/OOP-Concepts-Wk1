package TaskWk1;

import java.util.ArrayList;

public class Teachers extends Person implements School {


    private String subject;
    private long salary;
    private int level;
    private boolean maritalStatus;

    public Teachers(String title, String lastName, String firstName, String dateOfBirth, String gender,
                    String phoneNumber, String emailAddress, ArrayList<Teachers> mathTeacher,String subject,
                    long salary, int level, boolean maritalStatus)
    {
        super(title, lastName, firstName, dateOfBirth, gender, phoneNumber, emailAddress, mathTeacher);
    }

    // Array extensional method from Parent class
    public  boolean isFunctional = true;  // variable

    public void fix() {
        if(isFunctional)
            System.out.println("Hes truly working");
        else {
            System.out.println(" Hes not active");
        }
    }



    public String getSubject() {
        return subject;
    }

    public long getSalary() {
        return salary;
    }

    public int getLevel() {
        return level;
    }

    public boolean isMaritalStatus() {
        return maritalStatus;
    }


    public static double gradeScore() {  // Method Override 3

        return Students.gradeScore() + 0 ; //
    }

    // Interface Implementation

    @Override
    public void favoriteSubject() {
        System.out.println(subject);
    }

    @Override
    public void annualSalary() {

        System.out.println(getSalary() * 12);
    }

}

