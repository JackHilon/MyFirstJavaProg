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
public class StudentV2 {
    
    public String firstName; 
    public String lastName;
    public int expectedYearToGraduate;
    public double GPA;
    public String declaredMajor;

    public StudentV2(String firstName, String lastName, 
            int expectedYearToGraduate, double GPA, String declaredMajor) 
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.expectedYearToGraduate = expectedYearToGraduate;
        this.GPA = GPA;
        this.declaredMajor = declaredMajor;
    }
    
    public void IncrementExpectedYearToGraduate()
    {
        this.expectedYearToGraduate=this.expectedYearToGraduate+1;
    }
    
    
}
