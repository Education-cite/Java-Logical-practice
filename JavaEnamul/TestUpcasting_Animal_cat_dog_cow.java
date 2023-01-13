
package JavaEnamul;

public class TestUpcasting_Animal_cat_dog_cow {
    public static void main(String[] args) {
    /*    Animal a = new Animal();
        Dog d = new Dog();
        a=d;
        //or
        
        Animal a1 = new Dog();
        */
        
    Animal a;
    a = new Dog();
    a.eat();
    a.sleep();
    
    
      a = new Cat();
      a.eat();
      
        a = new Cow();
        a.eat();
      
    }
}
