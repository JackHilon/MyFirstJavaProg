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
public class SimpleChallenge {
    public String question;
    public String firstChoice;
    public String secondChoice;
    public String thirdChoice;
    public String correctAnswer;
    
    public SimpleChallenge(String str1, String str2, String str3, String str4, int correct)
    {
        this.question=str1;
        this.firstChoice=str2.toLowerCase();
        this.secondChoice=str3.toLowerCase();
        this.thirdChoice=str4.toLowerCase();
        
        if(correct==1)
            this.correctAnswer=this.firstChoice;
        else if(correct==2)
            this.correctAnswer=this.secondChoice;
        else
            this.correctAnswer=this.thirdChoice;
    }
    
public String ShowYourResult(String yourAns)
    {
        String answer=yourAns.toLowerCase();
        if(answer.equals(this.correctAnswer))
            return "Your answer is right!";
        else
            return "Your answer is wrong and the correct answer is: "+this.correctAnswer;
    }
    
}
