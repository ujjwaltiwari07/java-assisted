package implict;


public class string_to_stringBuffer {
	 
    public static void main(String[] args) {
 
       
        String s1 = "This is Java Weblog. ";
 
        
        StringBuffer s = new StringBuffer();
 
        
        s.append(s1);
 
        
        String s2 = "And there are over 500+ articles on Java.";
 
       
        s.append(s2);
 
        
        String s3 = "Covering most of the Core Java topics.";
 
       
        s.append("\n" + s3);
 
        
        System.out.println("Ex: String to StringBuffer"
                + " using append() method : \n\n" + s);
    }}
