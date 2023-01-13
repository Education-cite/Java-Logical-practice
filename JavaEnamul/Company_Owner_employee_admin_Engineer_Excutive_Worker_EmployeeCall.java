
package JavaEnamul;

public class Company_Owner_employee_admin_Engineer_Excutive_Worker_EmployeeCall {
    public static void main(String[] args) {
        Admin a = new Admin();
        Engineyer e = new Engineyer();
        Exucutive t = new Exucutive();
        Worker w = new Worker();
        EmployeeCall d  = new EmployeeCall();
        
        d.caller(a);
        d.caller(e);
        d.caller(t);
        d.caller(w);
        
        
    }
}
