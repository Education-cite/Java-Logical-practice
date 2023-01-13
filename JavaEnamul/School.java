
package JavaEnamul;

public abstract class School {
    private int id;
    private String name;
    private int age;
    
    public School(int id,String name,int age){
    this.id=id;
    this.name=name;
    this.age=age;
    }
    void dis(){
    
        System.out.println("id = " +id +  ",  name = "  +name + ", age =  " +age);
    }
    
    
    
    
    
    
    
    
}
