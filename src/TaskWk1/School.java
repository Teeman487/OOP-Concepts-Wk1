package TaskWk1;

public interface School {  // Not a functional interface

    void favoriteSubject();//  abstract method, access modifier is public by default
    void annualSalary();

}

/*
* Interface
--------------
An interface in java is a blueprint of a class.
Interface contains final and static variables. // int a=10; by default variables interface are static and final
Interface contains abstract methods.
An abstract method is a method contains definition but not body.
Methods in interface are publicly by default.
Interface supports the functionality of multiple inheritance. // 1 class implements two interfaces
We can define interface with interface keyword.
A class extends another class, an interface extends another interface but a class implememts an interface.
*    class1  extends c2 implements Interface1,Interface2
We can create Object reference for Interface but we cannot instantiate interface.
* */
