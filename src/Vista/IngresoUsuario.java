/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.C_IngresoSistema;
import Modelo.M_IngresoSistema;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USUARIO
 */
public class IngresoUsuario extends javax.swing.JFrame {

    /**
     * Creates new form IngresoUsuario
     */
   public DefaultTableModel modelo=new DefaultTableModel();
    public IngresoUsuario() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
       
        
        
        
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cb_Rol = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txt_User = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btn_Ingresar = new javax.swing.JButton();
        btn_Cancelar = new javax.swing.JButton();
        btn_RecuperarContraseña = new javax.swing.JButton();
        txt_Contraseña = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_IngresoUsuario = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo 132.png"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(40, 0, 154, 150);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/login_1.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(621, 177, 128, 203);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sad.png"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(170, 30, 550, 110);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("¿ Has olvidado tu Contraseña ?");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(320, 410, 200, 15);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Ingresar Como: ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(52, 207, 141, 24);

        cb_Rol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador SGSST", "Gerente", "Jefe de Proceso", "Empleado" }));
        jPanel1.add(cb_Rol);
        cb_Rol.setBounds(280, 207, 276, 31);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Usuario ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(52, 256, 72, 24);

        txt_User.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_UserKeyTyped(evt);
            }
        });
        jPanel1.add(txt_User);
        txt_User.setBounds(280, 256, 276, 31);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Contraseña");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(52, 305, 100, 24);

        btn_Ingresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ingresar.png"))); // NOI18N
        btn_Ingresar.setText("Ingresar");
        btn_Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_IngresarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Ingresar);
        btn_Ingresar.setBounds(280, 360, 140, 35);

        btn_Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar.png"))); // NOI18N
        btn_Cancelar.setText("Cancelar");
        jPanel1.add(btn_Cancelar);
        btn_Cancelar.setBounds(430, 360, 130, 35);

        btn_RecuperarContraseña.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/recuperar contra.png"))); // NOI18N
        btn_RecuperarContraseña.setText("Recuperar Contraseña");
        btn_RecuperarContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RecuperarContraseñaActionPerformed(evt);
            }
        });
        jPanel1.add(btn_RecuperarContraseña);
        btn_RecuperarContraseña.setBounds(300, 430, 230, 42);
        jPanel1.add(txt_Contraseña);
        txt_Contraseña.setBounds(280, 305, 276, 31);

        table_IngresoUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(table_IngresoUsuario);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(674, 398, 0, 0);
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 0, 20, 30);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/login.jpg"))); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(0, 0, 764, 530);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 749, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_IngresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_IngresarActionPerformed

    private void txt_UserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_UserKeyTyped
        char c=evt.getKeyChar();
        if((c<'a' || c>'z') && (c<'A' || c>'Z') &&(c!='ñ' && c!='Ñ' && c!='-' && c!='_')) evt.consume();

    }//GEN-LAST:event_txt_UserKeyTyped

    private void btn_RecuperarContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RecuperarContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_RecuperarContraseñaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
 try{
            UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
        }catch(Exception e){
            
        }       


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                IngresoUsuario vista_ingreso=new IngresoUsuario();
                 M_IngresoSistema modelo_ingreso=new M_IngresoSistema();
                C_IngresoSistema controlador_Ingreso=new C_IngresoSistema(vista_ingreso, modelo_ingreso);
                
                vista_ingreso.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_Cancelar;
    public javax.swing.JButton btn_Ingresar;
    public javax.swing.JButton btn_RecuperarContraseña;
    public javax.swing.JComboBox<String> cb_Rol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable table_IngresoUsuario;
    public javax.swing.JPasswordField txt_Contraseña;
    public javax.swing.JTextField txt_User;
    // End of variables declaration//GEN-END:variables
}
