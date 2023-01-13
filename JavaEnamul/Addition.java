
package JavaEnamul;

public class Addition extends MyCalculator {

    @Override
    void calculate(int a, int b) {
       int result = a+b;
        System.out.println("The Addition Result is  ="+result);
    }
    
}
