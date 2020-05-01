/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab6;

import java.util.Scanner;

/**
 *
 * @author Luke
 */
class Tract {
    double length;
    double width;
    
    public double area() {
        double area;
        area = length * width;
        return area;
    }
    public String toString() {
        return "length: " + length + " , " + "width: " + width + " , " + "area: " + area();
    }  
}
public class LandTract {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Tract one = new Tract();
        System.out.println("Enter length of the first landtract");
            one.length = in.nextDouble();
        System.out.println("Enter width of the first landtract");
            one.width = in.nextDouble();
        
        Tract two = new Tract();
        System.out.println("Enter width of the second landtract");
            two.length = in.nextDouble();
        System.out.println("Enter width of the second landtract");
            two.width = in.nextDouble();
            
        System.out.println("Tract one: " + one);
        System.out.println("Tract two: " + two);
        
        if (one.area() == two.area()) {
            System.out.println("The tracts are the same size.");   
        } else {
            System.out.println("The tracts are not the same size");
        }      
    }
}
    
