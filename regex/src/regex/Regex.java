/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author User
 */
public class Regex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pattern pattern;
        Matcher matcher;
         Scanner in = new Scanner(System.in);
        System.out.print("Enter  Constant: ");
        String input = in.next();
        
        pattern = Pattern.compile("[+-]?[0-9]+"); //int
        matcher = pattern.matcher(input);
        boolean integer = matcher.matches();
        
        pattern = Pattern.compile("[A-Za-z]");//character
        matcher = pattern.matcher(input);
        boolean ch = matcher.matches();
        
        pattern = Pattern.compile("[A-Za-z0-9]*");//string
        matcher = pattern.matcher(input);
        boolean str = matcher.matches();
        
        pattern = Pattern.compile("[+-]?[0-9]*[.][0-9]+");//float
        matcher = pattern.matcher(input);
        boolean flt = matcher.matches();
        

        if(integer){
            System.out.println("DataType : Integer");
        }
        else if(ch){
            System.out.println("DataType : char");}
        else if(str){
            System.out.println("DataType : String");
        }else if(flt){
            System.out.println("DataType : float");
        }
        else{
            System.out.println("Error");
        }
        
    }
    
}
