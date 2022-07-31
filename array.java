package implict;

class array{
	  public static void main(String[] args) {
		  
	    int[] num = {7, 2, 4, 4, 8};
	    int toFind = 4;
	    boolean found = false;

	    for (int i : num) 
	    {
	      if (i == toFind) {
	        found = true;
	        break;
	      }
	    }
	    
	    if(found)
	      System.out.println(toFind + " is found.");
	    else
	      System.out.println(toFind + " is not found.");
	  }
	}