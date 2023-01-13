
package JavaEnamul;

public class Parent {
    int n = 30;//instance variable
    static int v = 20; //static variable
    Parent (){
        System.out.println("parent constructor ");
    }
    
    static{
        System.out.println("parent static block");
    }
    
    {
        System.out.println("parent instance block");
    }
    
}
