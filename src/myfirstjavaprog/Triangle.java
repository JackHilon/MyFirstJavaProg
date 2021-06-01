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
public class Triangle {
    
    public Double height;
    public Double base;
    
    public Triangle(Double height, Double base)
    {
        this.height=height;
        this.base=base;
    }
    
    public Double GetTriangleArea()
    {
        return (base*height)/2;
    }
}
