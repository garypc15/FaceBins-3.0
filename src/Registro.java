/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Registro.java
 *
 * Created on 11-21-2011, 09:36:59 PM
 */
/**
 *
 * @author Gary
 */
public class Registro extends javax.swing.JFrame {

    /** Creates new form Registro */
    public Registro() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jComboBox4 = new javax.swing.JComboBox();
        OK = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/social-network-1.jpg"))); // NOI18N
        jLabel12.setText("jLabel12");

        setBackground(new java.awt.Color(255, 204, 102));
        setMinimumSize(new java.awt.Dimension(500, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 255, 153));
        jLabel1.setText("Nombre");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 70, 80, 15);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 255, 153));
        jLabel2.setText("Apellido");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 110, 49, 15);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 255, 153));
        jLabel3.setText("Fecha de Nacimiento");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 260, 140, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 255, 153));
        jLabel6.setText("Telefono");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 390, 53, 15);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel4.setForeground(new java.awt.Color(102, 255, 153));
        jLabel4.setText("Sexo");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 440, 30, 15);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 255, 153));
        jLabel5.setText("Email");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(70, 360, 31, 15);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(160, 390, 110, 20);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(170, 110, 110, 20);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(160, 360, 110, 20);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(170, 70, 110, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel7.setForeground(new java.awt.Color(102, 255, 153));
        jLabel7.setText("Dia            Mes              Año                    ");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(100, 280, 300, 30);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Femenino" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(160, 440, 110, 20);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930", "1929", "1928", "1927", "1926", "1925", "1924", "1923", "1922", "1921", "1920", "1919", "1918", "1917", "1916", "1915", "1914", "1913", "1912", "1911" }));
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(240, 310, 90, 20);

        jLabel9.setFont(new java.awt.Font("Microsoft Tai Le", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 255, 153));
        jLabel9.setText("REGISTRO");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(160, 10, 170, 40);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        getContentPane().add(jComboBox3);
        jComboBox3.setBounds(160, 310, 60, 20);

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        getContentPane().add(jComboBox4);
        jComboBox4.setBounds(90, 310, 50, 20);

        OK.setText("Aceptar");
        OK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                OKMouseReleased(evt);
            }
        });
        getContentPane().add(OK);
        OK.setBounds(170, 510, 100, 23);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 255, 153));
        jLabel8.setText("Nombre de Usuario");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 150, 150, 30);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(170, 160, 110, 20);
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(170, 200, 110, 20);
        getContentPane().add(jPasswordField2);
        jPasswordField2.setBounds(170, 230, 110, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 255, 153));
        jLabel10.setText("Contraseña");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(30, 200, 100, 15);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 255, 153));
        jLabel11.setText("Verficar Contraseña");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(20, 230, 130, 20);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/social-network-1.jpg"))); // NOI18N
        jLabel13.setText("jLabel13");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(0, 4, 490, 560);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void OKMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OKMouseReleased

        HomeFeed hf = new HomeFeed();
        this.dispose();
        hf.setVisible(true);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_OKMouseReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Registro().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton OK;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
