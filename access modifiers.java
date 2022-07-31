package implict;

class A
{
private void display()
    {
        System.out.println("GeeksforGeeks");
    }
}
 
class B
{
public static void main(String args[])
    {
        A obj = new A();
        // Trying to access private method
        // of another class
        obj.display();
    }
}