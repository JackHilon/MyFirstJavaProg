/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirstjavaprog;

/**
 *
 * @author marka
 */
public class Student {
    public int age;
    public double GPA;
    public String firstName;
    public String lastName;
    public char firstInitial;
    public char lastInitial;
    public boolean appearance;
    
    public Student(int age,double gpa, String firstName, String lastName,boolean appearance)
    {
        this.age=age;
        this.GPA=gpa;
        this.firstName=firstName;
        this.lastName=lastName;
        this.firstInitial=firstName.charAt(0);
        this.lastInitial=lastName.charAt(0);
    }
    
    public String StudentFullName()
    {
        return this.firstName+" "+this.lastName;
    }
    public String StudentFullINFO()
    {
        return this.firstName+" "+this.lastName+" has GPA:"+Double.toString(this.GPA)
                +", "+ "his age is:" + Integer.toString(this.age)+" years.";
    }
}
