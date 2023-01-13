
package JavaEnamul;

public class Amarpay_transaction implements  Amarpay {

    @Override
    public void bikash(double amount) {
        System.out.println("bikash pament successfuly done = "+amount);
    }

    @Override
    public void nogod(double amount) {
        System.out.println("nogod pament successfuly done = "+amount);
    }

    @Override
    public void Roket(double amount) {
        System.out.println("Rocket pament successfuly done = "+amount);
    }

}
