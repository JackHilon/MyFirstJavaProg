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
public class Rectangle {
    public static int numOfSides =3; // <-- static attribute
    
    public double sideLenOne;
    public double sideLenTwo;

    public Rectangle(double sideLenOne, double sideLenTwo) {
        this.sideLenOne = sideLenOne;
        this.sideLenTwo = sideLenTwo;
    }
    
    public double FindArea()
    {
        return (this.sideLenOne*this.sideLenTwo);
    }

    
}
