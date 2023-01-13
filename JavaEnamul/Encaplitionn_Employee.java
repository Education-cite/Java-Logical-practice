
package JavaEnamul;

import java.util.Scanner;

    public class Encaplitionn_Employee {
    private String name;
    private long empaccounnt;
    private String empEmail;
    private Double Balance ;
    
    public void setname(String name ){
    this.name=name;
    }
      public String getname( ){
    return name;
    
    }
      
     public void setempaccounnt(long empaccounnt){
     this. empaccounnt= empaccounnt;
     }
     
     public long getempaccounnt(){
     
         return  empaccounnt;
     }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public Double getBalance() {
        System.out.println("please enter your name");
       Scanner sc = new Scanner(System.in);
        String q = sc.nextLine();
        
         System.out.println("please enter your account no");
        
        long c = sc.nextLong();
        
        if(q.equals(name)&&c==empaccounnt){
        
            System.out.println(Balance);
        
        }else{
            System.out.println("invalid name and account number");
        }
      
        return Balance;
    }

    public void setBalance(Double Balance) {
        this.Balance = Balance;
    }
      
    }
    
    

