
package JavaEnamul;

public class Test_Downcasting {
    public static void main(String[] args) {
          Animal a1 = new Cat();
         // a1.sleep();//upcasting
          Cat c = (Cat)a1;//downcasting
   
          Animal a2 = new Cow();
          if(a2 instanceof Cow){
          Cow d =  (Cow)a2;
          d.hamba();
          d.sleep();
          d.eat();
          }
    }
  
    
}
