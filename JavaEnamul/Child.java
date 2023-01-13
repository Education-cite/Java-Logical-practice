
package JavaEnamul;

public class Child extends Parent {
    int m = 40;
    Child(){
        System.out.println("child constructor");
    }
    
    {
        System.out.println("child instance block");
    }
    
    static{
        System.out.println("child static block");
    }
    
    
}
