package implict;


import java.util.*; 
import java.util.stream.*; 
import java.util.stream.Collectors;  
public class map { 
    public static void map(String args[]) { 
        
        Map<String, String> map_cities = Stream.of(new String[][]
        {
        {"go", "goa"},
        {"pb", "delhi"},
        {"pb", "punjab"}
        }
        )
        .collect(Collectors.toMap(p -> p[0], p -> p[1]));
       
        Set<Map.Entry<String, String>> entries = map_cities.entrySet();
       
        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        System.out.println("The map entries are:");
        System.out.println("        KEY     VALUE");
       
        while(iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println("\t" + entry.getKey() + "\t" +entry.getValue());
        }
    } 
}