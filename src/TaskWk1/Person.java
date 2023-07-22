package TaskWk1;

import java.util.ArrayList;

public class Person { // Person is a logical entity | Parent/base class/super class
    /* Access Modifiers: Defines the scope of variables and methods
    -----------------------------------------------------
    1) public
    2) protected: The protected access modifier is accessible within package and (outside the package but through inheritance only)
    3) default: No modifier used, it is treated as default by default. The default modifier is accessible only within package
    4) private :accessible only within class.
    */
    String title;        // instance variables or class variables
    String lastName;
    String firstName;
    String dateOfBirth;
    String gender;
    String phoneNumber;
    String emailAddress ;
    Double gradeScore; // no constructor for gradeScore
    public ArrayList<Teachers> mathTeacher;

    /*

Constructor
--------------------
1) Constructor is a special type of a method
2) Constructor used for initilizing class variables
3) Constructor Name should be same as class name
4) Constructor will not return any value(not even void)
5) Constructor will be invoked at the time of object creation.

2 Types Constructor
--------------
1) Default constructor
2) Parameterized constructor         */

    // parameterized constructor
    public Person(String title, String lastName,String firstName, String dateOfBirth, String gender, String phoneNumber,
                  String emailAddress,ArrayList<Teachers> mathTeacher) {
        this.title = title;    // // this represents class variable above
        this.lastName = lastName;
        this.firstName = firstName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.mathTeacher = mathTeacher;
    }
    /*
Method overloading or Compile time: creating methods/constructors with the same name with different parameters.
Overloading occurs in same class
Advantage:
-----
saves memory
saves time
Consideration for Overloading
1)Number of parameters
2) data type of parameters    */
    void StudentGrade(int Math, int English) { // default is most suitable since im sending the score across in 1package after overloading
        if(Math>=70 && English>=60)    // Results is being overloaded to prevent possible grade errors
            System.out.println(Math+ ", "+ English);
    }
    void StudentGrade(int Math, double English) {
        if(Math>=70 && English>=60)
            System.out.println(Math+ ", "+ English);
    }

    void StudentGrade(double Math, double English) {
        if(Math>=70 && English>=60)
            System.out.println(Math+ ", "+ English);
    }

    void studentBdmi(int weight, int height) {  // To access the Wei
        int bodyMassIndex = (int) Math.pow(weight,height * 2);  // BDMI = Weight/h^2
        if (bodyMassIndex>= 25)
            System.out.println(weight+ " , " + height);
    }
    void studentBdmi(int weight, double height) {
        int bodyMassIndex = (int) Math.pow(weight,height * 2);
        if (bodyMassIndex>= 25)
            System.out.println(weight+ " , " + height);
    }
    void studentBdmi(double weight,double height) {
        int bodyMassIndex = (int) Math.pow(weight,height * 2);  // BDMI = Weight/h^2
        if (bodyMassIndex>= 25)
            System.out.println(weight+ " , " + height);
    }

    /*  Method Overriding or Runtime
             --------------------
             Rewrite the methods(that was initially in Parent class) to child classes|i.e child classes will override the method in Parent class with conditions below;
            1) method definition should be same
            2) body should be changed                           */
    public static double gradeScore() { // Method Overriding 1 // It will override to the child classes
        return 0;        // Reason for opting for Method Overriding: So that Teacher will access student's gradeScore
    }                        // and sends it to Principal for final assessment b4 sending student to rep the School


    //Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Double getGradeScore() {
        return gradeScore;
    }

    public void setGradeScore(Double gradeScore) {
        this.gradeScore = gradeScore;
    }

    @Override
    public String toString() {
        return "Person{" +
                "title='" + title + '\'' +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", gradeScore=" + gradeScore +
                '}';
    }
}


/*
* if (Math>=70 && English>=69){
               return "A potential student to represent the school"; }
           else { return "student is not a potential"; }

* */
