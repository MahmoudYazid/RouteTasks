/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassNo2Design;

/**
 *
 * @author ahmed
 */
public class Triangle implements Task4SectionNo2Class{
      public int Height=0;
    public int base=0;
  
    public Triangle(int Height , int base) {
        this.Height=Height;
        this.base=base;
        
    }
    
    @Override
    public double GetArea() {
        return .5*this.Height * this.base;
    }

    @Override
    public String ToString() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
