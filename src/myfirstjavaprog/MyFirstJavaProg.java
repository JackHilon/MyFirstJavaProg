/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirstjavaprog;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author marka
 */
public class MyFirstJavaProg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StudentPart();
        
        IfControlPart();

        WhileLoopPart();
        
        SimpleChallengePart();
        
        TrianglePart();
        
        // -- Instance method vs. static method
        // -- Static attributes
        RectanglePart();
        
        StudentVersion2();     
    }
    
    public static void StudentVersion2()
    {
        StudentV2 Tom =new StudentV2("Tom", "Foley", 2025, 71.3, "Physics");
        StudentV2 Dina =new StudentV2("Dina", "Mad", 2023, 82.7, "Math");
        
        System.out.println(Tom.firstName+" old graduation year is: "+Tom.expectedYearToGraduate);
        Tom.IncrementExpectedYearToGraduate();
        System.out.println(Tom.firstName+" new graduation year is: "+Tom.expectedYearToGraduate);
    }
    public  static void RectanglePart()
    {
         // -- Instance method vs. static method
        // -- Static attributes
        
        Rectangle rec1=new Rectangle(3.1, 5.8);
        Rectangle rec2=new Rectangle(2.2, 7);
        
        double rec1Area=rec1.FindArea();
        System.out.println("The area of first rectangle is: " + rec1Area);
        
        // -- static variable (access via class name)
        // -- instance variable (access via instance name)
        System.out.println("The size of every rectangle is: "+ Rectangle.numOfSides);
    }
    public static void TrianglePart()
    {
        // -- Triangle Part --------------------------------------------------
        System.out.println("Enter your triangle height:");
        Double myBase = EnterPositiveDouble();
        System.out.println("Enter your triangle base:");
        Double myHeight= EnterPositiveDouble();
        Triangle myTriangle=new Triangle(myHeight, myBase);
        System.out.println("The area is:");
        PrintDouble(myTriangle.GetTriangleArea());
    }
    
    public static void PrintDouble(Double d)
    {
        System.out.println(d);
    }
    
    public static Double EnterPositiveDouble()
    {
        try{
        Scanner numScanner=new Scanner(System.in);
        Double num=numScanner.nextDouble();
        
        if(!CheckDoublePositive(num))
            throw new InputMismatchException();
        return num;
        }
        catch(InputMismatchException ex)
        {
            System.out.println("Please enter a positive double:");
            return EnterPositiveDouble();
        }
    }
    
    public static Boolean CheckDoublePositive(Double d)
    {
        if(d>0)
            return true;
        else return false;
    }
    public static void SimpleChallengePart()
    {
        // -- Challenge Part --------------------------------------------------
        SimpleChallenge myChallenge=new SimpleChallenge
        ("What is the capital of Eygpt?", "Cairo", "Damascus", "Tunis", 1);
        PrintChallenge(myChallenge);
        
        System.out.println("Please enter your choice");
        
        // REMARK: Breakpoint is added line-after ----------
        // To show myAns value -----------------------------
        String myAns=GetStringFromScanner();             // |
        PrintString(myChallenge.ShowYourResult(myAns));  //<-here!!!!
    }
    
    public static String GetStringFromScanner()
    {
        Scanner myScanner=new Scanner(System.in);
        String myString=myScanner.next();
        return myString;
    }
            
    public static void PrintChallenge(SimpleChallenge challenge)
    {
        System.out.println("The question is: "+challenge.question);
        System.out.println("(1) "+challenge.firstChoice);
        System.out.println("(2) "+challenge.secondChoice);
        System.out.println("(3) "+challenge.thirdChoice);
    }
    
    public static void WhileLoopPart()
    {
        // -- While Loop Part -------------------------------------------------
        String str;
        boolean repeat=true;
        Scanner mySong=new Scanner(System.in);
        while(repeat)
        {        
            System.out.println("Play current song.");
            System.out.println("Would you like to play next song?");
            System.out.println("If so, answer yes.");
            str= mySong.next();
            if (str.equals("yes"))
                repeat=false;
        }
        System.out.println("Move to the next song.");
    }
    
    public static void IfControlPart()
    {
        // -- If Control Part ------------------------------------------------------
        System.out.println("Give me a number between 0 and 10");
        int myNum=GiveMeInteger();
        PrintString(ResultOfInt(myNum));
    }
    
    public static String ResultOfInt(int number)
    {
        if (number>=5)
            return "Gratulations!!!!";
        else return "Good luck!";
    }
    
    public static int GiveMeInteger() 
    {
        Scanner number= new Scanner(System.in);    
        try{
            int a = number.nextInt();
            //number.close();
            if(IntBetween0and10(a))
                return a;
            else throw new InputMismatchException();
        }
        catch(InputMismatchException ex)
        {
            System.out.println("Give me a number between 0 and 10");
            return GiveMeInteger();
        }
    }
    
    public static boolean IntBetween0and10(int num)
    {
        if(num <= 10 && num >=0)
        return true;
        else return false;
    }
    
    public static Double GiveMeDoubleValue(Scanner input)
    {
        try
        {
        double a= input.nextDouble();
        //input.close();
        return a;
        }
        
        catch(InputMismatchException ex)
        {
            System.out.println("Please enter valid double value!!!!");
            Scanner exInput= new Scanner(System.in);
            double b= GiveMeDoubleValue(exInput);
            //exInput.close();
            return b;
        }
    }
    
    public static void StudentPart()
    {
        // -- First part ------------------------------------------------------
        Student Jack= new Student(23, 34.78, "Jack", "Hilon", true);
        PrintStudent(Jack);
        PrintString(Jack.StudentFullName());
        PrintString(Jack.StudentFullINFO());
        
        // -- Second Part -----------------------------------------------------
        System.out.println("Do you want to change Jack's GPD???");
        // import java.util.Scanner;
        Scanner myInput= new Scanner(System.in);
        Jack.GPA= GiveMeDoubleValue(myInput);
        PrintString(Jack.StudentFullINFO());
    }
    
    public static void PrintString(String str)
    {
        System.out.println(str);
    }
    
    public static void PrintStudent(Student std)
    {
        System.out.println(std.age);
                System.out.println(std.GPA);
        System.out.println(std.firstName);
        System.out.println(std.lastName);
        System.out.println(std.firstInitial);
                System.out.println(std.lastInitial);
        System.out.println(std.appearance);
    }
    
}
