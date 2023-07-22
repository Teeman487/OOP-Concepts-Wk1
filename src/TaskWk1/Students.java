package TaskWk1;

public class Students implements School {

    String lastName;
    String firstName;
    private static int grade;
    private String subject;

    public Students(String lastName, String firstName, int grade, String subject) {

        this.grade = grade;
        this.subject = subject;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public static double gradeScore() { // Method Override 2
        return grade;
    }

    //Getters
    public String lastName()
    {
        return lastName;
    }

    public String firstName()
    {
        return firstName;
    }

    public String getSubject()
    {
        return subject;
    }

    @Override
    public String toString() {
        return "Students{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }

    // Interface Implementation
    @Override
    public void  favoriteSubject() {
        System.out.println(getSubject());
    }

    @Override
    public void annualSalary() {
        System.out.println();
    }


}

