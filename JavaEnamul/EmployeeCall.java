
package JavaEnamul;
public class EmployeeCall {
    public void caller(Employee e){
    //------------upcasting-----------------
    e.dosomething();
    e.setname();
    
    //---------------downcasting-----------------
     if(e instanceof Engineyer){
    Engineyer eng = (Engineyer)e;
    eng.dodevelop();
    eng.dosomething();
    eng.setname();
 
    }else if(e instanceof Admin){
    Admin ad = (Admin)e;
    ad.dohave();
    ad.dosomething();
    ad.setname();
    }else if(e instanceof Exucutive){
    Exucutive ex = (Exucutive)e;
    ex.docheack();
    ex.dosomething();
    ex.setname();
    }else if(e instanceof Worker){
    Worker wd = (Worker)e;
    wd.doseting();
    wd.dosomething();
    wd.setname();
    }
    }         
}
