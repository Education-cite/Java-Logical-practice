
package JavaEnamul;


class SingleArray {
    public static void main(String[] args) {
        //rule 1------------Array---------
        String[] b = {"q","p"};
        System.out.println("  name is = " +b[0]);
        System.out.println("  name is = " +b[1]);
       
        
       //rule2----------Array-----------
      int[] m = new int[3];
        m[0]=1;
        m[1]=12;
        m[2]=11;
        
       // rule4------------print loop sara
        
        System.out.println(m[0]);
        System.out.println(m[1]);
        System.out.println(m[2]);
        
        
        //Array sum-------------
        int sum = m[0]+m[1]+m[2];
        System.out.println("array sum is = " +sum);
        
        //rule3----------loop print---------
         String []a=new String[2];
        a[0]="enamul";
        a[1]="tawhide";
       for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}