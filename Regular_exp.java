package implict;


import java.util.regex.*;  
public class Regular_exp {  
public static void main(String args[]){  
//first way  
Pattern p = Pattern.compile(".s");//. represents single character  
Matcher m = p.matcher("as");  
boolean b = m.matches();  
  
//second way  
boolean b2=Pattern.compile(".s").matcher("as").matches();  
  
//third way  
boolean b3 = Pattern.matches(".s", "as");  
  
System.out.println(b+" "+b2+" "+b3);  
}}