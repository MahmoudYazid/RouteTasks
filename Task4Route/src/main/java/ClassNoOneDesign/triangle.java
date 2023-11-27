/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassNoOneDesign;

/**
 *
 * @author ahmed
 */
public class triangle implements ShapeInterFace{
    public int Length=0;
    public int Width=0;
  
    public triangle(int Length , int width,String color) {
        this.Length=Length;
        this.Width=Width;
        
    }
    
    @Override
    public double GetArea() {
        return .5*this.Length * this.Width;
    }

    @Override
    public String ToString() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
