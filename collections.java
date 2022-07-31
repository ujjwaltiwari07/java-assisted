package implict;


import java.util.*;  
class project6{  
public static void main(String args[]){  
ArrayList<String> list=new ArrayList<String>();  
list.add("ankit");  
list.add("rahul");  
list.add("Ravan");  
list.add("Alok");  
 
Iterator itr=list.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  