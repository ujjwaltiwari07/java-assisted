package implict;


	class impconstructor{

		  String sentence;

		 
		  impconstructor(String n) {
			  sentence = n;
		    System.out.println(sentence + " Programming Language");
		  }

		  public static void main(String[] args) {

		    
			  impconstructor obj1 = new impconstructor("Java");
			  impconstructor obj2 = new impconstructor("Python");
			  impconstructor obj3 = new impconstructor("C");
		  }
		}