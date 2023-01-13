
package JavaEnamul;

public class Test_Addition_substraction_Multification_division {
    
    public static void main(String[] args) {
        MyCalculator a;
        a = new Addition();
        a.calculate(4, 5);
        a = new Subtraction();
        a.calculate(5, 9);
        a = new Multification();
        a.calculate(111, 343);
        a = new Division();
        a.calculate(123345, 43);
              
      //  Addition z = new Addition();
       // z.calculate(2, 4);
    }
}
