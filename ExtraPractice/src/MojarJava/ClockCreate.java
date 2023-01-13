
package MojarJava;

import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;


public class ClockCreate extends javax.swing.JFrame {

    public ClockCreate() {
        initComponents();
        rb();
        clock();
    }
    
    
    public void rb(){
        setLocationRelativeTo(null);
    }

    
    public void clock(){
    
    Thread clock = new Thread(){
        public void run(){
  try{
        for(;;){
    
    Calendar cal = new GregorianCalendar();
    int day = cal.get(Calendar.DAY_OF_MONTH);
    int month = cal.get(Calendar.MONTH);
    int year = cal.get(Calendar.YEAR);
   // int am_pm = cal.get(Calendar.AM_PM);
    int sec = cal.get(Calendar.SECOND);
    int min = cal.get(Calendar.MINUTE);
    int hour = cal.get(Calendar.HOUR);
    jLabeldate.setText("date: "+day+" / "+month+" /"+year+"  ");
    jLabeltime.setText("Time: "+hour+" : "+min+" : "+sec+"   ");
            sleep(1000);
    }
    }
catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    
    }
    }
    
    };
    clock.start();
       }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabeldate = new javax.swing.JLabel();
        jLabeltime = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jLabeldate.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabeldate.setText("DATE :");

        jLabeltime.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabeltime.setText("TIME :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabeltime)
                    .addComponent(jLabeldate))
                .addContainerGap(211, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabeldate)
                .addGap(37, 37, 37)
                .addComponent(jLabeltime)
                .addContainerGap(127, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClockCreate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabeldate;
    private javax.swing.JLabel jLabeltime;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
