package implict;

public class methodd {
	

		void addition(int a , int b) {

		System.out.println( a + b );

		}

		void subtraction (int a , int b) {

		System.out.println(a-b);

		}

		void multiplication(int a , int b){

		System.out.println(a*b);

		}

		public static void main ( String args [ ] ) 

		{
			methodd m=new methodd();

		m.addition(3,4);

		m.subtraction(5,2);

		}

	}