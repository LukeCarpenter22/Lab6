/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab6;

/**
 *
 * @author Luke
 */
public class Month {
    private int monthNumber;
    
    public Month() { 
        monthNumber=1;
    }
    public Month(int monthNum) {
        if (monthNum < 1 || monthNum > 12) 
            monthNumber = 1;
        else 
            monthNumber = monthNum;
    }
    public Month(String monthName) {
        if (monthName.equals("January")) monthNumber = 1;
        else if (monthName.equals("February")) monthNumber = 2;
        else if (monthName.equals("March")) monthNumber = 3;
        else if (monthName.equals("April")) monthNumber = 4;
        else if (monthName.equals("May")) monthNumber = 5;
        else if (monthName.equals("June")) monthNumber = 6;
        else if (monthName.equals("July")) monthNumber = 7;
        else if (monthName.equals("August")) monthNumber = 8;
        else if (monthName.equals("September")) monthNumber = 9;
        else if (monthName.equals("October")) monthNumber = 10;
        else if (monthName.equals("November")) monthNumber = 11;
        else if (monthName.equals("December")) monthNumber = 12;
    }
    public void setMonthNumber(int monthNum) {
        if (monthNum < 1 || monthNum > 12)
            monthNumber = 1;
        else 
            monthNumber = monthNum; 
    }
    public int getmonthNumber() {
        return monthNumber;
    }
    public String getMonthName() {
        if (monthNumber == 1) return "January";
        else if (monthNumber == 2) return "February";
        else if (monthNumber == 3) return "March";
        else if (monthNumber == 4) return "April";
        else if (monthNumber == 5) return "May";
        else if (monthNumber == 6) return "June";
        else if (monthNumber == 7) return "July";
        else if (monthNumber == 8) return "August";
        else if (monthNumber == 9) return "September";
        else if (monthNumber == 10) return "October";
        else if (monthNumber == 11) return "November";
        else if (monthNumber == 12) return "December"; 
        return "January";
    }
    public String toString() {
        return getMonthName();
    }
    public boolean equals(Month X){
        return monthNumber==X.monthNumber;
    }
    public boolean greaterThan(Month X){
        return monthNumber>X.monthNumber;
    }
    public boolean lessThan(Month X){
        return monthNumber<X.monthNumber;
    }    
}
